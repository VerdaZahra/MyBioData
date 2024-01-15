package com.example.mybiodata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class form extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        // Receive data from MainActivity
        String nama = getIntent().getStringExtra("NAMA_KEY");
        String alamat = getIntent().getStringExtra("ALAMAT_KEY");
        String kota = getIntent().getStringExtra("KOTA_KEY");
        String jenisKelamin = getIntent().getStringExtra("JK_KEY");

        // Display data in TextViews
        TextView textViewNama = findViewById(R.id.textViewNama);
        TextView textViewAlamat = findViewById(R.id.textViewAlamat);
        TextView textViewKota = findViewById(R.id.textViewKota);
        TextView textViewJenisKelamin = findViewById(R.id.textViewJenisKelamin);

        textViewNama.setText("Nama: " + nama);
        textViewAlamat.setText("Alamat: " + alamat);
        textViewKota.setText("Kota: " + kota);
        textViewJenisKelamin.setText("Jenis Kelamin: " + jenisKelamin);
    }
}
