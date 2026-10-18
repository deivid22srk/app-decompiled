package com.google.android.play.article;

import java.util.Set;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f6803a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f6804b;

    d(c cVar, String str) {
        this.f6804b = cVar;
        this.f6803a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        boolean z;
        android.support.v4.h.g gVar;
        set = this.f6804b.f6802b.e;
        set.remove(this.f6804b.f6801a);
        z = this.f6804b.f6802b.f6799b;
        if (z) {
            gVar = this.f6804b.f6802b.c;
            gVar.a(this.f6804b.f6801a, this.f6803a);
        }
        this.f6804b.f6802b.a(this.f6804b.f6801a, this.f6803a);
    }
}
