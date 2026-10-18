package com.android.ex.photo;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final android.support.v7.a.a f1144a;

    public c(android.support.v7.a.a aVar) {
        this.f1144a = aVar;
    }

    @Override // com.android.ex.photo.a
    public final void a() {
        this.f1144a.a(true);
    }

    @Override // com.android.ex.photo.a
    public final void a(b bVar) {
        this.f1144a.a(new d(this, bVar));
    }

    @Override // com.android.ex.photo.a
    public final void b() {
        this.f1144a.a(8, 8);
    }

    @Override // com.android.ex.photo.a
    public final void a(CharSequence charSequence) {
        this.f1144a.a(charSequence);
    }

    @Override // com.android.ex.photo.a
    public final void b(CharSequence charSequence) {
        this.f1144a.b(charSequence);
    }

    @Override // com.android.ex.photo.a
    public final void c() {
        this.f1144a.c();
    }

    @Override // com.android.ex.photo.a
    public final void d() {
        this.f1144a.d();
    }

    @Override // com.android.ex.photo.a
    public final void a(Drawable drawable) {
        this.f1144a.a(drawable);
    }
}
