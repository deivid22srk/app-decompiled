package com.google.android.finsky.activities.onboard;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.apkg.i;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.layout.play.da;

/* loaded from: classes.dex */
public final class a extends Fragment implements da {

    /* renamed from: a, reason: collision with root package name */
    private DfeToc f1855a;

    /* renamed from: b, reason: collision with root package name */
    private AnimatedEntertainmentOnboardPage f1856b;
    private Handler c;
    private i d;
    private long e = i.g();
    private final ai f = i.a(5004);

    public static a a(DfeToc dfeToc) {
        a aVar = new a();
        aVar.f(new Bundle());
        aVar.r.putParcelable("finsky.onboarding.Fragment.toc", dfeToc);
        aVar.c = new Handler(Looper.getMainLooper());
        aVar.d = FinskyApp.a().h();
        return aVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
        this.f1855a = (DfeToc) this.r.getParcelable("finsky.onboarding.Fragment.toc");
    }

    @Override // android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1856b = (AnimatedEntertainmentOnboardPage) layoutInflater.inflate(R.layout.animated_onboard_entertainment_page, viewGroup, false);
        this.f1856b.setParentUiElementNode(this);
        this.f1856b.setEventLogger(this.d);
        this.f1856b.setEntertainmentWelcomeText(com.google.android.finsky.utils.ai.a(e(), this.f1855a));
        return this.f1856b;
    }

    @Override // android.support.v4.app.Fragment
    public final void p() {
        super.p();
        this.f1856b.setIsActivityResumed(false);
    }

    @Override // android.support.v4.app.Fragment
    public final void o() {
        super.o();
        i.c(this);
        this.f1856b.setIsActivityResumed(true);
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        AnimatedEntertainmentOnboardPage animatedEntertainmentOnboardPage = this.f1856b;
        if (animatedEntertainmentOnboardPage.f1853a != null) {
            animatedEntertainmentOnboardPage.f1853a.cancel(true);
        }
        if (animatedEntertainmentOnboardPage.f1854b != null) {
            animatedEntertainmentOnboardPage.f1854b.cancel(true);
        }
        super.d();
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void p_() {
        this.e = i.g();
    }

    @Override // com.google.android.finsky.layout.play.da
    public final void i() {
        i.a(this.c, this.e, this);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        i.a(this.c, this.e, this, cyVar);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.f;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final cy getParentNode() {
        return null;
    }
}
