package com.google.android.libraries.bind.widget;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static Rect f6723a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    private static Rect f6724b = new Rect();
    private static int[] c = new int[2];

    public static boolean a(View view) {
        return view.getGlobalVisibleRect(f6723a);
    }
}
