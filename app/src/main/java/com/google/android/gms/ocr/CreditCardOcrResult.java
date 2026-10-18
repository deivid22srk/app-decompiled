package com.google.android.gms.ocr;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* loaded from: classes.dex */
public final class CreditCardOcrResult implements SafeParcelable {
    public static final Parcelable.Creator<CreditCardOcrResult> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    final int f6390a;

    /* renamed from: b, reason: collision with root package name */
    public String f6391b;
    public int c;
    public int d;
    int e;
    String f;
    String g;
    boolean h;
    String i;
    String j;
    String k;
    String l;

    CreditCardOcrResult(int i, String str, int i2, int i3, int i4, String str2, String str3, boolean z, String str4, String str5, String str6, String str7) {
        this.f6390a = i;
        this.f6391b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str2;
        this.g = str3;
        this.h = z;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
    }

    public static CreditCardOcrResult a(Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT")) {
            return null;
        }
        intent.setExtrasClassLoader(CreditCardOcrResult.class.getClassLoader());
        return (CreditCardOcrResult) intent.getParcelableExtra("com.google.android.gms.ocr.CREDIT_CARD_OCR_RESULT");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b.a(this, parcel);
    }
}
