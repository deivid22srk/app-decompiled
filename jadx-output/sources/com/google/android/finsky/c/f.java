package com.google.android.finsky.c;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class f extends o<Long> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2458a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(e eVar, e eVar2, String str, Long l) {
        super(eVar2, str, l);
        this.f2458a = eVar;
    }

    @Override // com.google.android.finsky.c.o
    protected final /* synthetic */ void a(SharedPreferences.Editor editor, Long l) {
        Long l2 = l;
        if (l2 == null) {
            throw new IllegalArgumentException("null cannot be written for <Long>");
        }
        editor.putLong(this.c, l2.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.c.o
    protected final /* synthetic */ Long a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.c) ? Long.valueOf(sharedPreferences.getLong(this.c, 0L)) : (Long) this.d;
    }
}
