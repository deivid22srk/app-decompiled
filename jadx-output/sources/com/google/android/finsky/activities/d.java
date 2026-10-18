package com.google.android.finsky.activities;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.protos.pw;
import com.google.android.finsky.receivers.FlushLogsReceiver;
import com.google.android.finsky.services.DailyHygiene;
import com.google.android.finsky.utils.ExternalReferrer;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.hi;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.ig;
import com.google.android.finsky.utils.jb;
import com.google.android.finsky.utils.jm;
import com.google.android.finsky.utils.jo;

/* loaded from: classes.dex */
public abstract class d extends android.support.v7.a.e implements aa {
    private static final boolean o;
    private static boolean v;
    boolean k;
    public boolean l;
    protected com.google.android.finsky.layout.actionbar.e n;
    private Runnable s;
    private final Handler p = new Handler(Looper.getMainLooper());
    private final com.google.android.finsky.receivers.ak q = new com.google.android.finsky.receivers.ak();
    private boolean r = false;
    private boolean t = false;
    boolean m = false;
    private boolean u = false;
    private final DialogInterface.OnClickListener w = new k(this);
    private final DialogInterface.OnClickListener x = new l(this);

    static /* synthetic */ boolean a(d dVar) {
        dVar.t = true;
        return true;
    }

    static /* synthetic */ boolean c(d dVar) {
        dVar.k = true;
        return true;
    }

    static {
        o = Build.VERSION.SDK_INT >= 14;
        v = false;
    }

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (com.google.android.finsky.safemode.a.b()) {
            super.onCreate(bundle);
            com.google.android.finsky.safemode.a.d();
            finish();
            return;
        }
        if (!getResources().getBoolean(R.bool.is_rtl_enabled)) {
            com.google.android.play.utils.j.c(this);
        }
        if (bundle != null) {
            this.k = bundle.getBoolean("waiting_for_user_input");
            String o2 = o();
            String string = bundle.getString("last_used_account");
            if (o2 == null) {
                bundle = null;
            } else if (string != null && !o2.equals(string)) {
                bundle = null;
            } else if (FinskyApp.a().f().c) {
                bundle = null;
            }
        }
        super.onCreate(bundle);
        w_();
        if (!ic.a(this)) {
            AccessRestrictedActivity.c(this);
            finish();
            return;
        }
        if (!v) {
            jo.a(new e(this));
        } else if (!this.k) {
            c(true);
        } else {
            FinskyLog.a("Waiting for user to return from auth screen.", new Object[0]);
        }
        v = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onStart() {
        super.onStart();
        com.google.android.finsky.receivers.ak.a();
        registerReceiver(this.q, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.l = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t
    public final void i_() {
        super.i_();
        this.l = false;
        if (!jm.a(this)) {
            t_();
        } else {
            z.a(d());
        }
        if (this.s != null) {
            this.s.run();
        } else {
            if (!this.r) {
                return;
            }
            this.r = false;
            c(true);
        }
    }

    protected final void t_() {
        z.a(d(), this);
    }

    @Override // com.google.android.finsky.activities.aa
    public final void u_() {
        finish();
    }

    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.l = true;
        bundle.putBoolean("waiting_for_user_input", this.k);
        bundle.putString("last_used_account", o());
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.a.ae, android.support.v4.app.t, android.app.Activity
    public void onStop() {
        super.onStop();
        unregisterReceiver(this.q);
        com.google.android.finsky.receivers.ak.a();
        this.l = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.t) {
            this.t = false;
            d(this.u);
        }
        FlushLogsReceiver.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onPause() {
        super.onPause();
        FlushLogsReceiver.a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onSearchRequested() {
        return v_() && super.onSearchRequested();
    }

    protected void a(VolleyError volleyError) {
    }

    @Override // android.support.v4.app.t, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        switch (i) {
            case 20:
                this.k = false;
                if (i2 == 0) {
                    finish();
                    break;
                } else {
                    this.r = true;
                    break;
                }
            case 21:
                this.k = false;
                if (com.google.android.finsky.api.a.b(this) == null) {
                    FinskyLog.a("No new account added: Assume the user canceled and finish.", new Object[0]);
                    finish();
                    break;
                } else {
                    this.r = true;
                    break;
                }
            case 22:
                if (i2 != 0) {
                    this.k = false;
                    this.r = true;
                    break;
                } else {
                    if (Build.VERSION.SDK_INT >= 14) {
                        startActivityForResult(AccountManager.newChooseAccountIntent(FinskyApp.a().i(), null, com.google.android.finsky.api.a.a(), true, null, "androidmarket", null, a((Context) this)), 23);
                    } else {
                        showDialog(0);
                    }
                    FinskyApp.a().h().b(310, null, null);
                    break;
                }
            case 23:
                if (i2 == -1 && (stringExtra = intent.getStringExtra("authAccount")) != null) {
                    FinskyLog.a("b/5160617: Switch account to %s on resume", FinskyLog.a(stringExtra));
                    a(stringExtra);
                    break;
                }
                break;
            case 24:
                if (i2 == -1) {
                    hi.a();
                    f(true);
                    break;
                } else {
                    finish();
                    break;
                }
            default:
                super.onActivityResult(i, i2, intent);
                break;
        }
    }

    public final void a(String str) {
        a(new p(this, str));
    }

    protected void i() {
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i, Bundle bundle) {
        int i2 = 0;
        switch (i) {
            case 0:
                Account[] a2 = com.google.android.finsky.api.a.a(getApplicationContext());
                String[] strArr = new String[a2.length];
                for (int i3 = 0; i3 < a2.length; i3++) {
                    strArr[i3] = a2[i3].name;
                }
                String j = FinskyApp.a().j();
                while (true) {
                    if (i2 < strArr.length) {
                        if (!strArr[i2].equals(j)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                com.google.android.wallet.ui.common.a aVar = new com.google.android.wallet.ui.common.a(this);
                aVar.a(getString(R.string.select_account));
                aVar.a(strArr, i2, new s(this, a2));
                t tVar = new t(this);
                if (aVar.f7468b != null) {
                    aVar.f7468b.setOnCancelListener(tVar);
                } else {
                    aVar.f7467a.f473a.p = tVar;
                }
                return aVar.a();
            case 1:
            default:
                throw new IllegalStateException("Invalid dialog type id " + i);
            case 2:
                Resources resources = getResources();
                com.google.android.wallet.ui.common.a aVar2 = new com.google.android.wallet.ui.common.a(this);
                com.google.android.wallet.ui.common.a b2 = aVar2.b(resources.getString(R.string.account_required)).a(false).a(resources.getString(R.string.yes), this.x).b(resources.getString(R.string.no), this.w);
                r rVar = new r(this);
                if (b2.f7468b != null) {
                    b2.f7468b.setOnKeyListener(rVar);
                } else {
                    b2.f7467a.a(rVar);
                }
                return aVar2.a();
        }
    }

    protected final void a(Intent intent) {
        super.onNewIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.t, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        boolean z = true;
        if ("android.intent.action.MAIN".equals(intent.getAction()) && intent.hasCategory("android.intent.category.LAUNCHER")) {
            z = false;
        }
        c(z);
    }

    public void b(boolean z) {
        this.m = false;
    }

    private String o() {
        String stringExtra = getIntent().getStringExtra("authAccount");
        if (stringExtra != null) {
            Account a2 = com.google.android.finsky.api.a.a(stringExtra, this);
            if (a2 == null) {
                FinskyLog.e("This app was called with an intent that specified the account %s, which is not a valid account on this device", stringExtra);
                finish();
                return null;
            }
            return a2.name;
        }
        String j = FinskyApp.a().j();
        if (com.google.android.finsky.api.a.b(j, this)) {
            return j;
        }
        Account b2 = com.google.android.finsky.api.a.b(this);
        if (b2 != null) {
            return b2.name;
        }
        return null;
    }

    public static boolean v_() {
        DfeToc dfeToc;
        String j = FinskyApp.a().j();
        return (j == null || (dfeToc = FinskyApp.a().g) == null || ig.a(j, dfeToc)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z) {
        FinskyApp.a().k.a();
        DailyHygiene.b();
        x_();
        this.p.post(new q(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(String str) {
        return !str.equals(FinskyApp.a().j());
    }

    protected final void w_() {
        ViewGroup viewGroup = (ViewGroup) getWindow().findViewById(R.id.content_frame);
        if (viewGroup != null) {
            viewGroup.findViewById(R.id.placeholder_loading).setVisibility(0);
        }
    }

    protected final void x_() {
        ViewGroup viewGroup = (ViewGroup) getWindow().findViewById(R.id.content_frame);
        if (viewGroup != null) {
            viewGroup.findViewById(R.id.placeholder_loading).setVisibility(8);
        }
    }

    protected final void c(boolean z) {
        String dataString;
        w_();
        this.m = true;
        String o2 = o();
        if (o2 == null) {
            if (o) {
                p();
            } else {
                showDialog(2);
            }
            if (z) {
                Intent intent = getIntent();
                if ("android.intent.action.VIEW".equals(intent.getAction()) && (dataString = intent.getDataString()) != null && !intent.getBooleanExtra("dont_resolve_again", false)) {
                    Uri a2 = com.google.android.finsky.e.d.a(Uri.parse(dataString));
                    FinskyApp.a().h().b(12, a2.toString(), null, ExternalReferrer.a(a2), null, null);
                    return;
                }
                return;
            }
            return;
        }
        if (c(o2)) {
            a(o2, z ? getIntent() : null);
            return;
        }
        com.google.android.finsky.d.a f = FinskyApp.a().f();
        if (!f.c) {
            e(z);
            return;
        }
        com.google.android.finsky.utils.bg.aU.a((com.google.android.finsky.c.o<Boolean>) false);
        f.c = false;
        FinskyApp.a().a(new u(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(boolean z) {
        jb.b(o());
        FinskyApp.a().g().a((Runnable) null);
        FinskyApp.a().s.a((Runnable) null);
        FinskyApp.a().p.a((Runnable) null);
        com.google.android.finsky.api.b b2 = FinskyApp.a().b((String) null);
        com.google.android.finsky.utils.cg.a(b2, true, new v(this, new boolean[1], b2.c(), z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z) {
        FinskyApp.a().a((Account) null).a(new f(this), new g(this), false);
        if (jb.d(o())) {
            boolean[] zArr = {true};
            h hVar = new h(this, zArr, z);
            jb.a(hVar);
            new Handler(getMainLooper()).postDelayed(new i(this, zArr, hVar, z), 10000L);
            return;
        }
        g(z);
    }

    protected void a(String str, Intent intent) {
        FinskyApp.a().h().a(406, (Integer) 0, (Integer) 0, (String) null);
        Account a2 = com.google.android.finsky.api.a.a(str, this);
        if (a2 == null) {
            throw new IllegalArgumentException(String.format("Error, could not switch to %s because the account could not be found on the device", FinskyLog.a(str)));
        }
        a(a2, intent, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        AccountManager.get(this).addAccount(com.google.android.finsky.api.a.a()[0], "androidmarket", null, a((Context) this), null, new m(this), null);
    }

    public static Bundle a(Context context) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("pendingIntent", PendingIntent.getBroadcast(context, 0, new Intent(), 0));
        bundle.putString("introMessage", context.getString(R.string.account_required_external));
        bundle.putBoolean("allowSkip", false);
        return bundle;
    }

    protected final void a(Runnable runnable) {
        if (!this.l) {
            runnable.run();
        } else {
            this.s = runnable;
        }
    }

    public final void y_() {
        a(new n(this));
    }

    protected static DfeToc a(pw pwVar) {
        return new DfeToc(pwVar);
    }

    protected final void a(Account account, Intent intent, boolean z) {
        this.s = null;
        if (account == null && (account = FinskyApp.a().i()) == null) {
            n();
            return;
        }
        FinskyApp a2 = FinskyApp.a();
        i();
        if (intent != null) {
            setIntent(intent);
        } else {
            Intent intent2 = new Intent(this, (Class<?>) MainActivity.class);
            intent2.setAction("android.intent.action.MAIN");
            setIntent(intent2);
        }
        if (z) {
            a2.a((Runnable) null);
        }
        a2.a((DfeToc) null);
        synchronized (a2.j) {
            a2.j.clear();
        }
        boolean z2 = a2.h == null || !a2.h.equals(account);
        a2.h = account;
        if (z2) {
            com.google.android.finsky.api.a.a(a2.h, com.google.android.finsky.utils.bg.f);
            a2.c.a();
            com.google.android.finsky.widget.s.a(a2);
        }
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z) {
        boolean z2 = true;
        String o2 = o();
        if (ig.a(o2, FinskyApp.a().g)) {
            this.k = true;
            Intent a2 = ig.a(this, o2, FinskyApp.a().g);
            a2.setFlags(67108864);
            startActivityForResult(a2, 20);
        } else {
            z2 = false;
        }
        if (z2) {
            return;
        }
        String o3 = o();
        if (!TextUtils.isEmpty(o3)) {
            com.google.android.finsky.utils.hats.k b2 = FinskyApp.a().a(o3).b();
            com.google.android.finsky.api.b b3 = FinskyApp.a().b(b2.c);
            if (b3 != null) {
                b3.g(new com.google.android.finsky.utils.hats.l(b2), new com.google.android.finsky.utils.hats.m(b2));
            }
        }
        j jVar = new j(this, z);
        FinskyApp.a().s.a(jVar);
        FinskyApp.a().p.a(jVar);
    }

    @TargetApi(11)
    protected final void n() {
        this.s = null;
        if (Build.VERSION.SDK_INT >= 11) {
            recreate();
            return;
        }
        finish();
        this.p.postDelayed(new o(this, getIntent()), 250L);
    }
}
