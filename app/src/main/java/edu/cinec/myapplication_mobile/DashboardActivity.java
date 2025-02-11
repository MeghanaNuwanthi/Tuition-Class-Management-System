package edu.cinec.myapplication_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Initialize views
        ImageView profileImageView = findViewById(R.id.profileImageView);
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView roleTextView = findViewById(R.id.roleTextView);
        Button grade6Button = findViewById(R.id.grade6Button);
        Button grade7Button = findViewById(R.id.grade7Button);
        Button grade8Button = findViewById(R.id.grade8Button);
        Button grade9Button = findViewById(R.id.grade9Button);
        Button grade10Button = findViewById(R.id.grade10Button);
        Button grade11Button = findViewById(R.id.grade11Button);
        TextView incomeTextView = findViewById(R.id.incomeTextView);
        Button editDetailsButton = findViewById(R.id.editDetailsButton);

        // Set sample data (replace with your actual data)
        profileImageView.setImageResource(R.drawable.profile); // Replace with your image
        nameTextView.setText("Manoj De Silva");
        roleTextView.setText("Assistant Professor (CTE)");
        incomeTextView.setText("Rs. 4,323,500.00");


        // Set click listeners for the grade buttons
        grade6Button.setOnClickListener(v -> {
            // Handle Grade 6 click (e.g., open a new activity)
            Toast.makeText(this, "Grade 6 clicked", Toast.LENGTH_SHORT).show();
            // Example:
            // Intent intent = new Intent(DashboardActivity.this, Grade6Activity.class);
            // startActivity(intent);

        });

        grade7Button.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 7 clicked", Toast.LENGTH_SHORT).show();
        });

        grade8Button.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 8 clicked", Toast.LENGTH_SHORT).show();
        });

        grade9Button.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 9 clicked", Toast.LENGTH_SHORT).show();
        });

        grade10Button.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 10 clicked", Toast.LENGTH_SHORT).show();
        });

        grade11Button.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 11 clicked", Toast.LENGTH_SHORT).show();
        });

        editDetailsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Edit Details clicked", Toast.LENGTH_SHORT).show();
        });

    }
}