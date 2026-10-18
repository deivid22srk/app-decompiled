package com.google.android.finsky.g;

import java.util.Collection;

/* loaded from: classes.dex */
final class am implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f2801a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f2802b;
    private int c;

    am(al alVar, Collection collection) {
        this.f2802b = alVar;
        this.f2801a = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == this.f2801a.size() && this.f2802b.f2799a != null) {
            this.f2802b.c.f2795a.post(this.f2802b.f2799a);
        }
    }
}
