package com.example.alex_.tema34;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class saludo extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saludo);

        TextView textSaludo = (TextView)findViewById(R.id.TextSaludo);

        Bundle b = this.getIntent().getExtras();

        textSaludo.setText("Hola, " + b.getString("Nombre"));
    }
}
