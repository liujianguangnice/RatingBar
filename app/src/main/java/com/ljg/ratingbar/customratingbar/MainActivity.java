package com.ljg.ratingbar.customratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ljg.ratingbar.custom.RatingBar;

public class MainActivity extends AppCompatActivity {
    private RatingBar mRatingBar;
    private RatingBar star_have_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {

        mRatingBar = (RatingBar) findViewById(R.id.star);
        star_have_click = (RatingBar) findViewById(R.id.star_have_click);
    }

    private void initData() {
        // mRatingBar.setClickable(false);

        star_have_click.setOnRatingChangeListener(new RatingBar.OnRatingChangeListener() {
            @Override
            public void onRatingChange(float ratingCount) {
                Toast.makeText(getApplicationContext(), ratingCount + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
