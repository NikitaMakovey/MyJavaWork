package com.example.nikita.pravitelyros;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_test, btn_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        btn_test = (Button)findViewById(R.id.button);
        btn_date = (Button)findViewById(R.id.button2);
        btn_test.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nikita.pravitelyros.SecondActivity");
                        startActivity(intent);
                    }
                }
        );
        btn_date.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.nikita.pravitelyros.DateActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}
