package com.ifi.kuirin.baseanroid.ui.baseview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.databinding.BaseviewSelectedBinding;

/**
 * Created by KuiRin on 8/5/2017 AD.
 */

public class BaseViewSelected extends AppCompatActivity implements View.OnClickListener{
    BaseviewSelectedBinding baseViewSelectedBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        baseViewSelectedBinding = DataBindingUtil
                .setContentView(this, R.layout.baseview_selected);
        baseViewSelectedBinding.customView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
//        if (!ClickCheckUtil.canSelect()) {
//            return;
//        }
        boolean isSelected = baseViewSelectedBinding.customView.isSelected();
        baseViewSelectedBinding.customView.setSelected(!isSelected);
    }
}
