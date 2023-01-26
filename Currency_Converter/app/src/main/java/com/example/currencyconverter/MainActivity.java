package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    EditText input;
//    Spinner spFrom , spTo;
//    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


    }
