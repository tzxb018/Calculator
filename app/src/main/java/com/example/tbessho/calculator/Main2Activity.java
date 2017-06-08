package com.example.tbessho.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView result;
    EditText num1,num2;
    Button add, sub, div, mult;
    double resNum;
    int a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        result = (TextView)findViewById(R.id.result);
        num1 = (EditText)findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button)findViewById(R.id.btnAdd);
        sub = (Button)findViewById(R.id.btnSub);
        div = (Button)findViewById(R.id.btnDiv);
        mult = (Button) findViewById(R.id.btnMult);

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                resNum = a + b;
                result.setText(String.valueOf(resNum));
            }
        });

        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                resNum = a - b;
                result .setText(String.valueOf(resNum));
            }
        });

        mult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                resNum = a * b;
                result.setText(String.valueOf(resNum));
            }
        });

        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                a = Integer.parseInt(num1.getText().toString());
                b = Integer.parseInt(num2.getText().toString());
                if (b == 0){
                    char [] error = {'c','a','n','n','o','t',' ','d','i','v','i','d','e',' ','b','y',' ','z','e','r','o'};

                    result.setText("cannot divide by zero");
                }
                else{
                    resNum = (double)a/b;
                    result.setText(String.valueOf(resNum));
                }
            }
        });
    }
}
