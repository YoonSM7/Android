package com.cookandroid.every;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class sub7_1 extends AppCompatActivity {

    EditText edtAngle;
    ImageView imageView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub7_1);
        setTitle("제주도 풍경");

        edtAngle = findViewById(R.id.edtAngle);
        imageView1 = findViewById(R.id.imageView1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemRotate:
                imageView1.setRotation(Float.parseFloat(edtAngle.getText()
                        .toString()));
                return true;
            case R.id.item1:
                imageView1.setImageResource(R.drawable.jeju5);
                return true;
            case R.id.item2:
                imageView1.setImageResource(R.drawable.jeju6);
                return true;
            case R.id.item3:
                imageView1.setImageResource(R.drawable.jeju7);
                return true;
        }
        return false;
    }
}