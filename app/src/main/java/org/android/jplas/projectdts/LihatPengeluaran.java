package org.android.jplas.projectdts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LihatPengeluaran extends AppCompatActivity {

    private ListView lstpengeluaran;
    private ArrayAdapter<String> adapterlsvpengeluaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_pengeluaran);
        this.lstpengeluaran = this.findViewById(R.id.lsv_pengeluaran);

        this.adapterlsvpengeluaran = new ArrayAdapter<>(this, R.layout.listview_daftarpengeluaran, Beranda.dataPengeluaran);

        this.lstpengeluaran.setAdapter(this.adapterlsvpengeluaran);
    }
}