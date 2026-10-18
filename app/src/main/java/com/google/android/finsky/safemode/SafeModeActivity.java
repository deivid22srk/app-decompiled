package com.google.android.finsky.safemode;

import android.os.Bundle;
import android.support.v4.app.t;
import com.deivid22srk.store.R;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;

/* loaded from: classes.dex */
public class SafeModeActivity extends t implements gp {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        new gn().a(R.string.safe_mode_user_text).d(R.string.ok).a(true).b().a(d(), "safe_mode_dialog");
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        finish();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        finish();
    }
}
