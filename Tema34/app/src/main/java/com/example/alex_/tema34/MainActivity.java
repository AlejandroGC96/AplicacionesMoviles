package com.example.alex_.tema34;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText textnombre = (EditText)findViewById(R.id.TextNombre);
        final Button buttonnombre = (Button)findViewById(R.id.buttonNombre);


        buttonnombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intencion = new Intent(MainActivity.this, saludo.class);

                Bundle b = new Bundle();
                b.putString("Nombre", textnombre.getText().toString());

                intencion.putExtras(b);

                startActivity(intencion);

            }
        });
    }
}
