package syahputro.bimo.projek.dinas.p3a.network.response.pengaduan;

import com.google.gson.annotations.SerializedName;

import syahputro.bimo.projek.dinas.p3a.network.response.login.Data;

public class ResponsePengaduan {
    @SerializedName("status")
    private String status;
    @SerializedName("message")
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
