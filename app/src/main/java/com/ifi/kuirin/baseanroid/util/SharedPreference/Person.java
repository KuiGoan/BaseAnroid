package com.ifi.kuirin.baseanroid.util.SharedPreference;

/**
 * Created by KuiRin on 8/4/2017 AD.
 */

public class Person {
    private String mName;
    private int mAge;
    private boolean mIsMale;

    public Person(String mName, int mAge, boolean mIsMale) {
        this.mName = mName;
        this.mAge = mAge;
        this.mIsMale = mIsMale;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public int getAge() {
        return mAge;
    }

    public void setAge(int mAge) {
        this.mAge = mAge;
    }

    public boolean isIsMale() {
        return mIsMale;
    }

    public void setIsMale(boolean mIsMale) {
        this.mIsMale = mIsMale;
    }
}
