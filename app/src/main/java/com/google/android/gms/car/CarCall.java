package com.google.android.gms.car;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public class CarCall implements SafeParcelable {
    public static final Parcelable.Creator<CarCall> CREATOR = new es();

    /* renamed from: a, reason: collision with root package name */
    final int f5397a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5398b;
    public CarCall c;
    public List<String> d;
    public String e;
    public int f;
    public Details g;
    public boolean h;

    public final class Details implements SafeParcelable {
        public static final Parcelable.Creator<Details> CREATOR = new et();

        /* renamed from: a, reason: collision with root package name */
        final int f5399a;

        /* renamed from: b, reason: collision with root package name */
        public Uri f5400b;
        public String c;
        public String d;
        public long e;
        public Uri f;
        public Uri g;

        public Details(int i, Uri uri, String str, String str2, long j, Uri uri2, Uri uri3) {
            this.f5399a = i;
            this.f5400b = uri;
            this.c = str;
            this.d = str2;
            this.e = j;
            this.f = uri2;
            this.g = uri3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Details{handle=" + this.f5400b + ", callerDisplayName='" + this.c + "', disconnectCause='" + this.d + "', connectTimeMillis=" + this.e + ", gatewayInfoOriginal=" + this.f + ", gatewayInfoGateway=" + this.g + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            et.a(this, parcel, i);
        }
    }

    public CarCall(int i, int i2, CarCall carCall, List<String> list, String str, int i3, Details details, boolean z) {
        this.f5397a = i;
        this.f5398b = i2;
        this.c = carCall;
        this.d = list;
        this.e = str;
        this.f = i3;
        this.g = details;
        this.h = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CarCall) && this.f5398b == ((CarCall) obj).f5398b;
    }

    public int hashCode() {
        return this.f5398b;
    }

    public String toString() {
        return "CarCall{id=" + this.f5398b + ", parent=" + this.c + ", cannedTextResponses=" + this.d + ", remainingPostDialSequence='" + this.e + "', state=" + this.f + ", details=" + this.g + ", hasChildren=" + this.h + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        es.a(this, parcel, i);
    }
}
