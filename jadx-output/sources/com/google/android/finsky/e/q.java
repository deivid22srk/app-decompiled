package com.google.android.finsky.e;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.bv;
import com.google.android.finsky.layout.by;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.layout.play.da;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.utils.aw;
import com.google.android.play.headerlist.PlayHeaderListLayout;

/* loaded from: classes.dex */
public abstract class q extends Fragment implements com.android.volley.s, com.google.android.finsky.api.model.x, com.google.android.finsky.layout.actionbar.d, by, da {

    /* renamed from: a, reason: collision with root package name */
    private Handler f2765a;
    public t ao;
    public Context ap;
    public com.google.android.finsky.api.b aq;
    public com.google.android.play.image.e ar;
    public com.google.android.finsky.navigationmanager.b as;
    public com.google.android.finsky.layout.actionbar.c at;
    public bv au;
    public ViewGroup av;
    public String aw;
    public DfeToc ax;
    protected boolean ay;
    public Runnable az;

    /* renamed from: b, reason: collision with root package name */
    private long f2766b = com.google.android.finsky.a.i.g();

    public abstract void u();

    public abstract int w();

    public abstract void y();

    public q() {
        f(new Bundle());
    }

    public boolean G() {
        return false;
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) layoutInflater.inflate(R.layout.generic_frame, viewGroup, false);
        this.av = contentFrame.a(layoutInflater, w(), R.id.page_content);
        this.az = new r(this, contentFrame);
        if (!C()) {
            this.az.run();
        }
        this.ay = false;
        this.au = a(contentFrame);
        FinskyLog.f("Views inflated", new Object[0]);
        return contentFrame;
    }

    public boolean C() {
        return false;
    }

    public bv a(ContentFrame contentFrame) {
        return new bv(contentFrame, R.id.page_content, R.id.loading_indicator, this, 2);
    }

    @Override // android.support.v4.app.Fragment
    public final void h_() {
        com.google.android.finsky.navigationmanager.b bVar;
        int i = 1;
        if (this.av instanceof FinskyHeaderListLayout) {
            FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.av;
            FinskySearchToolbar finskySearchToolbar = (FinskySearchToolbar) finskyHeaderListLayout.getToolbar();
            if (finskySearchToolbar == null || finskySearchToolbar.k()) {
                bVar = this.as;
                i = 0;
            } else {
                boolean z = finskyHeaderListLayout.getActionBarTranslationY() == 0.0f;
                com.google.android.finsky.navigationmanager.b bVar2 = this.as;
                if (z) {
                    i = 2;
                    bVar = bVar2;
                } else {
                    bVar = bVar2;
                }
            }
            int size = bVar.c.size();
            if (size >= 2) {
                bVar.c.elementAt(size - 2).g = i;
            }
        }
        super.h_();
    }

    @Override // android.support.v4.app.Fragment
    public void d() {
        super.d();
        this.av = null;
        this.au = null;
        this.az = null;
        if (this.at != null) {
            this.at.a(null);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void a(Activity activity) {
        this.f2765a = new Handler(activity.getMainLooper());
        super.a(activity);
    }

    @Override // android.support.v4.app.Fragment
    @TargetApi(19)
    public void d(Bundle bundle) {
        Transition v;
        super.d(bundle);
        if (((t) f()) != this.ao) {
            this.ao = (t) f();
            this.ap = f();
            this.as = this.ao.g();
            this.at = this.ao.h();
            this.aq = this.ao.a_(this.aw);
            this.ar = this.ao.k();
        }
        this.ay = false;
        if (this.at != null) {
            this.at.a(this);
        }
        if (this.B.a("hats-survey") == null) {
            this.ao.a(this);
        }
        if (com.google.android.finsky.navigationmanager.b.h() && (v = v()) != null) {
            this.aa = v.setDuration(400L);
        }
        FinskyLog.f("Views bound", new Object[0]);
    }

    @TargetApi(22)
    public Transition v() {
        return new com.google.android.finsky.k.h(0);
    }

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.aw = this.r.getString("finsky.PageFragment.dfeAccount");
        this.ax = (DfeToc) this.r.getParcelable("finsky.PageFragment.toc");
        this.ay = false;
    }

    @Override // android.support.v4.app.Fragment
    public void e(Bundle bundle) {
        this.ay = true;
    }

    @Override // android.support.v4.app.Fragment
    public void o() {
        super.o();
        com.google.android.finsky.a.i.c(this);
        this.ay = false;
    }

    public void n_() {
        y();
    }

    public final boolean L() {
        android.support.v4.app.t f = f();
        return (this.ay || f == null || ((f instanceof com.google.android.finsky.activities.d) && ((com.google.android.finsky.activities.d) f).l)) ? false : true;
    }

    public void m_() {
        if (q_()) {
            this.au.b();
            u();
            FinskyLog.f("Views rebound", new Object[0]);
        }
        if (this.ao != null) {
            this.ao.a(this);
        }
    }

    public void o_() {
    }

    public final void M() {
        this.au.a(3, (String) null);
    }

    public final void N() {
        this.au.a(350);
    }

    public final void e(String str) {
        boolean z;
        boolean z2;
        if (this.au == null) {
            android.support.v4.app.t f = f();
            boolean z3 = f == null;
            if (z3) {
                z = false;
                z2 = false;
            } else {
                z2 = f instanceof com.google.android.finsky.activities.d;
                z = z2 ? ((com.google.android.finsky.activities.d) f).l : false;
            }
            FinskyLog.e("fragmentClass=[%s], mSaveInstanceStateCalled=[%s], activityNull=[%s], isAuthenticatedActivity=[%s], isStateSaved=[%s]", getClass().getSimpleName(), Boolean.valueOf(this.ay), Boolean.valueOf(z3), Boolean.valueOf(z2), Boolean.valueOf(z));
            return;
        }
        this.au.a(str);
    }

    public void a(VolleyError volleyError) {
        if (L()) {
            e(aw.a(this.ap, volleyError));
        }
    }

    public final void f(String str) {
        if (!TextUtils.isEmpty(str)) {
            b("finsky.PageFragment.dfeAccount", str);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final cy getParentNode() {
        return null;
    }

    public void a(cy cyVar) {
        com.google.android.finsky.a.i.a(this.f2765a, this.f2766b, this, cyVar);
    }

    public void p_() {
        this.f2766b = com.google.android.finsky.a.i.g();
    }

    public void i() {
        com.google.android.finsky.a.i.a(this.f2765a, this.f2766b, this);
    }

    public void z() {
        if (this.av instanceof PlayHeaderListLayout) {
            PlayHeaderListLayout playHeaderListLayout = (PlayHeaderListLayout) this.av;
            playHeaderListLayout.setFloatingControlsBackground$4eb43225(new ColorDrawable(0));
            playHeaderListLayout.setHeaderShadowMode(2);
        }
    }

    public void A() {
        if (this.av instanceof PlayHeaderListLayout) {
            PlayHeaderListLayout playHeaderListLayout = (PlayHeaderListLayout) this.av;
            playHeaderListLayout.setFloatingControlsBackground$4eb43225(new ColorDrawable(B()));
            playHeaderListLayout.postDelayed(new s(this, playHeaderListLayout), 200L);
        }
    }

    public int B() {
        return ai.a(this.ap, 0);
    }

    public int D() {
        return this.ap.getResources().getColor(R.color.play_white);
    }

    public int E() {
        return 1;
    }

    public cy F() {
        return this;
    }

    public final void b(String str, String str2) {
        this.r.putString(str, str2);
    }

    public final void a(String str, Parcelable parcelable) {
        this.r.putParcelable(str, parcelable);
    }

    public final void b(String str, boolean z) {
        this.r.putBoolean(str, z);
    }
}
