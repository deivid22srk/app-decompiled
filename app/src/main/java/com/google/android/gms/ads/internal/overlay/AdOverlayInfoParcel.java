package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.eb;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.im;

@gw
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel implements SafeParcelable {
    public static final i CREATOR = new i();

    /* renamed from: a, reason: collision with root package name */
    public final int f5318a;

    /* renamed from: b, reason: collision with root package name */
    public final AdLauncherIntentInfoParcel f5319b;
    public final com.google.android.gms.ads.internal.client.a c;
    public final j d;
    public final im e;
    public final dn f;
    public final String g;
    public final boolean h;
    public final String i;
    public final o j;
    public final int k;
    public final int l;
    public final String m;
    public final VersionInfoParcel n;
    public final eb o;
    public final String p;
    public final InterstitialAdParameterParcel q;

    AdOverlayInfoParcel(int i, AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i2, int i3, String str3, VersionInfoParcel versionInfoParcel, IBinder iBinder6, String str4, InterstitialAdParameterParcel interstitialAdParameterParcel) {
        this.f5318a = i;
        this.f5319b = adLauncherIntentInfoParcel;
        this.c = (com.google.android.gms.ads.internal.client.a) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder));
        this.d = (j) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder2));
        this.e = (im) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder3));
        this.f = (dn) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder4));
        this.g = str;
        this.h = z;
        this.i = str2;
        this.j = (o) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder5));
        this.k = i2;
        this.l = i3;
        this.m = str3;
        this.n = versionInfoParcel;
        this.o = (eb) com.google.android.gms.dynamic.d.a(com.google.android.gms.dynamic.b.a(iBinder6));
        this.p = str4;
        this.q = interstitialAdParameterParcel;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, j jVar, o oVar, im imVar, boolean z, int i, VersionInfoParcel versionInfoParcel) {
        this.f5318a = 4;
        this.f5319b = null;
        this.c = aVar;
        this.d = jVar;
        this.e = imVar;
        this.f = null;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = oVar;
        this.k = i;
        this.l = 2;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, j jVar, dn dnVar, o oVar, im imVar, boolean z, int i, String str, VersionInfoParcel versionInfoParcel, eb ebVar) {
        this.f5318a = 4;
        this.f5319b = null;
        this.c = aVar;
        this.d = jVar;
        this.e = imVar;
        this.f = dnVar;
        this.g = null;
        this.h = z;
        this.i = null;
        this.j = oVar;
        this.k = i;
        this.l = 3;
        this.m = str;
        this.n = versionInfoParcel;
        this.o = ebVar;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(com.google.android.gms.ads.internal.client.a aVar, j jVar, dn dnVar, o oVar, im imVar, boolean z, int i, String str, String str2, VersionInfoParcel versionInfoParcel, eb ebVar) {
        this.f5318a = 4;
        this.f5319b = null;
        this.c = aVar;
        this.d = jVar;
        this.e = imVar;
        this.f = dnVar;
        this.g = str2;
        this.h = z;
        this.i = str;
        this.j = oVar;
        this.k = i;
        this.l = 3;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = ebVar;
        this.p = null;
        this.q = null;
    }

    public AdOverlayInfoParcel(AdLauncherIntentInfoParcel adLauncherIntentInfoParcel, com.google.android.gms.ads.internal.client.a aVar, j jVar, o oVar, VersionInfoParcel versionInfoParcel) {
        this.f5318a = 4;
        this.f5319b = adLauncherIntentInfoParcel;
        this.c = aVar;
        this.d = jVar;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = null;
        this.j = oVar;
        this.k = -1;
        this.l = 4;
        this.m = null;
        this.n = versionInfoParcel;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public static AdOverlayInfoParcel a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception e) {
            return null;
        }
    }

    public static void a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        i.a(this, parcel, i);
    }
}
