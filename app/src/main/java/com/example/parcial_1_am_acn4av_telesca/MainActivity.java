package com.example.parcial_1_am_acn4av_telesca;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void mostrarMensajeProximamente(View v)
    {
        TextView text_view_mensaje_prox = findViewById(R.id.mensaje_proximamente);
        text_view_mensaje_prox.setText(R.string.mensaje_proximamente);
        if(text_view_mensaje_prox.getVisibility() == TextView.INVISIBLE) {
            text_view_mensaje_prox.setVisibility(TextView.VISIBLE);
        }else{
            text_view_mensaje_prox.setVisibility(TextView.INVISIBLE);
        }
    }


}