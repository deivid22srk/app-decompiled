package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class WebViewPageLoadEvent implements Parcelable {
    public static final Parcelable.Creator<WebViewPageLoadEvent> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public String f7234a;

    /* renamed from: b, reason: collision with root package name */
    public long f7235b;
    public int c;
    public String d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;

    /* synthetic */ WebViewPageLoadEvent(Parcel parcel, byte b2) {
        this(parcel);
    }

    public WebViewPageLoadEvent() {
        this.d = "";
    }

    private WebViewPageLoadEvent(Parcel parcel) {
        this.d = "";
        this.f7234a = parcel.readString();
        this.f7235b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readFloat();
        this.i = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7234a);
        parcel.writeLong(this.f7235b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("url: ").append(this.f7234a).append("\nstartTimestampMs: ").append(this.f7235b).append("\nerrorCode: ").append(this.c).append("\nerrorDescription: ").append(this.d).append("\norientation: ").append(this.e).append("\nscreenWidthPx: ").append(this.f).append("\nscreenHeightPx: ").append(this.g).append("\nscreenXDpi: ").append(this.h).append("\nscreenYDpi: ").append(this.i);
        return sb.toString();
    }
}
