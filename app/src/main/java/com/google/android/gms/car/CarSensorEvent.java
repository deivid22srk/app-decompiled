package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class CarSensorEvent implements SafeParcelable {
    public static final Parcelable.Creator<CarSensorEvent> CREATOR = new fn();

    /* renamed from: a, reason: collision with root package name */
    final int f5427a;

    /* renamed from: b, reason: collision with root package name */
    public int f5428b;
    public long c;
    public final float[] d;
    public final byte[] e;

    public CarSensorEvent(int i, int i2, long j, float[] fArr, byte[] bArr) {
        this.f5427a = i;
        this.f5428b = i2;
        this.c = j;
        this.d = fArr;
        this.e = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName() + "[");
        sb.append("type:" + Integer.toHexString(this.f5428b));
        if (this.d != null && this.d.length > 0) {
            sb.append(" float values:");
            for (float f : this.d) {
                sb.append(" " + f);
            }
        }
        if (this.e != null && this.e.length > 0) {
            sb.append(" byte values:");
            for (byte b2 : this.e) {
                sb.append(" " + ((int) b2));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fn.a(this, parcel);
    }
}
