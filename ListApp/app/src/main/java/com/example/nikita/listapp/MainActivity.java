package com.example.nikita.listapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private Button st_btn;
    private SeekBar seek;
    private String [] names = new String[] {"Никита", "Оля", "Ирина", "Георгий", "София", "Артём", "Сергей", "Настя"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

        list = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.names, names);
        list.setAdapter(adapter);
        seek = (SeekBar)findViewById(R.id.seekBar2);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String val = (String)list.getItemAtPosition(i);
                        Toast.makeText(
                                MainActivity.this,
                                "Позиция №" + (i+1) + " : " + val + ", прогресс - " + seek.getProgress(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }

    public void addListenerOnButton () {
        st_btn = (Button)findViewById(R.id.static_btn);
        st_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent("com.example.nikitamak.Static");
                        startActivity(intent);
                    }
                }
        );
    }
}
