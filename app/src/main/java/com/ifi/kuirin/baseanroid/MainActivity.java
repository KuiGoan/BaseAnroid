package com.ifi.kuirin.baseanroid;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ifi.kuirin.baseanroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);
        activityMainBinding.customView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        if (!ClickCheckUtil.canSelect()) {
//            return;
//        }
        boolean isSelected = activityMainBinding.customView.isSelected();
        activityMainBinding.customView.setSelected(!isSelected);
        activityMainBinding.textView.setSelected(!isSelected);
    }
}
