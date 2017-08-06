package com.ifi.kuirin.baseanroid;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ifi.kuirin.baseanroid.databinding.ActivityMainBinding;
import com.ifi.kuirin.baseanroid.ui.dialog_fragment.DialogFragmentActivity;
import com.ifi.kuirin.baseanroid.ui.recyclerview.RecyclerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);
        activityMainBinding.recyclerView.setOnClickListener(this);
        activityMainBinding.dialogFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.recycler_view:
                intent = new Intent(this, RecyclerActivity.class);
                break;
            case R.id.dialog_fragment:
                intent = new Intent(this, DialogFragmentActivity.class);
                break;
            default:
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
