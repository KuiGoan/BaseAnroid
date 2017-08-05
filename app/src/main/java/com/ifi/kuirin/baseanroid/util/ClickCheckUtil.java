package com.ifi.kuirin.baseanroid.util;

/**
 * Created by KuiRin on 8/5/2017 AD.
 */

public class ClickCheckUtil {
    private static long mTimeSelected = 0;
    private static final long TIME_WAITTING = 1000;

    public static boolean canSelect() {
        long currentTime = System.currentTimeMillis();
        long time = currentTime - mTimeSelected;
        LogUtil.d(ClickCheckUtil.class.getSimpleName(), "time select = " + time);
        if (time >= TIME_WAITTING) {
            LogUtil.d(ClickCheckUtil.class.getSimpleName(), "canselect ");
            mTimeSelected = System.currentTimeMillis();
            return true;
        }
        return false;
    }
}
