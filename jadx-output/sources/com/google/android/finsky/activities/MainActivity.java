package com.google.android.finsky.activities;

import android.accounts.Account;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.onboard.EntertainmentOnboardHostActivity;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.ButtonBar;
import com.google.android.finsky.layout.actionbar.FinskySearchToolbar;
import com.google.android.finsky.layout.play.FinskyDrawerLayout;
import com.google.android.finsky.layout.play.FinskyHeaderListLayout;
import com.google.android.finsky.navigationmanager.NavigationState;
import com.google.android.finsky.protos.kl;
import com.google.android.finsky.protos.pj;
import com.google.android.finsky.protos.qm;
import com.google.android.finsky.protos.qv;
import com.google.android.finsky.search.FinskySearch;
import com.google.android.finsky.uninstall.UninstallManagerActivity;
import com.google.android.finsky.utils.BgDataDisabledError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hats.HappinessSurveyController;
import com.google.android.finsky.utils.hs;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jb;
import com.google.android.play.search.PlaySearch;
import com.google.android.play.search.PlaySearchToolbar;
import com.google.android.play.utils.PlayCommonLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MainActivity extends d implements gp, com.google.android.finsky.e.t, com.google.android.finsky.layout.actionbar.c {
    private static boolean r;
    private com.google.android.play.drawer.n A;
    private com.google.android.gms.common.api.m B;
    private boolean C;
    public com.google.android.finsky.navigationmanager.b o;
    public ViewGroup p;
    public FinskyDrawerLayout q;
    private Bundle s;
    private int t;
    private HappinessSurveyController y;
    private com.google.android.finsky.utils.hats.e z;
    private int u = -1;
    private int v = -1;
    private final Handler w = new Handler();
    private com.google.android.finsky.layout.actionbar.d x = null;
    private final com.google.android.finsky.utils.ds D = new ee(this);
    private final Runnable E = new eg(this);

    public static Intent b(Context context) {
        return new Intent("com.google.android.finsky.VIEW_MY_DOWNLOADS").setClass(context, MainActivity.class);
    }

    public static Intent c(Context context) {
        return new Intent("com.google.android.finsky.VIEW_MY_DOWNLOADS").setClass(context, MainActivity.class).putExtra("trigger_update_all", true);
    }

    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (com.google.android.finsky.safemode.a.b()) {
            this.C = true;
            super.onCreate(bundle);
            finish();
            return;
        }
        if (bundle != null && E()) {
            bundle = null;
        }
        super.onCreate(bundle);
        setContentView(R.layout.main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.action_bar);
        if (toolbar instanceof FinskySearchToolbar) {
            ((FinskySearchToolbar) toolbar).a(new com.google.android.finsky.layout.actionbar.l(this));
        }
        a(toolbar);
        this.s = bundle;
        this.p = (ViewGroup) findViewById(R.id.content_frame);
        this.o = new com.google.android.finsky.navigationmanager.b(this);
        this.o.a(this);
        this.o.a(new eh(this));
        if (bundle != null) {
            com.google.android.finsky.navigationmanager.b bVar = this.o;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("nm_state");
            if (parcelableArrayList != null && parcelableArrayList.size() != 0 && bVar.f() != null) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    bVar.c.push((NavigationState) it.next());
                }
            }
            this.t = bundle.getInt("last_shown_error_hash");
        }
        if (!this.o.e()) {
            x_();
            G();
        }
        this.n = new com.google.android.finsky.layout.actionbar.e(this.o, this, this);
        this.q = (FinskyDrawerLayout) findViewById(R.id.drawer_layout);
        FinskyDrawerLayout finskyDrawerLayout = this.q;
        FinskyApp a2 = FinskyApp.a();
        if (ic.b(finskyDrawerLayout.getContext())) {
            finskyDrawerLayout.setIsMiniProfile(true);
        }
        int a3 = FinskySearchToolbar.a(this);
        boolean z = bundle != null && bundle.getBoolean("FinskyDrawerLayout.isAccountListExpanded", false);
        com.google.android.play.dfe.api.g c = a2.c();
        com.google.android.play.image.e eVar = a2.d;
        if (((com.google.android.play.drawer.r) finskyDrawerLayout).u) {
            PlayCommonLog.d("PlayDrawer is already configured", new Object[0]);
        }
        ((com.google.android.play.drawer.r) finskyDrawerLayout).u = true;
        finskyDrawerLayout.setActionBarHeight(a3);
        ((com.google.android.play.drawer.r) finskyDrawerLayout).s = new com.google.android.play.drawer.a(this, z, finskyDrawerLayout, c, eVar, finskyDrawerLayout, ((com.google.android.play.drawer.r) finskyDrawerLayout).p, ((com.google.android.play.drawer.r) finskyDrawerLayout).v);
        ((com.google.android.play.drawer.r) finskyDrawerLayout).p.setAdapter((ListAdapter) ((com.google.android.play.drawer.r) finskyDrawerLayout).s);
        String string = getString(com.google.android.play.m.play_drawer_title);
        int a4 = android.support.v4.view.v.a(8388611, android.support.v4.view.by.h(finskyDrawerLayout));
        if (a4 == 3) {
            finskyDrawerLayout.g = string;
        } else if (a4 == 5) {
            finskyDrawerLayout.h = string;
        }
        ((com.google.android.play.drawer.r) finskyDrawerLayout).t = new android.support.v7.a.f(this, finskyDrawerLayout, com.google.android.play.m.play_drawer_open, com.google.android.play.m.play_drawer_close);
        finskyDrawerLayout.setCurrentAvatarClickable(true);
        finskyDrawerLayout.n = this;
        finskyDrawerLayout.o = this.o;
        finskyDrawerLayout.e();
        finskyDrawerLayout.o.a(new com.google.android.finsky.layout.play.n(finskyDrawerLayout));
        finskyDrawerLayout.n.y();
        if (bundle != null && bundle.getBoolean("FinskyDrawerLayout.isDrawerOpened", false)) {
            finskyDrawerLayout.n.w();
        }
        android.support.v7.a.a a5 = f().a();
        this.A = new com.google.android.play.drawer.n(a5.f());
        a5.c(this.A);
        y();
        setDefaultKeyMode(3);
        com.google.android.gms.common.api.n nVar = new com.google.android.gms.common.api.n(this);
        com.google.android.gms.common.api.a<com.google.android.gms.people.o> aVar = com.google.android.gms.people.m.c;
        com.google.android.gms.people.p pVar = new com.google.android.gms.people.p();
        pVar.f6433a = 121;
        com.google.android.gms.common.internal.av.b(pVar.f6433a >= 0, "Must provide valid client application ID!");
        this.B = nVar.a((com.google.android.gms.common.api.a<com.google.android.gms.common.api.a<com.google.android.gms.people.o>>) aVar, (com.google.android.gms.common.api.a<com.google.android.gms.people.o>) new com.google.android.gms.people.o(pVar, (byte) 0)).b();
        if (!FinskyApp.a().e().a(12603396L) || !com.google.android.gms.common.c.g.a(14)) {
            return;
        }
        com.google.android.gms.googlehelp.e.f5819b = new com.google.android.gms.googlehelp.internal.common.ab(getApplicationContext());
        getApplication().registerActivityLifecycleCallbacks(com.google.android.gms.googlehelp.e.f5819b);
        com.google.android.gms.googlehelp.e.f5818a = true;
    }

    public final com.google.android.finsky.layout.actionbar.e o() {
        return this.n;
    }

    @Override // android.support.v4.app.t
    public final Object j_() {
        this.w.removeCallbacks(this.E);
        return super.j_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.q.n.y();
    }

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.MainActivity.B():void");
    }

    private boolean C() {
        FinskyApp a2 = FinskyApp.a();
        DfeToc dfeToc = a2.g;
        if (dfeToc != null && dfeToc.f1961a.J != 1) {
            com.google.android.finsky.d.d e = a2.e();
            if (e.a(12603210L) && Build.VERSION.SDK_INT >= 14 && dfeToc.b().size() > 2 && !com.google.android.finsky.utils.bg.aT.a().booleanValue()) {
                String j = FinskyApp.a().j();
                qv c = jb.c(j);
                if ((!e.a(12604043L)) && c != null && c.d != null) {
                    for (kl klVar : c.d.f4045a) {
                        if (klVar.f4044b && klVar.f4043a == 1) {
                            com.google.android.finsky.utils.bg.aT.a((com.google.android.finsky.c.o<Boolean>) true);
                            return false;
                        }
                    }
                }
                jb.g(j);
                startActivityForResult(EntertainmentOnboardHostActivity.a(this), 50);
                overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
                new com.google.android.finsky.api.model.e(a2.b((String) null), dfeToc.f1961a.l, new qm());
                com.google.android.finsky.utils.bg.aT.a((com.google.android.finsky.c.o<Boolean>) true);
                return true;
            }
            return false;
        }
        return false;
    }

    private void b(Intent intent) {
        PackageManager packageManager = getPackageManager();
        intent.setComponent(null);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        for (int i = 0; i < size; i++) {
            ActivityInfo activityInfo = queryIntentActivities.get(i).activityInfo;
            if (!activityInfo.packageName.equals(getPackageName())) {
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                startActivity(intent);
                finish();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d
    public final void b(boolean z) {
        int i;
        super.b(z);
        if (!hs.f4974a && com.google.android.finsky.c.d.dd.b().booleanValue()) {
            hs.f4974a = true;
            try {
                com.google.android.finsky.a.ag agVar = new com.google.android.finsky.a.ag();
                agVar.f1449a = com.google.android.finsky.utils.bg.t.a().booleanValue();
                agVar.f1450b = true;
                agVar.c = com.google.android.finsky.utils.bg.u.a().booleanValue();
                agVar.d = true;
                agVar.e = com.google.android.finsky.utils.bg.j.a().intValue();
                agVar.f = true;
                Account[] a2 = com.google.android.finsky.api.a.a(this);
                if (a2 != null) {
                    agVar.k = a2.length;
                    agVar.l = true;
                }
                NetworkInfo a3 = com.google.android.finsky.receivers.ak.a(this);
                if (a3 != null) {
                    agVar.g = a3.getType();
                    agVar.h = true;
                    agVar.i = a3.getSubtype();
                    agVar.j = true;
                }
                String j = FinskyApp.a().j();
                if (!TextUtils.isEmpty(j)) {
                    agVar.x = com.google.android.finsky.c.p.b(j);
                    agVar.y = true;
                }
                agVar.s = com.google.android.finsky.utils.bg.f4774b.a().intValue();
                agVar.t = true;
                if (Build.VERSION.SDK_INT >= 17) {
                    i = Settings.Global.getInt(FinskyApp.a().getContentResolver(), "install_non_market_apps", -1);
                } else {
                    i = Settings.Secure.getInt(FinskyApp.a().getContentResolver(), "install_non_market_apps", -1);
                }
                if (i == -1) {
                    FinskyLog.e("Couldn't obtain INSTALL_NON_MARKET_APPS value", new Object[0]);
                } else {
                    agVar.u = i != 0;
                    agVar.v = true;
                }
                com.google.android.finsky.a.al alVar = new com.google.android.finsky.a.al();
                Boolean a4 = com.google.android.finsky.utils.bg.G.b(j).a();
                if (a4 != null) {
                    alVar.f1459a = a4.booleanValue();
                    alVar.f1460b = true;
                }
                alVar.c = com.google.android.finsky.utils.bg.N.b(j).a().booleanValue();
                alVar.d = true;
                alVar.e = com.google.android.finsky.utils.bg.L.b(j).a().intValue();
                alVar.f = true;
                alVar.g = com.google.android.finsky.utils.bg.M.b(j).a().intValue();
                alVar.h = true;
                alVar.i = com.google.android.finsky.utils.bg.I.b(j).a().intValue();
                alVar.j = true;
                agVar.w = alVar;
                int identifier = getResources().getIdentifier("config_downloadDataDirSize", "integer", "android");
                if (identifier != 0) {
                    agVar.z = Resources.getSystem().getInteger(identifier);
                    agVar.A = true;
                }
                try {
                    agVar.B = Settings.Secure.getLong(FinskyApp.a().getContentResolver(), "download_manager_max_bytes_over_mobile");
                    agVar.C = true;
                } catch (Settings.SettingNotFoundException e) {
                }
                com.google.android.finsky.a.i h = FinskyApp.a().h();
                com.google.android.finsky.a.b bVar = new com.google.android.finsky.a.b(1);
                bVar.f1473a.s = agVar;
                h.b(bVar.f1473a);
            } catch (Exception e2) {
                FinskyLog.b(e2, "Fatal exception while logging session stats", new Object[0]);
            }
        }
        dj.a(this, FinskyApp.a().j());
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        String c = b2.c();
        long currentTimeMillis = System.currentTimeMillis();
        boolean c2 = com.google.android.finsky.billing.v.c(c);
        boolean d = com.google.android.finsky.billing.v.d(c);
        if (!c2 && !d) {
            FinskyLog.b("Not checking for valid FOP because relevant experiments are disabled. (account=%s)", FinskyLog.a(c));
        } else if (!com.google.android.finsky.billing.v.b(c, currentTimeMillis)) {
            if (c2 && com.google.android.finsky.billing.v.a(c, currentTimeMillis) && !d) {
                FinskyLog.b("Not checking for valid FOP because snoozed. (account=%s)", FinskyLog.a(c));
            } else {
                b2.b(new com.google.android.finsky.billing.w(c), new com.google.android.finsky.billing.x());
            }
        }
        if (z && (this.s == null || this.o.e() || this.o.f() == null)) {
            B();
        } else {
            D();
        }
        this.q.e();
        this.s = null;
        if (r) {
            return;
        }
        r = true;
        FinskyLog.a("Optimistically fetching billing countries.", new Object[0]);
        new Handler(Looper.getMainLooper()).postDelayed(new ei(this), com.google.android.finsky.c.d.O.b().intValue());
    }

    private void D() {
        if (!this.o.e() && E()) {
            FinskyApp.a().h().a(525, (byte[]) null);
            this.o.i();
            if (!C()) {
                this.o.a(FinskyApp.a().g);
            }
        }
    }

    private static boolean E() {
        return FinskyApp.a().e().a(742L) && com.google.android.finsky.utils.bg.ay.a().longValue() < System.currentTimeMillis() - com.google.android.finsky.c.d.ey.b().longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (this.s != null) {
            bundle.putAll(this.s);
        } else {
            com.google.android.finsky.navigationmanager.b bVar = this.o;
            if (bVar.c != null && !bVar.c.isEmpty()) {
                bundle.putParcelableArrayList("nm_state", new ArrayList<>(bVar.c));
            }
        }
        super.onSaveInstanceState(bundle);
        bundle.putInt("last_shown_error_hash", this.t);
        FinskyDrawerLayout finskyDrawerLayout = this.q;
        finskyDrawerLayout.f();
        bundle.putBoolean("FinskyDrawerLayout.isAccountListExpanded", ((com.google.android.play.drawer.r) finskyDrawerLayout).s.h);
        bundle.putBoolean("FinskyDrawerLayout.isDrawerOpened", finskyDrawerLayout.g());
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.navigationmanager.b g() {
        return this.o;
    }

    @Override // com.google.android.finsky.e.t
    public final void b_(String str) {
        this.n.a(str);
        com.google.android.finsky.e.q f = this.o.f();
        if (f != null) {
            int D = f.D();
            ViewGroup viewGroup = f.av;
            if (viewGroup instanceof FinskyHeaderListLayout) {
                FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) viewGroup;
                finskyHeaderListLayout.setActionBarTitleColor(D);
                int B = f.B();
                if (Color.alpha(B) > 0) {
                    finskyHeaderListLayout.setFloatingControlsBackground(new ColorDrawable(B));
                    return;
                }
                return;
            }
            FinskySearchToolbar finskySearchToolbar = (FinskySearchToolbar) findViewById(R.id.action_bar);
            if (finskySearchToolbar != null) {
                finskySearchToolbar.setTitleTextColor(D);
            }
        }
    }

    @Override // com.google.android.finsky.e.t
    public final void a(int i, boolean z) {
        this.n.a(i, z);
        this.q.b(i);
    }

    @Override // com.google.android.finsky.e.t
    public final void s_() {
        this.n.a(false, -1);
    }

    @Override // com.google.android.finsky.e.t
    public final void b(int i) {
        this.n.a(true, i);
    }

    @Override // com.google.android.finsky.e.t
    public final void c(int i) {
        this.n.a(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    @Override // com.google.android.finsky.e.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.finsky.e.q r9) {
        /*
            r8 = this;
            r1 = 0
            r0 = 1
            r2 = 0
            com.google.android.finsky.navigationmanager.b r3 = r8.o
            int r6 = r3.q()
            r3 = 2
            if (r6 != r3) goto L21
            r5 = r0
        Ld:
            r3 = 5
            if (r6 != r3) goto L23
            r4 = r0
        L11:
            r3 = 7
            if (r6 != r3) goto L25
            r3 = r0
        L15:
            r7 = 4
            if (r6 != r7) goto L27
        L18:
            if (r5 != 0) goto L29
            if (r4 != 0) goto L29
            if (r3 != 0) goto L29
            if (r0 != 0) goto L29
        L20:
            return
        L21:
            r5 = r2
            goto Ld
        L23:
            r4 = r2
            goto L11
        L25:
            r3 = r2
            goto L15
        L27:
            r0 = r2
            goto L18
        L29:
            com.google.android.finsky.navigationmanager.b r0 = r8.o
            com.google.android.finsky.FinskyApp r3 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.d.d r3 = r3.e()
            com.google.android.finsky.FinskyApp r4 = com.google.android.finsky.FinskyApp.a()
            com.google.android.finsky.d.d r4 = r4.e()
            boolean r0 = r0.t()
            if (r0 == 0) goto La1
            r6 = 745(0x2e9, double:3.68E-321)
            boolean r0 = r4.a(r6)
            if (r0 == 0) goto L82
            com.google.android.play.utils.b.a<java.lang.String> r0 = com.google.android.finsky.c.d.ea
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.google.android.finsky.utils.hats.h.a(r0)
            if (r0 == 0) goto L82
            com.google.android.play.utils.b.a<java.lang.String> r0 = com.google.android.finsky.c.d.ea
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
        L5f:
            if (r0 == 0) goto La3
        L61:
            com.google.android.finsky.utils.hats.HappinessSurveyController r1 = r8.y
            if (r1 == 0) goto L71
            com.google.android.finsky.utils.hats.HappinessSurveyController r1 = r8.y
            java.lang.String r1 = r1.getSiteId()
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L20
        L71:
            if (r9 == 0) goto L20
            if (r0 == 0) goto L20
            com.google.android.finsky.utils.hats.HappinessSurveyController r1 = new com.google.android.finsky.utils.hats.HappinessSurveyController
            r1.<init>(r9, r0, r2)
            r8.y = r1
            com.google.android.finsky.utils.hats.HappinessSurveyController r0 = r8.y
            r0.start()
            goto L20
        L82:
            r6 = 746(0x2ea, double:3.686E-321)
            boolean r0 = r4.a(r6)
            if (r0 == 0) goto La1
            com.google.android.play.utils.b.a<java.lang.String> r0 = com.google.android.finsky.c.d.eb
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.google.android.finsky.utils.hats.h.a(r0)
            if (r0 == 0) goto La1
            com.google.android.play.utils.b.a<java.lang.String> r0 = com.google.android.finsky.c.d.eb
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            goto L5f
        La1:
            r0 = r1
            goto L5f
        La3:
            r4 = 747(0x2eb, double:3.69E-321)
            boolean r0 = r3.a(r4)
            if (r0 == 0) goto Lc2
            com.google.android.play.utils.b.a<java.lang.String> r0 = com.google.android.finsky.c.d.dZ
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = com.google.android.finsky.utils.hats.h.a(r0)
            if (r0 == 0) goto Lc2
            com.google.android.play.utils.b.a<java.lang.String> r0 = com.google.android.finsky.c.d.dZ
            java.lang.Object r0 = r0.b()
            java.lang.String r0 = (java.lang.String) r0
            goto L61
        Lc2:
            r0 = r1
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.MainActivity.a(com.google.android.finsky.e.q):void");
    }

    @Override // com.google.android.finsky.e.t
    public final void a(pj pjVar) {
        View view;
        if (this.z == null) {
            this.z = new com.google.android.finsky.utils.hats.e(this, (ViewGroup) findViewById(R.id.outer_content_frame));
        }
        com.google.android.finsky.utils.hats.e eVar = this.z;
        if (eVar.f4940a == null || eVar.f4941b == null) {
            return;
        }
        FinskyApp a2 = FinskyApp.a();
        if (a2.a(a2.j()).b().f4946a) {
            return;
        }
        View findViewById = eVar.f4941b.findViewById(R.id.survey_prompt);
        if (findViewById == null) {
            view = LayoutInflater.from(eVar.f4940a).inflate(R.layout.survey_prompt_v2, eVar.f4941b, false);
            if (!eVar.f4940a.getResources().getBoolean(R.bool.stretch_happiness_survey_prompt)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                double b2 = ik.b(eVar.f4940a.getResources()) / ik.c(eVar.f4940a.getResources());
                eVar.f4940a.getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                layoutParams.width = (int) Math.min(b2 * 2.5d, r3.widthPixels);
                view.setLayoutParams(layoutParams);
            }
            ((ButtonBar) view.findViewById(R.id.button_bar)).setClickListener(new com.google.android.finsky.utils.hats.f(eVar));
            eVar.f4941b.addView(view);
        } else {
            view = findViewById;
        }
        if (!pjVar.equals(eVar.c)) {
            eVar.c = pjVar;
            ((TextView) view.findViewById(R.id.title)).setText(eVar.c.c.f4103a);
            ButtonBar buttonBar = (ButtonBar) view.findViewById(R.id.button_bar);
            buttonBar.setPositiveButtonTitle(eVar.c.c.c.toUpperCase());
            buttonBar.setNegativeButtonTitle(eVar.c.c.e.toUpperCase());
        }
        if (view.getVisibility() == 8) {
            view.setVisibility(0);
        }
        if (Build.VERSION.SDK_INT >= 11) {
            view.measure(View.MeasureSpec.makeMeasureSpec(eVar.f4941b.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(eVar.f4941b.getHeight(), Integer.MIN_VALUE));
            view.setTranslationY(view.getMeasuredHeight());
            ObjectAnimator.ofFloat(view, "translationY", 0.0f).start();
        }
        com.google.android.finsky.utils.hats.h.a(4, eVar.c.f4251a, -1, eVar.c.e);
    }

    @Override // com.google.android.finsky.e.t
    public final void m() {
        if (this.z != null) {
            this.z.a();
        }
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.layout.actionbar.c h() {
        return this;
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void p() {
        this.o.a(true);
        if (this.p.getPaddingTop() != 0) {
            android.support.v4.view.by.a(this.p, android.support.v4.view.by.n(this.p), 0, android.support.v4.view.by.o(this.p), this.p.getPaddingBottom());
        }
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void q() {
        this.o.a(false);
        int paddingTop = this.p.getPaddingTop();
        int max = Math.max(FinskySearchToolbar.a(this), f().a().b());
        if (paddingTop != max) {
            android.support.v4.view.by.a(this.p, android.support.v4.view.by.n(this.p), max, android.support.v4.view.by.o(this.p), this.p.getPaddingBottom());
        }
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void r() {
        this.o.b(true);
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void s() {
        this.o.b(false);
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    @TargetApi(11)
    public final void t() {
        this.n.a(1, (CharSequence) null);
        if (this.x != null) {
            this.x.z();
        }
        android.support.v4.view.by.a(this.p, 2, (Paint) null);
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    @TargetApi(11)
    public final void u() {
        com.google.android.finsky.layout.actionbar.e eVar = this.n;
        if (eVar.a((Integer) 1)) {
            eVar.d();
            eVar.a();
        } else {
            eVar.b((Integer) 1);
        }
        if (this.x != null) {
            this.x.A();
        }
        android.support.v4.view.by.a(this.p, 0, (Paint) null);
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void a(com.google.android.finsky.layout.actionbar.d dVar) {
        this.x = dVar;
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void a(CharSequence charSequence, hb hbVar) {
        this.q.setDrawerLockMode(1);
        com.google.android.finsky.layout.actionbar.e eVar = this.n;
        eVar.a(2, charSequence);
        eVar.c();
        eVar.m = hbVar;
        if (eVar.f3115b != null) {
            eVar.f.d(R.drawable.ic_collapse);
        }
        eVar.a();
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void v() {
        this.q.setDrawerLockMode(0);
        com.google.android.finsky.layout.actionbar.e eVar = this.n;
        if (eVar.f3115b != null) {
            eVar.f.d(0);
        }
        eVar.m = null;
        if (eVar.a((Integer) 2)) {
            eVar.d();
            eVar.a();
        } else {
            eVar.b((Integer) 2);
        }
    }

    @TargetApi(11)
    public final void w() {
        this.n.a(true);
        android.support.v4.view.by.a(this.p, 2, (Paint) null);
    }

    @TargetApi(11)
    public final void x() {
        this.n.a(false);
        android.support.v4.view.by.a(this.p, 0, (Paint) null);
    }

    @Override // com.google.android.finsky.e.t
    public final void j() {
        onBackPressed();
    }

    @Override // com.google.android.finsky.activities.d, android.support.v4.app.t, android.app.Activity
    protected void onResume() {
        super.onResume();
        FinskyApp.a().n.a(this.D);
        if (this.q != null) {
            this.q.n.y();
        }
        if (!((d) this).m) {
            D();
        }
    }

    @Override // com.google.android.finsky.activities.d, android.support.v4.app.t, android.app.Activity
    protected void onPause() {
        super.onPause();
        FinskyApp.a().n.a((com.google.android.finsky.utils.ds) null);
        this.u = FinskyApp.a().f1434a.f1251a.incrementAndGet();
        this.v = FinskyApp.a().e.f1251a.incrementAndGet();
        com.google.android.finsky.utils.bg.ay.a((com.google.android.finsky.c.o<Long>) Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.finsky.api.b a_(String str) {
        return FinskyApp.a().b(str);
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.play.image.e k() {
        return FinskyApp.a().d;
    }

    @Override // com.google.android.finsky.activities.d
    protected final void i() {
        FinskyApp.a().a(FinskyApp.a().f1434a.f1251a.incrementAndGet(), FinskyApp.a().e.f1251a.incrementAndGet());
        FinskyApp.a().a((Runnable) null);
        if (this.l) {
            FinskyLog.e("Should not be here after state was saved", new Object[0]);
            return;
        }
        if (this.o != null) {
            this.o.i();
            this.o.f3539b.b();
        }
        this.z = null;
        if (this.p != null) {
            int childCount = this.p.getChildCount();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.p.getChildAt(i);
                int id = childAt.getId();
                if (id != R.id.placeholder_loading && id != R.id.placeholder_error) {
                    arrayList.add(childAt);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.p.removeView((View) it.next());
            }
        }
        w_();
    }

    @Override // com.google.android.finsky.activities.d, android.support.v4.app.t, android.app.Activity
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        if (!this.l) {
            B();
            a(intent);
        } else {
            this.l = false;
            super.onNewIntent(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f3  */
    @Override // com.google.android.finsky.activities.d, android.support.v4.app.t, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.MainActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onDestroy() {
        if (this.C) {
            super.onDestroy();
            return;
        }
        this.o.f3538a = null;
        if (com.google.android.gms.googlehelp.e.f5818a && com.google.android.gms.googlehelp.e.f5818a) {
            com.google.android.gms.googlehelp.e.f5818a = false;
            com.google.android.gms.googlehelp.internal.common.ab abVar = com.google.android.gms.googlehelp.e.f5819b;
            com.google.android.gms.googlehelp.h.a(abVar.f5826a, new com.google.android.gms.googlehelp.internal.common.ae(abVar));
            getApplication().unregisterActivityLifecycleCallbacks(com.google.android.gms.googlehelp.e.f5819b);
        }
        super.onDestroy();
    }

    @Override // com.google.android.finsky.activities.d, android.support.v4.app.t, android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // com.google.android.finsky.activities.d, android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.w.post(this.E);
        if (this.u == -1) {
            this.u = FinskyApp.a().f1434a.f1251a.incrementAndGet();
        }
        if (this.v == -1) {
            this.v = FinskyApp.a().e.f1251a.incrementAndGet();
        }
        FinskyApp.a().a(this.u, this.v);
        this.u = -1;
        this.v = -1;
        this.B.d();
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onBackPressed() {
        if (this.q.g()) {
            this.q.h();
            return;
        }
        com.google.android.finsky.e.q f = this.o.f();
        if ((f == null || !f.G()) && !this.o.b()) {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.actions, menu);
        com.google.android.finsky.layout.actionbar.e eVar = this.n;
        eVar.k = menu.findItem(R.id.search_button);
        FinskySearchToolbar finskySearchToolbar = eVar.c;
        MenuItem findItem = menu.findItem(R.id.search_button);
        View a2 = android.support.v4.view.as.a(findItem);
        if (((PlaySearchToolbar) finskySearchToolbar).r == null && a2 != null && !(a2 instanceof PlaySearch)) {
            ((PlaySearchToolbar) finskySearchToolbar).r = a2;
        }
        if (((PlaySearchToolbar) finskySearchToolbar).s != null) {
            android.support.v4.view.as.a(((PlaySearchToolbar) finskySearchToolbar).s, (android.support.v4.view.n) null);
            android.support.v4.view.as.a(((PlaySearchToolbar) finskySearchToolbar).s, (android.support.v4.view.ay) null);
        }
        if (findItem != null) {
            android.support.v4.view.as.a(findItem, finskySearchToolbar.getActionProvider());
            android.support.v4.view.as.a(findItem, (android.support.v4.view.ay) finskySearchToolbar);
            if (((PlaySearchToolbar) finskySearchToolbar).t == R.id.search_button && !finskySearchToolbar.c()) {
                android.support.v4.view.as.b(findItem);
            }
        }
        ((PlaySearchToolbar) finskySearchToolbar).s = findItem;
        View a3 = android.support.v4.view.as.a(eVar.k);
        if (!(a3 instanceof FinskySearch)) {
            eVar.l = (SearchView) a3;
            eVar.l.setOnQueryTextFocusChangeListener(new com.google.android.finsky.layout.actionbar.i(eVar));
            eVar.l.setSearchableInfo(((SearchManager) getSystemService("search")).getSearchableInfo(getComponentName()));
        }
        eVar.i = menu.findItem(R.id.translate_button);
        eVar.h = menu.findItem(R.id.auto_update_button);
        eVar.j = menu.findItem(R.id.env_button);
        if (eVar.e == null) {
            a3.setVisibility(8);
            eVar.i.setVisible(false);
            eVar.h.setVisible(false);
            eVar.j.setVisible(false);
            if (!com.google.android.finsky.layout.actionbar.e.f3114a) {
                eVar.k.setVisible(false);
            }
        }
        eVar.g = true;
        eVar.b();
        eVar.e();
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                if (H()) {
                    FinskyDrawerLayout finskyDrawerLayout = this.q;
                    finskyDrawerLayout.f();
                    if (com.google.android.play.drawer.r.g(((com.google.android.play.drawer.r) finskyDrawerLayout).r)) {
                        finskyDrawerLayout.f(((com.google.android.play.drawer.r) finskyDrawerLayout).r);
                        return true;
                    }
                    finskyDrawerLayout.e(((com.google.android.play.drawer.r) finskyDrawerLayout).r);
                    return true;
                }
                this.q.h();
                com.google.android.finsky.e.q f = this.o.f();
                if ((f != null && f.G()) || this.o.a()) {
                    return true;
                }
                super.onBackPressed();
                return true;
            case R.id.translate_button /* 2131887333 */:
                com.google.android.finsky.layout.actionbar.e eVar = this.n;
                if (eVar.m == null) {
                    return true;
                }
                eVar.m.c();
                boolean b2 = eVar.m.b();
                FinskyApp.a().h().a(b2 ? 256 : 257, (byte[]) null, eVar.e.s());
                eVar.i.setTitle(b2 ? R.string.revert_translation : R.string.translate);
                return true;
            case R.id.auto_update_button /* 2131887334 */:
                com.google.android.finsky.layout.actionbar.e eVar2 = this.n;
                Document v = eVar2.e.v();
                if (v == null) {
                    FinskyLog.e("tried to operate on a null doc", new Object[0]);
                } else if (v.f1963a.g != 3) {
                    FinskyLog.e("tried to operate on a non-apps doc.", new Object[0]);
                } else {
                    String str = v.f1963a.f3890a;
                    boolean z = !com.google.android.finsky.utils.r.a(str);
                    android.support.v4.app.aa d = d();
                    com.google.android.finsky.b.a aVar = FinskyApp.a().s;
                    com.google.android.finsky.b.b a2 = FinskyApp.a().s.a(str);
                    boolean z2 = a2.d != null && a2.d.f2131b == 1;
                    aVar.f2060a.a(str, z ? 1 : 2);
                    if (z && !com.google.android.finsky.utils.bg.t.a().booleanValue()) {
                        new com.google.android.finsky.utils.s().a(d, "auto_update_dialog");
                    }
                    FinskyApp.a().h().b(new com.google.android.finsky.a.b(403).b(Integer.valueOf(z ? 1 : 0)).a(Integer.valueOf(z2 ? 1 : 0)).a(str).f1473a);
                }
                eVar2.f();
                return true;
            case R.id.env_button /* 2131887335 */:
                Toast.makeText(this, "Environment indicator (not visible externally)", 0).show();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean a(String str, String str2, int i, String str3) {
        com.google.android.finsky.b.y a2 = FinskyApp.a().v.a(str3);
        switch (i) {
            case 1:
                if (!(a2 != null && a2.d)) {
                    gn gnVar = new gn();
                    gnVar.a(R.string.install_parse_failed_mismatched_certificates).d(R.string.ok).e(R.string.uninstall);
                    Bundle bundle = new Bundle();
                    bundle.putString("error_package_name", str3);
                    gnVar.a(null, 32, bundle);
                    gnVar.b().a(d(), "mismatched_certificates");
                    return true;
                }
                a(str, str2, false);
                return true;
            case 2:
            default:
                a(str, str2, false);
                return true;
            case 3:
                if (FinskyApp.a().e().a(12603367L)) {
                    startActivity(UninstallManagerActivity.a(this.o.v()));
                    return true;
                }
                a(str, str2, false);
                return true;
        }
    }

    private void F() {
        gn gnVar = new gn();
        gnVar.a(null, 41, null).a(R.string.restart_required).d(R.string.ok).a(false);
        gnVar.b().a(d(), "restart_required");
    }

    @Override // com.google.android.finsky.e.t
    public final void a(String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2)) {
            if (this.l) {
                FinskyLog.d(str2, new Object[0]);
                return;
            } else {
                ch.a(d(), str, str2, z);
                return;
            }
        }
        FinskyLog.e("Unknown error with empty error message.", new Object[0]);
    }

    @Override // com.google.android.finsky.activities.d
    protected final void a(VolleyError volleyError) {
        Intent intent;
        if (!(volleyError instanceof AuthFailureError) || (intent = ((AuthFailureError) volleyError).f1194a) == null) {
            x_();
            if (volleyError instanceof BgDataDisabledError) {
                t_();
            } else {
                if (!this.o.e()) {
                    this.o.i();
                }
                String a2 = com.google.android.finsky.utils.aw.a(this, volleyError);
                View findViewById = findViewById(R.id.placeholder_error);
                findViewById.setVisibility(0);
                ((TextView) findViewById.findViewById(R.id.error_msg)).setText(a2);
                findViewById.findViewById(R.id.retry_button).setOnClickListener(new ef(this));
            }
            FinskyDrawerLayout finskyDrawerLayout = this.q;
            finskyDrawerLayout.f();
            if (com.google.android.play.drawer.r.g(((com.google.android.play.drawer.r) finskyDrawerLayout).r)) {
                return;
            }
            finskyDrawerLayout.e(((com.google.android.play.drawer.r) finskyDrawerLayout).r);
            return;
        }
        ((d) this).k = true;
        startActivityForResult(intent, 22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        findViewById(R.id.placeholder_error).setVisibility(8);
    }

    @Override // com.google.android.finsky.activities.gp
    public final void a(int i, Bundle bundle) {
        String string;
        switch (i) {
            case 32:
                break;
            case 33:
            case 34:
            case 35:
            case 39:
            case 43:
            case 44:
            case 45:
            case 46:
            default:
                if (this.o != null) {
                    com.google.android.finsky.navigationmanager.b bVar = this.o;
                    if (i == 1 && bundle != null && (string = bundle.getString("dialog_details_url")) != null && bVar.k()) {
                        bVar.a(string);
                        break;
                    }
                }
                break;
            case 36:
                y.a();
                com.google.android.finsky.utils.bg.t.a((com.google.android.finsky.c.o<Boolean>) true);
                com.google.android.finsky.autoupdate.p.a(FinskyApp.a().s, true, "cleanup");
                com.google.android.finsky.utils.bg.i.a((com.google.android.finsky.c.o<Boolean>) true);
                break;
            case 37:
                dj.b();
                break;
            case 38:
                new Handler().post(new ew(this.o));
                break;
            case 40:
                FinskyLog.a("Attempting to enable download manager", new Object[0]);
                getPackageManager().setApplicationEnabledSetting("com.android.providers.downloads", 1, 0);
                F();
                break;
            case 41:
                FinskyLog.a("Shutting down after download manager or gms core re-enabled", new Object[0]);
                System.exit(0);
                break;
            case 42:
                FinskyLog.a("Attempting to enable gms core", new Object[0]);
                getPackageManager().setApplicationEnabledSetting("com.google.android.gms", 1, 0);
                F();
                break;
            case 47:
                Intent intent = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                    break;
                }
                break;
            case 48:
                Intent intent2 = new Intent("android.settings.MEMORY_CARD_SETTINGS");
                if (intent2.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent2);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.finsky.activities.gp
    public final void b(int i, Bundle bundle) {
        switch (i) {
            case 32:
                FinskyApp.a().k.b(bundle.getString("error_package_name"), false);
                break;
            case 36:
                y.a();
                break;
            case 40:
                FinskyLog.a("Shutting down because download manager remains disabled", new Object[0]);
                System.exit(0);
                break;
            case 42:
                FinskyLog.a("Shutting down because gms core remains disabled", new Object[0]);
                System.exit(0);
                break;
        }
    }

    @Override // com.google.android.finsky.activities.d, android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        boolean z;
        if (!v_()) {
            return false;
        }
        com.google.android.finsky.layout.actionbar.e eVar = this.n;
        if (eVar.k != null) {
            if (android.support.v4.view.as.d(eVar.k)) {
                android.support.v4.view.as.c(eVar.k);
            } else {
                android.support.v4.view.as.b(eVar.k);
            }
            z = true;
        } else {
            z = false;
        }
        return z || super.onSearchRequested();
    }

    public final void c(String str) {
        Intent intent = new Intent(this, (Class<?>) SettingsActivity.class);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("setting-key-to-scroll", str);
        }
        startActivityForResult(intent, 31);
    }

    @Override // com.google.android.finsky.e.t
    public final com.google.android.gms.common.api.m l() {
        return this.B;
    }

    @Override // com.google.android.finsky.activities.d
    protected final void a(String str, Intent intent) {
        super.a(str, intent);
        if (this.n != null) {
            this.n.a(0, false);
        }
        if (this.q == null) {
            return;
        }
        this.q.b(0);
    }

    public final void y() {
        if (this.A != null) {
            boolean H = H();
            int i = H ? 0 : 1;
            com.google.android.play.drawer.n nVar = this.A;
            com.google.android.finsky.navigationmanager.b bVar = this.o;
            int size = bVar.c.size();
            nVar.a(i, size < 2 ? 0 : bVar.c.elementAt(size - 2).g);
            com.google.android.finsky.layout.actionbar.e eVar = this.n;
            if (eVar.c != null) {
                eVar.c.setIdleModeDrawerIconState(i);
            }
            android.support.v7.a.a a2 = f().a();
            if (H) {
                a2.b(this.q.g() ? R.string.play_drawer_close : R.string.play_drawer_open);
            } else {
                a2.b(0);
            }
        }
    }

    private boolean H() {
        int q = this.o.q();
        boolean z = q == 1 || q == 17 || q == 2 || q == 10 || q == 3 || q == 12 || q == 13 || q == 20;
        com.google.android.finsky.e.q f = this.o.f();
        if (q == 4 && (f instanceof gv)) {
            gv gvVar = (gv) f;
            if (gvVar.ax.a(gvVar.aA) != null) {
                return true;
            }
            return z;
        }
        return z;
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final Toolbar z() {
        return (Toolbar) findViewById(R.id.action_bar);
    }

    @Override // com.google.android.finsky.layout.actionbar.c
    public final void d(int i) {
        android.support.v7.a.a a2 = f().a();
        if (i == 0) {
            a2.c(this.A);
        } else {
            a2.a(i);
        }
    }
}
