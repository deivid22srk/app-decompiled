package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.gms.ads.a f5310a;

    /* renamed from: b, reason: collision with root package name */
    public o f5311b;
    public com.google.android.gms.ads.c[] c;
    public String d;
    public com.google.android.gms.ads.a.a e;
    public com.google.android.gms.ads.purchase.a f;
    public com.google.android.gms.ads.purchase.b g;
    public com.google.android.gms.ads.a.b h;
    public boolean i;
    public com.google.android.gms.ads.f j;
    private a k;
    private ViewGroup l;
    private boolean m;

    public final void a(com.google.android.gms.ads.a aVar) {
        try {
            this.f5310a = aVar;
            if (this.f5311b == null || aVar == null) {
                return;
            }
            new e(aVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to set the AdListener.", e);
        }
    }

    public final void a(a aVar) {
        try {
            this.k = aVar;
            if (this.f5311b == null || aVar == null) {
                return;
            }
            new d(aVar);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to set the AdClickListener.", e);
        }
    }

    public final void a(String str) {
        if (this.d != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.d = str;
    }

    public final void a(com.google.android.gms.ads.c... cVarArr) {
        if (this.c != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        b(cVarArr);
    }

    public final String b() {
        try {
            if (this.f5311b != null) {
                return this.f5311b.b();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to get the mediation adapter class name.", e);
        }
        return null;
    }

    public final com.google.android.gms.ads.c a() {
        AdSizeParcel a2;
        try {
            if (this.f5311b != null && (a2 = this.f5311b.a()) != null) {
                return new com.google.android.gms.ads.c(a2.f, a2.c, a2.f5300b);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to get the current AdSize.", e);
        }
        if (this.c != null) {
            return this.c[0];
        }
        return null;
    }

    public final void b(com.google.android.gms.ads.c... cVarArr) {
        this.c = cVarArr;
        try {
            if (this.f5311b != null) {
                new AdSizeParcel(this.l.getContext(), this.c).k = this.m;
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.b.c("Failed to set the ad size.", e);
        }
        this.l.requestLayout();
    }
}
