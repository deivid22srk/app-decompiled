package com.google.android.finsky.billing.lightpurchase.b;

import android.accounts.Account;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ap;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.a.aj;
import com.google.android.finsky.a.i;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.setup.SetupWizardNavBar;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.SetupWizardUtils;
import com.google.android.play.layout.PlayActionButton;

/* loaded from: classes.dex */
public abstract class a extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f2315a = new b(this);
    public f<?> ai;
    public boolean aj;
    public View ak;
    protected View al;
    protected View am;
    public i an;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2316b;
    private boolean c;
    private boolean d;
    private View.OnClickListener e;
    private View f;
    private View g;
    private View h;
    public Account i;

    public abstract int w();

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        if (this.r.containsKey("MultiStepFragment.account")) {
            this.i = (Account) this.r.getParcelable("MultiStepFragment.account");
        } else if (this.r.containsKey("authAccount")) {
            this.i = com.google.android.finsky.api.a.a(this.r.getString("authAccount"), FinskyApp.a());
        }
        if (this.i == null) {
            throw new IllegalStateException("No account specified.");
        }
        this.an = FinskyApp.a().c(this.i);
        if (bundle != null) {
            this.aj = bundle.getBoolean("MultiStepFragment.isLoading");
        }
        this.c = FinskyApp.a().e().a(12602631L);
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("MultiStepFragment.isLoading", this.aj);
    }

    @Override // android.support.v4.app.Fragment
    public void g_() {
        super.g_();
        this.ai = (f) h().a(R.id.content_frame_above_button);
        C();
    }

    @Override // android.support.v4.app.Fragment
    public void h_() {
        this.ak.removeCallbacks(this.f2315a);
        super.h_();
    }

    @Override // android.support.v4.app.Fragment
    public void a(View view, Bundle bundle) {
        super.a(view, bundle);
        this.ak = view;
        SetupWizardNavBar a2 = SetupWizardUtils.a(f());
        if (a2 != null) {
            this.d = false;
            this.h = a2.getView();
            this.al = a2.f4642a;
            this.am = null;
        } else {
            this.d = true;
            this.h = this.ak.findViewById(R.id.continue_button_bar);
            this.al = this.ak.findViewById(R.id.continue_button);
            this.am = this.ak.findViewById(R.id.secondary_button);
        }
        this.h.setVisibility(8);
        this.e = new c(this);
        if (!(this.al instanceof PlayActionButton)) {
            this.al.setOnClickListener(this.e);
        }
        if (this.am != null && !(this.am instanceof PlayActionButton)) {
            this.am.setOnClickListener(this.e);
        }
        this.g = this.ak.findViewById(R.id.progress_bar);
        this.f = this.ak.findViewById(R.id.content_frame_above_button);
    }

    public final void z() {
        if (this.f2316b) {
            if (this.c) {
                if (this.al.getVisibility() == 0) {
                    if (this.d) {
                        a(this.al);
                    } else {
                        this.al.setVisibility(4);
                    }
                }
                if (this.am != null && this.am.getVisibility() == 0) {
                    if (this.d) {
                        a(this.am);
                    } else {
                        this.am.setVisibility(4);
                    }
                }
                this.f2316b = false;
            } else if (this.f2316b) {
                this.f2316b = false;
                if (this.d) {
                    a(this.h);
                } else {
                    this.h.setVisibility(4);
                }
            }
        }
        if (!this.aj) {
            if (this.ai == null) {
                this.f.setVisibility(4);
                this.g.setVisibility(0);
                this.g.startAnimation(AnimationUtils.loadAnimation(f(), R.anim.play_fade_in));
            } else {
                Animation loadAnimation = AnimationUtils.loadAnimation(f(), R.anim.slide_out_left);
                loadAnimation.setAnimationListener(new d(this));
                this.f.startAnimation(loadAnimation);
                this.g.setVisibility(0);
                this.g.startAnimation(AnimationUtils.loadAnimation(f(), R.anim.slide_in_right));
            }
            this.aj = true;
            this.an.b(213, null, (cy) f());
        }
    }

    public final void A() {
        if (this.ai == null) {
            FinskyLog.e("Illegal state: hideLoading called without fragment.", new Object[0]);
            return;
        }
        this.f.setVisibility(0);
        this.f.startAnimation(AnimationUtils.loadAnimation(f(), R.anim.play_fade_in));
        u();
        this.aj = false;
        b(this.ai);
        a((cy) this.ai);
    }

    public final void a(f<?> fVar) {
        ap a2 = h().a();
        if (this.aj) {
            this.f.setVisibility(4);
            this.ak.postDelayed(this.f2315a, 100L);
        } else {
            if (this.ai != null) {
                a2.a(R.anim.slide_in_right, R.anim.slide_out_left);
            }
            this.f.setVisibility(0);
            b(fVar);
        }
        if (this.ai != null) {
            a2.a(this.ai);
        }
        a2.a(R.id.content_frame_above_button, fVar);
        a2.b();
        this.ai = fVar;
        this.aj = false;
    }

    public final void a(boolean z) {
        this.al.setEnabled(z);
    }

    public final boolean B() {
        return this.al.isEnabled();
    }

    public final void a(cy cyVar) {
        this.an.a(0L, cyVar);
    }

    public final void a(int i, cy cyVar) {
        this.an.a(i, (byte[]) null, cyVar);
    }

    public final void a(int i, aj ajVar, cy cyVar) {
        this.an.a(i, ajVar, cyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(f<?> fVar) {
        String str;
        String str2 = null;
        if (fVar != null && !fVar.x()) {
            this.h.setVisibility(8);
            this.f2316b = false;
            return;
        }
        if (!this.f2316b && ((this.c || fVar != null) && !this.f2316b)) {
            this.f2316b = this.c || !this.aj;
            if (this.c) {
                if (this.h.getVisibility() == 0) {
                    this.al.startAnimation(AnimationUtils.loadAnimation(f(), R.anim.play_fade_in));
                } else {
                    this.h.setVisibility(0);
                    if (this.d) {
                        this.h.startAnimation(AnimationUtils.loadAnimation(f(), R.anim.play_fade_in));
                    }
                }
            } else if (!this.aj) {
                this.h.setVisibility(0);
                if (this.d) {
                    this.h.startAnimation(AnimationUtils.loadAnimation(f(), R.anim.play_fade_in));
                }
            }
        }
        if (fVar == null || this.aj) {
            str = null;
        } else {
            str2 = fVar.a(g());
            g();
            str = fVar.v();
        }
        a(this.al, str2);
        if (this.am != null) {
            a(this.am, str);
        }
    }

    private void a(View view, String str) {
        if (TextUtils.isEmpty(str)) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        if (view instanceof PlayActionButton) {
            ((PlayActionButton) view).a(w(), str, this.e);
        } else if (view instanceof Button) {
            ((Button) view).setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        a(this.g);
    }

    private void a(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(f(), R.anim.fade_out);
        loadAnimation.setAnimationListener(new e(this, view));
        view.startAnimation(loadAnimation);
    }

    public final void C() {
        if (this.aj) {
            this.g.setVisibility(0);
        } else if (this.ai != null) {
            this.f.setVisibility(0);
        }
        b(this.ai);
    }

    static /* synthetic */ void b(a aVar) {
        aVar.f.setVisibility(0);
        aVar.f.startAnimation(AnimationUtils.loadAnimation(aVar.f(), R.anim.play_fade_in));
    }
}
