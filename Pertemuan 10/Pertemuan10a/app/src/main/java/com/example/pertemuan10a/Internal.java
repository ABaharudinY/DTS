package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Internal extends AppCompatActivity {

    public static final String FILENAME = "namafile.txt";
    Button newfile, changefile, readfile, deletfile;
    TextView readtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.internal);

        newfile = findViewById(R.id.buat_file);
        changefile = findViewById(R.id.ubah_file);
        readfile = findViewById(R.id.baca_file);
        deletfile = findViewById(R.id.hapus_file);
        readtext = findViewById(R.id.bacateks);
    }
    public void setNewfile(View view){
        String filecontents = "Enter The Text File";
        File file = new File(getFilesDir(),FILENAME);

        FileOutputStream outputStream = null;
        try{
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(filecontents.getBytes());
            outputStream.flush();
            outputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void setChangefile(View view){
        String change = "Update Text File";

        File file = new File(getFilesDir(),FILENAME);

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
        File file = new File(card,FILENAME);

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
        File file = new File(getFilesDir(), FILENAME);

        if (file.exists()){
            file.delete();
        }
    }
}
