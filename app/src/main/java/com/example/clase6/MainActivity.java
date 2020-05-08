package com.example.clase6;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menuItem){
            super.getMenuInflater().inflate(R.menu.menu,menuItem);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){

        if(item.getItemId()==R.id.opcion1){
            Log.d("Click en menu","Se hizo click en configuracion!!!");
        }else if(item.getItemId()==R.id.opcion2){
            Log.d("Click en menu","Se hizo click en ALTA");

            Intent intent = new Intent(this,FormularioActivity.class);
            intent.putExtra("persona","Matias");
            intent.putExtra("edad",31);

            super.startActivity(intent);

        }else if(android.R.id.home == item.getItemId()){
            super.finish();
        }

        return  false;
    }
}
