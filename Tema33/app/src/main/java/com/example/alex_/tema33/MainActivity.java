package com.example.alex_.tema33;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Boton Acerca de
        final Button botonacercade = (Button) findViewById(R.id.button2);
        botonacercade.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intencion = new Intent(MainActivity.this, Acercade.class);
                                        startActivity(intencion);
                                    }
                                });
        //Boton Salir
        Button btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        //Boton Entrar
        final Button botonentrar = (Button) findViewById(R.id.button);
        botonentrar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intencion2 = new Intent(MainActivity.this, Entrar.class);
                startActivity(intencion2);
            }
        });
    }
}
