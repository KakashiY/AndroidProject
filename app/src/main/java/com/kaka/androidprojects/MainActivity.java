package com.kaka.androidprojects;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.kaka.androidprojects.utils.DisplayUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoImmersiveStatusBar(View view) {
        Intent intent = new Intent(this, ImmersiveStatusBarActivity.class);
        startActivity(intent);
    }

    public void getSize(View view) {
        int sbHeight = DisplayUtils.getInternalDimensionPixelSize(getResources(), DisplayUtils.STATUS_BAR_HEIGHT_RES_NAME);
        int sbWidth = DisplayUtils.getInternalDimensionPixelSize(getResources(), DisplayUtils.STATUS_BAR_WIDTH_RES_NAME);
        int nbHeight = DisplayUtils.getInternalDimensionPixelSize(getResources(), DisplayUtils.NAV_BAR_HEIGHT_RES_NAME);
        int nbWidth = DisplayUtils.getInternalDimensionPixelSize(getResources(), DisplayUtils.NAV_BAR_WIDTH_RES_NAME);
        int nbHeightL = DisplayUtils.getInternalDimensionPixelSize(getResources(), DisplayUtils.NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME);
        Toast.makeText(this, "状态栏宽-高：" + sbWidth + "-" + sbHeight + ",导航栏宽-高：" + nbWidth + "-" + nbHeight + ",水平导航栏高：" + nbHeightL, Toast.LENGTH_LONG).show();
    }

    public void goToRecycleView(View view) {
        Intent intent = new Intent(this, RecylerViewActivity.class);
        startActivity(intent);
    }

    public void goToCollapsingToolbar(View view) {
        Intent intent = new Intent(this, CollapsingToolbarActivity.class);
        startActivity(intent);
    }

    public void getScreenSize(View view) {
        Intent intent = new Intent(this, ScreenSizeActivity.class);
        startActivity(intent);
    }
}