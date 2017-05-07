package com.tingyik90.prefmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

public class PrefManager {

    // parameters
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    private static String debugTag = "PrefManager";
    private static boolean toShowLog = false;
    private static final int PUT = 1;
    private static final int GET = 2;

    // constructors
    public PrefManager(Context context) {
        pref = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        editor = pref.edit();
    }

    // general options
    public static void setDebugTag(String debugTag) {
        if (!debugTag.isEmpty()) PrefManager.debugTag = debugTag;
    }

    public static void showLog(boolean toShowLog) {
        PrefManager.toShowLog = toShowLog;
    }

    private void log(int type, String log) {
        if (toShowLog) Log.d(debugTag, (type == PUT ? "PUT " : "GET ") + log);
    }

    // getters and setters
    public void putString(String key, String value) {
        editor.putString(key, value).commit();
        log(PUT, key + " = " + value);
    }

    public String getString(String key, String defValue) {
        String value = pref.getString(key, defValue);
        log(GET, key + " = " + value);
        return value;
    }

    public void putBoolean(String key, boolean value) {
        editor.putBoolean(key, value).commit();
        log(PUT, key + " = " + value);
    }

    public boolean getBoolean(String key, boolean defValue) {
        boolean value = pref.getBoolean(key, defValue);
        log(GET, key + " = " + value);
        return value;
    }

    public void putInt(String key, int value) {
        editor.putInt(key, value).commit();
        log(PUT, key + " = " + value);
    }

    public int getInt(String key, int defValue) {
        int value = pref.getInt(key, defValue);
        log(GET, key + " = " + value);
        return value;
    }

    public void putFloat(String key, float value) {
        editor.putFloat(key, value).commit();
        log(PUT, key + " = " + value);
    }

    public float getFloat(String key, float defValue) {
        float value = pref.getFloat(key, defValue);
        log(GET, key + " = " + value);
        return value;
    }

    public void putLong(String key, long value) {
        editor.putLong(key, value).commit();
        log(PUT, key + " = " + value);
    }

    public long getLong(String key, long defValue) {
        long value = pref.getLong(key, defValue);
        log(GET, key + " = " + value);
        return value;
    }

    public void clearAll() {
        editor.clear().commit();
    }

    public void remove(String key) {
        editor.remove(key).commit();
    }

}

