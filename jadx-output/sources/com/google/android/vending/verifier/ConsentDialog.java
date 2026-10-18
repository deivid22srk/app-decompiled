package com.google.android.vending.verifier;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.a.ae;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.ButtonBar;

/* loaded from: classes.dex */
public class ConsentDialog extends ae implements com.google.android.finsky.layout.r {
    private static String k = "verification_id";
    private int l;
    private ButtonBar m;
    private boolean n = false;

    public static void a(Context context, int i) {
        Intent intent = new Intent(context, (Class<?>) ConsentDialog.class);
        intent.setFlags(1342177280);
        intent.putExtra(k, i);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.package_malware_consent_dialog);
        if (Build.VERSION.SDK_INT >= 11) {
            setFinishOnTouchOutside(false);
        }
        this.l = getIntent().getIntExtra(k, -1);
        if (!PackageVerificationService.a(this.l, this)) {
            finish();
            return;
        }
        this.m = (ButtonBar) findViewById(R.id.button_bar);
        this.m.setClickListener(this);
        this.m.setPositiveButtonTitle(R.string.accept);
        this.m.setNegativeButtonTitle(R.string.decline);
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        if (!this.n && isFinishing()) {
            PackageVerificationService.a(this.l, false);
        }
        PackageVerificationService.a(this.l, (Activity) null);
        super.onDestroy();
    }

    @Override // com.google.android.finsky.layout.r
    public final void z_() {
        this.n = true;
        PackageVerificationService.a(this.l, true);
        PackageVerificationService.a(this.l, (Activity) null);
        finish();
    }

    @Override // com.google.android.finsky.layout.r
    public final void b() {
        this.n = true;
        PackageVerificationService.a(this.l, false);
        PackageVerificationService.a(this.l, (Activity) null);
        finish();
    }
}
