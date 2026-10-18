package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* loaded from: classes.dex */
public class EventParams implements SafeParcelable, Iterable<String> {
    public static final q CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final int f6281a;

    /* renamed from: b, reason: collision with root package name */
    final Bundle f6282b;

    EventParams(int i, Bundle bundle) {
        this.f6281a = i;
        this.f6282b = bundle;
    }

    EventParams(Bundle bundle) {
        com.google.android.gms.common.internal.av.a(bundle);
        this.f6282b = bundle;
        this.f6281a = 1;
    }

    public final Bundle a() {
        return new Bundle(this.f6282b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return new a(this);
    }

    public String toString() {
        return this.f6282b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        q.a(this, parcel);
    }
}
