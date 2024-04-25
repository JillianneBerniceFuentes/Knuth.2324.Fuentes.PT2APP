package com.example.fuentes_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    TextView total;
    EditText num1;
    EditText num2;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        total = (TextView) findViewById(R.id.total);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.sub);
        multiply = (Button) findViewById(R.id.mul);
        divide = (Button) findViewById(R.id.div);
        //result.setText("Check");
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//String input1 = num1.getText().toString();
//int number = Integer.parseInt(input1);
                double Num1 = Double.parseDouble(num1.getText().toString());
                double Num2 = Double.parseDouble(num2.getText().toString());
                double sum = Num1 + Num2;
                total.setText(String.valueOf(sum));
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Num1 = Double.parseDouble(num1.getText().toString());
                double Num2 = Double.parseDouble(num2.getText().toString());
                double dif = Num1 - Num2;
                total.setText(String.valueOf(dif));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Num1 = Double.parseDouble(num1.getText().toString());
                double Num2 = Double.parseDouble(num2.getText().toString());
                double product = Num1 * Num2;

                total.setText(String.valueOf(product));
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Num1 = Double.parseDouble(num1.getText().toString());
                double Num2 = Double.parseDouble(num2.getText().toString());
                double quotient = Num1 / Num2;

                total.setText(String.valueOf(quotient));
            }
        });
    }

}