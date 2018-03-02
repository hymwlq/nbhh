package com.nbhh.app.openproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nbhh.app.openproject.business.DataStructureActivity;
import com.nbhh.app.openproject.business.SeniorAnimActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_anim).setOnClickListener(this);
        findViewById(R.id.bt_data_structure).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_anim:
                startActivity(new Intent(this, SeniorAnimActivity.class));
                break;
            case R.id.bt_data_structure:
                startActivity(new Intent(this, DataStructureActivity.class));
                break;
        }
    }
}
