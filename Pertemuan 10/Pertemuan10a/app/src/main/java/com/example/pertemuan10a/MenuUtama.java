package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {

    Button inter, ekster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_utama);

        inter = findViewById(R.id.Internal);
        ekster = findViewById(R.id.Ektrnal);
    }

    public void setInter(View view){
        Intent internal = new Intent(getApplicationContext(), Internal.class);
        startActivity(internal);
    }
    public void setEkster(View view){
        Intent eksternal = new Intent(getApplicationContext(), Eksternal.class);
        startActivity(eksternal);
    }
}
