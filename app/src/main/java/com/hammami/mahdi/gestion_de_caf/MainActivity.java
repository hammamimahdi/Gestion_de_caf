package com.hammami.mahdi.gestion_de_caf;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {
    final String EXTRA_LOGIN = "login";
    final String EXTRA_PASSWORD = "password";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText login = (EditText) findViewById(R.id.log);
        final EditText pass = (EditText) findViewById(R.id.password);
        final Button loginButton = (Button) findViewById(R.id.b1);
        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String loginTxt = login.getText().toString();
                final String passTxt = pass.getText().toString();
                // On vérifie que le login et le password ne sont pas vides
                if (loginTxt.equals("") || passTxt.equals("")) {
                    Toast.makeText(MainActivity.this, R.string.login_or_password_empty, Toast.LENGTH_SHORT).show();
                    return;
                }
                // On déclare le pattern que l’on doit vérifier
                Pattern p = Pattern.compile("[a-z]");



                Intent intent = new Intent(MainActivity.this, accueil.class);
                intent.putExtra(EXTRA_LOGIN, loginTxt);
                intent.putExtra(EXTRA_PASSWORD, passTxt);
                startActivity(intent);

}
});}}

