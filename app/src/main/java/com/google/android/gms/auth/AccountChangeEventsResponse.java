package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* loaded from: classes.dex */
public static class AccountChangeEventsResponse implements SafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsResponse> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    final int f5359a;

    /* renamed from: b, reason: collision with root package name */
    final List<AccountChangeEvent> f5360b;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f5359a = i;
        this.f5360b = (List) av.a(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel);
    }
}
