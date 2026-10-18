package com.google.android.finsky.cpkg;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class h extends o<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f2460a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(e eVar, e eVar2, String str, Boolean bool) {
        super(eVar2, str, bool);
        this.f2460a = eVar;
    }

    @Override // com.google.android.finsky.cpkg.o
    public final /* synthetic */ void a(SharedPreferences.Editor editor, Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 == null) {
            throw new IllegalArgumentException("null cannot be written for <Boolean>");
        }
        editor.putBoolean(this.c, bool2.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.cpkg.o
    public final /* synthetic */ Boolean a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.c) ? Boolean.valueOf(sharedPreferences.getBoolean(this.c, false)) : (Boolean) this.d;
    }
}
