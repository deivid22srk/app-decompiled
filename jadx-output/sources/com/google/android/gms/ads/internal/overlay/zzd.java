package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.gb;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.im;
import com.google.android.gms.internal.iu;
import com.google.android.gms.internal.iv;
import java.util.Collections;
import org.keyczar.Keyczar;

@gw
/* loaded from: classes.dex */
public final class zzd extends gb implements p {

    /* renamed from: a, reason: collision with root package name */
    static final int f5333a = Color.argb(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final Activity f5334b;
    AdOverlayInfoParcel c;
    im d;
    e e;
    public n f;
    public FrameLayout h;
    public WebChromeClient.CustomViewCallback i;
    public RelativeLayout l;
    public boolean o;
    public boolean g = false;
    boolean j = false;
    boolean k = false;
    public boolean m = false;
    int n = 0;
    private boolean p = false;
    private boolean q = true;

    @gw
    final class zza extends Exception {
        public zza(String str) {
            super(str);
        }
    }

    public zzd(Activity activity) {
        this.f5334b = activity;
    }

    public final void a() {
        this.n = 2;
        this.f5334b.finish();
    }

    public final void a(int i) {
        this.f5334b.setRequestedOrientation(i);
    }

    public final void a(boolean z) {
        this.f = new n(this.f5334b, z ? 50 : 32, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        this.f.a(z, this.c.h);
        this.l.addView(this.f, layoutParams);
    }

    public final void a(boolean z, boolean z2) {
        if (this.f != null) {
            this.f.a(z, z2);
        }
    }

    @Override // com.google.android.gms.internal.ga
    public final void b(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.j);
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void c() {
        this.n = 1;
        this.f5334b.finish();
    }

    @Override // com.google.android.gms.internal.ga
    public final void d() {
        this.n = 0;
    }

    @Override // com.google.android.gms.internal.ga
    public final boolean e() {
        this.n = 0;
        if (this.d == null) {
            return true;
        }
        boolean p = this.d.p();
        if (p) {
            return p;
        }
        this.d.a("onbackblocked", Collections.emptyMap());
        return p;
    }

    @Override // com.google.android.gms.internal.ga
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ga
    public final void g() {
    }

    @Override // com.google.android.gms.internal.ga
    public final void j() {
        n();
    }

    @Override // com.google.android.gms.internal.ga
    public final void k() {
        if (this.d != null) {
            this.l.removeView(this.d.getView());
        }
        n();
    }

    @Override // com.google.android.gms.internal.ga
    public final void l() {
        this.o = true;
    }

    public final void m() {
        this.d.b();
    }

    public final void b() {
        if (this.c != null && this.g) {
            a(this.c.k);
        }
        if (this.h != null) {
            this.f5334b.setContentView(this.l);
            this.o = true;
            this.h.removeAllViews();
            this.h = null;
        }
        if (this.i != null) {
            this.i.onCustomViewHidden();
            this.i = null;
        }
        this.g = false;
    }

    @Override // com.google.android.gms.internal.ga
    public final void a(Bundle bundle) {
        this.j = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            this.c = AdOverlayInfoParcel.a(this.f5334b.getIntent());
            if (this.c == null) {
                throw new zza("Could not get info for ad overlay.");
            }
            if (this.c.n.d > 7500000) {
                this.n = 3;
            }
            if (this.f5334b.getIntent() != null) {
                this.q = this.f5334b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            if (this.c.q != null) {
                this.k = this.c.q.f5281b;
            } else {
                this.k = false;
            }
            if (((Boolean) com.google.android.gms.ads.internal.d.j().a(com.google.android.gms.ads.internal.a.f.aD)).booleanValue() && this.k && this.c.q.d != null) {
                new f(this, (byte) 0).b();
            }
            if (bundle == null) {
                if (this.c.d != null && this.q) {
                    this.c.d.b();
                }
                if (this.c.l != 1 && this.c.c != null) {
                    com.google.android.gms.ads.internal.client.a aVar = this.c.c;
                }
            }
            this.l = new d(this.f5334b, this.c.p);
            switch (this.c.l) {
                case 1:
                    b(false);
                    return;
                case 2:
                    this.e = new e(this.c.e);
                    b(false);
                    return;
                case 3:
                    b(true);
                    return;
                case 4:
                    if (this.j) {
                        this.n = 3;
                        this.f5334b.finish();
                        return;
                    }
                    com.google.android.gms.ads.internal.d.a();
                    Activity activity = this.f5334b;
                    AdLauncherIntentInfoParcel adLauncherIntentInfoParcel = this.c.f5319b;
                    o oVar = this.c.j;
                    if (a.a(activity, adLauncherIntentInfoParcel)) {
                        return;
                    }
                    this.n = 3;
                    this.f5334b.finish();
                    return;
                default:
                    throw new zza("Could not determine ad overlay type.");
            }
        } catch (zza e) {
            com.google.android.gms.ads.internal.util.client.b.e(e.getMessage());
            this.n = 3;
            this.f5334b.finish();
        }
    }

    @Override // com.google.android.gms.internal.ga
    public final void h() {
        if (this.c != null && this.c.l == 4) {
            if (this.j) {
                this.n = 3;
                this.f5334b.finish();
            } else {
                this.j = true;
            }
        }
        if (this.d == null || this.d.n()) {
            com.google.android.gms.ads.internal.util.client.b.e("The webview does not exit. Ignoring action.");
            return;
        }
        com.google.android.gms.ads.internal.d.e();
        im imVar = this.d;
        if (imVar != null) {
            imVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ga
    public final void i() {
        b();
        if (this.d != null && (!this.f5334b.isFinishing() || this.e == null)) {
            com.google.android.gms.ads.internal.d.e();
            im imVar = this.d;
            if (imVar != null) {
                imVar.onPause();
            }
        }
        n();
    }

    private void b(boolean z) {
        if (!this.o) {
            this.f5334b.requestWindowFeature(1);
        }
        Window window = this.f5334b.getWindow();
        if (window == null) {
            throw new zza("Invalid activity, no window available.");
        }
        if (!this.k || (this.c.q != null && this.c.q.c)) {
            window.setFlags(1024, 1024);
        }
        boolean a2 = this.c.e.i().a();
        this.m = false;
        if (a2) {
            if (this.c.k == com.google.android.gms.ads.internal.d.e().a()) {
                this.m = this.f5334b.getResources().getConfiguration().orientation == 1;
            } else if (this.c.k == com.google.android.gms.ads.internal.d.e().b()) {
                this.m = this.f5334b.getResources().getConfiguration().orientation == 2;
            }
        }
        com.google.android.gms.ads.internal.util.client.b.a("Delay onShow to next orientation change: " + this.m);
        a(this.c.k);
        if (com.google.android.gms.ads.internal.d.e().a(window)) {
            com.google.android.gms.ads.internal.util.client.b.a("Hardware acceleration on the AdActivity window enabled.");
        }
        if (this.k) {
            this.l.setBackgroundColor(f5333a);
        } else {
            this.l.setBackgroundColor(-16777216);
        }
        this.f5334b.setContentView(this.l);
        this.o = true;
        if (z) {
            com.google.android.gms.ads.internal.d.d();
            iu iuVar = new iu(iv.a(this.f5334b, this.c.e.h(), this.c.n));
            iuVar.setWebViewClient(com.google.android.gms.ads.internal.d.e().a(iuVar, a2));
            iuVar.setWebChromeClient(com.google.android.gms.ads.internal.d.e().a((im) iuVar));
            this.d = iuVar;
            this.d.i().a(this.c.f, this.c.j, this.c.o, this.c.e.i().n);
            this.d.i().f = new c(this);
            if (this.c.m != null) {
                this.d.loadUrl(this.c.m);
            } else {
                if (this.c.i == null) {
                    throw new zza("No URL or HTML to display in ad overlay.");
                }
                this.d.loadDataWithBaseURL(this.c.g, this.c.i, "text/html", Keyczar.DEFAULT_ENCODING, null);
            }
            if (this.c.e != null) {
                this.c.e.b(this);
            }
        } else {
            this.d = this.c.e;
            this.d.setContext(this.f5334b);
        }
        this.d.a(this);
        ViewParent parent = this.d.getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            ((ViewGroup) parent).removeView(this.d.getView());
        }
        if (this.k) {
            this.d.setBackgroundColor(f5333a);
        }
        this.l.addView(this.d.getView(), -1, -1);
        if (!z && !this.m) {
            m();
        }
        a(a2);
        if (this.d.j()) {
            a(a2, true);
        }
    }

    private void n() {
        if (!this.f5334b.isFinishing() || this.p) {
            return;
        }
        this.p = true;
        if (this.d != null) {
            this.d.a(this.n);
            this.l.removeView(this.d.getView());
            if (this.e != null) {
                this.d.setContext(this.e.d);
                this.d.a(false);
                this.e.c.addView(this.d.getView(), this.e.f5322a, this.e.f5323b);
                this.e = null;
            }
            this.d = null;
        }
        if (this.c == null || this.c.d == null) {
            return;
        }
        this.c.d.a();
    }
}
