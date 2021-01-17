package com.vistasgruposdevistas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity9 extends AppCompatActivity {

    private final static String[] names = { "Perro", "Gato", "Caballo", "Canario", "Vaca", "Cerdo" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        Button btn13 = (Button) findViewById(R.id.siguiente9);
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity11.class);
                startActivityForResult(intent,0);
            }
        });

        Button btn14 = (Button) findViewById(R.id.atras9);
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), MainActivity8.class);
                startActivityForResult(intent,0);
            }
        });
    }
}