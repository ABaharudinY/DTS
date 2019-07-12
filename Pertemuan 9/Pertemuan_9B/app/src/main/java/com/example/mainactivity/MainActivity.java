package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView LvItem;
    private String[] namanegara = new String[]{
            "Indonesia","Malaysia","Singapore",
            "Italia","Inggris","Belanda",
            "Argentina","Chile",
            "Mesir","Uganda"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("ListView Sederhana");


        LvItem = (ListView) findViewById(R.id.listNama);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>( getApplicationContext(),
                android.R.layout.simple_list_item_1,
                namanegara);

        LvItem.setAdapter(adapter);
        LvItem.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                 Toast.makeText( getApplicationContext(), "Memilih : "+namanegara[position],
                 Toast.LENGTH_LONG).show();
             }
        });
    }
}
