package com.example.alex_.controllogin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ControlLogin extends RelativeLayout {
    private EditText textousuario;
    private EditText textopassword;
    private Button botonlogin;
    private TextView labellogin;
    private OnLoginListener onloginlistener;

    public ControlLogin(Context context){
        super(context);
        inicializar();
    }
    public ControlLogin(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
    }

    private void asignarEventos(){
        botonlogin.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v){
                onloginlistener.onLogin(textousuario.getText().toString(), textopassword.getText().toString());
            }
        });
    }

    private void inicializar(){
        //usamos el layout control_login
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li=(LayoutInflater)getContext().getSystemService(infService);
        li.inflate(R.layout.control_login, this, true);

        //obtenemos referencias
        textousuario= (EditText)findViewById(R.id.editText1);
        textopassword=(EditText)findViewById(R.id.editText2);
        botonlogin=(Button)findViewById(R.id.button1);


        //asociamos eventos
        asignarEventos();
    }

    public void setMensaje(String Mensaje){
        Toast.makeText(getActivity(), Mensaje, Toast.LENGTH_LONG).show();
    }

    private Context getActivity() {

        return getContext();
    }

    public void setOnLoginListener(OnLoginListener oll){
        onloginlistener=oll;
    }
}
