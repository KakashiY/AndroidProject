package com.kaka.androidprojects;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class ScreenSizeActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_size);
        getScreenSize();
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void getScreenSize() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Log.e("kaka", "getRealSize=" + point.x + "--" + point.y);
        defaultDisplay.getSize(point);
        Log.e("kaka", "getSize=" + point.x + "--" + point.y);

        Rect rect = new Rect();
        defaultDisplay.getRectSize(rect);
        Log.e("kaka", "getRectSize=" + rect.left + "--" + rect.right + "--" + rect.top + "--" + rect.bottom);

        DisplayMetrics metrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(metrics);
        Log.e("kaka", "getRealMetrics=" + metrics.widthPixels + "--" + metrics.heightPixels);
        defaultDisplay.getMetrics(metrics);
        Log.e("kaka", "getMetrics=" + metrics.widthPixels + "--" + metrics.heightPixels);


        /**
         * 屏幕宽高
         */
        WindowManager mWm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        int mFullScreenSizeWidth = mWm.getDefaultDisplay().getMode().getPhysicalWidth();
        int mFullScreenSizeHeight = mWm.getDefaultDisplay().getMode().getPhysicalHeight();
        Log.e("kaka", "getPhysicalWidth=" + mFullScreenSizeWidth);
        Log.e("kaka", "getPhysicalHeight=" + mFullScreenSizeHeight);


        Log.e("kaka", " Resources.getSystem().getDisplayMetrics().widthPixels=" + Resources.getSystem().getDisplayMetrics().widthPixels);
        Log.e("kaka", " Resources.getSystem().getDisplayMetrics().heightPixels=" + Resources.getSystem().getDisplayMetrics().heightPixels);


        getWindow().getDecorView().getGlobalVisibleRect(rect);
        Log.e("kaka", " getWindow().getDecorView().getGlobalVisibleRect(rect)=" + rect.left + "--" + rect.right + "--" + rect.top + "--" + rect.bottom);
    }
}