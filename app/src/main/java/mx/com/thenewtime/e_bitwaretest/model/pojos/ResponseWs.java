package mx.com.thenewtime.e_bitwaretest.model.pojos;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;

/*
    En este clase hacemos la gestion del los mensajes del servidor
 */
public class ResponseWs implements Serializable {

    private int Cve_Mensaje;
    private String Mensaje;

    public ResponseWs(int msg, String body) {
        this.Cve_Mensaje = msg;
        this.Mensaje = body;
    }

    public int getCve_Mensaje() {
        return Cve_Mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }

    @Override
    public String toString() {
        return "(" + getCve_Mensaje() + "): " + getMensaje();
    }

    public static List<ResponseWs> fromResponseBody(String responseBody) {
        Type listType = new TypeToken<ArrayList<ResponseWs>>() {
        }.getType();

        Gson gson = new Gson();
        Log.i("ResponseWs", "Return null fromJson");
        return gson.fromJson(responseBody, listType);
    }
}