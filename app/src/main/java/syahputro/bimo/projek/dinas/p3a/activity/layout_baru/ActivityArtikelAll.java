package syahputro.bimo.projek.dinas.p3a.activity.layout_baru;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import syahputro.bimo.projek.dinas.p3a.R;

public class ActivityArtikelAll extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Berita");
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}