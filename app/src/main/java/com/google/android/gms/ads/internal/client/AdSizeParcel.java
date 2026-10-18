package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public class AdSizeParcel implements SafeParcelable {
    public static final h CREATOR = new h();

    /* renamed from: a, reason: collision with root package name */
    public final int f5299a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5300b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final AdSizeParcel[] h;
    public final boolean i;
    public final boolean j;
    public boolean k;

    public AdSizeParcel() {
        this(5, "interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    AdSizeParcel(int i, String str, int i2, int i3, boolean z, int i4, int i5, AdSizeParcel[] adSizeParcelArr, boolean z2, boolean z3, boolean z4) {
        this.f5299a = i;
        this.f5300b = str;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
        this.g = i5;
        this.h = adSizeParcelArr;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }

    public AdSizeParcel(Context context, com.google.android.gms.ads.c cVar) {
        this(context, new com.google.android.gms.ads.c[]{cVar});
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (c(displayMetrics) * displayMetrics.density);
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.ads.internal.client.h.a(this, parcel, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AdSizeParcel(android.content.Context r13, com.google.android.gms.ads.c[] r14) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.AdSizeParcel.<init>(android.content.Context, com.google.android.gms.ads.c[]):void");
    }
}
