package edu.cinec.myapplication_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        final EditText usernameEditText = findViewById(R.id.usernameEditText);
        final EditText passwordEditText = findViewById(R.id.passwordEditText);
        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Perform login validation here
                if (isValidCredentials(username, password)) {
                    // Successful login: Navigate to the DashboardActivity
                    Toast.makeText(AdminActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(AdminActivity.this, DashboardActivity.class);
                    startActivity(intent);
                    finish(); // Finish AdminActivity so the user can't go back to it by pressing back
                } else {
                    // Failed login: Show an error message
                    Toast.makeText(AdminActivity.this, "Invalid credentials!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean isValidCredentials(String username, String password) {
        // Replace with your actual login validation logic
        // Example: Check against a database or authentication service
        return username.equals("admin") && password.equals("123"); // Replace "123" with your actual password or validation method
    }
}