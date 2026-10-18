package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.av;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class TokenData implements SafeParcelable {
    public static final m CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    final int f5372a;

    /* renamed from: b, reason: collision with root package name */
    final String f5373b;
    final Long c;
    final boolean d;
    final boolean e;
    final List<String> f;

    TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list) {
        this.f5372a = i;
        this.f5373b = av.a(str);
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
    }

    public static TokenData a(Bundle bundle, String str) {
        bundle.setClassLoader(TokenData.class.getClassLoader());
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(TokenData.class.getClassLoader());
        return (TokenData) bundle2.getParcelable("TokenData");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f5373b, tokenData.f5373b) && at.a(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && at.a(this.f, tokenData.f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        m.a(this, parcel);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5373b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f});
    }
}
