package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class RecoveryDecision implements SafeParcelable {
    public static final f CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    final int f5364a;

    /* renamed from: b, reason: collision with root package name */
    public PendingIntent f5365b;
    public boolean c;
    public boolean d;
    public boolean e;
    public PendingIntent f;

    public RecoveryDecision() {
        this.f5364a = 1;
    }

    RecoveryDecision(int i, PendingIntent pendingIntent, boolean z, boolean z2, boolean z3, PendingIntent pendingIntent2) {
        this.f5364a = i;
        this.f5365b = pendingIntent;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = pendingIntent2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        com.google.android.gms.auth.f.a(this, parcel, i);
    }
}
