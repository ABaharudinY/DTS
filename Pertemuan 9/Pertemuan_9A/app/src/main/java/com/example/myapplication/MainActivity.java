package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3;
    TextView t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
        e3 = findViewById(R.id.edit3);
        t1 = findViewById(R.id.text5);
        t2 = findViewById(R.id.text6);
        t3 = findViewById(R.id.text7);

    }

    public  void  sehasil(View view){
        t1.setText("NIM adalah "+e1.getText().toString());
        t2.setText("NAMA adalah "+e2.getText().toString());
        t3.setText("KAMPUS adalah "+e3.getText().toString());
    }
}
