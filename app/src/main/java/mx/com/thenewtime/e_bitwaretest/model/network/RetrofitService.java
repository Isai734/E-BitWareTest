package mx.com.thenewtime.e_bitwaretest.model.network;

import java.util.List;

import mx.com.thenewtime.e_bitwaretest.model.pojos.Persona;
import mx.com.thenewtime.e_bitwaretest.model.pojos.ResponseWs;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitService {

    String BASE_URL = "http://187.188.122.85:8091/NutriNet/";

    @GET("Cliente/{id}")
    Call<Persona> getCliente(@Path("id") String idCliente);

    @GET("Cliente")
    Call<List<Persona>> getAllClientes();

    @POST("Cliente")
    Call<List<ResponseWs>> addCliente(@Body Persona cliente);

    @PUT("Cliente/{id}")
    Call<List<ResponseWs>> editCliente(@Path("id") String idCliente, @Body Persona cliente);

}