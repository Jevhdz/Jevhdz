package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText nombre;
    EditText apellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnEnviar);
        nombre = (EditText)findViewById(R.id.edtNombre);
        apellido = (EditText) findViewById(R.id.edtapellido);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                intent.putExtra("NOMBRE",nombre.getText().toString());
                intent.putExtra("APELLIDO",apellido.getText().toString());
                startActivity(intent);
            }
        });

    }

}
