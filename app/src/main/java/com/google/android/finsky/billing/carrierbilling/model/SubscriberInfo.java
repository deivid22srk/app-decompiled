package com.google.android.finsky.billing.carrierbilling.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.finsky.utils.dy;
import com.google.android.finsky.utils.jm;
import java.util.Arrays;

/* loaded from: classes.dex */
public static class SubscriberInfo implements Parcelable {
    public static final Parcelable.Creator<SubscriberInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f2195a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2196b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    /* synthetic */ SubscriberInfo(Parcel parcel, byte b2) {
        this(parcel);
    }

    /* synthetic */ SubscriberInfo(b bVar, byte b2) {
        this(bVar);
    }

    private static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char c : str.toCharArray()) {
            if ((c >= 'a' && c <= 'm') || (c >= 'A' && c <= 'M')) {
                c = (char) (c + '\r');
            } else if ((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) {
                c = (char) (c - '\r');
            } else if (c >= '0' && c <= '4') {
                c = (char) (c + 5);
            } else if (c >= '5' && c <= '9') {
                c = (char) (c - 5);
            }
            sb.append(c);
        }
        return sb.toString();
    }

    private SubscriberInfo(b bVar) {
        this.f2195a = bVar.f2197a;
        this.f2196b = bVar.f2198b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriberInfo)) {
            return false;
        }
        SubscriberInfo subscriberInfo = (SubscriberInfo) obj;
        return dy.a(this.f2195a, subscriberInfo.f2195a) && dy.a(this.f2196b, subscriberInfo.f2196b) && dy.a(this.c, subscriberInfo.c) && dy.a(this.d, subscriberInfo.d) && dy.a(this.e, subscriberInfo.e) && dy.a(this.f, subscriberInfo.f) && dy.a(this.g, subscriberInfo.g) && dy.a(this.h, subscriberInfo.h);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2195a, this.f2196b, this.c, this.d, this.e, this.f, this.g, this.h});
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2195a);
        parcel.writeString(this.f2196b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    private SubscriberInfo(Parcel parcel) {
        this.f2195a = parcel.readString();
        this.f2196b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
        this.h = parcel.readString();
    }

    public String toString() {
        return a(new String(Base64.encode(((this.f2195a == null ? "" : jm.a(this.f2195a)) + "," + (this.f2196b == null ? "" : jm.a(this.f2196b)) + "," + (this.c == null ? "" : jm.a(this.c)) + "," + (this.d == null ? "" : jm.a(this.d)) + "," + (this.e == null ? "" : jm.a(this.e)) + "," + (this.f == null ? "" : jm.a(this.f)) + "," + (this.g == null ? "" : jm.a(this.g)) + "," + (this.h == null ? "" : jm.a(this.h))).getBytes(), 0)));
    }
}
