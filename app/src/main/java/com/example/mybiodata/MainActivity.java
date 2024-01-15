package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myTextView;
    EditText nama, alamat, kota;
    RadioGroup myRadioGroup;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nama = (EditText) findViewById(R.id.ETnama);
        alamat = (EditText) findViewById(R.id.ETalamat);
        kota = (EditText) findViewById(R.id.ETkota);
        myRadioGroup = (RadioGroup) findViewById(R.id.pilih_jk);
        myButton = (Button) findViewById(R.id.submitButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id_pilihan = myRadioGroup.getCheckedRadioButtonId();
                RadioButton pilih = (RadioButton) findViewById(id_pilihan);

                // Create an Intent to start the FormActivity
                Intent intent = new Intent(MainActivity.this, form.class);

                // Pass data to the FormActivity using Intent extras
                intent.putExtra("NAMA_KEY", nama.getText().toString());
                intent.putExtra("ALAMAT_KEY", alamat.getText().toString());
                intent.putExtra("KOTA_KEY", kota.getText().toString());
                intent.putExtra("JK_KEY", pilih.getText().toString());

                // Start the FormActivity
                startActivity(intent);
            }
        });
    }
}
