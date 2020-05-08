package com.example.clase6;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class FormularioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla);
        ActionBar toolbar = getSupportActionBar();
        toolbar.setDisplayHomeAsUpEnabled(true);
        /*String nombre = (String) super.getIntent().getExtras().get("nombre");
        int edad = (int) super.getIntent().getExtras().get("edad");*/
        TextView tv =super.findViewById(R.id.tv);
        tv.setText(MainActivity.p.nombre+" - "+MainActivity.p.edad);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu m){
        super.getMenuInflater().inflate(R.menu.menu,m);
        return  true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem m){

        if(m.getItemId()==android.R.id.home){
            super.finish();
        }
        return false;
    }
}
