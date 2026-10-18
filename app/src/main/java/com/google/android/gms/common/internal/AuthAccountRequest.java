package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Set;

/* loaded from: classes.dex */
public class AuthAccountRequest implements SafeParcelable {
    public static final Parcelable.Creator<AuthAccountRequest> CREATOR = new f();

    /* renamed from: a, reason: collision with root package name */
    final int f5683a;

    /* renamed from: b, reason: collision with root package name */
    final IBinder f5684b;
    final Scope[] c;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr) {
        this.f5683a = i;
        this.f5684b = iBinder;
        this.c = scopeArr;
    }

    public AuthAccountRequest(ad adVar, Set<Scope> set) {
        this(1, adVar.asBinder(), (Scope[]) set.toArray(new Scope[set.size()]));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        f.a(this, parcel, i);
    }
}
