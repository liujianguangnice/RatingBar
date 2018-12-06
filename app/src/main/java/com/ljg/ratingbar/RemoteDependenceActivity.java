package com.ljg.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ljg.ratingbar.customratingbar.R;

public class RemoteDependenceActivity extends AppCompatActivity {

    private RatingBar mRatingBars;
    private RatingBar star_have_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remote_dependence);
        initView();
        initData();
    }

    private void initView() {

        mRatingBars = findViewById(R.id.star);
        star_have_click = findViewById(R.id.star_have_click);
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
