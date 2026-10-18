package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Status implements x, SafeParcelable {
    final int f;
    public final int g;
    public final String h;
    final PendingIntent i;

    /* renamed from: a, reason: collision with root package name */
    public static final Status f5572a = new Status(0);

    /* renamed from: b, reason: collision with root package name */
    public static final Status f5573b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new ae();

    public Status(int i) {
        this(i, null);
    }

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    public final boolean a() {
        return this.g <= 0;
    }

    @Override // com.google.android.gms.common.api.x
    public final Status b() {
        return this;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f == status.f && this.g == status.g && at.a(this.h, status.h) && at.a(this.i, status.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ae.a(this, parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), this.h, this.i});
    }

    public final String toString() {
        return at.a(this).a("statusCode", this.h != null ? this.h : l.a(this.g)).a("resolution", this.i).toString();
    }
}
