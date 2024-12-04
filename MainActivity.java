package com.cookandroid.every;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private Button btn_4_2;
    private Button btn_4_3;
    private Button btn_4_4;
    private Button btn_5_2;
    private Button btn_6_0;
    private Button btn_6_0_1;
    private Button btn_6_0_2;
    private Button btn_6_1;
    private Button btn_6_2;
    private Button btn_6_3;
    private Button btn_6_4;
    private Button btn_7_1;
    private Button btn_7_2;
    private Button btn_7_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_4_2 = findViewById(R.id.btn_4_2);
        btn_4_3 = findViewById(R.id.btn_4_3);
        btn_4_4 = findViewById(R.id.btn_4_4);
        btn_5_2 = findViewById(R.id.btn_5_2);
        btn_6_0 = findViewById(R.id.btn_6_0);
        btn_6_0_1 = findViewById(R.id.btn_6_0_1);
        btn_6_0_2 = findViewById(R.id.btn_6_0_2);
        btn_6_1 = findViewById(R.id.btn_6_1);
        btn_6_2 = findViewById(R.id.btn_6_2);
        btn_6_3 = findViewById(R.id.btn_6_3);
        btn_6_4 = findViewById(R.id.btn_6_4);
        btn_7_1 = findViewById(R.id.btn_7_1);
        btn_7_2 = findViewById(R.id.btn_7_2);
        btn_7_3 = findViewById(R.id.btn_7_3);


        btn_4_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(MainActivity.this, sub4_2.class);
                startActivity(intent1);
            }});

        btn_4_3.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent2 = new Intent(MainActivity.this, sub4_3.class);
                    startActivity(intent2);
            }});

        btn_4_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent3 = new Intent(MainActivity.this, sub4_4.class);
                startActivity(intent3);
            }});

        btn_5_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent4 = new Intent(MainActivity.this, sub5_2.class);
                startActivity(intent4);
            }});

        btn_6_0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent8 = new Intent(MainActivity.this, sub6_0.class);
                startActivity(intent8);
            }});

           btn_6_0_1.setOnClickListener(new View.OnClickListener(){
              @Override
                   public void onClick(View v){
               Intent intent9 = new Intent(MainActivity.this, sub6_0_1.class);
                            startActivity(intent9);
              }});
        btn_6_0_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent10 = new Intent(MainActivity.this, sub6_0_2.class);
                startActivity(intent10);
            }});

        btn_6_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent5 = new Intent(MainActivity.this, sub6_1.class);
                startActivity(intent5);
            }});

        btn_6_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent6 = new Intent(MainActivity.this, sub6_2.class);
                startActivity(intent6);
            }});

        btn_6_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent7 = new Intent(MainActivity.this, sub6_3.class);
                startActivity(intent7);
            }});

        btn_6_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent11 = new Intent(MainActivity.this, sub6_4.class);
                startActivity(intent11);
            }});

        btn_7_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent12 = new Intent(MainActivity.this, sub7_1.class);
                startActivity(intent12);
            }});

        btn_7_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent13 = new Intent(MainActivity.this, sub7_2.class);
                startActivity(intent13);
            }});

        btn_7_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent14 = new Intent(MainActivity.this, sub7_3.class);
                startActivity(intent14);
            }});


    }
}