package m.example.helloworld;

import android.app.Activity;

import android.graphics.drawable.AnimationDrawable;

import android.os.Bundle;

import android.view.View;

import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    AnimationDrawable androidAnimation;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView androidImage = (ImageView) findViewById(R.id.android);
        androidImage.setBackgroundResource(R.drawable.android_animate);
        androidAnimation = (AnimationDrawable) androidImage.getBackground();
        final Button btnAnimate = (Button) findViewById(R.id.animate);
        View.OnClickListener ocl;
        ocl = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                androidAnimation.stop();
                androidAnimation.start();
            }
        };
        btnAnimate.setOnClickListener(ocl);
    }
}
