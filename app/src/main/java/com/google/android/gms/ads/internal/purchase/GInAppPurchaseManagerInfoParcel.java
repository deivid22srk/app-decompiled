package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gh;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class GInAppPurchaseManagerInfoParcel implements SafeParcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final int f5335a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5336b;
    public final gh c;
    public final Context d;
    public final h e;

    GInAppPurchaseManagerInfoParcel(int i, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4) {
        this.f5335a = i;
        this.f5336b = (i) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder));
        this.c = (gh) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder2));
        this.d = (Context) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder3));
        this.e = (h) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder4));
    }

    public static GInAppPurchaseManagerInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
            bundleExtra.setClassLoader(GInAppPurchaseManagerInfoParcel.class.getClassLoader());
            return (GInAppPurchaseManagerInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.internal.purchase.InAppPurchaseManagerInfo");
        } catch (Exception e) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel);
    }
}
