package com.example.parcial_1_am_acn4av_telesca;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    LinearLayout layout_mensaje;
    Button boton_tenis;
    Button boton_futbol;
    Button boton_basket;
    Button boton_parrilla;
    Button boton_cumpleanios;
    Button boton_gimnasio;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout_mensaje = findViewById(R.id.layout_mensaje);

        boton_tenis = findViewById(R.id.boton_tenis);
        boton_tenis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_mensaje.setVisibility(View.VISIBLE);
                TextView mensaje = new TextView(MainActivity.this);
                mensaje.setText(R.string.mensaje_proximamente);
                mensaje.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                layout_mensaje.addView(mensaje);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        layout_mensaje.removeView(mensaje);
                        layout_mensaje.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });

        boton_futbol = findViewById(R.id.boton_futbol);
        boton_futbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_mensaje.setVisibility(View.VISIBLE);
                TextView mensaje = new TextView(MainActivity.this);
                mensaje.setText(R.string.mensaje_proximamente);
                mensaje.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                layout_mensaje.addView(mensaje);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        layout_mensaje.removeView(mensaje);
                        layout_mensaje.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });

        boton_basket = findViewById(R.id.boton_basket);
        boton_basket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_mensaje.setVisibility(View.VISIBLE);
                TextView mensaje = new TextView(MainActivity.this);
                mensaje.setText(R.string.mensaje_proximamente);
                mensaje.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                layout_mensaje.addView(mensaje);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        layout_mensaje.removeView(mensaje);
                        layout_mensaje.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });

        boton_parrilla = findViewById(R.id.boton_parrilla);
        boton_parrilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_mensaje.setVisibility(View.VISIBLE);
                TextView mensaje = new TextView(MainActivity.this);
                mensaje.setText(R.string.sin_turno_parrilla);
                mensaje.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                layout_mensaje.addView(mensaje);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        layout_mensaje.removeView(mensaje);
                        layout_mensaje.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });

        boton_cumpleanios = findViewById(R.id.boton_cumpleanios);
        boton_cumpleanios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_mensaje.setVisibility(View.VISIBLE);
                TextView mensaje = new TextView(MainActivity.this);
                mensaje.setText(R.string.mensaje_proximamente);
                mensaje.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                layout_mensaje.addView(mensaje);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        layout_mensaje.removeView(mensaje);
                        layout_mensaje.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });

        boton_gimnasio = findViewById(R.id.boton_gimnasio);
        boton_gimnasio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout_mensaje.setVisibility(View.VISIBLE);
                TextView mensaje = new TextView(MainActivity.this);
                mensaje.setText(R.string.sin_turno_gimnasio);
                mensaje.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

                layout_mensaje.addView(mensaje);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    public void run() {
                        layout_mensaje.removeView(mensaje);
                        layout_mensaje.setVisibility(View.INVISIBLE);
                    }
                }, 2000);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}