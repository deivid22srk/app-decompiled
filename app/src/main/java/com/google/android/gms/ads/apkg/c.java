package com.google.android.gms.ads.apkg;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.internal.client.i;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.dd;

/* loaded from: classes.dex */
public final class c extends ViewGroup {
    public c(android.content.Context context) {
        super(context);
        this.f5255a = null;
    }

    /* renamed from: a, reason: collision with root package name */
    public final x f5255a;

    public final com.google.android.gms.ads.c getAdSize() {
        return this.f5255a.a();
    }

    public final String getMediationAdapterClassName() {
        return this.f5255a.b();
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
            com.google.android.gms.ads.c adSize = getAdSize();
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
        this.f5255a.a(aVar);
    }

    public final void setAdSizes(com.google.android.gms.ads.c... cVarArr) {
        if (cVarArr == null || cVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f5255a.b(cVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f5255a.a(str);
    }

    public final com.google.android.gms.ads.a getAdListener() {
        return this.f5255a.f5310a;
    }

    public final com.google.android.gms.ads.c[] getAdSizes() {
        return this.f5255a.c;
    }

    public final String getAdUnitId() {
        return this.f5255a.d;
    }

    public final a getAppEventListener() {
        return this.f5255a.e;
    }

    public final b getOnCustomRenderedAdLoadedListener() {
        return this.f5255a.h;
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f5255a.i = z;
    }

    public final void setAppEventListener(a aVar) {
        x xVar = this.f5255a;
        try {
            xVar.e = aVar;
            if (xVar.f5311b == null || aVar == null) {
                return;
            }
            new i(aVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to set the AppEventListener.", e);
        }
    }

    public final void setCorrelator(f fVar) {
        this.f5255a.j = fVar;
    }

    public final void setOnCustomRenderedAdLoadedListener(b bVar) {
        x xVar = this.f5255a;
        xVar.h = bVar;
        try {
            if (xVar.f5311b == null || bVar == null) {
                return;
            }
            new dd(bVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to set the onCustomRenderedAdLoadedListener.", e);
        }
    }
}
