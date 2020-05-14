package com.example.jacourses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CursosActivity extends AppCompatActivity {

    Button btnSalir;
    ImageButton btnInicio, btnCursos;
    CardView Card1, Card2, Card3, Card4, Card5, Card6, Card7, Card8, Card9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        btnInicio = findViewById(R.id.imgBtnInicio);
        btnCursos = findViewById(R.id.imgBtnCursos);
        btnSalir = findViewById(R.id.btnSalir);

        Card1 = findViewById(R.id.card1);
        Card2 = findViewById(R.id.card2);
        Card3 = findViewById(R.id.card3);
        Card4 = findViewById(R.id.card4);
        Card5 = findViewById(R.id.card5);
        Card6 = findViewById(R.id.card6);
        Card7 = findViewById(R.id.card7);
        Card8 = findViewById(R.id.card8);
        Card9 = findViewById(R.id.card9);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
                startActivity(intent);
            }
        });

        btnCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CursosActivity.class);
                startActivity(intent);
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main1Activity.class);
                startActivity(intent);
            }
        });

        Card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
            }
        });

        Card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);
            }
        });

        Card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(intent);
            }
        });

        Card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
                startActivity(intent);
            }
        });

        Card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main6Activity.class);
                startActivity(intent);
            }
        });

        Card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main7Activity.class);
                startActivity(intent);
            }
        });

        Card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main8Activity.class);
                startActivity(intent);
            }
        });

        Card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main9Activity.class);
                startActivity(intent);
            }
        });
    }
}
