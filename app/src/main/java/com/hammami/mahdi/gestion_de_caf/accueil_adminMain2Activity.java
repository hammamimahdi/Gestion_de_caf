package com.hammami.mahdi.gestion_de_caf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class accueil_adminMain2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_admin_main2);
    }

    public void bu_ajouter(View view) {
        Intent intent = new Intent(this, ajout_Main2Activity.class);
        startActivity(intent);
    }

    public void bu_modifier(View view) {
        Intent intent = new Intent(this, modifier_Main2Activity.class);
        startActivity(intent);
    }

    public void by_supprimer(View view) {
        Intent intent = new Intent(this, supprimer_Main2Activity.class);
        startActivity(intent);
    }
}
