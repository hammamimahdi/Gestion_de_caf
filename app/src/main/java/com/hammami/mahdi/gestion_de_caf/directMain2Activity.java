package com.hammami.mahdi.gestion_de_caf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class directMain2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direct_main2);
    }

    public void bu_retouramenu(View view) {
        Intent intent = new Intent(this, menu_Main2Activity.class);
        startActivity(intent);
    }
}
