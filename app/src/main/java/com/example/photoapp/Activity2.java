package com.example.photoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    private static ImageView imgview;
    private static Button buttonsbm;
    private int current_image;
    int [ ]images={R.drawable.kajal1,R.drawable.kajal2,R.drawable.kajal3,R.drawable.kajal4,R.drawable.kajal5,R.drawable.kajal6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        buttonclick();
    }
        public void buttonclick()
        {
            imgview = (ImageView) findViewById(R.id.imageView3);
            buttonsbm=(Button)findViewById(R.id.forward1);
            buttonsbm.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            current_image++;
                            current_image=current_image % images.length;
                            imgview.setImageResource(images[current_image]);

                        }
                    }

            );


    }

    }
