package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class AmsEntityUpdateParcelable implements SafeParcelable {
    public static final Parcelable.Creator<AmsEntityUpdateParcelable> CREATOR = new cq();

    /* renamed from: a, reason: collision with root package name */
    final int f6494a;

    /* renamed from: b, reason: collision with root package name */
    byte f6495b;
    final byte c;
    final String d;

    AmsEntityUpdateParcelable(int i, byte b2, byte b3, String str) {
        this.f6495b = b2;
        this.f6494a = i;
        this.c = b3;
        this.d = str;
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
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
        return this.f6495b == amsEntityUpdateParcelable.f6495b && this.f6494a == amsEntityUpdateParcelable.f6494a && this.c == amsEntityUpdateParcelable.c && this.d.equals(amsEntityUpdateParcelable.d);
    }

    public int hashCode() {
        return (((((this.f6494a * 31) + this.f6495b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "AmsEntityUpdateParcelable{mVersionCode=" + this.f6494a + ", mEntityId=" + ((int) this.f6495b) + ", mAttributeId=" + ((int) this.c) + ", mValue='" + this.d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cq.a(this, parcel);
    }
}
