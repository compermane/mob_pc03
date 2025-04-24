package com.example.todov1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.todov1app.databinding.ActivityAddTaskBinding;

public class AddTaskActivity extends AppCompatActivity {

    ActivityAddTaskBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddTaskBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.addNewButton.setOnClickListener(view -> {
            String name         = binding.taskNameEditText.getText().toString();
            String desc         = binding.taskDescEditText.getText().toString();
            int    prio         = 0;

            if (binding.radioLow.isChecked())
                prio = 1;
            else if (binding.radioMedium.isChecked())
                prio = 2;
            else if (binding.radioHigh.isChecked())
                prio = 3;

            Task task = new Task(name, desc, prio);
            Intent i = new Intent();
            i.putExtra("taskAdded", task);
            setResult(RESULT_OK, i);
            AddTaskActivity.this.finish();
        });
    }
}