package com.google.android.finsky.billing.lightpurchase.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.utils.ik;

@TargetApi(23)
/* loaded from: classes.dex */
public final class r extends FingerprintManager.AuthenticationCallback {

    /* renamed from: a, reason: collision with root package name */
    final FingerprintManager f2370a;

    /* renamed from: b, reason: collision with root package name */
    final ImageView f2371b;
    final TextView c;
    final String d;
    final u e;
    CancellationSignal f;
    boolean g;
    private int i;
    private final int h = com.google.android.finsky.c.d.cR.b().intValue();
    private Runnable j = new s(this);
    private Runnable k = new t(this);

    public r(Context context, ImageView imageView, TextView textView, String str, u uVar) {
        this.f2370a = (FingerprintManager) context.getSystemService(FingerprintManager.class);
        this.f2371b = imageView;
        this.c = textView;
        this.d = str;
        this.e = uVar;
    }

    public final void a() {
        if (this.f != null) {
            this.g = true;
            this.f.cancel();
            this.f = null;
            this.c.removeCallbacks(this.j);
            this.c.removeCallbacks(this.k);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        if (!this.g) {
            a(charSequence);
            this.c.postDelayed(this.j, 1600L);
        }
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        this.i++;
        int i = R.string.fingerprint_not_recognized;
        if (this.i == 1) {
            i = R.string.fingerprint_failed_first_attempt;
        } else if (this.i == this.h - 1) {
            i = R.string.fingerprint_failed_last_attempt;
        } else if (this.i >= this.h) {
            a();
            this.e.b();
            return;
        }
        a((CharSequence) this.c.getResources().getString(i));
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        this.f2371b.setImageResource(R.drawable.ic_fp_dialog_successful);
        this.c.setTextColor(this.c.getResources().getColor(R.color.fingerprint_success_color, null));
        a(this.c.getResources().getString(R.string.fingerprint_scan_successful));
        this.c.postDelayed(this.k, 300L);
    }

    private void a(CharSequence charSequence) {
        this.f2371b.setImageResource(R.drawable.ic_fp_dialog_error);
        a(charSequence.toString());
        this.c.setTextColor(this.c.getResources().getColor(R.color.fingerprint_warning_color, null));
        ik.a(this.c.getContext(), this.c);
    }

    private void a(String str) {
        ik.a(this.c.getContext(), str, this.c);
        this.c.setText(str);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        a(charSequence);
    }
}
