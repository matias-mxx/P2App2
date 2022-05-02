package com.example.p2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    Button save;
    ArrayList<String> addArray = new ArrayList<>();
    EditText text;
    ListView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (EditText) findViewById(R.id.editTextTextPersonName);
        showText = (ListView) findViewById(R.id.list);
        save = (Button) findViewById(R.id.button);

        save.setOnClickListener(view -> {
            String getInput = text.getText().toString();

            if (getInput.trim().equals("Bibimbap")){
                Intent intent = new Intent(this, Bibimbap.class);
                startActivity(intent);
            }
            else if (getInput.trim().equals("")){
                Toast.makeText(MainActivity.this, "Ingen tekst", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
