package com.google.android.finsky.setup;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.services.VpaService;
import com.google.android.finsky.services.ay;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class SetupWizardFinalHoldActivity extends Activity implements ay {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4640a = com.google.android.finsky.cpkg.d.dI.b();

    /* renamed from: b, reason: collision with root package name */
    public static final String f4641b = com.google.android.finsky.cpkg.d.dJ.b();
    public static final String c = com.google.android.finsky.cpkg.d.dK.b();
    private static final long d = com.google.android.finsky.cpkg.d.dL.b().longValue();
    private static final long e = com.google.android.finsky.cpkg.d.dM.b().longValue();
    private boolean f;
    private boolean g;
    private long i;
    private String j;
    private o k;
    private Handler h = new Handler(Looper.getMainLooper());
    private Runnable l = new n(this);

    public static Intent a() {
        return new Intent(FinskyApp.a(), (Class<?>) SetupWizardFinalHoldActivity.class);
    }

    @Override // android.app.Activity
    @TargetApi(19)
    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((ViewGroup) LayoutInflater.from(this).inflate(R.layout.setup_wizard_final_hold, (ViewGroup) null));
        View decorView = getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new l(this, decorView));
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 5634);
        FifeImageView fifeImageView = (FifeImageView) findViewById(R.id.setup_wizard_restore_header);
        this.k = new o((TextView) findViewById(R.id.setup_wizard_title_ellipse));
        fifeImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (getResources().getBoolean(R.bool.setup_wizard_use_tablet_graphic)) {
            str = c;
        } else if (getResources().getConfiguration().orientation == 2) {
            str = f4641b;
        } else {
            str = f4640a;
        }
        fifeImageView.a(str, true, FinskyApp.a().d);
        if (bundle == null) {
            a(d, (String) null);
            return;
        }
        this.i = bundle.getLong("watchdog_expiration_ms");
        this.j = bundle.getString("watchdog_package");
        if (!d()) {
            a(this.i - SystemClock.elapsedRealtime(), this.j);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.h.removeCallbacks(this.l);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("watchdog_expiration_ms", this.i);
        bundle.putString("watchdog_package", this.j);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        d();
        o oVar = this.k;
        oVar.f4671b = true;
        oVar.f4670a.removeCallbacks(oVar.c);
        oVar.f4670a.postDelayed(oVar.c, 500L);
        if (!b()) {
            a(-1);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        o oVar = this.k;
        oVar.f4671b = false;
        oVar.f4670a.removeCallbacks(oVar.c);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.h.removeCallbacks(this.l);
        setResult(i);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        if (RestoreService.a((ay) this)) {
            this.g = true;
            return true;
        }
        if (VpaService.a(this)) {
            this.f = true;
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f) {
            VpaService.a((ay) null);
            this.f = false;
        }
        if (this.g) {
            RestoreService.a((ay) null);
            this.g = false;
        }
    }

    @Override // com.google.android.finsky.services.ay
    public final void a(int i, String str, boolean z, String str2) {
        Object[] objArr = new Object[5];
        objArr[0] = this.f ? "VPA" : "Restore";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = str;
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = str2;
        FinskyLog.a("Final hold status change: listener=%s code=%d package=%s cancelable=%b (%s)", objArr);
        switch (i) {
            case 1:
                this.h.post(new m(this));
                break;
            case 2:
                a(d, (String) null);
                break;
            case 3:
                if (this.j == null || !this.j.equals(str)) {
                    a(e, str);
                    break;
                }
                break;
            default:
                FinskyLog.e("Unknown event code - finishing early", new Object[0]);
                a(-1);
                break;
        }
    }

    private void a(long j, String str) {
        if (d == -1) {
            FinskyLog.a("Watchdog disabled", new Object[0]);
            return;
        }
        FinskyLog.a("Set watchdog to %d sec (package %s)", Long.valueOf(j / 1000), str);
        this.i = SystemClock.elapsedRealtime() + j;
        this.j = str;
        this.h.removeCallbacks(this.l);
        this.h.postDelayed(this.l, j);
    }

    private boolean d() {
        if (d == -1 || SystemClock.elapsedRealtime() <= this.i) {
            return false;
        }
        this.l.run();
        return true;
    }
}
