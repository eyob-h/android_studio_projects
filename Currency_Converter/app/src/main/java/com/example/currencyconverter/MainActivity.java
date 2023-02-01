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

public class MainActivity extends AppCompatActivity { //implements AdapterView.OnItemSelectedListener{

    String fromFrom, toTo;
    Spinner fromSpin, toSpin;
    TextView displayResults2;
    TextView displayResults;
    String toCurr, fromCurr;
    int userInput, result, rate;
    Button btn;
    String FromCurrencies[] = {" ETB ", " USD ", " GBP ", " EUR "};
    String ToCurrencies[] = {" ETB ", " USD ", " GBP ", " EUR "};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        displayResults = findViewById(R.id.displayResult);
        displayResults2 = findViewById(R.id.displayResult2);
        String hi = String.valueOf(result);
//        displayResults.setText(hi);

        toSpin = findViewById(R.id.toS);
        //creating array adapter from the currencies string.
        ArrayAdapter arAd = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ToCurrencies);
        arAd.setDropDownViewResource(android.R.layout.simple_spinner_item);
        toSpin.setAdapter(arAd);


        toSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
                toTo = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        fromSpin = findViewById(R.id.from);
        //creating array adapter from the FromCurrencies string.
        ArrayAdapter arAdf = new ArrayAdapter(this, android.R.layout.simple_spinner_item, FromCurrencies);
        arAdf.setDropDownViewResource(android.R.layout.simple_spinner_item);
        fromSpin.setAdapter(arAdf);


        fromSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//                    displayResults2.setText((CharSequence) parent.getItemAtPosition(position));
                fromFrom = parent.getItemAtPosition(pos).toString();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void calculate(View v) {

        EditText input = findViewById(R.id.take_input);
        int getNumber = Integer.parseInt(input.getText().toString()); //taking the input from the number and storing it.

        String numberDisplay = String.valueOf(getNumber); //converting the number into string to display it.

        result = getNumber;

        if(fromFrom == toTo){
            result = result;
        }

        if (fromFrom == " ETB ") {              //currency rates logic
            if (toTo == " USD ") {
                result = (int) (getNumber * 0.5);
            }else if(toTo == " GBP "){
                result = (int) (getNumber * 0.3);

            }else if(toTo == " EUR "){
                result = (int) (getNumber * 0.2);
            }
        }
        if (fromFrom == " USD ") {              //currency rates logic
            if (toTo == " ETB ") {
                result = (int) (getNumber * 2);
            }else if(toTo == " GBP "){
                result = (int) (getNumber * 0.9);

            }else if(toTo == " EUR "){
                result = (int) (getNumber * 0.8);
            }
        }
        if (fromFrom == " GBP ") {              //currency rates logic
            if (toTo == " ETB ") {
                result = (int) (getNumber * 2.5);
            }else if(toTo == " USD "){
                result = (int) (getNumber * 1.2);

            }else if(toTo == " EUR "){
                result = (int) (getNumber * 1.3);
            }
        }
        if (fromFrom == " EUR ") {              //currency rates logic
            if (toTo == " USD ") {
                result = (int) (getNumber * 0.8);
            }else if(toTo == " GBP "){
                result = (int) (getNumber * 0.9);

            }else if(toTo == " ETB "){
                result = (int) (getNumber * 2.9);
            }
        }

        String finalRes = String.valueOf(result);
        displayResults2.setText(numberDisplay + " "+ fromFrom+" "+ " is " + finalRes + " " + toTo);



    }
}


