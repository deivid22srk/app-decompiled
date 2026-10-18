package com.a.a.apkg.bpkg;

import java.io.InterruptedIOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ar extends okio2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao f949a;

    ar(ao aoVar) {
        this.f949a = aoVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // okio2.a
    public final void a() {
        this.f949a.b(a.CANCEL);
    }

    public final void b() {
        if (d()) {
            throw new InterruptedIOException("timeout");
        }
    }
}
