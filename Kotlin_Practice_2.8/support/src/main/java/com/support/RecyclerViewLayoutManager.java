package com.support;

import android.support.annotation.IntDef;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RecyclerViewLayoutManager {
    public static final int LINEAR = 10010;
    public static final int GRID = 10020;

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({LINEAR, GRID})
    public @interface LayoutManager{}
}
