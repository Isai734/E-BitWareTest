package mx.com.thenewtime.e_bitwaretest.model.network;

import android.util.Log;

import java.io.IOException;
import java.util.List;

import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseApi;
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

    public void post(Call<ResponseApi> e) {
        attemptRequest(e);
    }

    public void put(Call<ResponseApi> e) {
        attemptRequest(e);
    }

    public void delete(Call<ResponseApi> e) {
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
                    if (response.errorBody()
                            .contentType()
                            .subtype()
                            .equals("json")) {
                        ResponseApi responseApi = ResponseApi.fromResponseBody(response.errorBody());
                        error = responseApi.getMensaje();
                        Log.d("LoginActivity", responseApi.getMensaje());
                        listener.onFailure(responseApi);
                    } else {
                        try {
                            /**
                             *Reportar causas de error no relacionado con la API
                             */
                            Log.d("LoginActivity", response.errorBody().string());

                        } catch (IOException e) {
                            e.printStackTrace();

                        }
                    }
                    return;
                } else {
                    /**
                     * Si no existen errores entonces se notifica al listener que el procesos termino en ok se actualiza
                     * el origen de datos y la vista...
                     */

                    listener.onSucces(response);
                }


            }

            @Override
            public void onFailure(Call call, Throwable t) {
                /**
                 * Aqui se notifican errores relacionados con la comunicación...
                 */
                listener.onFailure(new ResponseApi(9, t.getMessage()));
            }
        });
    }

    public void setMiddlewareListener(OnRequestListener listener) {
        this.listener = listener;
    }

}
