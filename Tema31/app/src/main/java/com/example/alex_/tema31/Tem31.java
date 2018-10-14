package com.example.alex_.tema31;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class Tem31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tem31);

        //IMAGEVIEW

        final ImageView imagen;

        imagen=(ImageView)findViewById(R.id.imageView);

        //Video

        final VideoView video;

        video=(VideoView)findViewById(R.id.videoView);
        String uriPath = "android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri = Uri.parse(uriPath);
        video.setVideoURI(uri);

        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            public void onPrepared(MediaPlayer arg0) {

                video.start();
                arg0.setLooping(true);//Loop

            }
        });

        //ArrayAdapter

        final String[] datos = new String[]{"Selecciona una opcion","Rocket", "Blood of the Dead", "JOIN ME"};
        final TextView texto;

        texto = (TextView) findViewById(R.id.texto1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);

        //Creacion del Spinner

        final Spinner spin;

        spin = (Spinner) findViewById(R.id.spinner1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapter);

        //Listener Spinner

        spin.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent, View v, int posicion, long id) {




                        if(datos[posicion]=="Selecciona una opcion") {
                            imagen.setVisibility(View.INVISIBLE);
                            video.setVisibility(View.INVISIBLE);

                        }


                        if(datos[posicion]=="Rocket") {

                            video.setVisibility(View.VISIBLE);
                            imagen.setVisibility(View.INVISIBLE);
                            Toast.makeText(parent.getContext(), "Se seleccionó: " + parent.getItemAtPosition(posicion).toString(),
                                    Toast.LENGTH_LONG).show();

                        }
                        if(datos[posicion]=="Blood of the Dead"){
                            video.setVisibility(View.INVISIBLE);
                            imagen.setVisibility(View.VISIBLE);
                            imagen.setImageResource(R.drawable.zombies);
                            Toast.makeText(parent.getContext(), "Se seleccionó: " + parent.getItemAtPosition(posicion).toString(),
                                    Toast.LENGTH_LONG).show();

                        }
                        if(datos[posicion]=="JOIN ME"){
                            video.setVisibility(View.INVISIBLE);
                            imagen.setVisibility(View.VISIBLE);

                            imagen.setImageResource(R.drawable.vaderjpg);
                            Toast.makeText(parent.getContext(), "Se seleccionó: " + parent.getItemAtPosition(posicion).toString(),
                                    Toast.LENGTH_LONG).show();

                        }
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        texto.setText("@string/textview");

                    }
                }
        );

    }
}

