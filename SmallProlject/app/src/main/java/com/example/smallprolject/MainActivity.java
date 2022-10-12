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


    public void Button0(View view) { ButtonNum(0);

    }

    public void Button1(View view) {
        ButtonNum(1);
    }

    public void Button2(View view) { ButtonNum(2);
    }

    public void Button3(View view) { ButtonNum(3);
    }

    public void Button4(View view) {
        ButtonNum(4);
    }

    public void Button5(View view) {
        ButtonNum(5);
    }

    public void Button6(View view) {
        ButtonNum(6);
    }

    public void Button7(View view) {
        ButtonNum(7);
    }

    public void Button8(View view) {
        ButtonNum(8);
    }

    public void Button9(View view) {
        ButtonNum(9);
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
        if(state == null)
        {
            state = State.minus;
            text2.setText(a+"-");
            text.setText(b+"");
        }
        else
        {
            calculate();
        }
    }

     public void ButtonMultiply(View view) {
        if(state == null)
        {
            state = State.multiply;
            text2.setText(a+"*");
            text.setText(b+"");
        }
        else
        {
            calculate();
        }
    }

    public void ButtonDevide(View view) {
        if(state == null)
        {
            state=State.devide;
            text2.setText(a+"/");
            text.setText(b+"");
        }
        else
        {
            calculate();
        }
    }

    public void ButtonAnsware(View view) {
        if (state != null)
        {
            calculate();
            text.setText(a+"");
            text2.setText("");
            a = 0;
            b = 0;
            state = null;
        }
    }

    public void ButtonFunc(View view) {
        text.setText("0");
        text2.setText("");
        a = 0;
        b = 0;
        state = null;
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
