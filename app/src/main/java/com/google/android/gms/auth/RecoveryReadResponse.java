package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public class RecoveryReadResponse implements SafeParcelable {
    public static final g CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    final int f5366a;

    /* renamed from: b, reason: collision with root package name */
    public String f5367b;
    public String c;
    public String d;
    public List<Country> e;
    public String f;
    public String g;
    public String h;

    public RecoveryReadResponse() {
        this.f5366a = 1;
    }

    RecoveryReadResponse(int i, String str, String str2, String str3, List<Country> list, String str4, String str5, String str6) {
        this.f5366a = i;
        this.f5367b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel);
    }
}
