package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public static class CheckServerAuthResult implements SafeParcelable {
    public static final Parcelable.Creator<CheckServerAuthResult> CREATOR = new c();

    /* renamed from: a, reason: collision with root package name */
    final int f6444a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f6445b;
    final List<Scope> c;

    CheckServerAuthResult(int i, boolean z, List<Scope> list) {
        this.f6444a = i;
        this.f6445b = z;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        c.a(this, parcel);
    }

    public CheckServerAuthResult(boolean z, Set<Scope> set) {
        this(1, z, set == null ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(set)));
    }
}
