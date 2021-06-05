/**
 *  Created by Azeez Fazry on Jun 6, 2021, 11:36:32 PM
 *
 *      git: github.com/azeez-fazry
 */
package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        onCreate();
    }

    private void onCreate() {
        String email = getIntent().getStringExtra("email");
        String fullname = getIntent().getStringExtra("fullName");

        TextView fullNameTV = findViewById(R.id.tvFullName);
        TextView emailTV = findViewById(R.id.tvEmail);

        fullNameTV.setText(fullname.toString());
        emailTV.setText(email.toString());
    }

    public void buLogOutActivity(View view) {
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}