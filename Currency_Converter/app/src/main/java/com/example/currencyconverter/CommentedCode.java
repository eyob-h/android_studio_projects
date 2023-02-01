package com.example.currencyconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CommentedCode {
//    package com.example.currencyconverter;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Spinner;
//import android.widget.TextView;
//import android.widget.Toast;

    public class MainActivity extends AppCompatActivity { //implements AdapterView.OnItemSelectedListener{

        String fromFrom, toTo;
        TextView displayResults2;
        TextView displayResults;
        String toCurr, fromCurr;
        int  userInput, result, rate;
        Button btn;
        int counter = 0;
        String currencies[] = {" ETB ", " USD ", " GBP ", " EUR "};
        String currencies2[] = {" ETB ", " USD ", " GBP ", " EUR "};


        @Override
        protected void onCreate(Bundle savedInstanceState)  {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            displayResults = findViewById(R.id.displayResult);
            displayResults2 = findViewById(R.id.displayResult2);
            String hi = String.valueOf(result);
            displayResults.setText(hi);

            Spinner toSpin = findViewById(R.id.toS);
//        toSpin.setOnItemSelectedListener(this);
            //creating array adapter from the currencies string.
            ArrayAdapter arAd = new ArrayAdapter(this, android.R.layout.simple_spinner_item,currencies);
            arAd.setDropDownViewResource(android.R.layout.simple_spinner_item);
            toSpin.setAdapter(arAd);

            toSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                    displayResults2.setText((CharSequence) parent.getItemAtPosition(position));
                    toTo = parent.getItemAtPosition(position).toString();

//                    if(toTo == " USD "){
//
//                        displayResults2.setText("Dolla Money"+(CharSequence) parent.getItemAtPosition(position));
//                    }
//                    toCurr = ((String)parent.getItemAtPosition(position));
//                    fromCurr = parent.getSelectedItem().toString();


                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


            Spinner fromSpina = findViewById(R.id.from);
//        toSpin.setOnItemSelectedListener(this);
            //creating array adapter from the currencies string.
            ArrayAdapter arAdf = new ArrayAdapter(this, android.R.layout.simple_spinner_item,currencies2);
            arAdf.setDropDownViewResource(android.R.layout.simple_spinner_item);
            fromSpina.setAdapter(arAdf);
            fromSpina.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
//                    displayResults2.setText((CharSequence) parent.getItemAtPosition(position));
                    fromFrom = parent.getItemAtPosition(pos).toString();
//                fromFrom = parent.getItemAtPosition(pos).toString();

//                    if(toTo == " USD "){
//
//                        displayResults2.setText("Dolla Money"+(CharSequence) parent.getItemAtPosition(position));
//                    }
//                    toCurr = ((String)parent.getItemAtPosition(position));
//                    fromCurr = parent.getSelectedItem().toString();


                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });


//        Spinner toSpin = findViewById(R.id.toS);
//        ArrayAdapter<CharSequence> toCharsAdapter = ArrayAdapter.createFromResource(this,R.array.fromC, android.R.layout.simple_spinner_item);
//        toCharsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        toSpin.setAdapter(toCharsAdapter);
//        toSpin.setOnItemSelectedListener(this);

//        Spinner fromSpin = findViewById(R.id.from); //creating the array adapters from resources
//        ArrayAdapter<CharSequence> fromCharsAdapter = ArrayAdapter.createFromResource(this,R.array.fromC, android.R.layout.simple_spinner_item);
//
//        fromCharsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        fromSpin.setAdapter(fromCharsAdapter);
//        fromSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                displayResults.setText((CharSequence) parent.getItemAtPosition(position));
//                fromFrom = parent.getItemAtPosition(position).toString();
////                fromFrom = parent.getSelectedItem().toString();
////                fromCurr = parent.getSelectedItem().toString();
////
////
////                if (fromCurr == "ETB"){
//////                    displayResults2.setText("Hi "+ "Birr");
////                    userInput = 1;
////
////                }else if (fromCurr == "USD"){
////
//////                    displayResults2.setText("Hi "+ "dolla");
//////                    Toast.makeText(this,"Hi",Toast.LENGTH_LONG).show();
//////                    Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show();
////                    userInput = 2;
////
////                }else if (fromCurr == "GBP"){
//////                    displayResults2.setText("Hi "+ "brit");
////                    userInput = 3;
////
////                }
////
////
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });


        }





        //    public void conv(View v){
//        View butonVw = findViewById(R.id.button);
//        Button button = (Button) butonVw;
//        button.setText("Hi");
//
//
//        View butonVw2 = findViewById(R.id.button2);
//        Button buton2 = (Button) butonVw2;
//
//        if(counter%2 == 0){
//            buton2.setText("Even");
//            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show();
//        }
//        else{
//            buton2.setText("Odd");
//
//        }
//
//        counter++;
//        /**
//        v.setEnabled(false);
//        Button button = (Button) v;
//        button.setText("HI");
//        **/
//
//    }
        public void calculate(View v){

            EditText input = findViewById(R.id.take_input);
            int getNumber = Integer.parseInt(input.getText().toString()); //taking the input from the number and storing it.

            String numberDisplay = String.valueOf(getNumber); //converting the number into string to display it.
//        displayResults.setText(numberDisplay);

//        if(input != null){
//            Toast.makeText(this, numberDisplay,Toast.LENGTH_LONG).show(); //displays the result
            if(fromFrom==" ETB " && toTo == " ETB "){
                result = getNumber;
                String cat = String.valueOf(result);
                displayResults2.setText(fromFrom + " "+ toTo + " "+ cat);
//                Toast.makeText(this, getNumber +"What Up"+ numberDisplay,Toast.LENGTH_LONG).show(); //displays the result

            } else if(fromFrom == " ETB " && toTo == " USD "){
                result = (int) (getNumber * 0.5);
                String cata = String.valueOf(result);
                displayResults2.setText(cata + "$");
            }
//        }


        }


//    @Override
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        String text = parent.getItemAtPosition(position).toString();
//        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
////        Toast.makeText(getApplicationContext(),currencies[position],Toast.LENGTH_LONG).show();
//
//
////
//    }
//
////    public void onItemSelected(AdapterView<?> arg0,View arg1,int position,long id)
////    {
////        // make toastof name of course
////        // which is selected in spinner
////        Toast.makeText(getApplicationContext(),currencies[position],Toast.LENGTH_LONG).show();
////    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> parent) {

    }


}
