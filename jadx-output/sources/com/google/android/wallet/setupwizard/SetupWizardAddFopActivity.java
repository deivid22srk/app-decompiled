package com.google.android.wallet.setupwizard;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.a.g;
import com.google.android.wallet.instrumentmanager.f;

/* loaded from: classes.dex */
public class SetupWizardAddFopActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        g.a(getApplicationContext());
        super.onCreate(bundle);
        setContentView(f.activity_setupwizard_add_fop);
    }
}
