package com.google.android.finsky.activities.onboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ap;
import android.support.v4.app.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class EntertainmentOnboardHostActivity extends t {
    private DfeToc k;

    public static Intent a(Context context) {
        return new Intent(context, (Class<?>) EntertainmentOnboardHostActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = FinskyApp.a().g;
        if (this.k == null) {
            FinskyLog.c("No toc available! Exiting on-boarding activity", new Object[0]);
            finish();
        } else {
            if (d().a("AnimatedEntertainmentOnboardFragment") != null) {
                return;
            }
            ap a2 = d().a();
            a2.b(R.id.content, a.a(this.k), "AnimatedEntertainmentOnboardFragment");
            a2.b();
        }
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }
}
