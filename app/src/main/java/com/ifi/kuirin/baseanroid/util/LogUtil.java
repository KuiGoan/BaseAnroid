package com.ifi.kuirin.baseanroid.util;

import android.support.compat.BuildConfig;
import android.util.Log;

/**
 * Created by KuiRin on 8/5/2017 AD.
 */

public class LogUtil {
    public static void d(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, msg);
        }
    }
}
