package com.google.android.gms.common.people.data;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class AudienceMember implements SafeParcelable {
    public static final a CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f5768a;

    /* renamed from: b, reason: collision with root package name */
    final int f5769b;
    final int c;
    public final String d;
    final String e;
    public final String f;
    final String g;

    @Deprecated
    final Bundle h;

    AudienceMember(int i, int i2, int i3, String str, String str2, String str3, String str4, Bundle bundle) {
        this.f5768a = i;
        this.f5769b = i2;
        this.c = i3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = bundle == null ? new Bundle() : bundle;
    }

    private AudienceMember(int i, int i2, String str, String str2, String str3) {
        this(1, i, i2, str, str2, str3, null, null);
    }

    public static AudienceMember a(String str) {
        return new AudienceMember(2, 0, null, str, null);
    }

    public static AudienceMember a(String str, String str2) {
        return new AudienceMember(1, -1, str, null, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudienceMember)) {
            return false;
        }
        AudienceMember audienceMember = (AudienceMember) obj;
        return this.f5768a == audienceMember.f5768a && this.f5769b == audienceMember.f5769b && this.c == audienceMember.c && at.a(this.d, audienceMember.d) && at.a(this.e, audienceMember.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        a.a(this, parcel);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5768a), Integer.valueOf(this.f5769b), Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        if (this.f5769b == 2) {
            return String.format("Person [%s] %s", this.e, this.f);
        }
        return this.f5769b == 1 && this.c == -1 ? String.format("Circle [%s] %s", this.d, this.f) : String.format("Group [%s] %s", this.d, this.f);
    }
}
