package mx.com.thenewtime.e_bitwaretest.model.network;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;

/**
 * Created by isai.castro on 12/6/2017.
 */

public class FaceBookOper {

    public void getUser() {
        /* make the API call */
        new GraphRequest(
                AccessToken.getCurrentAccessToken(),
                "/{user-id}",
                null,
                HttpMethod.GET,
                new GraphRequest.Callback() {
                    public void onCompleted(GraphResponse response) {
                        response.getJSONObject();
            /* handle the result */
                    }
                }
        ).executeAsync();
    }
}
