package mx.com.thenewtime.e_bitwaretest.utils.prefs;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.facebook.login.LoginManager;
import com.mosso.abi.apptest.model.pojos.Usuario;

/**
 * Preferencias de Login== Las preferncias se guardan para que no se consulte el servicio web cada vez que se inicie sesion
 * por seguridad se sugiere que cada vez que se consume un servicio se verifique el usuario que consume el web service este activo
 */
public class SessionPreferences {

    public static final String USER_EMAIL = "USER_EMAIL";
    public static final String PREFS_USER_PHOTO = "PHTO_USER";
    public static final String USER_PASS = "USER_PASS";
    public static final String USER_NAME = "USER_NAME";
    public static final String DB_CREATED = "DB";

    private final SharedPreferences mPrefs;

    private boolean mIsLoggedIn = false;
    private boolean mIsLoggedFacebook = false;
    private boolean mIsDbCreated = false;

    private static SessionPreferences INSTANCE;

    public static SessionPreferences get(Context context) {
        if (INSTANCE == null) {
            INSTANCE = new SessionPreferences(context);
        }
        return INSTANCE;
    }

    private SessionPreferences(Context context) {
        mPrefs = context.getApplicationContext()
                .getSharedPreferences(USER_EMAIL, Context.MODE_PRIVATE);
        mIsLoggedIn = !TextUtils.isEmpty(mPrefs.getString(USER_EMAIL, null));
        mIsLoggedFacebook = "SN".equals(mPrefs.getString(USER_PASS, null));
        mIsDbCreated = mPrefs.getBoolean(DB_CREATED, false);
    }

    public String getEmailCliente() {
        return mPrefs.getString(USER_EMAIL, null);
    }

    public String getPassCliente() {
        return mPrefs.getString(USER_PASS, null);
    }

    public void setImgPath(String path) {
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString(PREFS_USER_PHOTO, path);
        editor.apply();
    }

    public Usuario getUserLogged() {
        return new Usuario(
                mPrefs.getString(USER_NAME, null),
                mPrefs.getString(USER_EMAIL, null),
                mPrefs.getString(USER_PASS, null),
                mPrefs.getString(PREFS_USER_PHOTO, null)
        );
    }

    public boolean isLoggedIn() {
        return mIsLoggedIn;
    }

    public boolean isLoggedFacebook() {
        return mIsLoggedFacebook;
    }

    public boolean isDbCreated() {

        return mIsDbCreated;
    }

    public void setDbCreated(boolean bol) {
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putBoolean(DB_CREATED, bol);
        editor.apply();
        mIsDbCreated = bol;
    }

    public void saveLogin(Usuario login) {
        if (login != null) {
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString(USER_EMAIL, login.getEmail());
            editor.putString(USER_PASS, login.getPassword());
            editor.putString(PREFS_USER_PHOTO, login.getImgPath());
            editor.putString(USER_NAME, login.getNombre());
            editor.apply();
            mIsLoggedIn = true;
        }
    }

    public void saveLoginFacebook(Usuario login) {
        if (login != null) {
            SharedPreferences.Editor editor = mPrefs.edit();
            editor.putString(USER_EMAIL, login.getEmail());
            editor.putString(USER_PASS, login.getPassword());
            editor.putString(PREFS_USER_PHOTO, login.getImgPath());
            editor.putString(USER_NAME, login.getNombre());
            editor.apply();
            mIsLoggedFacebook = true;
        }
    }

    public void logOut() {
        if (mIsLoggedFacebook)
            LoginManager.getInstance().logOut();
        mIsLoggedIn = false;
        mIsLoggedFacebook = false;
        SharedPreferences.Editor editor = mPrefs.edit();
        editor.putString(USER_EMAIL, null);
        editor.putString(USER_PASS, null);
        editor.apply();
    }
}
