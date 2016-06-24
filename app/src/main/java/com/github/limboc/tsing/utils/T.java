package com.github.limboc.tsing.utils;

import android.content.Context;
import android.widget.Toast;

import com.github.limboc.tsing.App;

public class T {

	public static Context context;

	public static void showShort(int resId) {
		Toast.makeText(App.context, resId, Toast.LENGTH_SHORT).show();
	}

	public static void showShort(String message) {
		Toast.makeText(App.context, message, Toast.LENGTH_SHORT).show();
	}


}