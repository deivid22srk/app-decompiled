package com.google.android.play.image;

import java.util.Iterator;

/* loaded from: classes.dex */
final class ab implements Iterable<String> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CharSequence f6925a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y f6926b;

    ab(y yVar, CharSequence charSequence) {
        this.f6926b = yVar;
        this.f6925a = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return this.f6926b.f6958b.a(this.f6926b, this.f6925a);
    }
}
