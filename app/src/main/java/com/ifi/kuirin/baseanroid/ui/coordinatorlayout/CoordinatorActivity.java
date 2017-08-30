package com.ifi.kuirin.baseanroid.ui.coordinatorlayout;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.databinding.CoordinatorLayoutBinding;

/**
 * Created by KuiRin on 8/9/2017 AD.
 */

public class CoordinatorActivity extends AppCompatActivity {

    CoordinatorLayoutBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.coordinator_layout);
    }
}
