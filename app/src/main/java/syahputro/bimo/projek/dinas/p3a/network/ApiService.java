package syahputro.bimo.projek.dinas.p3a.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import syahputro.bimo.projek.dinas.p3a.network.response.ResponseRegister;

public interface ApiService {
    @FormUrlEncoded
    @POST("register")
    Call<ResponseRegister> register(
            @Field("nama") String nama,
            @Field("password") String password,
            @Field("nomor_telp") String nomor_telp,
            @Field("alamat") String alamat,
            @Field("tanggal_lahir") String tanggal_lahir,
            @Field("lat") String lat,
            @Field("long") String longitute
    );
}
