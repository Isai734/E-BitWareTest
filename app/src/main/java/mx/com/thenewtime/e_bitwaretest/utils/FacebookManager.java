package mx.com.thenewtime.e_bitwaretest.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.mosso.abi.apptest.model.pojos.Usuario;
import com.mosso.abi.apptest.utils.prefs.SessionPreferences;

import org.json.JSONObject;

/**
 * Created by isai.castro on 12/8/2017.
 */

public class FacebookManager {

    private Context context;
    @SuppressLint("StaticFieldLeak")
    private static FacebookManager INSTANCE = null;

    public static FacebookManager get(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new FacebookManager(context);
        }
        return INSTANCE;
    }

    private FacebookManager(Context context) {
        this.context = context;
    }

    public void getUserDetails(LoginResult loginResult) {
        GraphRequest data_request = GraphRequest.newMeRequest(
                loginResult.getAccessToken(), new GraphRequest.GraphJSONObjectCallback() {
                    @Override
                    public void onCompleted(JSONObject json_object, GraphResponse response) {

                        Log.w("FacebookManager", json_object.toString());
                        try {
                            JSONObject profile_pic_data, profile_pic_url;
                            profile_pic_data = new JSONObject(json_object.get("picture").toString());
                            profile_pic_url = new JSONObject(profile_pic_data.getString("data"));

                            Usuario usuario = new Usuario(
                                    json_object.get("name").toString()
                                    , json_object.get("email").toString()
                                    , "SN"
                                    , profile_pic_url.getString("url")
                            );
                            SessionPreferences.get(context).saveLoginFacebook(usuario);
                        } catch (Exception e) {
                            e.printStackTrace();
                            LoginManager.getInstance().logOut();
                        }
                    }

                });
        Bundle permission_param = new Bundle();
        permission_param.putString("fields", "id,name,email,picture.width(240).height(240)");
        data_request.setParameters(permission_param);
        data_request.executeAsync();
    }
}
