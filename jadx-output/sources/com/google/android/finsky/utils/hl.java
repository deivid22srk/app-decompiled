package com.google.android.finsky.utils;

import android.content.Context;
import com.android.vending.R;

/* loaded from: classes.dex */
public final class hl {

    /* renamed from: a, reason: collision with root package name */
    private static hm[] f4964a = {new hm(4, R.string.reviews_sort_by_helpfulness), new hm(0, R.string.reviews_sort_by_date), new hm(1, R.string.reviews_sort_by_rating)};

    public static int a(int i) {
        if (i < 0 || i >= f4964a.length) {
            return -1;
        }
        return f4964a[i].f4965a;
    }

    public static String a(Context context, int i) {
        for (hm hmVar : f4964a) {
            if (i == hmVar.f4965a) {
                return context.getString(hmVar.f4966b);
            }
        }
        return null;
    }

    public static CharSequence[] a(Context context) {
        CharSequence[] charSequenceArr = new CharSequence[f4964a.length];
        for (int i = 0; i < f4964a.length; i++) {
            charSequenceArr[i] = context.getString(f4964a[i].f4966b);
        }
        return charSequenceArr;
    }

    public static int a(com.google.android.finsky.api.model.l lVar) {
        int i = lVar.d;
        for (int i2 = 0; i2 < f4964a.length; i2++) {
            if (i == f4964a[i2].f4965a) {
                return i2;
            }
        }
        return -1;
    }
}
