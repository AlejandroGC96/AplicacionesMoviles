package com.example.alex_.tems32gridview;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class GridView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        final String[] datos= new String[31];
        final TextView label = (TextView) findViewById(R.id.textview);
        final android.widget.GridView grid;
        final android.widget.GridView mGridView;
        mGridView = findViewById(R.id.gridView1);
        final int mGridViewBGColor = Color.parseColor("#FF86A38B");
        for(int i=1; i<=31; i++)
            datos[i - 1]= " Día" +i;
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, datos);
        grid = findViewById(R.id.gridView1);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(
                        new AdapterView.OnItemClickListener() {
                                    public void onItemClick(AdapterView<?> parent, View v, int posicion, long id) {
                                        ColorDrawable[] colors = {
                                                new ColorDrawable(Color.RED), // Animation starting color
                                                new ColorDrawable(mGridViewBGColor) // Animation ending color
                                        };

                                        // Initialize a new transition drawable instance
                                        TransitionDrawable transitionDrawable = new TransitionDrawable(colors);
                                        v.setBackground(transitionDrawable);
                                        label.setText("Opción seleccionada: " + datos[posicion]);


                                    }
                                });
    }
}
