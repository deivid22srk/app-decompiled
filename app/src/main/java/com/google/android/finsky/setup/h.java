package com.google.android.finsky.setup;

import android.view.View;

/* loaded from: classes.dex */
final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RestoreAppsActivity f4661a;

    h(RestoreAppsActivity restoreAppsActivity) {
        this.f4661a = restoreAppsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RestoreAppsActivity.a(this.f4661a);
    }
}
