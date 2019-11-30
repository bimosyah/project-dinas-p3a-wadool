package syahputro.bimo.projek.dinas.p3a.network.response.artikel.detail_artikel;

import com.google.gson.annotations.SerializedName;

public class ResponseDetailArtikel{

	@SerializedName("total")
	private int total;

	@SerializedName("data")
	private Data data;

	@SerializedName("status")
	private boolean status;

	public void setTotal(int total){
		this.total = total;
	}

	public int getTotal(){
		return total;
	}

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}
}