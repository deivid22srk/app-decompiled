package com.google.android.wallet.instrumentmanager.ui.redirect;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.wallet.analytics.f;
import com.google.android.wallet.d.d;
import com.google.android.wallet.d.g;
import com.google.android.wallet.instrumentmanager.e;
import com.google.android.wallet.ui.common.WebViewLayout;
import com.google.android.wallet.ui.common.ah;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.bj;
import com.google.b.a.a.a.b.a.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends ah<com.google.b.a.a.a.b.a.apkg.dpkg.b> implements com.google.android.gms.d.c, g {

    /* renamed from: a, reason: collision with root package name */
    WebViewLayout f7349a;

    /* renamed from: b, reason: collision with root package name */
    String f7350b;
    String c;
    com.google.android.wallet.d.b d;
    private final f e = new f(1745);
    private d f;
    private boolean g;
    private int h;
    private boolean i;

    public static b a(com.google.b.a.a.a.b.a.apkg.dpkg.b bVar, int i) {
        b bVar2 = new b();
        bVar2.f(a(i, bVar));
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.ah
    public final void u() {
        if (this.f7349a != null) {
            this.f7349a.setEnabled(this.av);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.ui.common.d
    public final View c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(com.google.android.wallet.instrumentmanager.f.fragment_redirect, (ViewGroup) null, false);
        this.f7349a = (WebViewLayout) inflate.findViewById(e.web_view_layout);
        if (!TextUtils.isEmpty(((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).i)) {
            this.f7349a.setUserAgent(((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).i);
        }
        this.f = new d(f(), this.f7349a.getWebView(), ((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).d, ((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).e, ((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).g, ((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).h);
        this.f.f = this;
        this.f.g = this;
        this.f7349a.setWebViewClient(this.f);
        if (bundle != null) {
            this.g = bundle.getBoolean("providerInstallerSucceeded");
        }
        if (this.g) {
            u();
        } else {
            b(false);
            com.google.android.gms.d.a.a(f(), this);
        }
        Window window = f().getWindow();
        if (window != null && window.getAttributes().height == -2) {
            this.h = window.getAttributes().height;
            d(-1);
        }
        return inflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void c(boolean z) {
        super.c(z);
        if (this.h != 0) {
            if (z) {
                d(this.h);
            } else {
                d(-1);
            }
        }
    }

    @Override // com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void a(Activity activity) {
        super.a(activity);
        if (this.f == null) {
            return;
        }
        this.f.f = this;
        this.f.g = this;
    }

    @Override // android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.i = bj.f(this.f7349a, true);
    }

    @Override // android.support.v4.app.Fragment
    public final void d() {
        super.d();
        bj.f(this.f7349a, this.i);
        if (this.h != 0) {
            d(this.h);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void E_() {
        super.E_();
        this.f.f = null;
        this.f.g = null;
    }

    private void d(int i) {
        Window window = f().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = i;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.wallet.ui.common.ah, com.google.android.wallet.ui.common.d, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("providerInstallerSucceeded", this.g);
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean a(j jVar) {
        return false;
    }

    @Override // com.google.android.wallet.ui.common.y
    public final boolean v() {
        return C() || D();
    }

    @Override // com.google.android.wallet.analytics.e
    public final f getUiElement() {
        return this.e;
    }

    @Override // com.google.android.wallet.analytics.e
    public final List<com.google.android.wallet.analytics.e> getChildren() {
        return null;
    }

    @Override // com.google.android.wallet.ui.common.ah
    public final List<ai> w() {
        return Collections.EMPTY_LIST;
    }

    public final com.google.b.a.a.a.b.a.apkg.dpkg.c x() {
        com.google.b.a.a.a.b.a.apkg.dpkg.c cVar = new com.google.b.a.a.a.b.a.apkg.dpkg.c();
        cVar.f7616a = ((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).f7614a.f7628a;
        cVar.f7617b = ((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).f7614a.c;
        if (C()) {
            cVar.c = this.c;
        } else if (D()) {
            cVar.d = this.f7350b;
        } else {
            throw new IllegalStateException("Unknown RedirectFormValue state.");
        }
        if (this.d != null && this.d.b()) {
            cVar.e = this.d.a();
        }
        return cVar;
    }

    @Override // com.google.android.wallet.d.g
    public final void a(String str, com.google.android.wallet.d.b bVar) {
        this.c = str;
        this.f7350b = null;
        this.d = bVar;
        a(8, Bundle.EMPTY);
    }

    @Override // com.google.android.wallet.d.g
    public final void b(String str, com.google.android.wallet.d.b bVar) {
        this.f7350b = str;
        this.c = null;
        this.d = bVar;
        a(8, Bundle.EMPTY);
    }

    @Override // com.google.android.wallet.d.g
    public final void y() {
        b(((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).j, 2);
    }

    private void b(String str, int i) {
        this.f7350b = null;
        this.c = null;
        this.d = null;
        a(5, com.google.android.wallet.common.util.e.a(new Bundle(), i, f_(com.google.android.wallet.instrumentmanager.g.wallet_im_error_title), str, null, null, f_(i == 501 ? com.google.android.wallet.instrumentmanager.g.wallet_uic_retry : R.string.ok)));
    }

    private boolean C() {
        return !TextUtils.isEmpty(this.c);
    }

    private boolean D() {
        return !TextUtils.isEmpty(this.f7350b);
    }

    @Override // com.google.android.gms.d.c
    public final void b() {
        this.g = true;
        b(true);
        this.f7349a.a(((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).f7615b, a(((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).c));
        e(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        Bundle bundle = new Bundle();
        bundle.putInt("FormEventListener.EXTRA_RESULT_CODE", 51);
        a(10, bundle);
    }

    @Override // android.support.v4.app.Fragment
    public final void a(int i, int i2, Intent intent) {
        if (i == 6000) {
            com.google.android.gms.d.a.a(f(), this);
        } else {
            super.a(i, i2, intent);
        }
    }

    private void e(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_TYPE", 776);
        bundle.putInt("FormEventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i);
        a(7, bundle);
    }

    private static String a(String str) {
        com.google.android.wallet.d.b bVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            bVar = new com.google.android.wallet.d.b("POST", str);
            e = null;
        } catch (IllegalArgumentException e) {
            e = e;
        }
        if (e == null && bVar != null && bVar.c()) {
            return bVar.a();
        }
        if (com.google.android.wallet.a.a.g.b().booleanValue()) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid initial post body: ".concat(valueOf) : new String("Invalid initial post body: "), e);
        }
        throw new IllegalArgumentException("Invalid initial post body.");
    }

    @Override // com.google.android.wallet.d.g
    public final void b(int i) {
        boolean z;
        switch (i) {
            case -8:
            case -6:
            case -1:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            b(((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).k, 501);
        } else {
            b(((com.google.b.a.a.a.b.a.apkg.dpkg.b) this.aw).l, 2);
        }
    }

    @Override // com.google.android.gms.d.c
    public final void a(int i) {
        if ("unknown".equals(Build.BOARD) && (("generic".equals(Build.BRAND) && "generic".equals(Build.DEVICE)) || ("generic_x86".equals(Build.BRAND) && ("generic_x86".equals(Build.DEVICE) || "Android".equals(Build.DEVICE))))) {
            b();
            return;
        }
        e(i);
        com.google.android.gms.common.b.a();
        if (com.google.android.gms.common.b.a(i)) {
            com.google.android.gms.common.c.a(i, f(), this, 6000, new c(this));
            com.google.android.wallet.common.bpkg.a.a.a(this, 1636);
        } else {
            E();
        }
    }
}
