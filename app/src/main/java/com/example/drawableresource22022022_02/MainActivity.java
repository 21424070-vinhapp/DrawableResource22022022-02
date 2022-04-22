package com.example.drawableresource22022022_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mtxtRating;
    RatingBar mRtBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRtBar=findViewById(R.id.ratingBar);
        mtxtRating=findViewById(R.id.txtRating);

        mRtBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                mtxtRating.setText("Rating is: "+ v);
            }
        });
    }
}