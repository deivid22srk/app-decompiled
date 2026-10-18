package com.google.android.finsky.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.deivid22srk.store.R;
import com.google.android.finsky.auth.AuthState;

/* loaded from: classes.dex */
public class GaiaAuthActivity extends android.support.v7.a.ae implements com.google.android.finsky.epkg.k {
    private com.google.android.finsky.epkg.i k;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gaia_auth_frame);
        AuthState authState = (AuthState) getIntent().getParcelableExtra("GaiaAuthActivity_authState");
        if (bundle != null) {
            this.k = (com.google.android.finsky.epkg.i) d().a(bundle, "GaiaAuthActivity_GaiaAuthFragment");
            this.k.f2756a = this;
            return;
        }
        Intent intent = getIntent();
        this.k = com.google.android.finsky.epkg.i.a(intent.getStringExtra("GaiaAuthActivity_accountName"), intent.getBooleanExtra("GaiaAuthActivity_showWarning", false), authState);
        this.k.f2756a = this;
        android.support.v4.app.ap a2 = d().a();
        a2.a(R.id.content_frame, this.k);
        a2.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d().a(bundle, "GaiaAuthActivity_GaiaAuthFragment", this.k);
    }

    @Override // com.google.android.finsky.epkg.k
    public final void g() {
        Intent intent = new Intent();
        intent.putExtra("GaiaAuthActivity_extraParams", getIntent().getBundleExtra("GaiaAuthActivity_extraParams"));
        setResult(-1, intent);
        finish();
    }

    @Override // com.google.android.finsky.epkg.k
    public final void h() {
        setResult(0);
        finish();
    }

    public static Intent a(Context context, String str, boolean z, AuthState authState, Bundle bundle) {
        authState.f2014b = false;
        Intent intent = new Intent(context, (Class<?>) GaiaAuthActivity.class);
        intent.putExtra("GaiaAuthActivity_authState", authState);
        intent.putExtra("GaiaAuthActivity_accountName", str);
        intent.putExtra("GaiaAuthActivity_showWarning", z);
        intent.putExtra("GaiaAuthActivity_extraParams", bundle);
        return intent;
    }
}
