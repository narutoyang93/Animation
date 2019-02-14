package com.example.naruto.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imageView = findViewById(R.id.iv_icon);
        final Animation animation = AnimationUtils.loadAnimation(this, R.anim.my_anim);
        imageView.startAnimation(animation);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = imageView.getAnimation();
                if (animation1 != null) {
                    if (animation1.hasStarted()) {
                        animation1.cancel();
                    } else {
                        animation1.start();
                    }
                } else {
                    imageView.startAnimation(animation);
                }
            }
        });
    }
}
