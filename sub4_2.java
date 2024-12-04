package com.cookandroid.every;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class sub4_2 extends AppCompatActivity {
public Button btn_1, btn_2;
public EditText et_1;
public TextView text_1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub4_2);
        setTitle("윤성민입니다.");

     text_1  = findViewById(R.id.text_1);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        et_1 = findViewById(R.id.et_1);

    }
}
