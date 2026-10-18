package com.google.android.finsky.activities;

import android.text.TextUtils;
import com.google.android.volley.guava.UrlRules;

/* loaded from: classes.dex */
final class af implements as<ar> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ab f1538a;

    af(ab abVar) {
        this.f1538a = abVar;
    }

    @Override // com.google.android.finsky.activities.as
    public final /* bridge */ /* synthetic */ boolean a(ar arVar) {
        this.f1538a.a(arVar);
        return true;
    }

    @Override // com.google.android.finsky.activities.as
    public final /* synthetic */ boolean b(ar arVar) {
        String str;
        String str2;
        String a2;
        String str3 = arVar.f1555a;
        UrlRules a3 = UrlRules.a(this.f1538a.getContentResolver());
        str = ab.f1532a;
        com.google.android.volley.guava.c a4 = a3.a(str);
        if (a4 == com.google.android.volley.guava.c.e) {
            a2 = ab.f1532a;
        } else {
            str2 = ab.f1532a;
            a2 = a4.a(str2);
        }
        return TextUtils.equals(str3, a2);
    }

    @Override // com.google.android.finsky.activities.as
    public final /* synthetic */ ar a(String[] strArr) {
        if (strArr != null) {
            return new ar(strArr[1], strArr[2], strArr[4]);
        }
        return new ar(null, null, null);
    }
}
