package com.google.android.play.search;

/* loaded from: classes.dex */
public final class c implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    final char[] f7036a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7037b;
    public final int c;

    @Override // java.lang.CharSequence
    public final /* synthetic */ CharSequence subSequence(int i, int i2) {
        return a(i);
    }

    public c(char[] cArr, int i, int i2) {
        this.f7036a = cArr;
        this.f7037b = i;
        this.c = i2;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.c - this.f7037b;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        length();
        return a(0);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f7036a[this.f7037b + i];
    }

    private String a(int i) {
        return new String(this.f7036a, this.f7037b + i, length());
    }
}
