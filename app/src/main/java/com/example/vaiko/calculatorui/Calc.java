package com.example.vaiko.calculatorui;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by Vaiko on 10.03.2016.
 */
public class Calc extends Activity implements View.OnClickListener {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonadd, buttonminus, buttonmultiply, buttondivide, buttonc, buttonequals;
    EditText numberField;
    double op1;
    double op2;
    String optr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonadd = (Button) findViewById(R.id.buttonadd);
        buttonminus = (Button) findViewById(R.id.buttonminus);
        buttonmultiply = (Button) findViewById(R.id.buttonmultiply);
        buttondivide = (Button) findViewById(R.id.buttondivide);
        buttonc = (Button) findViewById(R.id.buttonc);
        buttonequals = (Button) findViewById(R.id.buttonequals);
        numberField = (EditText) findViewById(R.id.numberField);

        try {
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);
            button6.setOnClickListener(this);
            button7.setOnClickListener(this);
            button8.setOnClickListener(this);
            button9.setOnClickListener(this);
            button0.setOnClickListener(this);
            buttonc.setOnClickListener(this);
            buttonadd.setOnClickListener(this);
            buttonminus.setOnClickListener(this);
            buttonmultiply.setOnClickListener(this);
            buttondivide.setOnClickListener(this);
            buttonequals.setOnClickListener(this);
        } catch (Exception e) {
        }
    }

    public void operation() {
        if (optr.equals("+")) {
            op2 = Integer.parseInt(numberField.getText().toString());
            numberField.setText("");
            op1 = op1 + op2;
            numberField.setText("Result : " + Double.toString(op1));
        } else if (optr.equals("-")) {
            op2 = Integer.parseInt(numberField.getText().toString());
            numberField.setText("");
            op1 = op1 - op2;
            numberField.setText("Result : " + Double.toString(op1));
        } else if (optr.equals("*")) {
            op2 = Integer.parseInt(numberField.getText().toString());
            numberField.setText("");
            op1 = op1 * op2;
            numberField.setText("Result : " + Double.toString(op1));
        } else if (optr.equals("/")) {
            op2 = Integer.parseInt(numberField.getText().toString());
            numberField.setText("");
            op1 = op1 / op2;
            numberField.setText("Result : " + Double.toString(op1));
        }
    }

    @Override
    public void onClick(View arg0) {
        Editable str = numberField.getText();
        switch (arg0.getId()) {
            case R.id.button1:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button2.getText());
                numberField.setText(str);
                break;
            case R.id.button2:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button2.getText());
                numberField.setText(str);
                break;
            case R.id.button3:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button3.getText());
                numberField.setText(str);
                break;
            case R.id.button4:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button4.getText());
                numberField.setText(str);
                break;
            case R.id.button5:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button5.getText());
                numberField.setText(str);
                break;
            case R.id.button6:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button6.getText());
                numberField.setText(str);
                break;
            case R.id.button7:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button7.getText());
                numberField.setText(str);
                break;
            case R.id.button8:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button8.getText());
                numberField.setText(str);
                break;
            case R.id.button9:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button9.getText());
                numberField.setText(str);
                break;
            case R.id.button0:
                if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                }
                str = str.append(button0.getText());
                numberField.setText(str);
                break;
            case R.id.buttonc:
                op1 = 0;
                op2 = 0;
                numberField.setText("");
                numberField.setHint("Perform Operation :)");
                break;
            case R.id.buttonadd:
                optr = "+";
                if (op1 == 0) {
                    op1 = Integer.parseInt(numberField.getText().toString());
                    numberField.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                } else {
                    op2 = Integer.parseInt(numberField.getText().toString());
                    numberField.setText("");
                    op1 = op1 + op2;
                    numberField.setText("Result : " + Double.toString(op1));
                }
                break;
            case R.id.buttonminus:
                optr = "-";
                if (op1 == 0) {
                    op1 = Integer.parseInt(numberField.getText().toString());
                    numberField.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                } else {
                    op2 = Integer.parseInt(numberField.getText().toString());
                    numberField.setText("");
                    op1 = op1 - op2;
                    numberField.setText("Result : " + Double.toString(op1));
                }
                break;
            case R.id.buttonmultiply:
                optr = "*";
                if (op1 == 0) {
                    op1 = Integer.parseInt(numberField.getText().toString());
                    numberField.setText("");
                } else if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                } else {
                    op2 = Integer.parseInt(numberField.getText().toString());
                    numberField.setText("");
                    op1 = op1 * op2;
                    numberField.setText("Result : " + Double.toString(op1));
                }
                break;
            case R.id.buttondivide:
                optr = "/";
                if (op1 == 0) {
                    op1 = Integer.parseInt(numberField.getText().toString());
                    numberField.setText("");

                } else if (op2 != 0) {
                    op2 = 0;
                    numberField.setText("");
                } else {
                    op2 = Integer.parseInt(numberField.getText().toString());

                    numberField.setText("");
                    op1 = op1 / op2;

                    numberField.setText("Result : " + Double.toString(op1));
                }
                break;
            case R.id.buttonequals:
                if (!optr.equals(null)) {
                    if (op2 != 0) {
                        if (optr.equals("+")) {
                            numberField.setText(""); /*op1 = op1 + op2;*/
                            numberField.setText("Result : " + Double.toString(op1));
                        } else if (optr.equals("-")) {
                            numberField.setText("");/* op1 = op1 - op2;*/
                            numberField.setText("Result : " + Double.toString(op1));
                        } else if (optr.equals("*")) {
                            numberField.setText("");/* op1 = op1 * op2;*/
                            numberField.setText("Result : " + Double.toString(op1));
                        } else if (optr.equals("/")) {
                            if(op2==0) {
                                numberField.setText("rip");
                            }
                            numberField.setText("");/* op1 = op1 / op2;*/
                            numberField.setText("Result : " + Double.toString(op1));
                        }
                    } else {
                        operation();
                    }
                }
                break;
        }


    }
}



