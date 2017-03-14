package com.example.ideal.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.BounceInterpolator;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1= (TextView)findViewById(R.id.t1);
        t2= (TextView)findViewById(R.id.t2);
        t3= (TextView)findViewById(R.id.t3);
        t4= (TextView)findViewById(R.id.t4);
        //ObjectAnimator fadeAnim = ObjectAnimator.ofFloat(t1, "alpha", 0.3f);
       // fadeAnim.start();

        ObjectAnimator fadeAltAnim = ObjectAnimator.ofFloat(t2, t2.ROTATION_X, 0,1);
        fadeAltAnim.start();

        /*ObjectAnimator scaleAnim = ObjectAnimator.ofFloat(t3, "scaleX", 1.0f, 2.0f);
        scaleAnim.setDuration(3000);
        scaleAnim.setRepeatCount(ValueAnimator.INFINITE);
        scaleAnim.setRepeatMode(ValueAnimator.REVERSE);
        scaleAnim.start();

        ObjectAnimator moveAnim = ObjectAnimator.ofFloat(t4, "Y", 1000);
        moveAnim.setDuration(2000);
        moveAnim.setRepeatCount(ValueAnimator.INFINITE);
        moveAnim.setRepeatMode(ValueAnimator.REVERSE);
        moveAnim.setInterpolator(new BounceInterpolator());
        moveAnim.start();*/
    }
}
