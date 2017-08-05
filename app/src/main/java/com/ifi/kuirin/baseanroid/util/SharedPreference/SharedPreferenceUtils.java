package com.ifi.kuirin.baseanroid.util.SharedPreference;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by KuiRin on 8/2/2017 AD.
 */

public class SharedPreferenceUtils {
    private static final String SHARED_PREFERENCE_TAG = "MyApp";

    private SharedPreferenceUtils() {
        throw new AssertionError();
    }

    /**
     * Get SharedPreferences Object.
     * <br>
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     *                 <br>
     * @return Returns the SharedPreferences object
     */
    public static SharedPreferences getSharedPreferences(Context mContext) {
        return mContext.getSharedPreferences(SHARED_PREFERENCE_TAG, Activity.MODE_PRIVATE);
    }

    /**
     * Retrieve a String value from the preferences.
     * <br>
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     *                 <br>
     * @return Returns the preference value if it exists, or null
     */
    public static String getString(Context mContext, String key) {
        return getSharedPreferences(mContext).getString(key, null);
    }

    /**
     * Retrieve a String value from the preferences.
     * <br>
     *
     * @param mContext     The context to use.  Usually your {@link android.app.Application}
     *                     or {@link Activity} object.
     * @param key          The name of the preference.
     * @param defaultValue Value to return if this preference does not exist.
     *                     <br>
     * @return Returns the preference value if it exists, or defaultValue
     */
    public static String getString(Context mContext, String key, String defaultValue) {
        return getSharedPreferences(mContext).getString(key, defaultValue);
    }

    /**
     * Set a String value in the preferences
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     * @param value    The value for the preference.
     *                 <br><br>
     * @return Returns true if the new values were successfully written
     * to persistent storage.
     */
    public static boolean putString(Context mContext, String key, String value) {
        SharedPreferences pref = getSharedPreferences(mContext);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(key, value);
        return editor.commit();
    }

    /**
     * Retrieve a int value from the preferences.
     *
     * @param mContext A Context of the application.
     * @param key      The name of the preference.
     *                 <br><br>
     * @return Returns the preference value if it exists, or -1
     */
    public static int getInt(Context mContext, String key) {
        return getSharedPreferences(mContext).getInt(key, -1);
    }

    /**
     * Retrieve a int value from the preferences.
     *
     * @param mContext     The context to use.  Usually your {@link android.app.Application}
     *                     or {@link Activity} object.
     * @param key          The name of the preference.
     * @param defaultValue Value to return if this preference does not exist.
     *                     <br><br>
     * @return Returns the preference value if it exists, or defaultValue
     */
    public static int getInt(Context mContext, String key, int defaultValue) {
        return getSharedPreferences(mContext).getInt(key, defaultValue);
    }

    /**
     * Set a int value in the preferences
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     * @param value    The value for the preference.
     *                 <br><br>
     * @return Returns true if the new values were successfully written
     * to persistent storage.
     */
    public static boolean putInt(Context mContext, String key, int value) {
        SharedPreferences pref = getSharedPreferences(mContext);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(key, value);
        return editor.commit();
    }

    /**
     * Retrieve a long value from the preferences.
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     *                 <br><br>
     * @return Returns the preference value if it exists, or -1l
     */
    public static long getLong(Context mContext, String key) {
        return getSharedPreferences(mContext).getLong(key, -1l);
    }

    /**
     * Retrieve a long value from the preferences.
     *
     * @param mContext     The context to use.  Usually your {@link android.app.Application}
     *                     or {@link Activity} object.
     * @param key          The name of the preference.
     * @param defaultValue Value to return if this preference does not exist.
     *                     <br><br>
     * @return Returns the preference value if it exists, or defaultValue
     */
    public static long getLong(Context mContext, String key, long defaultValue) {
        return getSharedPreferences(mContext).getLong(key, defaultValue);
    }

    /**
     * Set a long value in the preferences
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     * @param value    The value for the preference.
     *                 <br><br>
     * @return Returns true if the new values were successfully written
     * to persistent storage.
     */
    public static boolean putLong(Context mContext, String key, long value) {
        SharedPreferences pref = getSharedPreferences(mContext);
        SharedPreferences.Editor editor = pref.edit();
        editor.putLong(key, value);
        return editor.commit();
    }

    /**
     * Retrieve a boolean value from the preferences.
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     *                 <br><br>
     * @return Returns the preference value if it exists, or false
     */
    public static boolean getBoolean(Context mContext, String key) {
        return getSharedPreferences(mContext).getBoolean(key, false);
    }

    /**
     * Retrieve a boolean value from the preferences.
     *
     * @param mContext     The context to use.  Usually your {@link android.app.Application}
     *                     or {@link Activity} object.
     * @param key          The name of the preference.
     * @param defaultValue Value to return if this preference does not exist.
     *                     <br><br>
     * @return Returns the preference value if it exists, or defaultValue
     */
    public static boolean getBoolean(Context mContext, String key, boolean defaultValue) {
        return getSharedPreferences(mContext).getBoolean(key, defaultValue);
    }

    /**
     * Set a boolean value in the preferences
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     * @param value    The value for the preference.
     *                 <br><br>
     * @return Returns true if the new values were successfully written
     * to persistent storage.
     */
    public static boolean putBoolean(Context mContext, String key, boolean value) {
        SharedPreferences pref = getSharedPreferences(mContext);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(key, value);
        return editor.commit();
    }


    /**
     * Remove preference value.
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference to put.
     *                 <br><br>
     * @return Returns true if preference value were successfully removed from
     * persistent storage.
     */
    public static <E> boolean putList(Context mContext, String key, List<E> objectList) {
        return SharedPreferenceUtils.putString(mContext, key, new Gson().toJson(objectList));
    }

    /**
     * Remove preference value.
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference.
     *                 <br><br>
     * @return Returns true if preference value were successfully removed from
     * persistent storage.
     */
    public static <E> List<E> getList(Context mContext, String key, Class<E[]> clss) {
        TypeToken<List<E>> token = new TypeToken<List<E>>() {
        };
        String json = SharedPreferenceUtils.getString(mContext, key, null);
        List<E> objectList = stringToArray(json, clss);
        return objectList == null ? Collections.<E>emptyList() : objectList;
    }

    /**
     *
     * @param mContext
     * @param key
     * @param object
     * @param <E>
     * @return
     */
    public static <E> boolean putObject(Context mContext, String key, E object) {
        return SharedPreferenceUtils.putString(mContext, key, new Gson().toJson(object));
    }

    /**
     *
     * @param mContext
     * @param key
     * @param clss
     * @param <E>
     * @return
     */
    public static <E> E getObject(Context mContext, String key, Class<E> clss) {
        String json = SharedPreferenceUtils.getString(mContext, key, null);
        E object = new Gson().fromJson(json, clss);
        return object;
    }

    /**
     *
     * @param s
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> stringToArray(String s, Class<T[]> clazz) {
        T[] arr = new Gson().fromJson(s, clazz);
        return Arrays.asList(arr); //or return Arrays.asList(new Gson().fromJson(s, clazz)); for a one-liner
    }

    /**
     *
     * @param pJSon
     * @param clss
     * @param <T>
     * @return
     */
    public static <T> List<T> convertJsonToArray(String pJSon, Class<T> clss) {
        if (pJSon == null || pJSon.isEmpty())
            return null;
        Type listType = new TypeToken<List<T>>() {
        }.getType();
        try {
            return new Gson().fromJson(pJSon, listType);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Remove preference value.
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     * @param key      The name of the preference to remove.
     *                 <br><br>
     * @return Returns true if preference value were successfully removed from
     * persistent storage.
     */
    public static boolean remove(Context mContext, String key) {
        SharedPreferences pref = getSharedPreferences(mContext);
        SharedPreferences.Editor editor = pref.edit();
        editor.remove(key);
        return editor.commit();
    }

    /**
     * clear all preference value.
     *
     * @param mContext The context to use.  Usually your {@link android.app.Application}
     *                 or {@link Activity} object.
     *                 <br><br>
     * @return Returns true if all preference value successfully removed from
     * persistent storage.
     */
    public static boolean clear(Context mContext) {
        SharedPreferences pref = getSharedPreferences(mContext);
        SharedPreferences.Editor editor = pref.edit();
        editor.clear();
        return editor.commit();
    }

}