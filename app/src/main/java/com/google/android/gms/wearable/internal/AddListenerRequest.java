package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public static class AddListenerRequest implements SafeParcelable {
    public static final Parcelable.Creator<AddListenerRequest> CREATOR = new bp();

    /* renamed from: a, reason: collision with root package name */
    final int f6490a;

    /* renamed from: b, reason: collision with root package name */
    public final aj f6491b;
    public final IntentFilter[] c;
    public final String d;
    public final String e;

    AddListenerRequest(int i, IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        this.f6490a = i;
        if (iBinder != null) {
            this.f6491b = ak.a(iBinder);
        } else {
            this.f6491b = null;
        }
        this.c = intentFilterArr;
        this.d = str;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        bp.a(this, parcel, i);
    }

    public AddListenerRequest(cc ccVar) {
        this.f6490a = 1;
        this.f6491b = ccVar;
        this.c = ccVar.j;
        this.d = ccVar.k;
        this.e = null;
    }
}
