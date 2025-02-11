package edu.cinec.myapplication_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Grade10 extends AppCompatActivity {

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
                Intent intent = new Intent(Grade10.this, AttendancePaymentsActivity.class);
                startActivity(intent);
            }
        });

        addStudentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Add Students Activity
                Intent intent = new Intent(Grade10.this, AddStudentsActivity.class);
                startActivity(intent);
            }
        });

        paidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Paid Students Activity
                Intent intent = new Intent(Grade10.this, PaidStudentsActivity.class);
                startActivity(intent);
            }
        });

        notPaidButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Not Paid Students Activity
                Intent intent = new Intent(Grade10.this, NotPaidStudentsActivity.class);
                startActivity(intent);
            }
        });

        freeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Free Students Activity
                Intent intent = new Intent(Grade10.this, FreeStudentsActivity.class);
                startActivity(intent);
            }
        });
        Spinner monthSpinner = findViewById(R.id.monthSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.months_array, R.layout.spinner_item); // Use spinner_item for selected item
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item); // Dropdown items layout
        monthSpinner.setAdapter(adapter);

        // Set default selection to April (or any other month)
        String defaultMonth = "April";
        int position = adapter.getPosition(defaultMonth);
        if (position != -1) {
            monthSpinner.setSelection(position);
        }

        monthSpinner.setPopupBackgroundResource(R.drawable.spinner_background);
    }
}