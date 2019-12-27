package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8,
            button9, buttonAdd, buttonSub, buttonDiv, buttonMul, button10, buttonC, buttonEqual;
    TextView myCalcTextView,tv2;

    float mValueOne, mvalueTwo;
    String temp;

    boolean mycalculatorAddition, mSubstract, mycalculatorMultiplication, mycalculatorDivision;
    int negativenum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonsub);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDiv = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonEqual = findViewById(R.id.buttoneql);
        myCalcTextView = findViewById(R.id.edt1);
        tv2=findViewById(R.id.tv2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalcTextView.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    mValueOne = Float.parseFloat(myCalcTextView.getText() + "");
                    tv2.setText(mValueOne+"");
                    mycalculatorAddition = true;
                    myCalcTextView.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalcTextView.getText().toString().equals("")) {
                    myCalcTextView.setText("-");

                } else {
                    if (myCalcTextView.getText().toString().equals("-")) {
                        Toast.makeText(getApplicationContext(), "You cant enter 2 negative symbols", Toast.LENGTH_SHORT).show();
                    } else {
                        mValueOne = Float.parseFloat(myCalcTextView.getText() + "");
                        tv2.setText(mValueOne+"");
                        mSubstract = true;
                        myCalcTextView.setText(null);
                    }
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalcTextView.getText().toString().equals("") || myCalcTextView.getText().equals("-")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    mValueOne = Float.parseFloat(myCalcTextView.getText() + "");
                    tv2.setText(mValueOne+"");
                    mycalculatorMultiplication = true;
                    myCalcTextView.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalcTextView.getText().toString().equals("") || myCalcTextView.getText().equals("-")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    mValueOne = Float.parseFloat(myCalcTextView.getText() + "");
                    tv2.setText(mValueOne+"");
                    mycalculatorDivision = true;
                    myCalcTextView.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalcTextView.getText().toString().equals("") || myCalcTextView.getText().equals("-")) {
                    Toast.makeText(getApplicationContext(), "Please Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    mvalueTwo = Float.parseFloat(myCalcTextView.getText() + "");
                    if (mycalculatorAddition == true) {
                        myCalcTextView.setText(mValueOne + mvalueTwo + "");
                        mycalculatorAddition = false;
                    }

                    if (mSubstract == true) {
                        myCalcTextView.setText(mValueOne - mvalueTwo + "");
                        mSubstract = false;
                    }

                    if (mycalculatorMultiplication == true) {
                        myCalcTextView.setText(mValueOne * mvalueTwo + "");
                        mycalculatorMultiplication = false;
                    }

                    if (mycalculatorDivision == true) {
                        myCalcTextView.setText(mValueOne / mvalueTwo + "");
                        mycalculatorDivision = false;
                    }
                }
            }
        });
       buttonC.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View view) {
               myCalcTextView.setText("");
               tv2.setText("");
               Toast.makeText(getApplicationContext(), "Cleared", Toast.LENGTH_LONG).show();
               return true;
           }
       });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myCalcTextView.getText().toString().length() > 0) {
                    temp = myCalcTextView.getText().toString();
                    temp = temp.substring(0, temp.length() - 1);
                    myCalcTextView.setText(temp);
                } else {
                    tv2.setText("");
                    Toast.makeText(getApplicationContext(), "Clear Already", Toast.LENGTH_LONG).show();
                }
            }});

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myCalcTextView.setText(myCalcTextView.getText() + ".");
            }
        });
    }
}
