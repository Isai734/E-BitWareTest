package mx.com.thenewtime.e_bitwaretest.presenter;

import android.util.Log;

import com.mosso.abi.apptest.model.local.DataSource;
import com.mosso.abi.apptest.model.network.AbstractOperInteractor;
import com.mosso.abi.apptest.model.network.RetrofitService;
import com.mosso.abi.apptest.model.pojos.Palabra;
import com.mosso.abi.apptest.model.pojos.ResponseApi;
import com.mosso.abi.apptest.utils.Constants;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PalabraImplOperator extends AbstractOperInteractor<Palabra> implements OnRequestListener {

    private static final String TAG = LoginImpOperator.class.getSimpleName();
    private Retrofit mRestAdapter;
    private RetrofitService mRetrofitService;
    OnViewOperatorListener vListener;
    String method = "";

    public PalabraImplOperator(OnViewOperatorListener vListener) {
        super.setMiddlewareListener(this);
        this.vListener = vListener;
        mRestAdapter = new Retrofit.Builder().baseUrl(RetrofitService.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        mRetrofitService = mRestAdapter.create(RetrofitService.class);

    }

    public void getAllPalabras() {
        vListener.onShowProgress("Obteniendo datos de palabras...");
        method = Constants.GETS;
        Call<List<Palabra>> call = mRetrofitService.allPalabras();
        super.getAll(call);
    }

    public void getPalabra(String id) {
        vListener.onShowProgress("Obteniendo datos de Usuario...");
        method = Constants.GET;
        Call<Palabra> call = mRetrofitService.getPalabra(id);
        super.get(call);
    }

    public void addPalabra(Palabra palabra) {
        vListener.onShowProgress("Agregando palabra...");
        method = Constants.POST;
        Call<ResponseApi> call = mRetrofitService.uploadFile(palabra);
        super.post(call);
    }


    @Override
    public void onFailure(ResponseApi response) {
        vListener.onHideProgress();
        vListener.onRequestError(response.getMensaje());
    }

    @Override
    public void onSucces(Response response) {
        /**
         * Se define el tipo de peticion para posteriormente procesar la respuesta
         */
        switch (method) {
            case Constants.GETS:
                List<Palabra> list = (List<Palabra>) response.body();
                DataSource.getInstance().storeListObject(list);
                vListener.onHideProgress();
                vListener.onRequestOk("Recursos obtenidos");
                Log.i(TAG, "Respuesta OnSucces Method : GETS List : " + list.toString());
                break;
            case Constants.GET:
                Palabra palabra = (Palabra) response.body();
                DataSource.getInstance().storeObject(palabra);
                vListener.onHideProgress();
                vListener.onRequestOk("Conectado...");
                break;
            case Constants.POST:
                ResponseApi responseApi = (ResponseApi) response.body();
                vListener.onHideProgress();
                if (responseApi.getEstado() == 200)
                    vListener.onRequestOk(responseApi.getMensaje());
                else
                    vListener.onRequestError(responseApi.getMensaje());
                break;
        }
    }

}


