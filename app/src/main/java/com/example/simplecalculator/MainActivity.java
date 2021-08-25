package com.example.simplecalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView text_display;
    Button button_cel;
    Button button_procent;
    Button button_delete;
    Button button_division;
    Button button_7;
    Button button_8;
    Button button_9;
    Button button_multiplay;
    Button button_4;
    Button button_5;
    Button button_6;
    Button button_minus;
    Button button_1;
    Button button_2;
    Button button_3;
    Button button_plus;
    Button button_dot;
    Button button_0;
    Button button_equal;
    double num1 = 0, num2 = 0;
    double result = 0;
    Boolean isClick = false;
    String operation = "$";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_display = findViewById(R.id.text_display);
        button_cel = findViewById(R.id.button_cel);
        button_procent = findViewById(R.id.button_procent);
        button_delete = findViewById(R.id.button_delete);
        button_division = findViewById(R.id.button_division);
        button_7 = findViewById(R.id.button_7);
        button_8 = findViewById(R.id.button_8);
        button_9 = findViewById(R.id.button_9);
        button_multiplay = findViewById(R.id.button_multiply);
        button_4 = findViewById(R.id.button_4);
        button_5 = findViewById(R.id.button_5);
        button_6 = findViewById(R.id.button_6);
        button_minus = findViewById(R.id.button_minus);
        button_1 = findViewById(R.id.button_1);
        button_2 = findViewById(R.id.button_2);
        button_3 = findViewById(R.id.button_3);
        button_plus = findViewById(R.id.button_plus);
        button_dot = findViewById(R.id.button_dot);
        button_0 = findViewById(R.id.button_0);
        button_equal = findViewById(R.id.button_equal);

        button_cel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text_display.setText("");
            }
        });

        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = text_display.getText().toString();
                if (str1.equals("")) {
                    return;
                }
                num1 = Double.parseDouble(str1);
                text_display.setText("");
                operation = "/";
                isClick = false;
            }
        });


        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "7");

            }
        });

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "8");

            }
        });

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "9");

            }
        });

        button_multiplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = text_display.getText().toString();
                if (str1.equals("")) {
                    return;
                }
                num1 = Double.parseDouble(str1);
                text_display.setText("");
                operation = "*";
                isClick = false;
            }

        });

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "4");

            }
        });

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "5");

            }
        });

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "6");

            }
        });

        button_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = text_display.getText().toString();
                if (str1.equals("")) {
                    return;
                }
                num1 = Double.parseDouble(str1);
                text_display.setText("");
                operation = "-";
                isClick = false;
            }

        });

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "1");

            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "2");

            }
        });

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "3");

            }
        });

        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1 = text_display.getText().toString();
                if (str1.equals("")) {
                    return;
                }
                num1 = Double.parseDouble(str1);
                text_display.setText("");
                operation = "+";
                isClick = false;
            }

        });

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isClick) {
                    text_display.setText("");
                    isClick = false;
                }
                text_display.setText(text_display.getText().toString() + "0");
            }

        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str2 = text_display.getText().toString();
                if (str2.equals("")) {
                    return;
                }
                num2 = Double.parseDouble(str2);
                text_display.setText("");
                switch (operation) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    case "$":
                        result = num2;
                        break;
                    default:
                        result = 0.0;
                }
                text_display.setText(result + "");
                operation = "$";
                isClick = true;
            }
        });


    }


}