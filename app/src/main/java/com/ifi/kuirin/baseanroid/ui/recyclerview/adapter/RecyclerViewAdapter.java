package com.ifi.kuirin.baseanroid.ui.recyclerview.adapter;

import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.base.adapter.BaseRecyclerAdapter;
import com.ifi.kuirin.baseanroid.databinding.RecyclerviewItemBinding;
import com.ifi.kuirin.baseanroid.util.SharedPreference.Person;

import java.util.List;

/**
 * Created by KuiRin on 8/5/2017 AD.
 */

public class RecyclerViewAdapter extends BaseRecyclerAdapter<Person, RecyclerViewAdapter.ViewHolder> {

    public RecyclerViewAdapter(@Nullable List<Person> objects) {
        super(objects);
    }

    private OnItemClickListener mOnItemClickListener;
    private OnItemLongClickListener mOnItemLongClickListener;

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerviewItemBinding binding = DataBindingUtil.inflate(LayoutInflater
                .from(parent.getContext()), R.layout.recyclerview_item, parent, true);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.ViewHolder holder, final int position) {
        holder.mBinding.itemTitle.setText(getItem(position).getName());
        holder.mBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mOnItemLongClickListener != null) {
                    mOnItemLongClickListener.onItemLongClicked(view, position);
                }
            }
        });

        holder.mBinding.getRoot().setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClicked(view, position);
                }
                return true;
            }
        });
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        RecyclerviewItemBinding mBinding;

        public ViewHolder(RecyclerviewItemBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }

    public OnItemClickListener getOnItemClickListener() {
        return mOnItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    public OnItemLongClickListener getOnItemLongClickListener() {
        return mOnItemLongClickListener;
    }

    public void setOnItemLongClickListener(OnItemLongClickListener onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
    }

    public interface OnItemClickListener {
        void onItemClicked(View view, int position);
    }

    public interface OnItemLongClickListener {
        boolean onItemLongClicked(View view, int position);
    }
}
