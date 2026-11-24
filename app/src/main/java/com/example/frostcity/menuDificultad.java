package com.example.frostcity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class menuDificultad extends AppCompatActivity {
    Button facil = new Button(this);
    Button normal = new Button(this);
    Button dificil = new Button(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);

        facil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recursos.madera = 75;
                Recursos.carbon = 100;
                Recursos.hierro = 70;
                Recursos.descontento = 25;

            }
        });
        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recursos.madera = 50;
                Recursos.carbon = 100;
                Recursos.hierro = 50;
                Recursos.descontento = 50;
            }
        });






    }
}