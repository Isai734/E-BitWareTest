package mx.com.thenewtime.e_bitwaretest.presenter;



import com.mosso.abi.apptest.model.pojos.ResponseApi;

import retrofit2.Response;

public interface OnRequestListener {

    void onFailure(ResponseApi response);

    void onSucces(Response response);

}
