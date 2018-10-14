package com.example.alex_.tema32;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;

public class ExtendedEditText extends android.support.v7.widget.AppCompatEditText{

    private Paint p1;
    private Paint p2;
    private float escala;

    public ExtendedEditText(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
        inicializacion();
    }

    public ExtendedEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializacion();
    }

    public ExtendedEditText(Context context) {
        super(context);
        inicializacion();
    }

    private void inicializacion()
    {
        //Esto se trata del fondo blanco
        p1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p1.setColor(Color.WHITE);
        p1.setStyle(Style.FILL);
        //Numero que nos contara los caracteres
        p2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p2.setColor(Color.BLACK);
        p2.setTextSize(40);
        escala = getResources().getDisplayMetrics().density;
    }

    @Override
    public void onDraw(Canvas canvas)
    {

        super.onDraw(canvas);
        canvas.drawRect(this.getWidth()-30*escala,5*escala,this.getWidth()-5*escala,20*escala, p1) ;
        canvas.drawText("" + this.getText().toString().length(),this.getWidth()-28*escala,17*escala, p2);
    }
}
