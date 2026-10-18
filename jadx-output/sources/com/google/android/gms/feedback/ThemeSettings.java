package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class ThemeSettings implements SafeParcelable {
    public static final Parcelable.Creator<ThemeSettings> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    final int f5804a;

    /* renamed from: b, reason: collision with root package name */
    public int f5805b;
    int c;

    public ThemeSettings() {
        this(1, 0, 0);
    }

    ThemeSettings(int i, int i2, int i3) {
        this.f5804a = i;
        this.f5805b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel);
    }
}
