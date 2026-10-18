package com.google.android.gms.car;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.car.CarMediaBrowserListNode;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class CarMediaBrowserSongNode implements SafeParcelable {
    public static final Parcelable.Creator<CarMediaBrowserSongNode> CREATOR = new fg();

    /* renamed from: a, reason: collision with root package name */
    final int f5417a;

    /* renamed from: b, reason: collision with root package name */
    public CarMediaBrowserListNode.CarMediaSong f5418b;
    public byte[] c;
    public int d;

    public CarMediaBrowserSongNode() {
        this.f5417a = 1;
        this.f5418b = new CarMediaBrowserListNode.CarMediaSong();
    }

    public CarMediaBrowserSongNode(int i, CarMediaBrowserListNode.CarMediaSong carMediaSong, byte[] bArr, int i2) {
        this.f5417a = i;
        this.f5418b = carMediaSong;
        this.c = bArr;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        fg.a(this, parcel, i);
    }
}
