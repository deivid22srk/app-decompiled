package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public static final class ConnectionResult implements SafeParcelable {

    /* renamed from: b, reason: collision with root package name */
    final int f5557b;
    public final int c;
    public final PendingIntent d;
    final String e;

    /* renamed from: a, reason: collision with root package name */
    public static final ConnectionResult f5556a = new ConnectionResult();
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new g();

    private ConnectionResult() {
        this(0, null, (byte) 0);
    }

    ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f5557b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, byte b2) {
        this(1, i, pendingIntent, null);
    }

    public final boolean a() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean b() {
        return this.c == 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.c == connectionResult.c && com.google.android.gms.common.internal.at.a(this.d, connectionResult.d) && com.google.android.gms.common.internal.at.a(this.e, connectionResult.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        g.a(this, parcel, i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        String str;
        com.google.android.gms.common.internal.au a2 = com.google.android.gms.common.internal.at.a(this);
        int i = this.c;
        switch (i) {
            case 0:
                str = "SUCCESS";
                break;
            case 1:
                str = "SERVICE_MISSING";
                break;
            case 2:
                str = "SERVICE_VERSION_UPDATE_REQUIRED";
                break;
            case 3:
                str = "SERVICE_DISABLED";
                break;
            case 4:
                str = "SIGN_IN_REQUIRED";
                break;
            case 5:
                str = "INVALID_ACCOUNT";
                break;
            case 6:
                str = "RESOLUTION_REQUIRED";
                break;
            case 7:
                str = "NETWORK_ERROR";
                break;
            case 8:
                str = "INTERNAL_ERROR";
                break;
            case 9:
                str = "SERVICE_INVALID";
                break;
            case 10:
                str = "DEVELOPER_ERROR";
                break;
            case 11:
                str = "LICENSE_CHECK_FAILED";
                break;
            case 12:
            default:
                str = "UNKNOWN_ERROR_CODE(" + i + ")";
                break;
            case 13:
                str = "CANCELED";
                break;
            case 14:
                str = "TIMEOUT";
                break;
            case 15:
                str = "INTERRUPTED";
                break;
            case 16:
                str = "API_UNAVAILABLE";
                break;
            case 17:
                str = "SIGN_IN_FAILED";
                break;
            case 18:
                str = "SERVICE_UPDATING";
                break;
            case 19:
                str = "SERVICE_MISSING_PERMISSION";
                break;
        }
        return a2.a("statusCode", str).a("resolution", this.d).a("message", this.e).toString();
    }
}
