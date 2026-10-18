package com.a.a.a.b;

import java.io.InterruptedIOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ar extends a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ao f949a;

    ar(ao aoVar) {
        this.f949a = aoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.a
    public final void a() {
        this.f949a.b(a.CANCEL);
    }

    public final void b() {
        if (d()) {
            throw new InterruptedIOException("timeout");
        }
    }
}
