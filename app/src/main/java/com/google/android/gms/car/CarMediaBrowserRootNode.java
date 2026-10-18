package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class CarMediaBrowserRootNode implements SafeParcelable {
    public static final Parcelable.Creator<CarMediaBrowserRootNode> CREATOR = new ff();

    /* renamed from: a, reason: collision with root package name */
    final int f5413a;

    /* renamed from: b, reason: collision with root package name */
    public String f5414b;
    public CarMediaSource[] c;

    public static class CarMediaSource implements SafeParcelable {
        public static final Parcelable.Creator<CarMediaSource> CREATOR = new fk();

        /* renamed from: a, reason: collision with root package name */
        final int f5415a;

        /* renamed from: b, reason: collision with root package name */
        public String f5416b;
        public String c;
        public byte[] d;

        public CarMediaSource() {
            this.f5415a = 1;
        }

        public CarMediaSource(int i, String str, String str2, byte[] bArr) {
            this.f5415a = i;
            this.f5416b = str;
            this.c = str2;
            this.d = bArr;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            fk.a(this, parcel);
        }
    }

    public CarMediaBrowserRootNode() {
        this.f5413a = 1;
    }

    public CarMediaBrowserRootNode(int i, String str, CarMediaSource[] carMediaSourceArr) {
        this.f5413a = i;
        this.f5414b = str;
        this.c = carMediaSourceArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ff.a(this, parcel, i);
    }
}
