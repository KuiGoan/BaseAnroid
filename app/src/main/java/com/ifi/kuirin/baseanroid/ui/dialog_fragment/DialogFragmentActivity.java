package com.ifi.kuirin.baseanroid.ui.dialog_fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.databinding.DialogFragmentActivityBinding;

/**
 * Created by KuiRin on 8/6/2017 AD.
 */

public class DialogFragmentActivity extends AppCompatActivity implements View.OnClickListener {
    DialogFragmentActivityBinding dialogFragmentActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dialogFragmentActivityBinding = DataBindingUtil
                .setContentView(this, R.layout.dialog_fragment_activity);
        dialogFragmentActivityBinding.dialogFragmentNormal.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dialog_fragment_normal:
                CustomDialogFragment fragment = CustomDialogFragment.getInstance(CustomDialogFragment.TAG);
                CustomFragmentManager.build(this).addDialogFragment(fragment, CustomDialogFragment.TAG);
                break;
            default:
                break;
        }
    }
}
