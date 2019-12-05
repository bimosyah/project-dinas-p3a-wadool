package syahputro.bimo.projek.dinas.p3a.network;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import syahputro.bimo.projek.dinas.p3a.network.response.artikel.detail_artikel.ResponseDetailArtikel;
import syahputro.bimo.projek.dinas.p3a.network.response.artikel.list_artikel.ResponseArtikel;
import syahputro.bimo.projek.dinas.p3a.network.response.artikel.list_berita.ResponseBerita;
import syahputro.bimo.projek.dinas.p3a.network.response.artikel.list_kegiatan.ResponseKegiatan;
import syahputro.bimo.projek.dinas.p3a.network.response.artikel.list_slider.ResponseSlider;
import syahputro.bimo.projek.dinas.p3a.network.response.kategori.ResponseKategori;
import syahputro.bimo.projek.dinas.p3a.network.response.login.ResponseLogin;
import syahputro.bimo.projek.dinas.p3a.network.response.pengaduan.ResponsePengaduan;
import syahputro.bimo.projek.dinas.p3a.network.response.profile_dinas.ResponseProfileDinas;
import syahputro.bimo.projek.dinas.p3a.network.response.register.ResponseRegister;
import syahputro.bimo.projek.dinas.p3a.network.response.riwayat.ResponseRiwayat;
import syahputro.bimo.projek.dinas.p3a.network.response.user.ResponseUser;

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

    @FormUrlEncoded
    @POST("login")
    Call<ResponseLogin> login(
            @Field("nomor_telp") String nomor_telp,
            @Field("password") String password
    );

    @FormUrlEncoded
    @POST("pengaduan")
    Call<ResponsePengaduan> pengaduan(
            @Field("id_user") int id_user,
            @Field("id_kategori") int id_kategori,
            @Field("isi_laporan") String isi_laporan,
            @Field("lat") String lat,
            @Field("long") String lon
    );

    @GET("master/kategori")
    Call<ResponseKategori> kategori();

    @GET("history/{id_user}")
    Call<ResponseRiwayat> riwayat(@Path("id_user") int id_user);

    @GET("posts/slider/{jumlah}")
    Call<ResponseSlider> slider(@Path("jumlah") int jumlah);

    @GET("posts/berita/{jumlah}")
    Call<ResponseBerita> berita(@Path("jumlah") int jumlah);

    @GET("posts/artikel/{jumlah}")
    Call<ResponseArtikel> artikel(@Path("jumlah") int jumlah);

    @GET("posts/kegiatan/{jumlah}")
    Call<ResponseKegiatan> kegiatan(@Path("jumlah") int jumlah);

    @GET("posts/{id}")
    Call<ResponseDetailArtikel> detail_artikel(@Path("id") int id_artikel);

    @GET("profile/dinas")
    Call<ResponseProfileDinas> dinas();

    @POST("profile")
    Call<ResponseUser> user(@Field("id") int id);
}
