package com.google.android.finsky.navigationmanager;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aa;
import android.support.v4.app.ap;
import android.support.v4.app.bb;
import android.support.v4.app.cz;
import android.text.TextUtils;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.activities.ReviewsActivity;
import com.google.android.finsky.activities.ScreenshotsActivity;
import com.google.android.finsky.activities.ScreenshotsActivityV2;
import com.google.android.finsky.activities.bpkg.ad;
import com.google.android.finsky.activities.bpkg.l;
import com.google.android.finsky.activities.bpkg.u;
import com.google.android.finsky.activities.bh;
import com.google.android.finsky.activities.ch;
import com.google.android.finsky.activities.ck;
import com.google.android.finsky.activities.di;
import com.google.android.finsky.activities.ep;
import com.google.android.finsky.activities.fu;
import com.google.android.finsky.activities.gv;
import com.google.android.finsky.activities.myapps.ac;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.api.s;
import com.google.android.finsky.billing.iab.m;
import com.google.android.finsky.billing.lightpurchase.LightPurchaseFlowActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseActivity;
import com.google.android.finsky.billing.lightpurchase.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.ah;
import com.google.android.finsky.billing.lightpurchase.billingprofile.instruments.RedeemCodeActivity;
import com.google.android.finsky.detailspage.w;
import com.google.android.finsky.detailspage.z;
import com.google.android.finsky.epkg.q;
import com.google.android.finsky.layout.play.cy;
import com.google.android.finsky.protos.bx;
import com.google.android.finsky.protos.jd;
import com.google.android.finsky.protos.nn;
import com.google.android.finsky.protos.no;
import com.google.android.finsky.protos.np;
import com.google.android.finsky.protos.pt;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.al;
import com.google.android.finsky.utils.au;
import com.google.android.finsky.utils.cp;
import com.google.android.finsky.utils.cr;
import com.google.android.finsky.utils.de;
import java.util.EmptyStackException;
import java.util.Stack;

/* loaded from: classes.dex */
public class b {
    private static final boolean d;

    /* renamed from: a, reason: collision with root package name */
    public MainActivity f3538a;

    /* renamed from: b, reason: collision with root package name */
    public aa f3539b;
    public final Stack<NavigationState> c = new de();
    private boolean e = false;

    static {
        d = Build.VERSION.SDK_INT >= 16;
    }

    public b(MainActivity mainActivity) {
        a(mainActivity);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 22;
    }

    private static Fragment a(Document document, String str, String str2, String str3, boolean z, View view) {
        return h() ? z.a(document, str, str2, str3, z, view) : w.a(document, str, str2, str3, z);
    }

    public final void i() {
        j();
        this.e = false;
    }

    public final void j() {
        this.c.removeAllElements();
        while (this.f3539b.e() > 0) {
            this.f3539b.d();
        }
    }

    public void a(MainActivity mainActivity) {
        this.f3538a = mainActivity;
        this.f3539b = this.f3538a.d();
    }

    public final boolean k() {
        return (this.f3538a == null || ((com.google.android.finsky.activities.d) this.f3538a).l) ? false : true;
    }

    public final void a(Uri uri, String str) {
        a(9, (String) null, com.google.android.finsky.epkg.d.a(uri, str), false, new View[0]);
    }

    public void a(DfeToc dfeToc) {
        if (dfeToc != null) {
            if (!k()) {
                this.f3538a.y_();
                return;
            }
            pw pwVar = dfeToc.f1961a;
            if (!a(dfeToc, 3)) {
                if (dfeToc.b().size() == 1) {
                    j();
                    pt ptVar = dfeToc.b().get(0);
                    a(2, ptVar.e, (Fragment) gv.a(ptVar.e, ptVar.c, ptVar.f4268a, dfeToc), true, new View[0]);
                    return;
                }
                a(dfeToc, dfeToc.f1961a.l);
            }
        }
    }

    public final void a(DfeToc dfeToc, String str) {
        int i;
        String string = this.f3538a.getString(R.string.launcher_name);
        if (str.equals(dfeToc.f1961a.n)) {
            i = 13;
        } else {
            if (TextUtils.isEmpty(dfeToc.f1961a.n)) {
                for (pt ptVar : dfeToc.b()) {
                    if (str.equals(ptVar.e)) {
                        i = ptVar.f4268a;
                        break;
                    }
                }
            }
            i = 3;
        }
        if (!a(dfeToc, i)) {
            j();
            a(1, str, (Fragment) gv.a(str, string, i, dfeToc), true, new View[0]);
        }
    }

    public final void a(String str, String str2, int i, DfeToc dfeToc) {
        if (k()) {
            a(2, str, (Fragment) gv.a(str, str2, i, dfeToc), false, new View[0]);
        }
    }

    public final void b(String str, String str2, int i, DfeToc dfeToc) {
        switch (i) {
            case 3:
            case 13:
                a(dfeToc, str);
                break;
            default:
                if (TextUtils.isEmpty(dfeToc.f1961a.n)) {
                    a(dfeToc, str);
                    break;
                } else {
                    a(str, str2, i, dfeToc);
                    break;
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.google.android.finsky.api.model.DfeToc r9, int r10) {
        /*
            r8 = this;
            r2 = 0
            r1 = 1
            java.util.List r0 = r9.b()
            int r0 = r0.size()
            if (r0 <= r1) goto L65
            r0 = r1
        Ld:
            boolean r3 = r8.x()
            if (r3 == 0) goto L6c
            if (r0 == 0) goto L6c
            com.google.android.finsky.epkg.q r0 = r8.f()
            com.google.android.finsky.activities.gv r0 = (com.google.android.finsky.activities.gv) r0
            com.google.android.finsky.api.model.e r3 = r0.f1784a
            if (r3 == 0) goto L6a
            com.google.android.finsky.layout.play.FinskyViewPager r3 = r0.c
            if (r3 == 0) goto L6a
            com.google.android.finsky.api.model.e r3 = r0.f1784a
            com.google.android.finsky.protos.ay r3 = r3.f1973a
            com.google.android.finsky.protos.az[] r4 = r3.e
            r3 = r2
        L2a:
            int r5 = r4.length
            if (r3 >= r5) goto L6a
            r5 = r4[r3]
            int r5 = r5.o
            if (r10 != r5) goto L67
            com.google.android.finsky.layout.ad r4 = r0.e
            com.google.android.finsky.activities.gr r5 = r0.d
            boolean r5 = r5.d
            android.view.View r6 = r4.i
            int[] r7 = r4.f3124b
            r6.getLocationOnScreen(r7)
            int[] r6 = r4.f3124b
            r6 = r6[r2]
            r4.l = r6
            if (r5 == 0) goto L53
            int r5 = r4.l
            android.view.View r6 = r4.i
            int r6 = r6.getWidth()
            int r5 = r5 + r6
            r4.l = r5
        L53:
            com.google.android.finsky.activities.gr r4 = r0.d
            int r3 = com.google.android.libraries.bind.bpkg.c.b(r4, r3)
            com.google.android.finsky.layout.play.FinskyViewPager r4 = r0.c
            r4.a(r3, r1)
            r0.a(r3, r1)
            r0 = r1
        L62:
            if (r0 == 0) goto L6c
        L64:
            return r1
        L65:
            r0 = r2
            goto Ld
        L67:
            int r3 = r3 + 1
            goto L2a
        L6a:
            r0 = r2
            goto L62
        L6c:
            r1 = r2
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.navigationmanager.b.a(com.google.android.finsky.api.model.DfeToc, int):boolean");
    }

    private boolean x() {
        int q = q();
        return (f() instanceof gv) && (q == 1 || q == 0);
    }

    public final void a(String str, DfeToc dfeToc) {
        if (k() && !TextUtils.isEmpty(dfeToc.f1961a.z)) {
            a(12, str, (Fragment) gv.a(str, FinskyApp.a().getString(R.string.side_drawer_social_home), 9, dfeToc), false, new View[0]);
        }
    }

    public void a(String str, String str2, int i, DfeToc dfeToc, cy cyVar) {
        if (k()) {
            FinskyApp.a().h().a(cyVar);
            if (str.equals(dfeToc.f1961a.z)) {
                a(str, dfeToc);
                return;
            }
            int i2 = 4;
            if (dfeToc != null && dfeToc.a(str) != null) {
                i2 = 2;
            }
            a(i2, str, (Fragment) gv.a(str, str2, i, dfeToc), false, new View[0]);
        }
    }

    public final void a(String str, no noVar) {
        String str2;
        String str3 = null;
        if (noVar != null) {
            str2 = !TextUtils.isEmpty(noVar.f4177a) ? noVar.f4177a : null;
            if (!TextUtils.isEmpty(noVar.c)) {
                str3 = noVar.c;
            }
        } else {
            str2 = null;
        }
        g().startActivityForResult(RedeemCodeActivity.a(str, 3, str2, str3), 34);
    }

    public final void l() {
        if (k()) {
            a(20, (String) null, (Fragment) com.google.android.finsky.activities.apkg.b.F_(), false, new View[0]);
        }
    }

    public final void a(np npVar, String str, int i, DfeToc dfeToc, cy cyVar, String str2) {
        PurchaseParams a2;
        if (k()) {
            FinskyApp.a().h().a(cyVar);
            if (!TextUtils.isEmpty(npVar.e)) {
                a(npVar.e, str, i, dfeToc, (cy) null);
                return;
            }
            if (!TextUtils.isEmpty(npVar.f4179a)) {
                a(npVar.f4179a);
                return;
            }
            if (npVar.m != null) {
                if (npVar.t.c == 11 && (a2 = m.a(FinskyApp.a().getBaseContext(), npVar.t, str2)) != null) {
                    this.f3538a.startActivity(PurchaseActivity.a(FinskyApp.a().i(), a2, (byte[]) null, (Bundle) null));
                    return;
                }
                ah a3 = PurchaseParams.a();
                a3.f2312b = npVar.m.c;
                a3.f2311a = npVar.t;
                a3.d = npVar.m.g;
                a3.i = str2;
                this.f3538a.startActivity(PurchaseActivity.a(FinskyApp.a().i(), a3.a(), (byte[]) null, (Bundle) null));
                return;
            }
            if (!TextUtils.isEmpty(npVar.n)) {
                a(dfeToc, npVar.n);
                return;
            }
            if (npVar.p != null) {
                a(FinskyApp.a().j(), npVar.p);
                return;
            }
            if (!TextUtils.isEmpty(npVar.g)) {
                a(npVar.g, npVar.y, npVar.w, (cy) null);
                return;
            }
            if (!TextUtils.isEmpty(npVar.k)) {
                n();
            } else if (npVar.s != null) {
                nn nnVar = npVar.s;
                if (TextUtils.isEmpty(nnVar.f4175a)) {
                    return;
                }
                cp.a(g(), nnVar.f4175a);
            }
        }
    }

    public final void a(jd jdVar, DfeToc dfeToc, PackageManager packageManager) {
        a(jdVar, (String) null, dfeToc, packageManager);
    }

    public final void a(jd jdVar, String str, DfeToc dfeToc, PackageManager packageManager) {
        a(jdVar, str, dfeToc, packageManager, (String) null);
    }

    public final void a(jd jdVar, String str, DfeToc dfeToc, PackageManager packageManager, String str2) {
        Activity g = g();
        if (jdVar.e != null) {
            a(jdVar.e, str, -1, dfeToc, (cy) null, str2);
            return;
        }
        if (jdVar.d) {
            int i = jdVar.c;
            if (!cr.a(packageManager, i)) {
                b(i);
                return;
            }
            if (!TextUtils.isEmpty(jdVar.f3988a)) {
                Intent a2 = cr.a(i, jdVar.f3988a, FinskyApp.a().j());
                if (!cr.b(i, a2)) {
                    b(i);
                    return;
                } else {
                    g.startActivity(a2);
                    return;
                }
            }
            g.startActivity(cr.a(g, i, FinskyApp.a().j()));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(jdVar.f3988a));
        g.startActivity(intent);
    }

    public final void a(Document document, String str, boolean z) {
        if (this.f3538a != null && !((com.google.android.finsky.activities.d) this.f3538a).l) {
            Intent a2 = ReviewsActivity.a(this.f3538a, document, str, z);
            q f = f();
            if (f != null) {
                f.a(a2, 45);
            } else {
                this.f3538a.startActivityForResult(a2, 45);
            }
        }
    }

    public final void a(DfeToc dfeToc, boolean z) {
        if (k()) {
            a(3, (String) null, (Fragment) ac.a(dfeToc, z), false, new View[0]);
        }
    }

    public final void m() {
        if (k()) {
            a(10, (String) null, (Fragment) com.google.android.finsky.activities.cpkg.a.N_(), false, new View[0]);
        }
    }

    public final void n() {
        if (FinskyApp.a().e().a(12605501L)) {
            a(0);
        } else if (k()) {
            a(13, (String) null, (Fragment) l.G_(), false, new View[0]);
        }
    }

    public final void a(int i) {
        Fragment J_;
        String str = null;
        int i2 = 15;
        if (!k()) {
            return;
        }
        DfeToc dfeToc = FinskyApp.a().g;
        switch (i) {
            case 0:
                J_ = com.google.android.finsky.activities.bpkg.q.J_();
                i2 = 13;
                break;
            case 1:
                str = com.google.android.finsky.api.b.j.toString();
                J_ = u.a(str, R.string.my_account_order_history_page_title, R.string.no_order_history, dfeToc, true);
                break;
            case 2:
                str = com.google.android.finsky.api.b.h.toString();
                J_ = u.a(str, R.string.my_account_subscriptions_page_title, R.string.no_subscriptions, dfeToc, false);
                break;
            case 3:
                str = com.google.android.finsky.api.b.i.toString();
                J_ = u.a(str, R.string.my_account_rewards_page_title, R.string.no_rewards, dfeToc, false);
                break;
            case 4:
                J_ = ad.K_();
                break;
            default:
                throw new IllegalArgumentException("Invalid my account page type: " + i);
        }
        a(i2, str, J_, false, new View[0]);
    }

    public final void o() {
        if (k()) {
            a(18, (String) null, (Fragment) ck.r_(), false, new View[0]);
        }
    }

    public final void a(String str, int i) {
        a(s.a(str, i), str, i, (cy) null);
    }

    public final void a(String str, String str2, int i, cy cyVar) {
        if (k()) {
            a(7, str, (Fragment) fu.a(str2, str, i), false, new View[0]);
            FinskyApp.a().h().a(cyVar);
        }
    }

    public final void p() {
        this.f3538a.c((String) null);
    }

    public final void b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.putExtra("com.android.browser.application_id", this.f3538a.getPackageName());
        this.f3538a.startActivity(intent);
    }

    public void a(String str) {
        if (k()) {
            a(6, str, (Fragment) al.a(str, (String) null, (String) null, (String) null), false, new View[0]);
        }
    }

    public void a(String str, String str2, String str3, String str4) {
        if (k()) {
            a(6, str, (Fragment) al.a(str, str2, str3, str4), false, new View[0]);
        }
    }

    public final void a(Document document, String str, String str2, String str3) {
        b(document, str, str2, str3, true, null);
    }

    private void b(Document document, String str, String str2, String str3, boolean z, View view) {
        if (!k()) {
        }
        int i = document.f1963a.e;
        if (document.f1963a.g == 2 && document.ai()) {
            a(5, str, a(document, str, (String) null, (String) null, false, view), z, view);
            return;
        }
        if (document.f1963a.g == 2 && document.ah()) {
            a(5, str, di.a(document, str), z, view);
            return;
        }
        switch (i) {
            case 1:
                String str4 = document.E().w;
                String j = FinskyApp.a().j();
                boolean z2 = !TextUtils.isEmpty(str3);
                String a2 = z2 ? str3 : com.google.android.finsky.activities.a.a(str4, j, FinskyApp.a().s, FinskyApp.a().p);
                if (z2 || !j.equals(a2)) {
                    FinskyLog.a("Selecting account %s for package %s. overriding=[%s]", FinskyLog.a(a2), str4, Boolean.valueOf(z2));
                }
                a(5, str, a(document, str, str2, a2, z2, view), z, view);
                break;
            case 7:
                Resources resources = this.f3538a.getResources();
                ch.a(this.f3538a.d(), resources.getString(R.string.error), resources.getString(R.string.unsupported_page), false);
                break;
            case 28:
                a(11, str, ep.a(document, str), z, view);
                break;
            default:
                a(5, str, a(document, str, str2, (String) null, false, view), z, view);
                break;
        }
    }

    public void b(String str, String str2, String str3, String str4) {
        a(str, str2, str3, str4);
    }

    public final void a(Document document, int i, boolean z) {
        a(document, i, 1, z);
    }

    public void a(Document document, int i, int i2, boolean z) {
        if (this.f3538a != null && !((com.google.android.finsky.activities.d) this.f3538a).l) {
            if (FinskyApp.a().e().a(12602819L)) {
                ScreenshotsActivityV2.a(this.f3538a, document, i, i2);
            } else {
                ScreenshotsActivity.a(this.f3538a, document, i, i2, z);
            }
        }
    }

    public final int q() {
        if (this.c.isEmpty()) {
            return 0;
        }
        return this.c.peek().f3536a;
    }

    public final boolean r() {
        int q = q();
        return q == 1 || q == 2 || q == 4;
    }

    public boolean b() {
        return c(true);
    }

    private boolean c(boolean z) {
        boolean z2;
        if (this.f3538a == null || ((com.google.android.finsky.activities.d) this.f3538a).l) {
            return false;
        }
        if (z) {
            FinskyApp.a().h().a(600, (byte[]) null, s());
        }
        if (!this.e) {
            z2 = false;
        } else if (this.c.size() == 1 && this.f3539b.e() == 1) {
            z2 = (x() && ((gv) f()).f1785b == 3) ? false : true;
        } else {
            z2 = false;
        }
        if (z2) {
            a(FinskyApp.a().g);
            return true;
        }
        try {
            FinskyLog.b();
            this.c.pop();
            this.f3539b.c();
            this.c.peek();
            return true;
        } catch (EmptyStackException e) {
            return false;
        }
    }

    public q f() {
        return (q) this.f3539b.a(R.id.content_frame);
    }

    public final cy s() {
        q f = f();
        if (f != null) {
            return f.F();
        }
        return null;
    }

    public final void b(int i) {
        a.a(this.f3538a, i, this.f3539b, null, 1);
    }

    public void a(Account account, Document document, boolean z) {
        if ((a.a(this.f3538a, account, document, this.f3539b, null, 1, null) ? false : true) && z) {
            this.f3538a.finish();
        }
    }

    public final View.OnClickListener a(Document document, cy cyVar) {
        return a(document, cyVar, (String) null, -1, (View) null);
    }

    public final View.OnClickListener a(Document document, cy cyVar, String str, int i, View view) {
        if (!b(document)) {
            return null;
        }
        if (document.i()) {
            if (document.j().e == null) {
                return new c(this, document, cyVar);
            }
            return new f(this, document.j().e, document, FinskyApp.a().g, cyVar, str, i);
        }
        if (document.m() && !TextUtils.isEmpty(document.f1963a.y.f3798a)) {
            return new d(this, document, cyVar);
        }
        return new e(this, document, view, cyVar);
    }

    public static boolean b(Document document) {
        return document.i() || document.ai() || !TextUtils.isEmpty(document.f1963a.D) || (document.m() && !TextUtils.isEmpty(document.f1963a.y.f3798a));
    }

    public final void a(int i, String str, Fragment fragment, boolean z, View... viewArr) {
        FinskyLog.b();
        ap a2 = this.f3539b.a();
        if (h()) {
            int length = viewArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                View view = viewArr[i2];
                String transitionName = view != null ? view.getTransitionName() : null;
                if (!TextUtils.isEmpty(transitionName)) {
                    a2.a(view, transitionName);
                }
            }
        }
        a2.a();
        a2.b(R.id.content_frame, fragment);
        if (z) {
            u();
        }
        NavigationState navigationState = new NavigationState(i, null, str);
        a2.a(navigationState.f3537b);
        this.c.push(navigationState);
        a2.b();
    }

    public final void a(boolean z) {
        if (!this.c.isEmpty()) {
            this.c.peek().d = z;
        }
    }

    public final boolean t() {
        int size = this.c.size();
        if (size < 2) {
            return false;
        }
        return this.c.elementAt(size - 2).e;
    }

    public final void b(boolean z) {
        if (!this.c.isEmpty()) {
            this.c.peek().f = z;
        }
    }

    public final void u() {
        if (!this.c.isEmpty()) {
            this.c.pop();
        }
        this.f3539b.c();
    }

    public final View.OnClickListener a(Account account, Document document, int i, au auVar, String str, int i2, cy cyVar) {
        return new g(this, i2, cyVar != null ? cyVar : s(), account, document, i, auVar, str);
    }

    public void a(Account account, Document document, int i, au auVar, String str, boolean z) {
        if (k()) {
            this.f3538a.startActivityForResult(LightPurchaseFlowActivity.a(account, document, null, i, auVar, document.f1963a.R, str, 0, null, z), 33);
        }
    }

    public final View.OnClickListener a(Document document, Account account, cy cyVar) {
        return new h(this, cyVar, account, document);
    }

    public final Document v() {
        q f;
        if (this.f3539b != null && (f = f()) != null && (f instanceof bh)) {
            return ((bh) f).f1612a;
        }
        return null;
    }

    public boolean a() {
        DfeToc dfeToc;
        int i;
        pt a2;
        int i2;
        int i3;
        Intent a3;
        if (this.f3538a == null || ((com.google.android.finsky.activities.d) this.f3538a).l || this.c.isEmpty()) {
            return true;
        }
        FinskyApp.a().h().a(602, (byte[]) null, s());
        DfeToc dfeToc2 = FinskyApp.a().g;
        if (d) {
            Document v = v();
            if (v == null) {
                i3 = -1;
            } else {
                i3 = v.f1963a.g;
            }
            if (dfeToc2 != null && i3 >= 0 && dfeToc2.a(i3) != null && i3 != 0 && i3 != 9) {
                a3 = cr.a(this.f3538a, v.f1963a.g, dfeToc2);
            } else {
                a3 = cr.a(this.f3538a);
            }
            if (bb.a(this.f3538a, a3)) {
                cz.a(this.f3538a).a(a3).a();
                android.support.v4.app.a.a(this.f3538a);
                return true;
            }
        }
        switch (this.c.peek().f3536a) {
            case 2:
            case 3:
            case 10:
            case 12:
            case 13:
            case 20:
                a(dfeToc2);
                break;
            case 4:
            case 7:
            case 8:
            case 11:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
                return c(false);
            case 5:
            case 6:
                if (this.f3538a != null && !((com.google.android.finsky.activities.d) this.f3538a).l && (dfeToc = FinskyApp.a().g) != null) {
                    while (!this.c.isEmpty() && ((i2 = this.c.peek().f3536a) == 5 || i2 == 6)) {
                        this.c.pop();
                    }
                    if (!this.c.isEmpty()) {
                        this.f3539b.a(this.c.peek().f3537b, 0);
                        break;
                    } else {
                        this.f3539b.a(this.f3539b.f().d(), 1);
                        Document v2 = v();
                        if (v2 != null && (a2 = dfeToc.a((i = v2.f1963a.g))) != null) {
                            b(a2.e, a2.c, i, dfeToc);
                            break;
                        } else {
                            a(dfeToc);
                            break;
                        }
                    }
                }
                break;
            case 17:
                a(dfeToc2);
                break;
        }
        return true;
    }

    public boolean c() {
        if (e() || this.c.size() == 0) {
            return false;
        }
        NavigationState peek = this.c.peek();
        if (peek.f3536a != 1 && peek.f3536a != 17) {
            if (peek.f3536a != 2) {
                return true;
            }
            DfeToc dfeToc = f().ax;
            if (dfeToc != null && dfeToc.b().size() > 1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void w() {
        if (!x()) {
            j();
        }
        this.e = true;
    }

    public void a(android.support.v4.app.ac acVar) {
        this.f3539b.a(acVar);
    }

    public final void b(android.support.v4.app.ac acVar) {
        this.f3539b.b(acVar);
    }

    public boolean e() {
        return this.f3539b.e() == 0;
    }

    public boolean d() {
        switch (q()) {
            case 8:
            case 14:
            case 19:
                return false;
            default:
                return true;
        }
    }

    public final void a(bx bxVar, com.google.android.finsky.api.b bVar, DfeToc dfeToc, PackageManager packageManager) {
        if (bxVar.f3657a != 1) {
            if (bxVar.f3657a == 2) {
                a(bxVar.h, dfeToc, packageManager);
                return;
            }
            return;
        }
        bVar.i(bxVar.f, new i(this), null);
    }

    public Activity g() {
        return this.f3538a;
    }

    public void a(Document document) {
        b(document, document.f1963a.D, null, null, false, null);
    }

    public void a(Document document, View view) {
        b(document, document.f1963a.D, null, null, false, view);
    }
}
