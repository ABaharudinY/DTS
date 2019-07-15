package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Eksternal extends AppCompatActivity {

    public static final String FILENAME = "ekternalfile.txt";
    Button newfile, changefile, readfile, deletfile;
    TextView readtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eksternal);

        newfile = findViewById(R.id.buat_file);
        changefile = findViewById(R.id.ubah_file);
        readfile = findViewById(R.id.baca_file);
        deletfile = findViewById(R.id.hapus_file);
        readtext = findViewById(R.id.bacateks);
    }
    public void setNewfile(View view){
        String oky = "Enter The Text File";

        String kondisi = Environment.getExternalStorageState();

        if (!Environment.MEDIA_MOUNTED.equals(kondisi)){
            return;
        }
        File file = new File(getExternalFilesDir(  null), FILENAME) ;
        FileOutputStream outputStream = null;
        try{
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(oky.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setChangefile(View view){
        String change = "Update Text File";
        String kondisi = Environment.getExternalStorageState();

        if (!Environment.MEDIA_MOUNTED.equals(kondisi)){
            return;
        }

        File file = new File(getExternalFilesDir(  null), FILENAME) ;

        FileOutputStream outputStream = null;

        try{
            file.createNewFile();
            outputStream = new FileOutputStream(file, false);
            outputStream.write(change.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setReadfile(View view){
        File card = getFilesDir();
        String kondisi = Environment.getExternalStorageState();

        if (!Environment.MEDIA_MOUNTED.equals(kondisi)){
            return;
        }
        File file = new File(getExternalFilesDir(  null), FILENAME) ;

        if(file.exists()){

            StringBuilder text = new StringBuilder();

            try{
                BufferedReader rd = new BufferedReader(new FileReader(file));

                String line = rd.readLine();

                while (line != null){
                    text.append(line);
                    line = rd.readLine();
                }
                rd.close();
            }catch (IOException e){
                System.out.println("Error " + e.getMessage());
            }
            readtext.setText(text.toString());
        }
    }

    public void  setDeletfile(View view){
        String kondisi = Environment.getExternalStorageState();

        if (!Environment.MEDIA_MOUNTED.equals(kondisi)){
            return;
        }
        File file = new File(getExternalFilesDir(  null), FILENAME) ;

        if (file.exists()){
            file.delete();
        }
    }
}
