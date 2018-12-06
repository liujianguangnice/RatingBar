package com.ljg.ratingbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ljg.ratingbar.custom.RatingBars;
import com.ljg.ratingbar.customratingbar.R;

public class MainActivity extends AppCompatActivity {
    private RatingBars mRatingBars;
    private RatingBars star_have_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {

        mRatingBars = (RatingBars) findViewById(R.id.star);
        star_have_click = (RatingBars) findViewById(R.id.star_have_click);
    }

    private void initData() {
        // mRatingBar.setClickable(false);

        star_have_click.setOnRatingChangeListener(new RatingBars.OnRatingChangeListener() {
            @Override
            public void onRatingChange(float ratingCount) {
                Toast.makeText(getApplicationContext(), ratingCount + "", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
