package com.example.newandroidlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //Finding the spinner element by its Id
        Spinner spinner = findViewById(R.id.word_char_Selector);
        //Setting up and connecting the arrays to the spinner element from the strign resurces
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.choices,android.R.layout.simple_spinner_item);
        //Setting the drop down resourse to the default simple spinner dropdown
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item );
        //To connect these adapters and spinner element
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }
}
