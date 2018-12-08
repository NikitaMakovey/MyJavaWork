package com.example.nikita.pravitelyros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    String[] periods = {"IX - XII ВЕКА", "XII - XVII ВЕКА", "XVII - XX ВЕКА", "XX - XI ВЕКА"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // находим список
        ListView listView = (ListView)findViewById(R.id.listView);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, periods);

        // присваиваем адаптер списку
        listView.setAdapter(adapter);
    }
}
