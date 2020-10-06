package org.android.jplas.projectdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class Beranda extends AppCompatActivity {

    public static ArrayList<String> dataPengeluaran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        if (dataPengeluaran == null)
        {
            dataPengeluaran = new ArrayList<>();
            dataPengeluaran.add("Sarapan - 10000");
            dataPengeluaran.add("Makan Siang - 12000");
        }
    }

    public void btnlihat(View view) {
        Intent i = new Intent(Beranda.this, LihatPengeluaran.class);
        startActivity(i);
    }

    public void btntambah(View view) {
        Intent i = new Intent(Beranda.this, TambahPengeluaran.class);
        startActivity(i);
    }
}