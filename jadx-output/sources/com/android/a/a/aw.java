package com.android.a.a;

/* loaded from: classes.dex */
final class aw {

    /* renamed from: a, reason: collision with root package name */
    av f1089a = new av((byte) 0);

    aw() {
    }

    final av a() {
        return new av(this.f1089a, (byte) 0);
    }

    final aw a(String str) {
        be.a(str, "Key should not be null.");
        this.f1089a.f1087a = str;
        return this;
    }

    final aw b(String str) {
        this.f1089a.f1088b = be.c(str);
        return this;
    }
}
