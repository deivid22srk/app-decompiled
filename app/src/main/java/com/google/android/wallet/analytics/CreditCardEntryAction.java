package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public static class CreditCardEntryAction implements Parcelable {
    public static final Parcelable.Creator<CreditCardEntryAction> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    public boolean f7232a;

    /* renamed from: b, reason: collision with root package name */
    public int f7233b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;

    /* synthetic */ CreditCardEntryAction(Parcel parcel, byte b2) {
        this(parcel);
    }

    public CreditCardEntryAction() {
        this.s = -1;
        this.u = -1;
    }

    private CreditCardEntryAction(Parcel parcel) {
        this.s = -1;
        this.u = -1;
        this.f7232a = a(parcel);
        this.f7233b = parcel.readInt();
        this.c = a(parcel);
        this.d = a(parcel);
        this.e = a(parcel);
        this.f = a(parcel);
        this.g = parcel.readInt();
        this.h = a(parcel);
        this.i = a(parcel);
        this.j = a(parcel);
        this.k = a(parcel);
        this.l = parcel.readInt();
        this.m = a(parcel);
        this.n = a(parcel);
        this.o = a(parcel);
        this.p = parcel.readLong();
        this.q = a(parcel);
        this.r = a(parcel);
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        a(parcel, this.f7232a);
        parcel.writeInt(this.f7233b);
        a(parcel, this.c);
        a(parcel, this.d);
        a(parcel, this.e);
        a(parcel, this.f);
        parcel.writeInt(this.g);
        a(parcel, this.h);
        a(parcel, this.i);
        a(parcel, this.j);
        a(parcel, this.k);
        parcel.writeInt(this.l);
        a(parcel, this.m);
        a(parcel, this.n);
        a(parcel, this.o);
        parcel.writeLong(this.p);
        a(parcel, this.q);
        a(parcel, this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(256);
        sb.append("panOcrEnabled: ").append(this.f7232a).append("\npanEntryType: ").append(this.f7233b).append("\npanRecognizedByOcr: ").append(this.c).append("\npanValidationErrorOccurred: ").append(this.d).append("\npanRecognizedByNfc: ").append(this.e).append("\nexpDateOcrEnabled: ").append(this.f).append("\nexpDateEntryType: ").append(this.g).append("\nexpDateRecognizedByOcr: ").append(this.h).append("\nexpDateValidationErrorOccurred: ").append(this.i).append("\nexpDateRecognizedByNfc: ").append(this.j).append("\nnameOcrEnabled: ").append(this.k).append("\nnameEntryType: ").append(this.l).append("\nnameRecognizedByOcr: ").append(this.m).append("\nnameValidationErrorOccurred: ").append(this.n).append("\nnameRecognizedByNfc: ").append(this.o).append("\nnfcElapsedTimeMillis: ").append(this.p).append("\nnfcFeatureEnabled: ").append(this.q).append("\nnfcAdapterEnabled: ").append(this.r).append("\nnumOcrAttempts: ").append(this.s).append("\nocrExitReason: ").append(this.t).append("\nnumNfcAttempts: ").append(this.u).append("\nnfcExitReason: ").append(this.v).append("\nnfcErrorReason: ").append(this.w).append("\ncameraInputPreference: ").append(this.x).append("\nnfcInputPreference: ").append(this.y);
        return sb.toString();
    }

    private static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    private static boolean a(Parcel parcel) {
        return parcel.readInt() == 1;
    }
}
