package com.owen.tvrecyclerview.example.display;

import android.util.TypedValue;

import com.owen.tvrecyclerview.example.App;


/**
 * @author ZhouSuQiang
 */
public class DisplayAdaptive {
    
    private static class DisplayAdaptiveHolder {
        private static final DisplayAdaptive INSTANCE = new DisplayAdaptive();
    }
    
    private DisplayAdaptive() {}
    
    public static DisplayAdaptive getInstance() {
        return DisplayAdaptiveHolder.INSTANCE;
    }
    
    public float toLocalPx(float pt) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_PT, pt, App.get().getResources().getDisplayMetrics());
    }

}
