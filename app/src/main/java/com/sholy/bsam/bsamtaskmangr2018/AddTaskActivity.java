package com.sholy.bsam.bsamtaskmangr2018;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sholy.bsam.bsamtaskmangr2018.TaskFragment.Data.MyTask;

import java.util.Date;

public class AddTaskActivity extends AppCompatActivity {
    private EditText etTitle,etText,etDueDate,etDatePicker;
    private Button btnSave,btnDatePicker;
    private TextView tvImportant,tvNecesary;
    private SeekBar skbrNecesary,skbrImportant;
    private String owner;


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
        String dueDate=etDueDate.getText().toString();
        int imp=skbrImportant.getProgress();
        int nec=skbrNecesary.getProgress();
        boolean isok=true;
        if (title.length()<4){
            etTitle.setError("title can not be empty");
            isok=false;
        }
        if (text.length()<4){
            etText.setError("text can not be empty");
            isok=false;
        }
        if (isok) {
            MyTask task = new MyTask();
            task.setCreatedAt(new Date());
            task.setDueDate(new Date(dueDate));
            task.setText(text);
            task.setText(title);
            task.setTitle(title);
            task.setImportant(imp);
            task.setNesesary(nec);

            FirebaseAuth auth = FirebaseAuth.getInstance();
            task.setOwner(auth.getCurrentUser().getEmail());

            DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

            String key = reference.child("MyTasks").push().getKey();
            task.setKey(key);

            reference.child("MyTasks").child(key).setValue(task).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(AddTaskActivity.this, "Add Successful", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(AddTaskActivity.this, "Add Failed", Toast.LENGTH_LONG).show();
                    }
                }
            });


















        }

    }
}
