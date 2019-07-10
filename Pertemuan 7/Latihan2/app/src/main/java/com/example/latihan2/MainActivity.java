package com.example.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textedit;
    TextView texthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textedit = findViewById(R.id.text_edit);
    texthasil = findViewById(R.id.tex_hasil);
    }

    public void Texthasil(View view){

        texthasil.setText("Kalimat : "+textedit.getText());
    }
}
