package mx.com.thenewtime.e_bitwaretest.presenter;

import android.util.Log;


import java.util.List;

import mx.com.thenewtime.e_bitwaretest.model.local.DataSource;
import mx.com.thenewtime.e_bitwaretest.model.network.AbstractOperInteractor;
import mx.com.thenewtime.e_bitwaretest.model.network.RetrofitService;
import mx.com.thenewtime.e_bitwaretest.model.pojos.Persona;
import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseWs;
import mx.com.thenewtime.e_bitwaretest.utils.Constants;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ClienteImpOperator extends AbstractOperInteractor<Persona> implements OnRequestListener {

    private static final String TAG = ClienteImpOperator.class.getSimpleName();
    private Retrofit mRestAdapter;
    private RetrofitService mRetrofitService;
    OnViewOperatorListener vListener;
    String method = "";

    public ClienteImpOperator(OnViewOperatorListener vListener) {
        super.setMiddlewareListener(this);
        this.vListener = vListener;
        mRestAdapter = new Retrofit.Builder().baseUrl(RetrofitService.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        mRetrofitService = mRestAdapter.create(RetrofitService.class);
    }

    public void getAllClientes() {
        vListener.onShowProgress("Fetching data...");
        method = Constants.GETS;
        Call<List<Persona>> call = mRetrofitService.getAllClientes();
        super.getAll(call);
    }

    public void getCliente(String id) {
        vListener.onShowProgress("Fetching data...");
        method = Constants.GET;
        Call<Persona> call = mRetrofitService.getCliente(id);
        super.get(call);
    }

    public void putCliente(String id, Persona Persona) {
        vListener.onShowProgress("Actualzando datos de Persona...");
        method = Constants.PUT;
        Call<List<ResponseWs>> call = mRetrofitService.editCliente(id, Persona);
        super.put(call);
    }

    public void addCliente(Persona Persona) {
        vListener.onShowProgress("Agregando Persona...");
        method = Constants.POST;
        Call<List<ResponseWs>> call = mRetrofitService.addCliente(Persona);
        super.post(call);
    }

    @Override
    public void onFailure(ResponseWs response) {
        vListener.onHideProgress();
        vListener.onRequestError(response.getMensaje());
    }

    @Override
    public void onSucces(Response response) {
        /**
         * Se define el tipo de peticion para posteriormente procesar la respuesta
         */
        ResponseWs responseWs = null;
        switch (method) {
            case Constants.GETS:
                List<Persona> list = (List<Persona>) response.body();
                DataSource.getInstance().storeListObject(list);
                vListener.onHideProgress();
                vListener.onRequestOk(new ResponseWs(9, "Clientes"));
                Log.i(TAG, "Respuesta OnSucces Method : GETS List : " + list.toString());
                break;
            case Constants.GET:
                Persona auto = (Persona) response.body();
                DataSource.getInstance().storeObject(auto);
                vListener.onHideProgress();
                vListener.onRequestOk(new ResponseWs(9, "Clientes"));
                break;
            case Constants.POST:
                vListener.onHideProgress();
                responseWs = (ResponseWs) response.body();
                if (response.code() == 201) {
                    vListener.onRequestOk(responseWs);
                } else
                    vListener.onRequestError(responseWs.getMensaje());
                break;
            case Constants.PUT:
                responseWs = (ResponseWs) response.body();
                vListener.onHideProgress();
                if (response.code() == 201) {
                    vListener.onRequestOk(responseWs);
                } else
                    vListener.onRequestError(responseWs.getMensaje());
                break;
        }

    }
}
