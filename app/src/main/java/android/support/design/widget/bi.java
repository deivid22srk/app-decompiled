package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: classes.dex */
final class bi {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f113a = {android.support.design.c.colorPrimary};

    static void a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f113a);
        boolean z = obtainStyledAttributes.hasValue(0) ? false : true;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
