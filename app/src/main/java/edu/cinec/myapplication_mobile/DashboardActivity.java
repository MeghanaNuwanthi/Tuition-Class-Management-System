package edu.cinec.myapplication_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatActivity;

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
        LinearLayout grade6Container = findViewById(R.id.g6container);
        LinearLayout grade7Container = findViewById(R.id.g7container);
        LinearLayout grade8Container = findViewById(R.id.g8container);
        LinearLayout grade9Container = findViewById(R.id.g9container);
        LinearLayout grade10Container = findViewById(R.id.g10container);
        LinearLayout grade11Container = findViewById(R.id.g11container);
        TextView incomeTextView = findViewById(R.id.incomeTextView);
        Button editDetailsButton = findViewById(R.id.editDetailsButton);

        // Set sample data (replace with your actual data)
        profileImageView.setImageResource(R.drawable.profile); // Replace with your image
        nameTextView.setText("Manoj De Silva");
        roleTextView.setText("Assistant Professor (CTE)");
        incomeTextView.setText("Rs. 4,323,500.00");


        // Set click listeners for the grade buttons
        grade6Container.setOnClickListener(v -> {
            // Handle Grade 6 click (e.g., open a new activity)
            Toast.makeText(this, "Grade 6 clicked", Toast.LENGTH_SHORT).show();
            // Example:
            // Intent intent = new Intent(DashboardActivity.this, Grade6Activity.class);
            // startActivity(intent);

        });

        grade7Container.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 7 clicked", Toast.LENGTH_SHORT).show();
        });

        grade8Container.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 8 clicked", Toast.LENGTH_SHORT).show();
        });

        grade9Container.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 9 clicked", Toast.LENGTH_SHORT).show();
        });

        grade10Container.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 10 clicked", Toast.LENGTH_SHORT).show();
        });

        grade11Container.setOnClickListener(v -> {
            Toast.makeText(this, "Grade 11 clicked", Toast.LENGTH_SHORT).show();
        });

        editDetailsButton.setOnClickListener(v -> {
            Toast.makeText(this, "Edit Details clicked", Toast.LENGTH_SHORT).show();
        });


    }
}