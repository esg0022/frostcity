package com.example.frostcity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class game extends AppCompatActivity {
    Button construir = new Button(this);
    Button pasar = new Button(this);
    Button guardar = new Button(this);

    int madera = Recursos.madera;
    int carbon = Recursos.carbon;
    int hierro = Recursos.hierro;

    int poblacion = Recursos.poblacion;
    int casa = Recursos.casa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);

        construir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }
}