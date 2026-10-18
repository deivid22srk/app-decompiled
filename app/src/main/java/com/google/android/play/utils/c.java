package com.google.android.play.utils;

import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.gx;

/* loaded from: classes.dex */
public final class c {
    public static ds a(gx gxVar, int i) {
        if (gxVar == null || gxVar.w == null) {
            return null;
        }
        ds[] dsVarArr = gxVar.w;
        for (int i2 = 0; i2 < dsVarArr.length; i2++) {
            if (dsVarArr[i2].f3746a == i) {
                return dsVarArr[i2];
            }
        }
        return null;
    }
}
