package com.example.studentinformationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class PrepSchoolProcess extends AppCompatActivity {

    Button btnExam;
    Button btnGrade;
    Button btnAttendance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prep_school_process);

        btnExam = findViewById(R.id.btnExamCalOfPrep);
        btnExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrepSchoolProcess.this,ExamCalendar.class);
                String str = "fromPrepForCal";
                i.putExtra("type",str);
                startActivity(i);
            }
        });

        btnGrade = findViewById(R.id.btnGradeListOfPrep);
        btnGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrepSchoolProcess.this,ExamCalendar.class);
                String str = "fromPrepForGrade";
                i.putExtra("type",str);
                startActivity(i);
            }
        });
        btnAttendance = findViewById(R.id.btnAttendanceOfPrep);
        btnAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrepSchoolProcess.this,AttendanceOfPrep.class);
                String[] attendance = new String[2];
                attendance[0] = "85";
                attendance[1] = "699";
                i.putExtra("attendance",attendance);
                startActivity(i);
            }
        });

        FloatingActionButton fabBack = findViewById(R.id.fabBackPrep);
        fabBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrepSchoolProcess.this, MainPage.class);
                startActivity(i);
            }
        });
    }
}
