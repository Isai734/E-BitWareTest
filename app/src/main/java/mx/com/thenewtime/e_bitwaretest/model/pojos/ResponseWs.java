package mx.com.thenewtime.e_bitwaretest.model.pojos;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.ResponseBody;

/*
    En este clase hacemos la gestion del los mensajes del servidor
 */
public class ResponseWs {
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

    public static ResponseWs fromResponseBody(ResponseBody responseBody) {
        Gson gson = new Gson();
        try {
            return gson.fromJson(responseBody.string(), ResponseWs.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}