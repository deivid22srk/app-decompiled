package com.google.android.finsky.cpkg;

import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class g extends o<String> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f2459a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(e eVar, e eVar2, String str, String str2) {
        super(eVar2, str, str2);
        this.f2459a = eVar;
    }

    @Override // com.google.android.finsky.cpkg.o
    public final /* synthetic */ void a(SharedPreferences.Editor editor, String str) {
        editor.putString(this.c, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.finsky.cpkg.o
    public final /* synthetic */ String a(SharedPreferences sharedPreferences) {
        return sharedPreferences.contains(this.c) ? sharedPreferences.getString(this.c, null) : (String) this.d;
    }
}
