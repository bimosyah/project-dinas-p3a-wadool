package syahputro.bimo.projek.dinas.p3a.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import syahputro.bimo.projek.dinas.p3a.R;
import syahputro.bimo.projek.dinas.p3a.network.response.riwayat.Data;

public class AdapterRiwayat extends RecyclerView.Adapter<AdapterRiwayat.Holder>{
    public List<Data> list;
    public Context context;

    public AdapterRiwayat(List<Data> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterRiwayat.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_riwayat_pengaduan, parent, false);

        return new AdapterRiwayat.Holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRiwayat.Holder holder, int position) {
        Data data = list.get(position);
        holder.tvTanggal.setText(data.getWaktuLapor());
        String status = data.getStatus();
        String color = context.getResources().getString(R.string.color_belum_direspon);

        switch (data.getId_status()) {
            case "0":
                color = context.getResources().getString(R.string.color_belum_direspon);
                break;
            case "1":
                color = context.getResources().getString(R.string.color_sudah_teratasi);
                break;
            case "2":
                color = context.getResources().getString(R.string.color_tidak_teratasi);
                break;
            case "3":
                color = context.getResources().getString(R.string.color_tidak_bisa_dihubungi);
                break;
            case "4":
                color = context.getResources().getString(R.string.color_on_proses);
                break;
        }


        holder.tvKategori.setText(data.getKategori());
        holder.tvStatus.setText(status);
        holder.tvStatus.getBackground().setColorFilter(Color.parseColor(color), PorterDuff.Mode.SRC_ATOP);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Holder extends RecyclerView.ViewHolder{
        public TextView tvTanggal,tvStatus, tvKategori;
        public Holder(@NonNull View itemView) {
            super(itemView);
            tvKategori = itemView.findViewById(R.id.tvKategori);
            tvTanggal = itemView.findViewById(R.id.tvTanggal);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
    }
}
