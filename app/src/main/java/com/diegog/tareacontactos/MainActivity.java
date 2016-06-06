package com.diegog.tareacontactos;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button siguiente = (Button)findViewById(R.id.btnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextInputLayout tilNombre   = (TextInputLayout)findViewById(R.id.etNombre);
                DatePicker tilFechaNac      = (DatePicker)findViewById(R.id.dpFechaNac);
                TextInputLayout tilTel      = (TextInputLayout)findViewById(R.id.etTel);
                TextInputLayout tilEmail    = (TextInputLayout)findViewById(R.id.etEmail);
                TextInputLayout tilDesc     = (TextInputLayout)findViewById(R.id.etDescCont);

                Intent intent = new Intent(MainActivity.this,Confirmacion.class);


                intent.putExtra(getResources().getString(R.string.nombre),tilNombre.getEditText().getText().toString() );
                intent.putExtra(getResources().getString(R.string.fechaNac), tilFechaNac.getMonth()+" "+tilFechaNac.getDayOfMonth()+" "+tilFechaNac.getYear());
                intent.putExtra(getResources().getString(R.string.tel),tilTel.getEditText().getText().toString() );
                intent.putExtra(getResources().getString(R.string.email), tilEmail.getEditText().getText().toString());
                intent.putExtra(getResources().getString(R.string.desc), tilDesc.getEditText().getText().toString());
                startActivity(intent);


            }
        });



    }
}
