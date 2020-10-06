package org.android.jplas.projectdts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TambahPengeluaran extends AppCompatActivity {

    private EditText edtketerangan, edtnominal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_pengeluaran);

        this.edtketerangan = this.findViewById(R.id.editTextketerangan);
        this.edtnominal = this.findViewById(R.id.editTextnominal);
    }

    public void btnsimpan(View view) {
        if (edtketerangan.getText().toString().equals(null) && !edtnominal.getText().toString().equals(null))
        {
            edtketerangan.setError("Isi Keterangan Pengeluaran");
        }
        else if (edtnominal.getText().toString().equals(null) && !edtketerangan.getText().toString().equals(null))
        {
            edtnominal.setError("Isi Nominal");
        }
        else if (edtnominal.getText().toString().equals(null) && edtketerangan.getText().toString().equals(null))
        {
            edtnominal.setError("Isi Nominal");
            edtketerangan.setError("Isi Keterangan Pengeluaran");
        }
        else if (!edtnominal.getText().toString().equals(null) && !edtketerangan.getText().toString().equals(null))
        {
            String keterangan = this.edtketerangan.getText().toString();
            String nominal = this.edtnominal.getText().toString();
            String pengeluaran = keterangan + " - " + nominal;
            Beranda.dataPengeluaran.add(pengeluaran);
            Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(TambahPengeluaran.this, LihatPengeluaran.class);
            startActivity(i);
        }
    }
}