package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public static final class GoogleHelp implements SafeParcelable {
    public static final Parcelable.Creator<GoogleHelp> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final int f5808a;

    /* renamed from: b, reason: collision with root package name */
    String f5809b;
    public Account c;
    Bundle d;
    String e;
    int f;
    int g;
    boolean h;
    boolean i;
    List<String> j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List<OverflowMenuItem> r;

    @Deprecated
    int s;
    ThemeSettings t;
    List<OfflineSuggestion> u;
    boolean v;
    public ErrorReport w;
    public TogglingData x;
    int y;
    PendingIntent z;

    public GoogleHelp(String str) {
        this(7, str, null, null, null, 0, 0, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 0, null, new ArrayList(), false, new ErrorReport(), null, 0, null);
    }

    public static Bitmap a(Activity activity) {
        try {
            View rootView = activity.getWindow().getDecorView().getRootView();
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            rootView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Error | Exception e) {
            Log.w("GOOGLEHELP_GoogleHelp", "Get screenshot failed!", e);
            return null;
        }
    }

    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }

    GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, int i2, int i3, boolean z, boolean z2, List<String> list, Bundle bundle2, Bitmap bitmap, byte[] bArr, int i4, int i5, String str3, Uri uri, List<OverflowMenuItem> list2, int i6, ThemeSettings themeSettings, List<OfflineSuggestion> list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i7, PendingIntent pendingIntent) {
        GoogleHelp googleHelp;
        this.w = new ErrorReport();
        this.f5808a = i;
        this.f5809b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = z2;
        this.j = list;
        this.z = pendingIntent;
        this.k = bundle2;
        this.l = bitmap;
        this.m = bArr;
        this.n = i4;
        this.o = i5;
        this.p = str3;
        this.q = uri;
        this.r = list2;
        if (this.f5808a < 4) {
            themeSettings = new ThemeSettings();
            themeSettings.f5805b = i6;
            googleHelp = this;
        } else if (themeSettings == null) {
            themeSettings = new ThemeSettings();
            googleHelp = this;
        } else {
            googleHelp = this;
        }
        googleHelp.t = themeSettings;
        this.u = list3;
        this.v = z3;
        this.w = errorReport;
        if (this.w != null) {
            this.w.Y = "GoogleHelp";
        }
        this.x = togglingData;
        this.y = i7;
    }
}
