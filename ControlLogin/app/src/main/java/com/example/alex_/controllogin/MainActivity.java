package com.example.alex_.controllogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ControlLogin controldelogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controldelogin = (ControlLogin)findViewById(R.id.Cntrollogin);
        controldelogin.setOnLoginListener(new OnLoginListener(){
            @Override
            public void onLogin(String usuario, String password){
                //se valida si coinciden los usuarios
                if (usuario.equals("Richtofen") && password.equals("115"))
                    controldelogin.setMensaje("Acceso concedido");

                else
                    controldelogin.setMensaje("No tiene acceso");
            }
        });

    }
}
