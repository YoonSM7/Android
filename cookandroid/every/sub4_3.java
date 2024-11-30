package com.cookandroid.every;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class sub4_3 extends AppCompatActivity {

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRem;
    TextView textResult;
    String num1, num2;
    Double result;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub4_3);
        setTitle("특급 계산기");

        edit1 = findViewById(R.id.Edit1);
        edit2 = findViewById(R.id.Edit2);

        btnAdd = findViewById(R.id.BtnAdd);
        btnSub = findViewById(R.id.BtnSub);
        btnMul = findViewById(R.id.BtnMul);
        btnDiv = findViewById(R.id.BtnDiv);
        btnRem = findViewById(R.id.BtnRem);

        textResult = findViewById(R.id.TextResult);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    result = Double.parseDouble(num1)
                            + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();


                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {
                    result = Double.parseDouble(num1)
                            - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다",Toast.LENGTH_SHORT)
                            .show();
                } else {
                    result = Double.parseDouble(num1)
                            * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {

                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(),
                                "0으로 나누면 안됩니다!", Toast.LENGTH_SHORT).show();

                    } else {
                        result = Double.parseDouble(num1)
                                / Double.parseDouble(num2);
                        result = (int) (result * 10) / 10.0;
                        textResult.setText("계산 결과 : " + result.toString(result));
                    }
                }

            }
        });

        btnRem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력 값이 비었습니다", Toast.LENGTH_SHORT)
                            .show();
                } else {

                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(),
                                "0으로 나머지 값 안됩니다!", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Double.parseDouble(num1)
                                % Double.parseDouble(num2);
                        textResult.setText("계산 결과 : " + result.toString());
                    }
                }

            }
        });

    }

}