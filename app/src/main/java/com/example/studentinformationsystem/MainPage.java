package com.example.studentinformationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainPage extends AppCompatActivity {
    Button btnNot;
    Button btnDevam;
    Button btnTranscript;
    Button btnAcademic;
    Button btnSinav;
    Button btnMuf;
    Button btnHazirlik;

    ListView listBtn;
    ArrayList<Button> lButtons = new ArrayList<>();

    LayoutInflater layoutInflater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        View buttons;
        layoutInflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        buttons = layoutInflater.inflate(R.layout.buttons_of_main_page,null);
        btnNot = buttons.findViewById(R.id.btnNot);
        btnDevam = buttons.findViewById(R.id.btnDevamsizlik);
        btnTranscript = buttons.findViewById(R.id.btnTranscript);
        btnAcademic = buttons.findViewById(R.id.btnAcademic);
        btnSinav = buttons.findViewById(R.id.btnSinav);
        btnMuf = buttons.findViewById(R.id.btnSyllabus);
        btnHazirlik = buttons.findViewById(R.id.btnHazirlik);

        btnNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainPage.this, GradeInformation.class);
                startActivity(i);
            }
        });

        listBtn = findViewById(R.id.listButtons);
        lButtons.add(btnNot);
        lButtons.add(btnDevam);
        lButtons.add(btnTranscript);
        lButtons.add(btnAcademic);
        lButtons.add(btnSinav);
        lButtons.add(btnMuf);
        lButtons.add(btnHazirlik);

        final ListView listView = findViewById(R.id.listButtons);
        ButtonAdaptor adaptor = new ButtonAdaptor(this, lButtons);
        listView.setAdapter(adaptor);
    }
}
