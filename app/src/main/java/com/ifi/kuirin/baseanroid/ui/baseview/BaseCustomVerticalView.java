package com.ifi.kuirin.baseanroid.ui.baseview;

import android.content.Context;
import android.content.res.TypedArray;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.databinding.BaseviewCustomviewVerticalBinding;

/**
 * Created by KuiRin on 8/5/2017 AD.
 */

public class BaseCustomVerticalView extends RelativeLayout {
    private int mTextColor;
    private int mImageResourceId;
    private String mText;
    private TextView mTextView;
    private ImageView mImageView;

    public BaseCustomVerticalView(Context context) {
        this(context, null);
    }

    public BaseCustomVerticalView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseCustomVerticalView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            init(context, attrs, defStyleAttr, 0);
        }
    }

    public BaseCustomVerticalView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        if (!isInEditMode()) {
            init(context, attrs, defStyleRes, defStyleRes);
        }
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = context.getTheme()
                .obtainStyledAttributes(attrs, R.styleable.BaseCustomVerticalView, defStyleAttr, defStyleRes);
        try {
            mText = a.getString(R.styleable.BaseCustomVerticalView_text);
            mImageResourceId = a.getResourceId(R.styleable.BaseCustomVerticalView_imageResource, -1);
            mTextColor = a.getResourceId(R.styleable.BaseCustomVerticalView_textColor, Color.BLACK);
            initView();
        } finally {
            a.recycle();
        }
    }

    private void initView() {
        BaseviewCustomviewVerticalBinding mBinding = DataBindingUtil.inflate(LayoutInflater
                .from(getContext()), R.layout.baseview_customview_vertical, this, true);
        mTextView = mBinding.textItem;
        mImageView = mBinding.imageItem;
        Log.d("base_custom_view", "#mTextView = " + mTextView);
        Log.d("base_custom_view", "#mImageView = " + mImageView);
        Log.d("base_custom_view", "#mText = " + mText);
        Log.d("base_custom_view", "#mTextColor = " + mTextColor);
        Log.d("base_custom_view", "#mImageResourceId = " + mImageResourceId);
        if (mImageView != null && mImageResourceId != -1) {
            mImageView.setBackgroundResource(mImageResourceId);
        }
        if (mTextView != null) {
            mTextView.setText(mText);
            mTextView.setTextColor(mTextColor);
        }
    }

    @Override
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        mTextView.setSelected(selected);
    }
}
