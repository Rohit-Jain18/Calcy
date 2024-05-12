package com.example.calcy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView showres = findViewById(R.id.result);
        EditText firstnum = findViewById(R.id.firstno);
        EditText secondnum= findViewById(R.id.secondno);
        Button add = findViewById(R.id.add);
        Button sub = findViewById(R.id.sub);
        Button mul = findViewById(R.id.multiply);
        Button div = findViewById(R.id.division);
        Button calc = findViewById(R.id.calculate);
try {

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstnum.getText().toString().trim(); // Remove leading/trailing whitespace
                String secondInput = secondnum.getText().toString().trim();

                // Check for empty inputs
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    showres.setText("Please enter both numbers.");
                    return;
                }
                int fnum=   Integer.parseInt(firstnum.getText().toString());
                int snum=   Integer.parseInt(secondnum.getText().toString());

                double result = fnum + snum;

                showres.setText(String.valueOf(result));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstnum.getText().toString().trim(); // Remove leading/trailing whitespace
                String secondInput = secondnum.getText().toString().trim();

                // Check for empty inputs
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    showres.setText("Please enter both numbers.");
                    return;
                }
                int fnum=   Integer.parseInt(firstnum.getText().toString());
                int snum=   Integer.parseInt(secondnum.getText().toString());

                double result = fnum - snum;

                showres.setText(String.valueOf(result));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstnum.getText().toString().trim(); // Remove leading/trailing whitespace
                String secondInput = secondnum.getText().toString().trim();

                // Check for empty inputs
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    showres.setText("Please enter both numbers.");
                    return;
                }
                int fnum=   Integer.parseInt(firstnum.getText().toString());
                int snum=   Integer.parseInt(secondnum.getText().toString());

                double result = fnum * snum;

                showres.setText(String.valueOf(result));
            }
        });


        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstInput = firstnum.getText().toString().trim(); // Remove leading/trailing whitespace
                String secondInput = secondnum.getText().toString().trim();

                // Check for empty inputs
                if (firstInput.isEmpty() || secondInput.isEmpty()) {
                    showres.setText("Please enter both numbers.");
                    return;
                }
                int fnum=   Integer.parseInt(firstnum.getText().toString());
                int snum=   Integer.parseInt(secondnum.getText().toString());

                if (snum == 0) {
                    Toast.makeText(MainActivity.this, "Cannot divide by zero.", Toast.LENGTH_SHORT).show();
                    return; // Exit the listener if division by zero
                }

                double result = fnum / snum;

                showres.setText(String.valueOf(result));
            }
        });














//        calc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String firstInput = firstnum.getText().toString().trim(); // Remove leading/trailing whitespace
//                String secondInput = secondnum.getText().toString().trim();
//
//                // Check for empty inputs
//                if (firstInput.isEmpty() || secondInput.isEmpty()) {
//                    showres.setText("Please enter both numbers.");
//                    return;
//                }
//                int fnum=   Integer.parseInt(firstnum.getText().toString());
//                int snum=   Integer.parseInt(secondnum.getText().toString());
//                try {
//
//                    int  a = fnum+snum;
//                    int  s = fnum-snum;
//                    int m = fnum*snum;
//                    int d = fnum/snum;
//
////                    boolean ad=   add.isPressed();
////                    boolean sb =  sub.isPressed();
////                    boolean mult = mul.isPressed();
////                    boolean divi = div.isPressed();
//
//
//                    if(add.isPressed()){
//                        showres.setText(String.valueOf(a));
//                    }
//                    else if (sub.isPressed()) {
//                        showres.setText(String.valueOf(s));
//                    }
//                    else if (sub.isPressed()) {
//                        showres.setText(String.valueOf(m));
//                    }
//                    else {
//                        showres.setText(String.valueOf(d));
//                    }


                }catch (NumberFormatException e) {
                    // Handle invalid input (e.g., display an error message)
                    showres.setText("Invalid input. Please enter numbers only.");
                }
            }










    }
