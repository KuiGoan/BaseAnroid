package com.ifi.kuirin.baseanroid.util.SharedPreference;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class SharedPreferenceExample {

    protected void example(Context context) {

        List<Person> list = new ArrayList<>();
        Person a = new Person("Test", 1, true);
        list.add(new Person("AA", 10, false));
        list.add(new Person("BB", 13, true));
        list.add(new Person("CC", 12, false));
        list.add(new Person("DD", 11, true));
        list.add(a);
        String key = "test";
        SharedPreferenceUtils.putList(context, key, list);

        List<Person> list1 = SharedPreferenceUtils.getList(context, key, Person[].class);
        if (list1 == null && list1.size() <= 0) {
            return;
        }
        for (int i = 0; i < list1.size(); i++) {
            Log.d("test", "list i = " + list1.get(i).getName());
            Log.d("test", "list i = " + list1.get(i).getAge());
            Log.d("test", "list i = " + list1.get(i).isIsMale());
        }
        String key1 = "test1";
        SharedPreferenceUtils.putObject(context, key1, a);
        Person b = SharedPreferenceUtils.getObject(context, key1, Person.class);
        Log.d("testbbb", "ib = " + b.getName());

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        SharedPreferenceUtils.putList(context, key1, arr);
        List<Integer> arr2 = SharedPreferenceUtils.getList(context, key1, Integer[].class);
        for (int i = 0; i < arr2.size(); i++) {
            switch (arr.get(i)) {
                case 1:
                    Log.d("test", "list 1 = " + arr2.get(i));
                    break;
                case 2:
                    Log.d("test", "list 2 = " + arr2.get(i));
                    break;
            }
        }
        //Add item view
//        LinearLayout mLayoutItems = activityMainBinding.layoutItem;
//        mLayoutItems.removeAllViews();
//        for (int i = 0; i < 3; i++) {
//            if (i < 2) {
//                BaseCustomVerticalView view = new BaseCustomVerticalView(this, null, 0,
//                        R.style.BaseCustomVerticalView);
//            LinearLayout.LayoutParams params = LinearLayout.();
//            if (params != null) {
//                params.width = 100;
//                params.height = 200;
//            } else {
//                LinearLayout.LayoutParams params = new LinearLayout
//                        .LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup
//                        .LayoutParams.WRAP_CONTENT, 1.0f);
//                view.setLayoutParams(params);
//                mLayoutItems.addView(view);
//            }
//            } else {
//                View view = new View(this);
//                LinearLayout.LayoutParams params = new LinearLayout
//                        .LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup
//                        .LayoutParams.WRAP_CONTENT, 1.0f);
//                view.setLayoutParams(params);
//                mLayoutItems.addView(view);
//            }
//        }
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(4);
//        String key = "DATE_LIST";
////        inputPreference(key, list);
//        SharedPreferenceUtils.putList(this, key, list);
//        List<Integer> list1 = SharedPreferenceUtils.getList(this, key);
//        for (int i = 0; i < list1.size(); i++) {
//            Log.d("getPreference", "list1[" + i + "] = " + list1.get(i));
//        }
//        Log.d("getPreference", "list1 = " + list1);
    }
}
