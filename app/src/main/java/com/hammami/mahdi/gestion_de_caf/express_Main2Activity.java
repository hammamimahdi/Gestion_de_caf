package com.hammami.mahdi.gestion_de_caf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class express_Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_express__main2);
        Button achat = (Button)findViewById(R.id.bu_acheter);
        achat.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Toast.makeText(express_Main2Activity.this, R.string.ms1, Toast.LENGTH_SHORT).show();
                return;
            }

                        }



        );




}

    public void bu_retour_a_menu(View view) {
            Intent intent = new Intent(this, menu_Main2Activity.class);
            startActivity(intent);

        }

    }

