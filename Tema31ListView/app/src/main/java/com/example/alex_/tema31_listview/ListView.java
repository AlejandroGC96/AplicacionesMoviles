package com.example.alex_.tema31_listview;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);



        final TextView label;
        label = (TextView)findViewById(R.id.textView);
        final android.widget.ListView listaopciones;
        final String[] datos = new String[]{"R2-D2", "FIRE", "Cargas sismicas"};
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.r2d2);
        final MediaPlayer mp2= MediaPlayer.create(this, R.raw.rit);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.seismic);



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        listaopciones = findViewById(R.id.listView1);
        listaopciones.setAdapter(adapter);

        listaopciones.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> a, View v, int position, long id) {



                                        String opcionSeleccionada = (listaopciones.getAdapter().getItem(position).toString());

                        if (opcionSeleccionada=="R2-D2"){

                            mp.start();

                        }
                        if (opcionSeleccionada=="FIRE"){

                            mp2.start();

                        }
                        if (opcionSeleccionada=="Cargas sismicas"){

                            mp3.start();

                        }
                                        label.setText("Opción seleccionada: " + opcionSeleccionada);
                                    }
                                });
    }
}
