package com.ifi.kuirin.baseanroid.ui.recyclerview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.databinding.RecyclerviewActivityBinding;

/**
 * Created by KuiRin on 8/5/2017 AD.
 */

public class DragAndDropRecyclerViewActivity extends AppCompatActivity{
    RecyclerviewActivityBinding mBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.recyclerview_activity);

    }
}
