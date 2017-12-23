package mx.com.thenewtime.e_bitwaretest.model.network;

import com.mosso.abi.apptest.model.pojos.Palabra;
import com.mosso.abi.apptest.model.pojos.ResponseApi;
import com.mosso.abi.apptest.model.pojos.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface RetrofitService {

    String BASE_URL = "http://mephaa.com.mx/ws/";

    @GET("login/{usuario}")
    Call<Usuario> login(@Path("usuario") String usuario);

    @GET("login")
    Call<List<Usuario>> allUsers();

    @GET("login/{id}")
    Call<Usuario> getUser(@Path("id") String idAuto);

    @POST("login")
    Call<ResponseApi> addUser(@Body Usuario auto);

    @PUT("login")
    Call<ResponseApi> putUser(@Body Usuario auto);

    @POST("palabra")
    Call<ResponseApi> uploadFile(@Body Palabra palabra);

    @GET("palabra")
    Call<List<Palabra>> allPalabras();

    @GET("palabra/{id}")
    Call<Palabra> getPalabra(@Path("id") String id);

}