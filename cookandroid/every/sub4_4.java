package com.cookandroid.every;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Switch;

public class sub4_4 extends AppCompatActivity {

    TextView text1, text2;
    Switch switchAgree;
    RadioGroup rGroup1;
    RadioButton radioArray[] = new RadioButton[3];
    ImageView imgPet;
    Button btnQuit, btnRerun;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub4_4);
        setTitle("202208184 윤성민");

        text1 = findViewById(R.id.Text1);
        switchAgree = findViewById(R.id.switchAgree);

        text2 = findViewById(R.id.Text2);
        rGroup1 = findViewById(R.id.Rgroup1);
        radioArray[0] = findViewById(R.id.Rdo1);
        radioArray[1] = findViewById(R.id.Rdo2);
        radioArray[2] = findViewById(R.id.Rdo3);

        imgPet = findViewById(R.id.ImgIcon);

        btnQuit = findViewById(R.id.BtnQuit);
        btnRerun = findViewById(R.id.BtnRerun);

        switchAgree
                .setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton arg0,
                                                 boolean arg1) {

                        if (switchAgree.isChecked() == true) {
                            text2.setVisibility(android.view.View.VISIBLE);
                            rGroup1.setVisibility(android.view.View.VISIBLE);
                            imgPet.setVisibility(android.view.View.VISIBLE);
                            btnQuit.setVisibility(android.view.View.VISIBLE);
                            btnRerun.setVisibility(android.view.View.VISIBLE);
                        } else {
                            text2.setVisibility(android.view.View.INVISIBLE);
                            rGroup1.setVisibility(android.view.View.INVISIBLE);
                            imgPet.setVisibility(android.view.View.INVISIBLE);
                            btnQuit.setVisibility(android.view.View.INVISIBLE);
                            btnRerun.setVisibility(android.view.View.INVISIBLE);
                        }
                    }
                });

        final int draw[] = {R.drawable.dog1, R.drawable.cat1, R.drawable.rabbit};

        for (int i = 0; i < radioArray.length; i++) {
            final int index;
            index = i;
            radioArray[index].setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    imgPet.setImageResource(draw[index]);
                }
            });
        }

        btnQuit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                finish();
            }
        });

        btnRerun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                text2.setVisibility(android.view.View.INVISIBLE);
                rGroup1.setVisibility(android.view.View.INVISIBLE);
                imgPet.setVisibility(android.view.View.INVISIBLE);
                btnQuit.setVisibility(android.view.View.INVISIBLE);
                btnRerun.setVisibility(android.view.View.INVISIBLE);

                rGroup1.clearCheck();
                switchAgree.setChecked(false);

            }
        });

    }

}
