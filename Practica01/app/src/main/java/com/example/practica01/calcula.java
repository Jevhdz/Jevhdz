package com.example.practica01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class calcula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView txtResultado = (TextView)findViewById(R.id.txtVResultado);
        final EditText edtNumero1 = (EditText)findViewById(R.id.edtnuno);
        final EditText edtNumero2 = (EditText)findViewById(R.id.edtndos);
        Button btnSuma = (Button)findViewById(R.id.btnSuma);
        Button btnResta = (Button)findViewById(R.id.btnResta);
        Button btnMulti = (Button)findViewById(R.id.btnMultip);
        Button btnDiv = (Button)findViewById(R.id.btnDividir);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Introduzca ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica suma = new aritmetica(numero1,numero2);

                txtResultado.setText("Suma: " + String.valueOf(suma.suma()));

            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduza ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica resta = new aritmetica(numero1,numero2);

                txtResultado.setText("Resta: " + String.valueOf(resta.resta()));

            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduza ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica mul = new aritmetica(numero1,numero2);

                txtResultado.setText("Multiplicación: " + String.valueOf(mul.multiplicacion()));

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnumero1 = edtNumero1.getText().toString();
                String strnumero2 = edtNumero2.getText().toString();

                if(strnumero1.equals("") || strnumero2.equals("")){
                    Toast.makeText(getApplicationContext(),"Introduza ambos número", Toast.LENGTH_LONG).show();
                    return;
                }

                int numero1 = Integer.parseInt(strnumero1);
                int numero2 = Integer.parseInt(strnumero2);
                aritmetica div = new aritmetica(numero1,numero2);

                txtResultado.setText("División: " + String.valueOf(div.division()));

            }
        });

    }
}
