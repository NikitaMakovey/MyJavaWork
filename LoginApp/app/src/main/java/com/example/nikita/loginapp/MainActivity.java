package com.example.nikita.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private Button btn;
    private EditText email, pass;

    private static final String email_txt = "niks.finn@gmail.com";
    private static final String pass_txt = "goniMak";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login() {
        img = (ImageView)findViewById(R.id.imageView);
        btn = (Button)findViewById(R.id.button2);
        email = (EditText)findViewById(R.id.editText3);
        pass = (EditText)findViewById(R.id.editText4);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (email_txt.equals(String.valueOf(email.getText())) && pass_txt.equals(String.valueOf(pass.getText())))
                            img.setImageResource(R.drawable.right);
                        else
                            img.setImageResource(R.drawable.wrong);
                    }
                }
        );
    }
}
