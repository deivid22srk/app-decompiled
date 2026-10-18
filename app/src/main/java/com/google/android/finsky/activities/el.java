package com.google.android.finsky.activities;

import com.deivid22srk.store.R;

/* loaded from: classes.dex */
final class el implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MainActivity f1720a;

    el(MainActivity mainActivity) {
        this.f1720a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!((d) this.f1720a).l) {
            android.support.v4.app.aa d = this.f1720a.d();
            int i = com.google.android.finsky.utils.bg.u.a().booleanValue() ? R.string.auto_update_migration_dialog_message_on_wifi : R.string.auto_update_migration_dialog_message_on_mobile;
            gn gnVar = new gn();
            gnVar.a(i).d(R.string.ok).e(R.string.not_now).a(null, 36, null).a(306, null, 237, 236, null);
            gnVar.b().a(d, "dialog.auto_update_migration");
        }
    }
}
