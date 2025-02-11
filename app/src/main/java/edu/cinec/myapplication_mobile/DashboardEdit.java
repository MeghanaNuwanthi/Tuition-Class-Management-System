package edu.cinec.myapplication_mobile;

import android.app.AlertDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Calendar;

public class DashboardEdit extends AppCompatActivity {

    // Declare variables OUTSIDE onCreate()
    private TextView txtDay, txtStartTime, txtEndTime;
    private final String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_edit);

        // Initialize UI elements
        txtDay = findViewById(R.id.txtDay);
        txtStartTime = findViewById(R.id.txtStartTime);
        txtEndTime = findViewById(R.id.txtEndTime);
        LinearLayout layoutDay = findViewById(R.id.layoutDay);
        LinearLayout layoutStartTime = findViewById(R.id.layoutStartTime);
        LinearLayout layoutEndTime = findViewById(R.id.layoutEndTime);

        // Show Dropdown for Days Selection
        layoutDay.setOnClickListener(v -> showDayPicker());

        // Open TimePicker for Start Time
        layoutStartTime.setOnClickListener(v -> showTimePicker(txtStartTime));

        // Open TimePicker for End Time
        layoutEndTime.setOnClickListener(v -> showTimePicker(txtEndTime));
    }

    // Show a day selection dialog
    private void showDayPicker() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Select a Day");
        builder.setItems(days, (dialog, which) -> txtDay.setText(days[which]));
        builder.show();
    }

    // Show a time picker dialog
    private void showTimePicker(TextView textView) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        TimePickerDialog timePickerDialog = new TimePickerDialog(
                this,
                (view, selectedHour, selectedMinute) -> {
                    String period = (selectedHour < 12) ? "AM" : "PM";
                    int displayHour = (selectedHour > 12) ? (selectedHour - 12) : selectedHour;
                    if (displayHour == 0) displayHour = 12;
                    String time = displayHour + ":" + String.format("%02d", selectedMinute) + " " + period;
                    textView.setText(time);
                },
                hour, minute, false
        );

        timePickerDialog.show();
    }
}
