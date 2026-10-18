package com.google.android.play.utils.b;

import android.content.ContentResolver;

/* loaded from: classes.dex */
final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final ContentResolver f7071a;

    public i(ContentResolver contentResolver, String[] strArr) {
        this.f7071a = contentResolver;
        com.google.android.a.d.b(this.f7071a, strArr);
    }

    @Override // com.google.android.play.utils.b.h
    public final Boolean a(String str, Boolean bool) {
        return Boolean.valueOf(com.google.android.a.d.a(this.f7071a, str, bool.booleanValue()));
    }

    @Override // com.google.android.play.utils.b.h
    public final Integer a(String str, Integer num) {
        return Integer.valueOf(com.google.android.a.d.a(this.f7071a, str, num.intValue()));
    }

    @Override // com.google.android.play.utils.b.h
    public final Float a(String str, Float f) {
        String a2 = com.google.android.a.d.a(this.f7071a, str, (String) null);
        if (a2 != null) {
            try {
                return Float.valueOf(Float.parseFloat(a2));
            } catch (NumberFormatException e) {
                return f;
            }
        }
        return f;
    }

    @Override // com.google.android.play.utils.b.h
    public final Long a(String str, Long l) {
        return Long.valueOf(com.google.android.a.d.a(this.f7071a, str, l.longValue()));
    }

    @Override // com.google.android.play.utils.b.h
    public final String a(String str, String str2) {
        return com.google.android.a.d.a(this.f7071a, str, str2);
    }

    @Override // com.google.android.play.utils.b.h
    public final String b(String str, String str2) {
        return com.google.android.a.c.a(this.f7071a, str, str2);
    }
}
