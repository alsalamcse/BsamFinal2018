package com.sholy.bsam.bsamtaskmangr2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class AddTaskActivity extends AppCompatActivity {
    private EditText etTitle,etText,etDueDate,etDatePicker;
    private Button btnSave,btnDatePicker;
    private TextView tvImportant,tvNecesary;
    private SeekBar skbrNecesary,skbrImportant;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);


        etTitle = (EditText) findViewById(R.id.etTitle);
        etText = (EditText) findViewById(R.id.etText);
        etDueDate = (EditText) findViewById(R.id.etDueDate);
        btnDatePicker = (Button)findViewById(R.id.btnDatePicker);
        btnSave = (Button) findViewById(R.id.btnSave);
        tvImportant = (TextView) findViewById(R.id.tvImportant);
        tvNecesary = (TextView) findViewById(R.id.tvNecesary);
        skbrImportant = (SeekBar) findViewById(R.id.skbrImportant);
        skbrNecesary = (SeekBar) findViewById(R.id.skbrNecesary);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
    }
    private void dataHandler(){
        boolean isk=true;
        String title=etTitle.getText().toString();
        String text=etText.getText().toString();
        String DueDate=etDueDate.getText().toString();
        int imp=skbrImportant.getProgress();
        int nec=skbrNecesary.getProgress();

    }
}
