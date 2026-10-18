package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.Channel;

/* loaded from: classes.dex */
public static class ChannelImpl implements SafeParcelable, Channel {
    public static final Parcelable.Creator<ChannelImpl> CREATOR = new cy();

    /* renamed from: a, reason: collision with root package name */
    final int f6502a;

    /* renamed from: b, reason: collision with root package name */
    final String f6503b;
    final String c;
    final String d;

    ChannelImpl(int i, String str, String str2, String str3) {
        this.f6502a = i;
        this.f6503b = (String) com.google.android.gms.common.internal.av.a(str);
        this.c = (String) com.google.android.gms.common.internal.av.a(str2);
        this.d = (String) com.google.android.gms.common.internal.av.a(str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.f6503b.equals(channelImpl.f6503b) && com.google.android.gms.common.internal.at.a(channelImpl.c, this.c) && com.google.android.gms.common.internal.at.a(channelImpl.d, this.d) && channelImpl.f6502a == this.f6502a;
    }

    public int hashCode() {
        return this.f6503b.hashCode();
    }

    public String toString() {
        return "ChannelImpl{versionCode=" + this.f6502a + ", token='" + this.f6503b + "', nodeId='" + this.c + "', path='" + this.d + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        cy.a(this, parcel);
    }
}
