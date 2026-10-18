package com.google.android.finsky.c;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class i extends o<Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(e eVar, e eVar2, String str, Integer num) {
        super(eVar2, str, num);
        this.f2461a = eVar;
    }

    @Override // com.google.android.finsky.c.o
    protected final /* synthetic */ void a(SharedPreferences.Editor editor, Integer num) {
        Integer num2 = num;
        if (num2 == null) {
            throw new IllegalArgumentException("null cannot be written for <Integer>");
        }
        editor.putInt(this.c, num2.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.c.o
    protected final /* synthetic */ Integer a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.c) ? Integer.valueOf(sharedPreferences.getInt(this.c, 0)) : (Integer) this.d;
    }
}
