package com.ifi.kuirin.baseanroid.ui.recyclerview;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.databinding.RecyclerviewActivityBinding;
import com.ifi.kuirin.baseanroid.ui.recyclerview.adapter.RecyclerViewAdapter;
import com.ifi.kuirin.baseanroid.util.SharedPreference.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KuiRin on 8/5/2017 AD.
 */

public class RecyclerActivity extends AppCompatActivity implements RecyclerViewAdapter.OnItemLongClickListener {
    RecyclerviewActivityBinding mBinding;
    RecyclerViewAdapter mAdapter1;
    RecyclerViewAdapter mAdapter2;
    List<Person> mList1 = new ArrayList<>();
    List<Person> mList2 = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.recyclerview_activity);

        mAdapter1 = new RecyclerViewAdapter(mList1);
        mAdapter2 = new RecyclerViewAdapter(mList2);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mBinding.recyclerView1.setLayoutManager(mLayoutManager);
        mBinding.recyclerView1.setItemAnimator(new DefaultItemAnimator());
        mBinding.recyclerView1.setAdapter(mAdapter1);
        mBinding.recyclerView2.setAdapter(mAdapter2);
        initFakeData();

        //item long click
        mAdapter1.setOnItemLongClickListener(this);
        mAdapter2.setOnItemLongClickListener(this);
    }

    private void initFakeData() {
        mList1.add(new Person("AAAA", 2, true));
        mList1.add(new Person("bbbb", 3, true));
        mList1.add(new Person("cccc", 4, true));
        mList1.add(new Person("ssss", 5, true));
        mList1.add(new Person("aaxxx", 6, true));
        mList1.add(new Person("vvvv", 7, true));
        mList1.add(new Person("ffff", 8, true));
        mList1.add(new Person("rrrrr", 9, true));
        mAdapter1.notifyDataSetChanged();
    }

    @Override
    public boolean onItemLongClicked(View view, int position) {
        return false;
    }
}
