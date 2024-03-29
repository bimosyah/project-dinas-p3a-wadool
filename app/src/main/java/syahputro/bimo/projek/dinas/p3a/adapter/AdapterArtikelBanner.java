package syahputro.bimo.projek.dinas.p3a.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import syahputro.bimo.projek.dinas.p3a.R;
import syahputro.bimo.projek.dinas.p3a.activity.ActivityArticleDetail;
import syahputro.bimo.projek.dinas.p3a.network.response.artikel.list_slider.DataSlider;

public class AdapterArtikelBanner extends RecyclerView.Adapter<AdapterArtikelBanner.Holder> {
    public List<DataSlider> list;
    public Context context;

    public AdapterArtikelBanner(List<DataSlider> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterArtikelBanner.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_halaman_utama_artikel_top, parent, false);

        return new AdapterArtikelBanner.Holder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final AdapterArtikelBanner.Holder holder, int position) {
        final DataSlider dataSlider = list.get(position);
        holder.tv_halaman_utama_artikel_top.setText(dataSlider.getTitle());
        Glide.with(context).
                load(dataSlider.getImage()).
                into(holder.iv_halaman_utama_artikel_top);

        holder.iv_halaman_utama_artikel_top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ActivityArticleDetail.class);
                intent.putExtra("id_artikel", dataSlider.getId());
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        int limit_data = 4;
        if (list.size() > limit_data) {
            return limit_data;
        } else {
            return list.size();
        }
    }

    class Holder extends RecyclerView.ViewHolder {
        ImageView iv_halaman_utama_artikel_top;
        TextView tv_halaman_utama_artikel_top;

        Holder(@NonNull View itemView) {
            super(itemView);
            iv_halaman_utama_artikel_top = itemView.findViewById(R.id.iv_halaman_utama_artikel_top);
            tv_halaman_utama_artikel_top = itemView.findViewById(R.id.tv_halaman_utama_artikel_top);
        }
    }
}
