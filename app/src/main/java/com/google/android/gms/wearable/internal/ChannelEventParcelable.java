package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class ChannelEventParcelable implements SafeParcelable {
    public static final Parcelable.Creator<ChannelEventParcelable> CREATOR = new cx();

    /* renamed from: a, reason: collision with root package name */
    final int f6500a;

    /* renamed from: b, reason: collision with root package name */
    final ChannelImpl f6501b;
    final int c;
    final int d;
    final int e;

    ChannelEventParcelable(int i, ChannelImpl channelImpl, int i2, int i3, int i4) {
        this.f6500a = i;
        this.f6501b = channelImpl;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final void a() {
        switch (this.c) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            default:
                Log.w("ChannelEventParcelable", "Unknown type: " + this.c);
                break;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        cx.a(this, parcel, i);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder append = new StringBuilder("ChannelEventParcelable[versionCode=").append(this.f6500a).append(", channel=").append(this.f6501b).append(", type=");
        int i = this.c;
        switch (i) {
            case 1:
                str = "CHANNEL_OPENED";
                break;
            case 2:
                str = "CHANNEL_CLOSED";
                break;
            case 3:
                str = "INPUT_CLOSED";
                break;
            case 4:
                str = "OUTPUT_CLOSED";
                break;
            default:
                str = Integer.toString(i);
                break;
        }
        StringBuilder append2 = append.append(str).append(", closeReason=");
        int i2 = this.d;
        switch (i2) {
            case 0:
                str2 = "CLOSE_REASON_NORMAL";
                break;
            case 1:
                str2 = "CLOSE_REASON_DISCONNECTED";
                break;
            case 2:
                str2 = "CLOSE_REASON_REMOTE_CLOSE";
                break;
            case 3:
                str2 = "CLOSE_REASON_LOCAL_CLOSE";
                break;
            default:
                str2 = Integer.toString(i2);
                break;
        }
        return append2.append(str2).append(", appErrorCode=").append(this.e).append("]").toString();
    }
}
