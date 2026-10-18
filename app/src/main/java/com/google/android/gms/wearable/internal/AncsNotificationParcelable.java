package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class AncsNotificationParcelable implements SafeParcelable {
    public static final Parcelable.Creator<AncsNotificationParcelable> CREATOR = new cs();

    /* renamed from: a, reason: collision with root package name */
    final int f6496a;

    /* renamed from: b, reason: collision with root package name */
    int f6497b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    String h;
    byte i;
    byte j;
    byte k;
    byte l;

    AncsNotificationParcelable(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, byte b2, byte b3, byte b4, byte b5) {
        this.f6497b = i2;
        this.f6496a = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = b2;
        this.j = b3;
        this.k = b4;
        this.l = b5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        if (this.l == ancsNotificationParcelable.l && this.k == ancsNotificationParcelable.k && this.j == ancsNotificationParcelable.j && this.i == ancsNotificationParcelable.i && this.f6497b == ancsNotificationParcelable.f6497b && this.f6496a == ancsNotificationParcelable.f6496a && this.c.equals(ancsNotificationParcelable.c)) {
            if (this.d == null ? ancsNotificationParcelable.d != null : !this.d.equals(ancsNotificationParcelable.d)) {
                return false;
            }
            return this.h.equals(ancsNotificationParcelable.h) && this.e.equals(ancsNotificationParcelable.e) && this.g.equals(ancsNotificationParcelable.g) && this.f.equals(ancsNotificationParcelable.f);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.d != null ? this.d.hashCode() : 0) + (((((this.f6496a * 31) + this.f6497b) * 31) + this.c.hashCode()) * 31)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l;
    }

    public String toString() {
        return "AncsNotificationParcelable{mVersionCode=" + this.f6496a + ", mId=" + this.f6497b + ", mAppId='" + this.c + "', mDateTime='" + this.d + "', mNotificationText='" + this.e + "', mTitle='" + this.f + "', mSubtitle='" + this.g + "', mDisplayName='" + this.h + "', mEventId=" + ((int) this.i) + ", mEventFlags=" + ((int) this.j) + ", mCategoryId=" + ((int) this.k) + ", mCategoryCount=" + ((int) this.l) + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cs.a(this, parcel);
    }
}
