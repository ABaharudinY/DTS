package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OperasiGnapGanjil extends AppCompatActivity {

    EditText masuk;
    TextView hasilnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operasi_gnap_ganjil);
    masuk = findViewById(R.id.input_edit);
    hasilnya = findViewById(R.id.hasil_kuy);
    }

    public  void setHasilnya(View view){
       int hasilbo = Integer.parseInt(masuk.getText().toString());

        if ((hasilbo% 2 ) == 0 )
        {
            Toast toast = Toast.makeText( getApplicationContext(),"Nilai Bilangan "+hasilbo+" adalah bilangan bulat ", Toast.LENGTH_LONG);
            toast.show();
        }else{
            Toast toast = Toast.makeText( getApplicationContext(), "Nilai Bilangan "+hasilbo+" adalah bilangan Ganjil", Toast.LENGTH_LONG
            );
            toast.show();
        }
    }
}
