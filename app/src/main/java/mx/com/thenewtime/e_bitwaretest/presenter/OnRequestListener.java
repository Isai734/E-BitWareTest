package mx.com.thenewtime.e_bitwaretest.presenter;
import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseWs;
import retrofit2.Response;

public interface OnRequestListener {

    void onFailure(ResponseWs response);

    void onSucces(Response response);

}
