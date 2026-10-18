package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public static class AccountChangeEvent implements SafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    final int f5355a;

    /* renamed from: b, reason: collision with root package name */
    final long f5356b;
    final String c;
    final int d;
    final int e;
    final String f;

    AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.f5355a = i;
        this.f5356b = j;
        this.c = (String) av.a(str);
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f5355a == accountChangeEvent.f5355a && this.f5356b == accountChangeEvent.f5356b && at.a(this.c, accountChangeEvent.c) && this.d == accountChangeEvent.d && this.e == accountChangeEvent.e && at.a(this.f, accountChangeEvent.f);
    }

    public String toString() {
        String str = "UNKNOWN";
        switch (this.d) {
            case 1:
                str = "ADDED";
                break;
            case 2:
                str = "REMOVED";
                break;
            case 3:
                str = "RENAMED_FROM";
                break;
            case 4:
                str = "RENAMED_TO";
                break;
        }
        return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5355a), Long.valueOf(this.f5356b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }
}
