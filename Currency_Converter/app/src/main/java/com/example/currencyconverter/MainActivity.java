package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{


        int  userInput;
        Button btn;
        int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner fromSpin = findViewById(R.id.from);
        Spinner toSpin = findViewById(R.id.toS);

        ArrayAdapter<CharSequence> toCharsAdapter = ArrayAdapter.createFromResource(this,R.array.fromC, android.R.layout.simple_spinner_item);
        toCharsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        toSpin.setAdapter(toCharsAdapter);
        toSpin.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> fromCharsAdapter = ArrayAdapter.createFromResource(this,R.array.fromC, android.R.layout.simple_spinner_item);
        fromCharsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        fromSpin.setAdapter(fromCharsAdapter);
        fromSpin.setOnItemSelectedListener(this);

    }
    public void conv(View v){
        View butonVw = findViewById(R.id.button);
        Button button = (Button) butonVw;
        button.setText("Hi");


        View butonVw2 = findViewById(R.id.button2);
        Button buton2 = (Button) butonVw2;

        if(counter%2 == 0){
            buton2.setText("Even");
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show();
        }
        else{
            buton2.setText("Odd");

        }

        counter++;
        /**
        v.setEnabled(false);
        Button button = (Button) v;
        button.setText("HI");
        **/

    }
    public void calculate(View v){
        EditText input = findViewById(R.id.take_input);
        TextView displayResults = findViewById(R.id.displayResult);
        int getNumber = Integer.parseInt(input.getText().toString()); //taking the input from the number and storing it.

        String numberDisplay = String.valueOf(getNumber); //converting the number into string to display it.
        displayResults.setText(numberDisplay);

        Toast.makeText(this, numberDisplay,Toast.LENGTH_LONG).show(); //displays the result


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
//
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
