package com.example.newandroidlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //Finding the spinner element by its Id
        Spinner spinner = findViewById(R.id.word_char_Selector);
        //Setting up and connecting the arrays to the spinner element from the string resources
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.choices,android.R.layout.simple_spinner_item);
        //Setting the drop down resources to the default simple spinner dropdown
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item );
        //To connect these adapters and spinner element
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        this.type = text;
        Toast.makeText(parent.getContext(),text,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    //int result

    public void showInformation(View view) {
               // Do something in response to button click
                EditText txtDescription;
                txtDescription = (EditText)findViewById(R.id.textInputEdit);
                String message = txtDescription.getText().toString();
                if(message.equals("")){
                    Context context = getApplicationContext();
                    // message to display
                    String text = "Please Enter a String";
                    // toast time duration, can also set manual value
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(context, text, duration);
                }
                else{
                    WordCounter text = new WordCounter();
                    if(type == "Characters"){
                        TextView textviewtochange = (TextView) findViewById(R.id.displayResults);
                        textviewtochange.setText(text.charCounter(message));

                    }
                    else if(type =="Word"){
                        TextView textviewtochange = (TextView) findViewById(R.id.displayResults);
                        textviewtochange.setText(text.wordCounter(message));
                    }
                }

            }

    }

