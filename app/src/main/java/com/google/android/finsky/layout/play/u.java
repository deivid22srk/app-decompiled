package com.google.android.finsky.layout.play;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class u implements com.google.android.play.drawer.t {

    /* renamed from: a, reason: collision with root package name */
    private final int f3514a;

    public u(int i) {
        this.f3514a = i;
    }

    @Override // com.google.android.play.drawer.t
    public final Drawable a(Resources resources, boolean z) {
        int i = this.f3514a;
        return com.caverock.androidsvg.q.a(resources, com.google.android.finsky.utils.ai.i(i), i == 13 ? 0 : com.google.android.finsky.utils.ai.a(i));
    }
}
