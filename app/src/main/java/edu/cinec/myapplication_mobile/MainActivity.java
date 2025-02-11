package edu.cinec.myapplication_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button adminButton = findViewById(R.id.adminButton);

        adminButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // For demonstration, we'll just check a "secret" value.
                // In a real app, you would have proper authentication.
                boolean isAdmin = checkAdminCredentials();

                if (isAdmin) {
                    // Navigate to the admin activity
                    Intent intent = new Intent(MainActivity.this, AdminActivity.class);
                    startActivity(intent);
                } else {
                    // Handle non-admin access (e.g., show an error message)
                    // You might use a Toast or AlertDialog here.
                    // For now, let's just log it.
                    System.out.println("Not an admin!");
                }
            }
        });
    }

    // Replace this with your actual admin credential check
    private boolean checkAdminCredentials() {
        // In a real app, you would:
        // 1. Retrieve entered username/password (not shown in this example)
        // 2. Check against a database or authentication service.

        // For this example, we'll just return true to simulate admin access.
        return true;  // Replace with your actual logic
    }
}