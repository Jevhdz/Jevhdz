package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView nombret;
    TextView apellidot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btnregresar = (Button) findViewById(R.id.btnRegresar);

       nombret = (TextView) findViewById(R.id.textView2);
       apellidot = (TextView) findViewById(R.id.textView3);

       Bundle extras = getIntent().getExtras();
       String nombree = extras.getString("NOMBRE");
       String apellidoo = extras.getString("APELLIDO");
       nombret.setText(nombree.toUpperCase());
       apellidot.setText(apellidoo.toUpperCase());

       btnregresar.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
           }
       });


    }
}
