package com.example.smallprolject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    State state = null;
    TextView text;
    TextView text2;

    float a = 0;
    float b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        text.setText("0");
        text2.setText("");
    }


    public void Button0(View view) {

    }

    public void Button1(View view) {
        ButtonNum(1);
    }

    public void Button2(View view) {
    }

    public void Button3(View view) {
    }

    public void Button4(View view) {
    }

    public void Button5(View view) {
    }

    public void Button6(View view) {
    }

    public void Button7(View view) {
    }

    public void Button8(View view) {
    }

    public void Button9(View view) {
    }

    public void ButtonPlus(View view) {
        if(state == null)
        {
            state = State.plus;
            text2.setText(a+"+");
            text.setText(b+"");
        }
        else
        {
            calculate();
        }
    }

    public void ButtonMinus(View view) {
    }

    public void ButtonMultiply(View view) {
    }

    public void ButtonDevide(View view) {
    }

    public void ButtonAnsware(View view) {
    }

    public void ButtonFunc(View view) {
    }

    public void ButtonNum(int num)
    {
        if(state == null){
            a = a * 10 + num;
            text.setText(String.valueOf(a));
        }
        else {
            b = b * 10 + num;
            text.setText(String.valueOf(a));
        }
    }

    public void calculate()
    {
        switch (state)
        {
            case plus:
                a = a + b;
                b = 0;
                text.setText(b+"");
                state = State.plus;
                text2.setText(a+"+");
                break;
            case minus:
                a = a - b;
                b = 0;
                text.setText(b+"");
                state = State.minus;
                text2.setText(a+"+");
                break;
            case multiply:
                a = a * b;
                b = 0;
                text.setText(b+"");
                state = State.multiply;
                text2.setText(a+"+");
                break;
            case devide:
                a = a / b;
                b = 0;
                text.setText(b+"");
                state = State.devide;
                text2.setText(a+"+");
                break;
            default:
                break;
        }
    }
}