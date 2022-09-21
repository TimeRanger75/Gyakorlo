package com.example.gyakorlo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button Nagybetu, Kisbetu, Random_szin;
    private EditText Szoveg;
    private TextView ki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        Nagybetu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ki.setText( Szoveg.getText().toString().toUpperCase(Locale.ROOT));
            }
        });

        Kisbetu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ki.setText( Szoveg.getText().toString().toLowerCase(Locale.ROOT));
            }
        });

        Random_szin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd=new Random();
                int r=rnd.nextInt(255);
                int g=rnd.nextInt(255);
                int b=rnd.nextInt(255);

                ki.setBackgroundColor(Color.rgb(r,g,b));
            }
        });
    }

    private void init(){
        Szoveg=findViewById(R.id.Szoveg);
        Nagybetu=findViewById(R.id.Nagybetus);
        Kisbetu=findViewById(R.id.Kisbetu);
        Random_szin=findViewById(R.id.Random_szin);
        ki=findViewById(R.id.Out);
    }
}