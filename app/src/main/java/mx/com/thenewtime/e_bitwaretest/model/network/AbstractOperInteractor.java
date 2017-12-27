/*
 * Copyright (c) 2017. Desarrollado por <a href="https://plus.google.com/u/0/+IsaiCastroAlv">Isai Castro G+</a>
 */

package mx.com.thenewtime.e_bitwaretest.model.network;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseWs;
import mx.com.thenewtime.e_bitwaretest.presenter.OnRequestListener;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public abstract class AbstractOperInteractor<E> {

    private static final String TAG = AbstractOperInteractor.class.getSimpleName();
    private OnRequestListener listener;

    public AbstractOperInteractor() {

    }

    public AbstractOperInteractor(OnRequestListener listener) {
        this.listener = listener;
    }

    public void getAll(Call<List<E>> e) {
        attemptRequest(e);
    }

    public void get(Call<E> e) {
        attemptRequest(e);
    }

    public void post(Call<List<ResponseWs>> e) {
        attemptRequest(e);
    }

    public void put(Call<List<ResponseWs>> e) {
        attemptRequest(e);
    }

    public void delete(Call<ResponseWs> e) {
        attemptRequest(e);
    }

    private void attemptRequest(Call call) {
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                /**
                 * Se procesan los errores
                 */
                if (!response.isSuccessful()) {
                    String error = "Ha ocurrido un error. Contacte al administrador";
                    String json = "";
                    if (response.errorBody()
                            .contentType()
                            .subtype()
                            .equals("json")) {
                        try {
                            json = response.errorBody().string();
                            List<ResponseWs> responseApi = ResponseWs.fromResponseBody(json);
                            //error = responseApi.get(0).getMensaje();
                            Log.d(TAG, responseApi.toString());
                            listener.onFailure(responseApi.get(0));
                        } catch (Exception e) {
                            try {
                                listener.onFailure(new ResponseWs(-4, new JSONObject(json).get("Message").toString()));
                            } catch (JSONException e1) {
                                Log.i(TAG, e1.toString());
                            }
                            Log.i(TAG, e.toString());
                        }


                    } else {
                        try {
                            /*
                             *Reportar causas de error no relacionado con la API
                             */
                            Log.d(TAG, response.errorBody().string());

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    return;
                } else {
                    /*
                     * Si no existen errores entonces se notifica al listener que el procesos termino en ok se actualiza
                     * el origen de datos y la vista...
                     */
                    Log.d(TAG, "Succes with code : " + response.code());
                    listener.onSucces(response);
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                /*
                 * Aqui se notifican errores relacionados con la comunicación...
                 */
                Log.d(TAG, "onFailure with message : " + t.getMessage());
                listener.onFailure(new ResponseWs(9, t.getMessage()));
            }
        });
    }

    public void setMiddlewareListener(OnRequestListener listener) {
        this.listener = listener;
    }

}
