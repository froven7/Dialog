package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
Button dialogBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    dialogBtn=findViewById(R.id.dialog_btn);

    dialogBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Dialog dialog=new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.dialog_layout);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            dialog.getWindow().setWindowAnimations(R.style.AnimationsForDialog);

            ImageView closeBtn;
            closeBtn=dialog.findViewById(R.id.dialog_btn);
            closeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.cancel();
                }
            });

            dialog.show();
        }
    });
    }
}