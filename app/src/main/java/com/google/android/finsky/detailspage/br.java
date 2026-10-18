package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public final class br extends android.support.v7.widget.eb {

    /* renamed from: a, reason: collision with root package name */
    private int f2567a;

    public br(Context context, boolean z) {
        this.f2567a = a(context.getResources(), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v7.widget.eb
    public final void a(Rect rect, View view) {
        int i = view instanceof bs ? 0 : this.f2567a;
        if (view instanceof bt) {
            i += ((bt) view).getMarginOffset();
        }
        rect.set(i, 0, i, 0);
    }

    public static int a(Resources resources, boolean z) {
        int i = resources.getDisplayMetrics().widthPixels;
        return (i - Math.min(i, z ? ik.b(resources) : i)) / 2;
    }
}
