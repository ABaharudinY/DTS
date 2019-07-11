package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no1,no2;
    TextView hasil;
    Button Btn1,Btn2,Btn3,Btn4,sampah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        no1 = findViewById(R.id.edit_1);
        no2 = findViewById(R.id.edit_2);
        hasil = findViewById(R.id.tamp);
        Btn1 = findViewById(R.id.Jmlh);
        Btn2 = findViewById(R.id.kurang);
        Btn3 = findViewById(R.id.kali);
        Btn4 = findViewById(R.id.bagi);
        sampah = findViewById(R.id.clear);
    }

    public void setjmlh(View view){

        if((no1.getText().length() > 0) && (no2.getText().length() > 0)){
            int input1 = Integer.parseInt(no1.getText().toString());
            int input2 = Integer.parseInt(no2.getText().toString());
            int submit = input1 + input2;
            hasil.setText(Integer.toString(submit));
        }else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan ",Toast.LENGTH_LONG);
            toast.show();
        }

    }

    public void setmins(View view){

        if((no1.getText().length() > 0) && (no2.getText().length() > 0)){
            int input1 = Integer.parseInt(no1.getText().toString());
            int input2 = Integer.parseInt(no2.getText().toString());
            int submit = input1 - input2;
            hasil.setText(Integer.toString(submit));
        }else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan ",Toast.LENGTH_LONG);
            toast.show();
        }

    }
    public void setkali(View view){

        if((no1.getText().length() > 0) && (no2.getText().length() > 0)){
            int input1 = Integer.parseInt(no1.getText().toString());
            int input2 = Integer.parseInt(no2.getText().toString());
            int submit = input1 * input2;
            hasil.setText(Integer.toString(submit));
        }else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan ",Toast.LENGTH_LONG);
            toast.show();
        }

    }

    public void setbagi(View view){

        if((no1.getText().length() > 0) && (no2.getText().length() > 0)){
            int input1 = Integer.parseInt(no1.getText().toString());
            int input2 = Integer.parseInt(no2.getText().toString());
            int submit = input1 / input2;
            hasil.setText(Integer.toString(submit));
        }else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan ",Toast.LENGTH_LONG);
            toast.show();
        }

    }
    public void reset(View view){
        no1.setText("");
        no2.setText("");
        hasil.setText("0");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.pilihmenu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.opra){
            startActivity(new Intent(this, OperasiGnapGanjil.class));
        }
        return true;
    }
}
