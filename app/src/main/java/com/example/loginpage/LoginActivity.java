/**
 *  Created by Azeez Fazry on Jun 3, 2021, 12:02:10 AM
 *
 *      git: github.com/azeez-fazry
 */
package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void buSignupAction(View view) {

        // declaration of components
        EditText fullNameET = (EditText) findViewById(R.id.etFirstName);
        EditText usernameET = (EditText) findViewById(R.id.etUsername);
        EditText passwordET = (EditText) findViewById(R.id.etPassword);
        EditText confirmPasswordET = (EditText) findViewById(R.id.etConfirmPassword);

        String fullname = fullNameET.getText().toString();
        String username = usernameET.getText().toString();
        String password = passwordET.getText().toString();
        String confirmPassword = confirmPasswordET.getText().toString();

        if(!(Patterns.EMAIL_ADDRESS.matcher(username).matches())){
            Toast.makeText(LoginActivity.this, "Invalid E-mail address", Toast.LENGTH_LONG).show();
            return;
        }

        if (!(password.length() > 7 && isValidPassword(password,confirmPassword))) {
            Toast.makeText(LoginActivity.this, "Incorrect Password", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
        intent.putExtra("email",username);
        intent.putExtra("fullName", fullname);
        startActivity(intent);

    }

    /**
     * Function to validate the password
     * @param password
     * @param confirmPassword
     * @return boolean
     */
    private boolean isValidPassword(String password, String confirmPassword){
        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{4,}$";
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        if(matcher.matches()) return true;
        else return false;
    }

}