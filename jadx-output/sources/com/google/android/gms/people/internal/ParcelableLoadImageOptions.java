package com.google.android.gms.people.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public class ParcelableLoadImageOptions implements SafeParcelable {
    public static final j CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    final int f6406a;

    /* renamed from: b, reason: collision with root package name */
    final int f6407b;
    final int c;
    final boolean d;

    ParcelableLoadImageOptions(int i, int i2, int i3, boolean z) {
        this.f6406a = i;
        this.f6407b = i2;
        this.c = i3;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return at.a(this).a("imageSize", Integer.valueOf(this.f6407b)).a("avatarOptions", Integer.valueOf(this.c)).a("useLargePictureForCp2Images", Boolean.valueOf(this.d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        j.a(this, parcel);
    }
}
