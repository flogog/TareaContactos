package com.diegog.tareacontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmacion extends AppCompatActivity {
    TextView tvNombre;
    TextView tvFechaNac;
    TextView tvTel;
    TextView tvEmail;
    TextView tvDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion);

        Bundle param    =   getIntent().getExtras();

        String nombre   = param.getString(getResources().getString(R.string.nombre));
        String fechaNac = param.getString(getResources().getString(R.string.fechaNac));
        String tel      = param.getString(getResources().getString(R.string.tel));
        String email    = param.getString(getResources().getString(R.string.email));
        String desc     = param.getString(getResources().getString(R.string.desc));

        tvNombre   = (TextView) findViewById(R.id.tvNombre);
        tvFechaNac   = (TextView) findViewById(R.id.tvFechaNac);
        tvTel   = (TextView) findViewById(R.id.tvTel);
        tvEmail   = (TextView) findViewById(R.id.tvEmail);
        tvDesc   = (TextView) findViewById(R.id.tvDesc);

        tvNombre.setText(nombre);
        tvFechaNac.setText(fechaNac);
        tvTel.setText(tel);
        tvEmail.setText(email);
        tvDesc.setText(desc);

        Button editar = (Button)findViewById(R.id.buttonEditarDatos);

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Confirmacion.this,MainActivity.class);
                intent.putExtra(getResources().getString(R.string.nombre),tvNombre.getText());
                intent.putExtra(getResources().getString(R.string.tel),tvTel.getText());
                intent.putExtra(getResources().getString(R.string.email), tvEmail.getText());
                intent.putExtra(getResources().getString(R.string.desc), tvDesc.getText());
                startActivity(intent);

            }
        });
    }
}
