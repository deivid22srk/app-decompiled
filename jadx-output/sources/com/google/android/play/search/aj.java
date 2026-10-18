package com.google.android.play.search;

import android.content.Context;
import android.text.Spannable;
import android.text.style.TextAppearanceSpan;

/* loaded from: classes.dex */
public abstract class aj {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7033a;

    protected abstract CharSequence a(String str, String str2, int i, int i2);

    protected aj(Context context) {
        this.f7033a = context;
    }

    protected final void a(int i, Spannable spannable, int i2, int i3) {
        if (i2 != i3) {
            spannable.setSpan(new TextAppearanceSpan(this.f7033a, i), i2, i3, 0);
        }
    }
}
