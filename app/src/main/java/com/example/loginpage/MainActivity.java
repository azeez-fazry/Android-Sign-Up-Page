/**
 *  Created by Azeez Fazry on Jun 2, 2021, 10:52:21 PM
 *
 *      git: github.com/azeez-fazry
 */
package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buSignupActivity(View view) {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
    }

    public void buLoginAction(View view) {
        EditText usernameET = findViewById(R.id.etEmail);
        String username = usernameET.getText().toString();

        EditText passwordET = findViewById(R.id.etPassword);
        String password = passwordET.getText().toString();

        Toast.makeText(MainActivity.this, "Completed", Toast.LENGTH_LONG).show();

    }
}