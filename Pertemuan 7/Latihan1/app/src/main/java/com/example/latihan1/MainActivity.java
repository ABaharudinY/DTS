package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textnama;
    TextView hasilsentence;
    Button Btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textnama = findViewById(R.id.text_edit);
    hasilsentence = findViewById(R.id.text_hasil);
    Btn1 = findViewById(R.id.button_clik);

    }

    public void setHasilsentence(View view){
        hasilsentence.setText("Kalimat : "+textnama.getText());
    }
}
