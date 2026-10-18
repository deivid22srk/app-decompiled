package com.google.android.wallet.ui.common;

import android.text.method.NumberKeyListener;

/* loaded from: classes.dex */
public final class av extends NumberKeyListener {

    /* renamed from: a, reason: collision with root package name */
    private final char[] f7492a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7493b;

    public av(String str) {
        this.f7492a = new char[str.length()];
        str.getChars(0, str.length(), this.f7492a, 0);
        this.f7493b = 20;
    }

    @Override // android.text.method.NumberKeyListener
    protected final char[] getAcceptedChars() {
        return this.f7492a;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f7493b;
    }
}
