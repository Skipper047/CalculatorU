package com.example.calculatorua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Double firstVar, secondVar;
    private Boolean isOperationClick;
    private static final char addition = '+';
    private static final char minus = '-';
    private static final char umnojen = '*';
    private static final char division = '/';
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);
    }

    public void onClickNumber(View view) {
        switch (view.getId()){
            case R.id.btn_one:
               setNumber("1");
                break;
            case R.id.btn_two:
                setNumber("2");
                break;
            case R.id.btn_three:
                setNumber("3");
                break;
            case R.id.btn_four:
                setNumber("4");
                break;
            case R.id.btn_five:
                setNumber("5");
                break;
            case R.id.btn_six:
                setNumber("6");
                break;
            case R.id.btn_seven:
                setNumber("7");
                break;
            case R.id.btn_eight:
                setNumber("8");
                break;
            case R.id.btn_nine:
                setNumber("9");
                break;
            case R.id.btn_noll:
                setNumber("0");
                break;

            case R.id.btn_clear:
                textView.setText("0");
                isOperationClick = false;
                firstVar =0.0;
                secondVar =0.0;
                break;
        }
    }

    public void onClickOperation(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                firstVar= Double.parseDouble(textView.getText().toString());
                action = addition;
                isOperationClick = true;
                break;
            case R.id.btn_minus:
                firstVar= Double.parseDouble(textView.getText().toString());
                action = minus;
                isOperationClick = true;
                break;
            case R.id.btn_umnoj:
                firstVar= Double.parseDouble(textView.getText().toString());
                action = umnojen;
                isOperationClick = true;
                break;
            case R.id.btn_deli:
                firstVar= Double.parseDouble(textView.getText().toString());
                action = division;
                isOperationClick = true;
                break;

            case R.id.btn_equal:
                secondVar = Double.parseDouble(textView.getText().toString());
                if (action == minus){
                    if (view.getId()==R.id.btn_percent){
                        Double percent = firstVar*secondVar/100;
                        Double result = firstVar - percent;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }else{
                        Double result = firstVar - secondVar;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }

                }else if (action == division){
                    if (view.getId()==R.id.btn_percent){
                        Double percent = firstVar*secondVar/100;
                        Double result = firstVar / percent;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }else{
                        Double result = firstVar / secondVar;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }

                }else if (action == umnojen){
                    if (view.getId()==R.id.btn_percent){
                        Double percent = firstVar*secondVar/100;
                        Double result = firstVar * percent;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }else{
                        Double result = firstVar * secondVar;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }

                }else if (action == addition){
                    if (view.getId()==R.id.btn_percent){
                        Double percent = firstVar*secondVar/100;
                        Double result = firstVar + percent;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }else{
                        Double result = firstVar + secondVar;
                        textView.setText(result.toString());
                        isOperationClick = true;
                        break;
                    }

                }else{
                    textView.setText("Error");

                }


//            case R.id.btn_percent:
//                secondVar = Double.parseDouble(textView.getText().toString());
//                if (action == minus){
//                    Double percent = firstVar*secondVar/100;
//                    Double result = firstVar - percent;
//                    textView.setText(result.toString());
//                    isOperationClick = true;
//                    break;
//                }else if (action == division){
//                    Double percent = firstVar*secondVar/100;
//                    Double result = firstVar / percent;
//                    textView.setText(result.toString());
//                    isOperationClick = true;
//                    break;
//                }else if (action == umnojen){
//                    Double percent = firstVar*secondVar/100;
//                    Double result = firstVar * percent;
//                    textView.setText(result.toString());
//                    isOperationClick = true;
//                    break;
//                }else if (action == addition){
//                    Double percent = firstVar*secondVar/100;
//                    Double result = firstVar + percent;
//                    textView.setText(result.toString());
//                    isOperationClick = true;
//                    break;
//                }else{
//                    textView.setText("Error");
//
//                }


        }
    }

//    private void onClickOper(View view){
//        if (textView.getText().toString().equals("+")){
//            firstVar= Integer.parseInt(textView.getText().toString());
//            if (textView.getText().toString().equals("=")){
//                secondVar = Integer.parseInt(textView.getText().toString());
//                Integer result = firstVar + secondVar;
//                textView.setText(result.toString());
//                isOperationClick = true; }
//        }else if (textView.getText().toString().equals("-")){
//            firstVar= Integer.parseInt(textView.getText().toString());
//            if (textView.getText().toString().equals("=")){
//                secondVar = Integer.parseInt(textView.getText().toString());
//                Integer result = firstVar - secondVar;
//                textView.setText(result.toString());
//                isOperationClick = true; }
//        }else if (textView.getText().toString().equals("/")){
//            firstVar= Integer.parseInt(textView.getText().toString());
//            if (textView.getText().toString().equals("=")){
//                secondVar = Integer.parseInt(textView.getText().toString());
//                Integer result = firstVar / secondVar;
//                textView.setText(result.toString());
//                isOperationClick = true; }
//        }else if (textView.getText().toString().equals("*")){
//            firstVar= Integer.parseInt(textView.getText().toString());
//            if (textView.getText().toString().equals("=")){
//                secondVar = Integer.parseInt(textView.getText().toString());
//                Integer result = firstVar * secondVar;
//                textView.setText(result.toString());
//                isOperationClick = true; }
//        }else { textView.setText("Error"); } }

    private void setNumber(String number){
        if (textView.getText().toString().equals("0")){
            textView.setText(number);
        } else if (isOperationClick){
            textView.setText(number);
        }else {
            textView.append(number);
        }
        isOperationClick = false;
    }
}