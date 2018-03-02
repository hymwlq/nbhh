package com.nbhh.app.openproject.business;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.nbhh.app.openproject.R;

/**
 * @author Wlq
 * @description 高级动画
 * @date 2018/3/1 下午6:01
 */
public class SeniorAnimActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ivThreeLineAnim;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_senior_anim);

        ivThreeLineAnim = (ImageView) findViewById(R.id.iv_three_line_anim);
        ivThreeLineAnim.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_three_line_anim:
                Drawable drawable = ivThreeLineAnim.getDrawable();
                ((Animatable)drawable).start();
                break;
        }
    }
}
