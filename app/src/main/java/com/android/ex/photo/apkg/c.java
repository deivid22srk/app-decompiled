package com.android.ex.photo.apkg;

import android.support.v4.app.Fragment;
import android.support.v4.h.g;

/* loaded from: classes.dex */
public final class c extends g<String, Fragment> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f1140a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.h.g
    public final /* bridge */ /* synthetic */ void a(boolean z, String str, Fragment fragment, Fragment fragment2) {
        Fragment fragment3 = fragment;
        Fragment fragment4 = fragment2;
        if (!z && (fragment4 == null || fragment3 == fragment4)) {
            return;
        }
        this.f1140a.g.a(fragment3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar) {
        super(5);
        this.f1140a = bVar;
    }
}
