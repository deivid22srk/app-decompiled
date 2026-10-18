package com.google.android.play.image;

/* loaded from: classes.dex */
final class y {

    /* renamed from: a, reason: collision with root package name */
    final boolean f6957a;

    /* renamed from: b, reason: collision with root package name */
    final af f6958b;

    private y(af afVar) {
        this(afVar, false);
    }

    private y(af afVar, boolean z) {
        this.f6958b = afVar;
        this.f6957a = z;
    }

    public static y a(String str) {
        if (str.length() == 0) {
            throw new IllegalArgumentException("separator may not be empty or null");
        }
        return new y(new z(str));
    }

    public final y a() {
        return new y(this.f6958b, true);
    }

    public final Iterable<String> a(CharSequence charSequence) {
        return new ab(this, charSequence);
    }
}
