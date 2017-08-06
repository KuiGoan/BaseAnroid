package com.ifi.kuirin.baseanroid.ui.dialog_fragment;

import android.app.Dialog;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ifi.kuirin.baseanroid.R;
import com.ifi.kuirin.baseanroid.databinding.DialogFragmentBinding;
import com.ifi.kuirin.baseanroid.databinding.DialogFragmentMisionBinding;

/**
 * Created by KuiRin on 8/6/2017 AD.
 */
public class CustomDialogFragment extends DialogFragment {

    public static final String TAG = CustomDialogFragment.class.getSimpleName();

    public static final String KEY_TAG = "KEY_TAG";

    public static final String KEY_TYPE = "KEY_TYPE";

    private DialogFragmentBinding mBinding;

    private int mType;

    private static final CustomDialogFragment ourInstance = new CustomDialogFragment();

    static CustomDialogFragment getInstance(String tag) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TAG, tag);
        ourInstance.setArguments(bundle);
        return ourInstance;
    }

    static CustomDialogFragment getInstance(String tag, int dialogType) {
        Bundle bundle = new Bundle();
        bundle.putString(KEY_TAG, tag);
        bundle.putInt(KEY_TYPE, dialogType);
        ourInstance.setArguments(bundle);
        return ourInstance;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mType = getArguments().getInt(KEY_TYPE, DialogFragment.STYLE_NO_TITLE);
            // Pick a style based on the num.
            int style = DialogFragment.STYLE_NORMAL;
            int theme = 0;
            switch ((mType - 1) % 6) {
                case 1:
                    style = DialogFragment.STYLE_NO_TITLE;
                    break;
                case 2:
                    style = DialogFragment.STYLE_NO_FRAME;
                    break;
                case 3:
                    style = DialogFragment.STYLE_NO_INPUT;
                    break;
                case 4:
                    style = DialogFragment.STYLE_NORMAL;
                    break;
                case 5:
                    style = DialogFragment.STYLE_NORMAL;
                    break;
                case 6:
                    style = DialogFragment.STYLE_NO_TITLE;
                    break;
                case 7:
                    style = DialogFragment.STYLE_NO_FRAME;
                    break;
                case 8:
                    style = DialogFragment.STYLE_NORMAL;
                    break;
            }
            switch ((mType - 1) % 6) {
                case 4:
                    theme = android.R.style.Theme_Holo;
                    break;
                case 5:
                    theme = android.R.style.Theme_Holo_Light_Dialog;
                    break;
                case 6:
                    theme = android.R.style.Theme_Holo_Light;
                    break;
                case 7:
                    theme = android.R.style.Theme_Holo_Light_Panel;
                    break;
                case 8:
                    theme = android.R.style.Theme_Holo_Light;
                    break;
            }
//            setStyle(style, theme);
        }
        //Theme_AppCompat_DayNight_DialogWhenLarge : full screen
        setStyle(DialogFragment.STYLE_NO_TITLE, R.style.Theme_AppCompat_Dialog_Alert);
        setCancelable(false);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
//        mBinding = DataBindingUtil.inflate(inflater, R.layout.dialog_fragment, container, false);
//        mBinding = CustomDialogFragmentBinding.inflate(inflater, container, false);
        DialogFragmentMisionBinding binding = DataBindingUtil
                .inflate(inflater, R.layout.dialog_fragment_mision, container, false);
        View view = binding.getRoot();
        binding.cancelAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().hide();
            }
        });
        return view;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        return dialog;
    }

}
