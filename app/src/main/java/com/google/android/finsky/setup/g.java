package com.google.android.finsky.setup;

import android.view.View;

/* loaded from: classes.dex */
final class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RestoreAppsActivity f4660a;

    g(RestoreAppsActivity restoreAppsActivity) {
        this.f4660a = restoreAppsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f4660a.setResult(0);
        this.f4660a.finish();
    }
}
