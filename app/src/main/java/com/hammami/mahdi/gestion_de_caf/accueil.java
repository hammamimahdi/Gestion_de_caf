package com.hammami.mahdi.gestion_de_caf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    public void bu_retour(View view) {
        Intent Retour=new Intent(getApplicationContext(),MainActivity.class) ;
        startActivity(Retour);
    }

    public void bu_menu(View view)
    {Intent intent = new Intent(this, menu_Main2Activity.class);
        startActivity(intent);
    }
}
