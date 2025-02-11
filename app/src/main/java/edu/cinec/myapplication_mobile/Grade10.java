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

        Button attendancePaymentsButton = findViewById(R.id.attendancePaymentsButton);
        Button addStudentsButton = findViewById(R.id.addStudentsButton);
        Button paidButton = findViewById(R.id.paidButton);
        Button notPaidButton = findViewById(R.id.notPaidButton);
        Button freeButton = findViewById(R.id.freeButton);

        attendancePaymentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Attendance/Payments Activity
                Intent intent = new Intent(MainActivity.this, AttendancePaymentsActivity.class);
                startActivity(intent);
            }
        });

        addStudentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Add Students Activity
                Intent intent = new Intent(MainActivity.this, AddStudentsActivity.class);
                startActivity(intent);
            }
        });

        paidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Paid Students Activity
                Intent intent = new Intent(MainActivity.this, PaidStudentsActivity.class);
                startActivity(intent);
            }
        });

        notPaidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Not Paid Students Activity
                Intent intent = new Intent(MainActivity.this, NotPaidStudentsActivity.class);
                startActivity(intent);
            }
        });

        freeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Free Students Activity
                Intent intent = new Intent(MainActivity.this, FreeStudentsActivity.class);
                startActivity(intent);
            }
        });
    }
}