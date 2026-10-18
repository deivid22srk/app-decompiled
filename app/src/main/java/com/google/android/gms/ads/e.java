package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.gs;

/* loaded from: classes.dex */
class e extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final x f5279a;

    public c getAdSize() {
        return this.f5279a.a();
    }

    public String getMediationAdapterClassName() {
        return this.f5279a.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    protected void onMeasure(int i, int i2) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(a aVar) {
        this.f5279a.a(aVar);
        if (aVar != 0 && (aVar instanceof com.google.android.gms.ads.internal.client.a)) {
            this.f5279a.a((com.google.android.gms.ads.internal.client.a) aVar);
        } else if (aVar == 0) {
            this.f5279a.a((com.google.android.gms.ads.internal.client.a) null);
        }
    }

    public void setAdSize(c cVar) {
        this.f5279a.a(cVar);
    }

    public void setAdUnitId(String str) {
        this.f5279a.a(str);
    }

    public a getAdListener() {
        return this.f5279a.f5310a;
    }

    public String getAdUnitId() {
        return this.f5279a.d;
    }

    public com.google.android.gms.ads.purchase.a getInAppPurchaseListener() {
        return this.f5279a.f;
    }

    public void setInAppPurchaseListener(com.google.android.gms.ads.purchase.a aVar) {
        x xVar = this.f5279a;
        if (xVar.g != null) {
            throw new IllegalStateException("Play store purchase parameter has already been set.");
        }
        try {
            xVar.f = aVar;
            if (xVar.f5311b == null || aVar == null) {
                return;
            }
            new gs(aVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to set the InAppPurchaseListener.", e);
        }
    }
}
