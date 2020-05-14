package com.example.jacourses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Main9Activity extends AppCompatActivity {

    ImageButton btnInicio, btnCursos, btnPerfil, Back;
    VideoView videoView1;
    Button btnVideo1, btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        btnInicio = findViewById(R.id.imgBtnInicio);
        btnCursos = findViewById(R.id.imgBtnCursos);
        btnSalir = findViewById(R.id.btnSalir);
        Back = findViewById(R.id.imgBtnRegresar);
        videoView1 = findViewById(R.id.video1);
        btnVideo1 = findViewById(R.id.btnVerVideo1);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView1);

        String uri = "www.youtube.com/watch?v=xnWtGNiG2lg&list=PLhSj3UTs2_yVC0iaCGf16glrrfXuiSd0G";
        videoView1.setMediaController(mediaController);
        videoView1.setVideoURI(Uri.parse(uri));
        videoView1.start();

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

        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CursosActivity.class);
                startActivity(intent);
            }
        });
    }
}
