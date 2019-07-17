package com.example.aplikasisqlite;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.aplikasisqlite.helper.DbHelper;


public class AddEdit extends AppCompatActivity {

    EditText txt_id, txt_name, txt_address;
    Button btn_submit, btn_cancel;
    DbHelper SQLite = new DbHelper(this);
    String id, name, address;

    @Override
    protected  void  onCreate(Bundle saveInstanceState) {
         super.onCreate(saveInstanceState);
         setContentView(R.layout.activity_add_edit);
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         txt_id = findViewById(R.id.text_id);
         txt_name = findViewById(R.id.text_name);
         txt_address = findViewById(R.id.text_address);

         id = getIntent().getStringExtra(MainActivity.TAG_ID);
         name = getIntent().getStringExtra(MainActivity.TAG_NAME);
         address = getIntent().getStringExtra(MainActivity.TAG_ADDRESS);

         if (id == null || id == ""){
             setTitle("Add Data");
         }else {
             setTitle("Edit Data");
             txt_id.setText(id);
             txt_name.setText(name);
             txt_address.setText(address);
         }

         btn_submit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 try{
                     if (txt_id.getText().toString().equals("")){
                         save();
                     }else {
                         edit();
                     }
                 }catch (Exception e){
                     Log.e("SUBMIT", e.toString());
                 }
             }
         });

         btn_cancel.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 blank();
                 finish();
             }
         });
    }
    @Override
    public void onBackPressed(){
        finish();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
            this.finish();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
    //kosongkan semua edit teks
    private void blank(){
        txt_name.requestFocus();
        txt_id.setText(null);
        txt_name.setText(null);
        txt_address.setText(null);
    }

    private void save(){
        if (String.valueOf(txt_name.getText()).equals(null) || String.valueOf(txt_name.getText()).equals("") ||
        String.valueOf(txt_address.getText()).equals(null) || String.valueOf(txt_address.getText()).equals("")){
            Toast.makeText(getApplicationContext(),
                    "Please Input Name Or Address  ", Toast.LENGTH_SHORT).show();
        }else {
            SQLite.update(Integer.parseInt(txt_id.getText().toString().trim()), txt_name.getText().toString().trim(),
                    txt_address.getText().toString().trim());
            blank();
            finish();
        }
    }
    private void edit(){
        if (String.valueOf(txt_name.getText()).equals(null) || String.valueOf(txt_name.getText()).equals("") ||
                String.valueOf(txt_address.getText()).equals(null) || String.valueOf(txt_address.getText()).equals("")){
            Toast.makeText(getApplicationContext(),
                    "Please Input Name Or Address  ", Toast.LENGTH_SHORT).show();
        }else {
            SQLite.update(Integer.parseInt(txt_id.getText().toString().trim()), txt_name.getText().toString().trim(),
                    txt_address.getText().toString().trim());
            blank();
            finish();
        }

    }
}
