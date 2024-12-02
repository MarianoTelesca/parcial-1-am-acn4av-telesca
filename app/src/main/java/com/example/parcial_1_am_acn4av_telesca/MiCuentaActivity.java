package com.example.parcial_1_am_acn4av_telesca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MiCuentaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuenta);

        Button boton_regresar = findViewById(R.id.btnBackToMain);
        boton_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MiCuentaActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        Button boton_cerrar_sesion = findViewById(R.id.btnCerrarSesion);
        boton_cerrar_sesion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MiCuentaActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}