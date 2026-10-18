package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class MessageEventParcelable implements SafeParcelable, com.google.android.gms.wearable.w {
    public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new bc();

    /* renamed from: a, reason: collision with root package name */
    final int f6560a;

    /* renamed from: b, reason: collision with root package name */
    final int f6561b;
    final String c;
    final byte[] d;
    final String e;

    MessageEventParcelable(int i, int i2, String str, byte[] bArr, String str2) {
        this.f6560a = i;
        this.f6561b = i2;
        this.c = str;
        this.d = bArr;
        this.e = str2;
    }

    @Override // com.google.android.gms.wearable.w
    public final String a() {
        return this.c;
    }

    @Override // com.google.android.gms.wearable.w
    public final String b() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MessageEventParcelable[" + this.f6561b + "," + this.c + ", size=" + (this.d == null ? "null" : Integer.valueOf(this.d.length)) + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bc.a(this, parcel);
    }
}
