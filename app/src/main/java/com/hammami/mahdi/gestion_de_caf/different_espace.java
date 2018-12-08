package com.hammami.mahdi.gestion_de_caf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class different_espace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_different_espace);
    }

    public void tx_client(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
