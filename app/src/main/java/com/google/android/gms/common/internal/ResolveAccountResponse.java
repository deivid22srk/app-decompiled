package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class ResolveAccountResponse implements SafeParcelable {
    public static final Parcelable.Creator<ResolveAccountResponse> CREATOR = new ax();

    /* renamed from: a, reason: collision with root package name */
    final int f5690a;

    /* renamed from: b, reason: collision with root package name */
    public IBinder f5691b;
    public ConnectionResult c;
    public boolean d;
    public boolean e;

    public ResolveAccountResponse() {
        this(new ConnectionResult(8, null));
    }

    ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f5690a = i;
        this.f5691b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    private ResolveAccountResponse(ConnectionResult connectionResult) {
        this(1, null, connectionResult, false, false);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ax.a(this, parcel, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.c.equals(resolveAccountResponse.c) && ae.a(this.f5691b).equals(ae.a(resolveAccountResponse.f5691b));
    }
}
