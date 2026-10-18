package com.android.ex.photo.views;

import android.widget.ProgressBar;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final ProgressBar f1185a;

    /* renamed from: b, reason: collision with root package name */
    private final ProgressBar f1186b;
    private boolean c = true;

    public f(ProgressBar progressBar, ProgressBar progressBar2) {
        this.f1185a = progressBar;
        this.f1186b = progressBar2;
        a(this.c);
    }

    public final void a(int i) {
        if (i == 4 || i == 8) {
            this.f1186b.setVisibility(i);
            this.f1185a.setVisibility(i);
        } else {
            a(this.c);
        }
    }

    private void a(boolean z) {
        this.f1186b.setVisibility(z ? 0 : 8);
        this.f1185a.setVisibility(z ? 8 : 0);
    }
}
