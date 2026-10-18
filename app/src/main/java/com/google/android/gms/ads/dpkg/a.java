package com.google.android.gms.ads.dpkg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.internal.client.x;

/* loaded from: classes.dex */
public final class a extends ViewGroup {
    public a(android.content.Context context) {
        super(context);
        this.f5278a = null;
    }

    /* renamed from: a, reason: collision with root package name */
    public final x f5278a;

    public final c getAdSize() {
        return this.f5278a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            c adSize = getAdSize();
            if (adSize != null) {
                Context context = getContext();
                i3 = adSize.b(context);
                i4 = adSize.a(context);
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i3 = childAt.getMeasuredWidth();
            i4 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i3, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i4, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(com.google.android.gms.ads.a aVar) {
        this.f5278a.a(aVar);
    }

    public final void setAdSize(c cVar) {
        this.f5278a.a(cVar);
    }

    public final void setAdUnitId(String str) {
        this.f5278a.a(str);
    }

    public final com.google.android.gms.ads.a getAdListener() {
        return this.f5278a.f5310a;
    }

    public final String getAdUnitId() {
        return this.f5278a.d;
    }
}
