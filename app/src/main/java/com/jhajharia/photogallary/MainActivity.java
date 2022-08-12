package com.jhajharia.photogallary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int imgNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setImage();
    }

    public void setImage() {
        ImageView picture = (ImageView) findViewById(R.id.frame);
        imgNum %= 4;
        switch (imgNum) {
            case 0 :
                picture.setImageResource(R.drawable.a);
                break;
            case 1 :
                picture.setImageResource(R.drawable.b);
                break;
            case 2 :
                picture.setImageResource(R.drawable.c);
                break;
            case 3 :
                picture.setImageResource(R.drawable.d);
                break;
            default :
                break;
        }
    }

    public void nextImage(View view) {
        imgNum++;
        setImage();
    }

    public void prevImage(View view) {
        if (imgNum == 0) {
            imgNum = 3;
        }
        else {
            imgNum--;
        }

        setImage();
    }
}