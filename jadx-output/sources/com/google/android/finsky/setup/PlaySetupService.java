package com.google.android.finsky.setup;

import android.accounts.Account;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.deivid22srk.store.setup.RestoreConfig;
import com.android.volley.a.ae;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.gk;
import com.google.android.finsky.protos.gz;
import com.google.android.finsky.protos.hb;
import com.google.android.finsky.protos.nu;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.protos.nw;
import com.google.android.finsky.protos.nx;
import com.google.android.finsky.services.RestoreService;
import com.google.android.finsky.services.VpaService;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.am;
import com.google.android.finsky.utils.bg;
import com.google.android.finsky.utils.ik;
import com.google.android.finsky.utils.jm;
import com.google.android.volley.DisplayMessageError;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class PlaySetupService extends Service implements com.google.android.finsky.installer.p {

    /* renamed from: a, reason: collision with root package name */
    private int f4637a;
    private Bundle c;
    private String d;
    private boolean f;
    private boolean g;

    /* renamed from: b, reason: collision with root package name */
    private int f4638b = 0;
    private Semaphore e = null;

    static /* synthetic */ int f(PlaySetupService playSetupService) {
        int i = playSetupService.f4638b;
        playSetupService.f4638b = i - 1;
        return i;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return new c(this);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f4637a = i2;
        this.f4638b++;
        FinskyApp.a().s.a(new d(this, intent));
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        jm.a();
        if (this.f4638b == 0 && this.d == null) {
            if (this.g) {
                FinskyApp.a().k.b(this);
                this.g = false;
            }
            stopSelf(this.f4637a);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        this.e = new Semaphore(1);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.g) {
            FinskyApp.a().k.b(this);
            this.g = false;
        }
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle c() {
        gk gkVar;
        Bundle bundle;
        int i;
        Bundle bundle2 = null;
        if (com.google.android.finsky.c.d.dV.b().booleanValue()) {
            jm.b();
            if (com.google.android.finsky.api.d.p.b().longValue() == 0) {
                FinskyLog.c("Unexpected android-id = 0", new Object[0]);
            }
            try {
                this.e.tryAcquire(com.google.android.finsky.c.d.dW.b().longValue(), TimeUnit.MILLISECONDS);
                this.e.release();
            } catch (InterruptedException e) {
                FinskyLog.e("Deadlocked - race condition longer than expected?", new Object[0]);
            }
            synchronized (this) {
                this.c = null;
            }
            try {
                gkVar = am.a().d();
            } catch (Exception e2) {
                FinskyLog.b(e2, "Exception while getting device configuration.", new Object[0]);
                gkVar = null;
            }
            com.google.android.finsky.api.b d = FinskyApp.a().d();
            ae a2 = ae.a();
            d.a(gkVar, a2, a2);
            hb hbVar = (hb) a(d, a2, "Error while loading early update");
            if (hbVar != null) {
                FinskyLog.a("Received EarlyUpdate with %d entries", Integer.valueOf(hbVar.f3898a.length));
                PackageManager packageManager = FinskyApp.a().getPackageManager();
                gz[] gzVarArr = hbVar.f3898a;
                int length = gzVarArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    gz gzVar = gzVarArr[i2];
                    String str = gzVar.f3894a.f3740a;
                    if (!bg.av.b(str).a().booleanValue()) {
                        try {
                            i = packageManager.getPackageInfo(str, 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e3) {
                            i = 0;
                        }
                        if (i < gzVar.d) {
                            i3++;
                            if (bundle2 == null) {
                                bundle = new Bundle();
                                bundle.putString("package_name", str);
                                bundle.putInt("version_code", gzVar.d);
                                bundle.putString("title", gzVar.f3895b);
                                bundle.putBoolean("critical", gzVar.h);
                                i2++;
                                i3 = i3;
                                bundle2 = bundle;
                            }
                        }
                    }
                    bundle = bundle2;
                    i2++;
                    i3 = i3;
                    bundle2 = bundle;
                }
                if (bundle2 != null) {
                    bundle2.putInt("package_count", i3);
                }
                synchronized (this) {
                    this.c = bundle2;
                }
            }
        }
        return bundle2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d() {
        if (!com.google.android.finsky.c.d.dV.b().booleanValue()) {
            FinskyLog.e("Canceled early-update when disabled", new Object[0]);
            return true;
        }
        FutureTask futureTask = new FutureTask(new e(this));
        new Handler(getMainLooper()).post(futureTask);
        try {
            return ((Boolean) futureTask.get()).booleanValue();
        } catch (InterruptedException e) {
            FinskyLog.b(e, "Canceler interrupted", new Object[0]);
            return true;
        } catch (ExecutionException e2) {
            FinskyLog.b(e2, "Canceler crashed", new Object[0]);
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.google.android.finsky.installer.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r7, int r8, int r9) {
        /*
            r6 = this;
            r5 = 2
            r0 = 0
            r1 = 1
            java.lang.String r2 = r6.d
            if (r2 == 0) goto Lf
            java.lang.String r2 = r6.d
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L10
        Lf:
            return
        L10:
            java.lang.String r2 = "EarlyUpdate %s: %s"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r0] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3[r1] = r4
            com.google.android.finsky.utils.FinskyLog.a(r2, r3)
            switch(r8) {
                case 0: goto L40;
                case 1: goto L53;
                case 2: goto L55;
                case 3: goto L57;
                case 4: goto L53;
                case 5: goto L63;
                case 6: goto L66;
                case 7: goto L68;
                case 8: goto L68;
                default: goto L22;
            }
        L22:
            r2 = r0
        L23:
            if (r0 == 0) goto L32
            com.google.android.finsky.c.n<java.lang.Boolean> r0 = com.google.android.finsky.utils.bg.av
            com.google.android.finsky.c.o r0 = r0.b(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.a(r1)
        L32:
            if (r2 == 0) goto Lf
            r0 = 0
            r6.d = r0
            java.util.concurrent.Semaphore r0 = r6.e
            r0.release()
            r6.b()
            goto Lf
        L40:
            java.util.concurrent.Semaphore r2 = r6.e
            boolean r2 = r2.tryAcquire()
            if (r2 != 0) goto L22
            java.lang.String r2 = "Couldn't acquire mutex for pending %s"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r0] = r7
            com.google.android.finsky.utils.FinskyLog.e(r2, r3)
            r2 = r0
            goto L23
        L53:
            r2 = r0
            goto L23
        L55:
            r2 = r1
            goto L23
        L57:
            monitor-enter(r6)
            boolean r2 = r6.f     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L5d
            r0 = r1
        L5d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L60
            r2 = r1
            goto L23
        L60:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L60
            throw r0
        L63:
            r0 = r1
            r2 = r1
            goto L23
        L66:
            r2 = r1
            goto L23
        L68:
            java.lang.String r2 = "EarlyUpdate %s: unexpected %d"
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r0] = r7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r3[r1] = r4
            com.google.android.finsky.utils.FinskyLog.e(r2, r3)
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.setup.PlaySetupService.a(java.lang.String, int, int):void");
    }

    private static <T> T a(com.google.android.finsky.api.b bVar, ae<T> aeVar, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            T t = aeVar.get();
            a(-1, null, bVar, elapsedRealtime);
            return t;
        } catch (InterruptedException e) {
            FinskyLog.e("%s, InterruptedException: %s", str, e.getMessage());
            a(1, e, bVar, elapsedRealtime);
            return null;
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            FinskyLog.d("%s: %s (%s)", str, cause, cause instanceof DisplayMessageError ? ((DisplayMessageError) cause).f7176a : null);
            a(1, cause, bVar, elapsedRealtime);
            return null;
        }
    }

    private static void a(int i, Throwable th, com.google.android.finsky.api.b bVar, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        com.google.android.finsky.a.y b2 = com.google.android.finsky.a.i.b();
        b2.f1511a = 125;
        b2.f1512b = true;
        if (i != -1) {
            b2.g = i;
            b2.h = true;
        }
        if (th != null) {
            b2.i = th.getClass().getSimpleName();
            b2.j = true;
        }
        if (j != 0) {
            b2.w = elapsedRealtime;
            b2.x = true;
        }
        FinskyApp.a().f(bVar.c()).b(b2);
    }

    private void e() {
        new Handler(getMainLooper()).post(new f(this));
    }

    static /* synthetic */ void b(PlaySetupService playSetupService) {
        Bundle bundle;
        if (!com.google.android.finsky.c.d.dV.b().booleanValue()) {
            FinskyLog.e("Started early-update when disabled", new Object[0]);
            return;
        }
        synchronized (playSetupService) {
            bundle = playSetupService.c;
        }
        if (bundle == null) {
            FinskyLog.e("Started early-update when no earlier response given", new Object[0]);
            return;
        }
        String string = bundle.getString("package_name");
        int i = bundle.getInt("version_code");
        String string2 = bundle.getString("title");
        boolean z = bundle.getBoolean("critical");
        Context applicationContext = playSetupService.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) PlaySetupService.class);
        intent.putExtra("package", string);
        intent.putExtra("version_code", i);
        intent.putExtra("title", string2);
        intent.putExtra("critical", z);
        intent.setData(Uri.parse("playsetupservice://earlyupdatepackage"));
        applicationContext.startService(intent);
    }

    static /* synthetic */ Bundle a(PlaySetupService playSetupService, String str) {
        nu[] nuVarArr;
        if (com.google.android.finsky.api.d.p.b().longValue() == 0) {
            FinskyLog.c("Unexpected android-id = 0", new Object[0]);
        }
        Account a2 = com.google.android.finsky.api.a.a(str, playSetupService);
        if (a2 == null) {
            FinskyLog.d("Received invalid account name: %s", FinskyLog.a(str));
            return null;
        }
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(a2.name);
        ae a3 = ae.a();
        b2.c(a3, a3);
        nw nwVar = (nw) a(b2, a3, "Unable to fetch backup devices");
        if (nwVar == null) {
            nuVarArr = null;
        } else {
            nuVarArr = nwVar.f4189a;
            FinskyLog.a("getBackupDeviceChoices returned with %d devices", Integer.valueOf(nuVarArr.length));
        }
        if (nuVarArr == null || nuVarArr.length == 0) {
            return null;
        }
        Intent a4 = SetupWizardRestoreAppsActivity.a(a2.name, nuVarArr);
        Bundle bundle = new Bundle();
        bundle.putParcelable("available_restore_intent", a4);
        return bundle;
    }

    static /* synthetic */ Bundle a(RestoreConfig restoreConfig) {
        if (com.google.android.finsky.api.d.p.b().longValue() == 0) {
            FinskyLog.c("Unexpected android-id = 0", new Object[0]);
        } else {
            Account[] accountArr = restoreConfig.c;
            if (accountArr == null || accountArr.length == 0) {
                FinskyLog.d("Received 0 accounts", new Object[0]);
            } else {
                Account account = accountArr[0];
                if (account == null) {
                    FinskyLog.d("Received null account", new Object[0]);
                } else {
                    ae a2 = ae.a();
                    com.google.android.finsky.api.b b2 = FinskyApp.a().b(account.name);
                    b2.a(restoreConfig.f1193b, a2, a2);
                    nx nxVar = (nx) a(b2, a2, "Unable to fetch backup apps");
                    if (nxVar != null) {
                        nv[] nvVarArr = nxVar.f4190a;
                        if (nvVarArr.length != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("available_restore_intent", RestoreAppsActivity.a(nvVarArr, account.name));
                            bundle.putInt("available_apps_count", nvVarArr.length);
                            return bundle;
                        }
                    }
                }
            }
        }
        return null;
    }

    static /* synthetic */ void a() {
        if (com.google.android.finsky.api.d.p.b().longValue() == 0) {
            FinskyLog.c("Unexpected android-id = 0", new Object[0]);
        }
        FinskyLog.a("Starting VPA", new Object[0]);
        VpaService.b();
    }

    static /* synthetic */ Bundle d(PlaySetupService playSetupService) {
        playSetupService.e();
        FinskyLog.a("Getting final hold flow", new Object[0]);
        Bundle bundle = new Bundle();
        if (!com.google.android.finsky.c.d.fC.b().booleanValue() && !ik.a() && VpaService.a()) {
            bundle.putParcelable("final_hold_intent", VpaSelectionActivity.a(FinskyApp.a().j()));
        } else if (VpaService.e() || RestoreService.a()) {
            bundle.putParcelable("final_hold_intent", SetupWizardFinalHoldActivity.a());
        }
        return bundle;
    }

    static /* synthetic */ void e(PlaySetupService playSetupService) {
        if (com.google.android.finsky.api.d.p.b().longValue() == 0) {
            FinskyLog.c("Unexpected android-id = 0", new Object[0]);
        }
        FinskyLog.a("Setup Wizard reports OK to begin downloading apps", new Object[0]);
        playSetupService.e();
        bg.aw.a((com.google.android.finsky.c.o<Boolean>) true);
    }

    static /* synthetic */ boolean a(PlaySetupService playSetupService, Intent intent) {
        if (intent.hasExtra("package") && intent.hasExtra("version_code") && intent.hasExtra("title")) {
            String stringExtra = intent.getStringExtra("package");
            int intExtra = intent.getIntExtra("version_code", 0);
            String stringExtra2 = intent.getStringExtra("title");
            boolean booleanExtra = intent.getBooleanExtra("critical", false);
            if (playSetupService.d != null) {
                FinskyLog.e("Received command to early-update %s while already handling %s", stringExtra, playSetupService.d);
            }
            playSetupService.d = stringExtra;
            playSetupService.f = booleanExtra;
            com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
            if (!playSetupService.g) {
                fVar.a(playSetupService);
                playSetupService.g = true;
            }
            fVar.a(stringExtra);
            fVar.a(stringExtra, false, false, false);
            fVar.f(stringExtra);
            fVar.a(stringExtra, intExtra, null, stringExtra2, false, "early-update", 1, null);
            return true;
        }
        FinskyLog.e("Unknown command intent %s", intent);
        return false;
    }
}
