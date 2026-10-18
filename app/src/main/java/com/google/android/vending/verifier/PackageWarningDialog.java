package com.google.android.vending.verifier;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.a.ae;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.gn;
import com.google.android.finsky.activities.gp;

/* loaded from: classes.dex */
public class PackageWarningDialog extends ae implements gp {
    public static int k = -1;
    private int l;
    private int m;
    private String n;
    private String o;
    private String p;
    private byte[] q;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;

    public static Intent a(Context context, int i, int i2, String str, String str2, String str3, byte[] bArr, int i3) {
        Intent intent = new Intent(context, (Class<?>) PackageWarningDialog.class);
        intent.setFlags(1476395008);
        intent.putExtra("verification_id", i);
        intent.putExtra("action", i2);
        intent.putExtra("app_name", str);
        intent.putExtra("message", str3);
        intent.putExtra("package_name", str2);
        intent.putExtra("response_token", bArr);
        intent.putExtra("layout_version", i3);
        return intent;
    }

    public static void a(Context context, int i, int i2, String str, String str2, int i3) {
        context.startActivity(a(context, i, i2, str, null, str2, null, i3));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.m = intent.getIntExtra("verification_id", k);
        this.l = intent.getIntExtra("action", 0);
        this.n = intent.getStringExtra("app_name");
        this.o = intent.getStringExtra("message");
        this.p = intent.getStringExtra("package_name");
        this.q = intent.getByteArrayExtra("response_token");
        Bundle bundle2 = new Bundle();
        bundle2.putString("app_name", this.n);
        bundle2.putString("warning_message", this.o);
        bundle2.putInt("action", this.l);
        gn gnVar = new gn();
        gnVar.b(R.layout.package_malware_dialog).a(bundle2).d(R.string.ok).c().a(false);
        switch (this.l) {
            case 0:
                gnVar.c(R.string.package_malware_banner_blocked);
                break;
            case 1:
                gnVar.c(R.string.package_malware_banner_blocked);
                break;
            case 2:
                gnVar.c(R.string.package_malware_banner_request_removal_question);
                gnVar.e(R.string.package_malware_keep_anyway_unsafe_caps);
                FinskyApp.a().n.c(this.p);
                break;
            case 3:
                gnVar.c(R.string.package_malware_banner_removed);
                break;
        }
        p pVar = new p();
        gnVar.a(pVar);
        pVar.a(d(), "PackageWarningSimpleAlertDialog");
        if (Build.VERSION.SDK_INT >= 11) {
            setFinishOnTouchOutside(false);
        }
        if (this.m != k && !PackageVerificationService.a(this.m, this)) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        if (!this.s && isFinishing()) {
            if (this.l == 0 || this.l == 1) {
                PackageVerificationService.a(this.m, -1, false);
            } else if (this.l == 2) {
                PackageVerificationService.a(this, this.p, false, this.t, this.r, this.q);
            }
        }
        PackageVerificationService.a(this.m, (Activity) null);
        super.onDestroy();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        this.r = bundle.getBoolean("pressed_back_button", false);
        this.t = bundle.getBoolean("dont_warn", false);
        if (this.l == 0 || this.l == 1) {
            PackageVerificationService.a(this.m, -1, this.r);
            PackageVerificationService.a(this.m, (Activity) null);
        } else if (this.l == 2) {
            PackageVerificationService.a(this, this.p, true, this.t, this.r, this.q);
        }
        this.s = true;
        finish();
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        this.r = bundle.getBoolean("pressed_back_button", false);
        this.t = bundle.getBoolean("dont_warn", false);
        if (this.l == 0 || this.l == 1) {
            PackageVerificationService.a(this.m, 1, this.r);
            PackageVerificationService.a(this.m, (Activity) null);
        } else if (this.l == 2) {
            PackageVerificationService.a(this, this.p, false, this.t, this.r, this.q);
        }
        this.s = true;
        finish();
    }
}
