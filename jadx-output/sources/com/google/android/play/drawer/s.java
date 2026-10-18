package com.google.android.play.drawer;

import android.annotation.TargetApi;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
final class s implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f6873a;

    s(r rVar) {
        this.f6873a = rVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    @TargetApi(20)
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return windowInsets.consumeSystemWindowInsets();
    }
}
