package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.activities.DebugActivity;

/* loaded from: classes.dex */
final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f3497a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FinskyDrawerLayout f3498b;

    h(FinskyDrawerLayout finskyDrawerLayout, Context context) {
        this.f3498b = finskyDrawerLayout;
        this.f3497a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3497a.startActivity(new Intent(this.f3497a, (Class<?>) DebugActivity.class));
    }
}
