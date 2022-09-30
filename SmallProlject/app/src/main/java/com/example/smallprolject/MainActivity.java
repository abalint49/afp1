package com.example.smallprolject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean first = true;
    TextView text;

    float a = 0;
    float b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        text.setText("0");
    }


    public void Button0(View view) {
        /* TODO:
            ButtonNum(0);
         */
    }

    public void Button1(View view) {
        ButtonNum(1);
        /* TODO:
            ButtonNum(1);
         */
    }

    public void Button2(View view) {
        /* TODO:
            ButtonNum(2);
         */
    }

    public void Button3(View view) {
        /* TODO:
            ButtonNum(3);
         */
    }

    public void Button4(View view) {
        /* TODO:
            ButtonNum(4);
         */
    }

    public void Button5(View view) {
        /* TODO:
            ButtonNum(5);
         */
    }

    public void Button6(View view) {
        /* TODO:
            ButtonNum(6);
         */
    }

    public void Button7(View view) {
        /* TODO:
            ButtonNum(7);
         */
    }

    public void Button8(View view) {
        /* TODO:
            ButtonNum(8);
         */
    }

    public void Button9(View view) {
        /* TODO:
            ButtonNum(9);
         */
    }

    public void ButtonPlus(View view) {
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
        if(first){
            a = a * 10 + num;
            text.setText(String.valueOf(a));
        }
        else {
            b = b * 10 + num;
            text.setText(String.valueOf(a));
        }


    }
}