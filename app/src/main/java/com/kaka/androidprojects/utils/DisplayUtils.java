package com.kaka.androidprojects.utils;

import android.content.res.Resources;

public class DisplayUtils {
    /**
     * 状态栏高度
     */
    public static final String STATUS_BAR_HEIGHT_RES_NAME = "status_bar_height";
    /**
     * 状态栏宽度
     */
    public static final String STATUS_BAR_WIDTH_RES_NAME = "status_bar_width";
    /**
     * 导航栏高度
     */
    public static final String NAV_BAR_HEIGHT_RES_NAME = "navigation_bar_height";
    /**
     * 状态栏宽度
     */
    public static final String NAV_BAR_WIDTH_RES_NAME = "navigation_bar_width";
    /**
     * 横屏导航栏高度
     */
    public static final String NAV_BAR_HEIGHT_LANDSCAPE_RES_NAME = "navigation_bar_height_landscape";

    public static final String SHOW_NAV_BAR_RES_NAME = "config_showNavigationBar";

    public static int getInternalDimensionPixelSize(Resources res, String key) {
        int result = 0;
        // 获取资源id
        int resourceId = res.getIdentifier(key, "dimen", "android");
        if (resourceId > 0) {
            result = res.getDimensionPixelSize(resourceId);
        }
        return result;
    }

}
