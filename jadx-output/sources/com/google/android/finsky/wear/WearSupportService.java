package com.google.android.finsky.wear;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.jm;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class WearSupportService extends Service {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f5064a = new byte[0];
    private static int c = 0;
    private int d;
    private List<String> e;
    private com.google.android.gms.common.api.m f;
    private boolean g;
    private List<Runnable> h;
    private Handler i;
    private Handler j;
    private a k;
    private h l;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5065b = false;
    private boolean m = false;
    private List<Runnable> n = new ArrayList();
    private int o = 0;
    private int p = 0;

    static /* synthetic */ int a(WearSupportService wearSupportService) {
        int i = wearSupportService.p;
        wearSupportService.p = i - 1;
        return i;
    }

    static /* synthetic */ boolean f(WearSupportService wearSupportService) {
        wearSupportService.m = true;
        return true;
    }

    static /* synthetic */ com.google.android.gms.common.api.m h(WearSupportService wearSupportService) {
        wearSupportService.f = null;
        return null;
    }

    static /* synthetic */ int m(WearSupportService wearSupportService) {
        int i = wearSupportService.o;
        wearSupportService.o = i + 1;
        return i;
    }

    static /* synthetic */ int n(WearSupportService wearSupportService) {
        int i = wearSupportService.o;
        wearSupportService.o = i - 1;
        return i;
    }

    public static void a(Context context, String str, String str2) {
        if (!FinskyApp.a().e().a(12603948L)) {
            FinskyLog.a("disabled", new Object[0]);
            return;
        }
        if (!"hygiene_reason_retry".equals(str2)) {
            context.getApplicationContext().startService(b(context, str, str2));
            return;
        }
        FinskyApp a2 = FinskyApp.a();
        AlarmManager alarmManager = (AlarmManager) a2.getSystemService("alarm");
        long longValue = com.google.android.finsky.c.d.em.b().longValue() * c;
        if (longValue <= 0) {
            return;
        }
        FinskyLog.a("Scheduling hygiene retry for node %s in %d MS", str, Long.valueOf(longValue));
        alarmManager.set(3, longValue + SystemClock.elapsedRealtime(), PendingIntent.getService(a2, 0, b(a2, str, "hygiene_reason_node_request"), 0));
    }

    private static Intent b(Context context, String str, String str2) {
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) WearSupportService.class);
        intent.setData(Uri.parse("wearsupportservice://hygiene"));
        intent.putExtra("command", "hygiene");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("node_id", str);
        }
        intent.putExtra("hygiene_reason", str2);
        return intent;
    }

    public static void a(Context context, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        if (!FinskyApp.a().e().a(12603948L)) {
            FinskyLog.a("disabled", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) WearSupportService.class);
        intent.setData(Uri.parse("wearsupportservice://node_updates"));
        intent.putExtra("command", "node_updates");
        if (arrayList != null) {
            intent.putStringArrayListExtra("changed_uri_list", arrayList);
        }
        if (arrayList2 != null) {
            intent.putStringArrayListExtra("deleted_uri_list", arrayList2);
        }
        applicationContext.startService(intent);
    }

    public static void a(Context context, String str, String str2, boolean z) {
        if (!FinskyApp.a().e().a(12603948L)) {
            FinskyLog.a("disabled", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) WearSupportService.class);
        intent.setData(Uri.parse("wearsupportservice://package_broadcast/" + str2));
        intent.putExtra("command", "package_broadcast");
        intent.putExtra("node_id", str);
        intent.putExtra("package_name", str2);
        intent.putExtra("deleted", z);
        applicationContext.startService(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (Build.VERSION.SDK_INT < 18) {
            FinskyLog.a("Not supported on API %d device", Integer.valueOf(Build.VERSION.SDK_INT));
            stopSelf(i2);
            return 2;
        }
        this.p++;
        this.d = i2;
        ah ahVar = new ah(this, intent);
        FinskyApp.a().p.a(ahVar);
        if (this.f != null && this.g) {
            ahVar.run();
        } else {
            if (this.h == null) {
                this.h = new ArrayList(1);
            }
            this.h.add(ahVar);
            if (this.h.size() <= 1) {
                this.f = new com.google.android.gms.common.api.n(this).a(com.google.android.gms.wearable.aa.m).a(new bb(this)).a(new ba(this)).b();
                this.f.b();
            }
        }
        return 3;
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.l != null) {
            h hVar = this.l;
            hVar.d.b(hVar);
        }
    }

    private void c() {
        if (this.i == null) {
            this.i = new Handler(Looper.getMainLooper());
        }
        if (this.j == null) {
            HandlerThread handlerThread = new HandlerThread("wear-nodes-content-sync", 10);
            handlerThread.start();
            this.j = new Handler(handlerThread.getLooper());
        }
    }

    private void d() {
        c();
        if (this.k == null) {
            this.k = new a(this, this.f, this.i, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.p++;
        h hVar = this.l;
        aw awVar = new aw(this);
        hVar.d.a(hVar);
        jm.a(new k(hVar, awVar), new Void[0]);
    }

    private synchronized void c(String str) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(String str) {
        this.e.remove(str);
        if (this.e.isEmpty()) {
            this.f5065b = false;
        }
        b();
    }

    public final void a() {
        this.o--;
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        jm.a();
        if (this.p <= 0 && ((this.e == null || this.e.isEmpty()) && ((this.l == null || this.l.a()) && this.o <= 0))) {
            stopSelf(this.d);
        }
    }

    private void e(String str) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        this.p++;
        d();
        this.k.a(host, new ai(this, parse, host, str));
    }

    private static void f(String str) {
        FinskyApp a2 = FinskyApp.a();
        AlarmManager alarmManager = (AlarmManager) a2.getSystemService("alarm");
        long longValue = com.google.android.finsky.c.d.ek.b().longValue();
        if (longValue > 0) {
            FinskyLog.a("Scheduling hygiene for node %s in %d MS", str, Long.valueOf(longValue));
            alarmManager.set(3, longValue + SystemClock.elapsedRealtime(), PendingIntent.getService(a2, 0, b(a2, str, "hygiene_reason_new_node"), 0));
        }
    }

    public final synchronized void a(String str) {
        if (c >= com.google.android.finsky.c.d.el.b().intValue()) {
            FinskyLog.a("Max retry reached, giving up", new Object[0]);
        } else {
            c++;
            FinskyLog.a("Retrying hygiene for node %s, attempt %d", str, Integer.valueOf(c));
            com.google.android.gms.wearable.aa.c.a(this.f, str, "request_checkin", f5064a).a(new ak(this));
        }
    }

    static /* synthetic */ void a(WearSupportService wearSupportService, Intent intent) {
        String stringExtra = intent.getStringExtra("command");
        if (wearSupportService.f == null || !wearSupportService.g) {
            FinskyLog.a("Dropping command=%s due to Gms not connected", stringExtra);
            wearSupportService.stopSelf(wearSupportService.d);
        }
        if (stringExtra == null) {
            stringExtra = "";
        }
        switch (stringExtra) {
            case "hygiene":
                String stringExtra2 = intent.getStringExtra("hygiene_reason");
                FinskyLog.a("Received hygiene command %s", stringExtra2);
                if (!com.google.android.finsky.c.d.ee.b().booleanValue()) {
                    wearSupportService.stopSelf(wearSupportService.d);
                    break;
                } else if (wearSupportService.f5065b) {
                    FinskyLog.a("Hygiene already running, skip", new Object[0]);
                    if ("hygiene_reason_new_node".equals(stringExtra2)) {
                        f(intent.getStringExtra("node_id"));
                        break;
                    }
                } else {
                    wearSupportService.f5065b = true;
                    wearSupportService.p++;
                    d.g();
                    d.a(wearSupportService.f, new aq(wearSupportService));
                    break;
                }
                break;
            case "node_updates":
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("changed_uri_list");
                ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("deleted_uri_list");
                if (stringArrayListExtra2 != null) {
                    int size = stringArrayListExtra2.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayListExtra2.get(i);
                        FinskyLog.a("Handle delete %s", str);
                        wearSupportService.e(str);
                    }
                }
                if (stringArrayListExtra != null) {
                    int size2 = stringArrayListExtra.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        String str2 = stringArrayListExtra.get(i2);
                        FinskyLog.a("Handle change %s", str2);
                        wearSupportService.e(str2);
                    }
                }
                wearSupportService.b();
                break;
            case "package_broadcast":
                String stringExtra3 = intent.getStringExtra("node_id");
                String stringExtra4 = intent.getStringExtra("package_name");
                boolean booleanExtra = intent.getBooleanExtra("deleted", false);
                wearSupportService.p++;
                wearSupportService.d();
                d.a(wearSupportService.f, new al(wearSupportService, stringExtra3, stringExtra4, booleanExtra));
                break;
            default:
                FinskyLog.e("Unexpected command %s", stringExtra);
                wearSupportService.b();
                break;
        }
    }

    static /* synthetic */ void a(WearSupportService wearSupportService, String[] strArr) {
        if (strArr.length == 0) {
            wearSupportService.f5065b = false;
            wearSupportService.b();
            return;
        }
        wearSupportService.d();
        for (String str : strArr) {
            FinskyLog.a("Start daily hygiene for node %s", str);
            bh.a(132, null, null, 0, null, null, str);
            wearSupportService.c(str);
            wearSupportService.k.a(str, new at(wearSupportService, str));
        }
    }

    static /* synthetic */ void b(WearSupportService wearSupportService) {
        if (!FinskyApp.a().e().a(12605594L)) {
            FinskyLog.a("Wear zapp experiment disabled", new Object[0]);
            return;
        }
        FinskyLog.a("Checking pending zapp requests", new Object[0]);
        wearSupportService.o++;
        com.google.android.gms.wearable.aa.f6462a.a(wearSupportService.f, bi.f, 1).a(new ap(wearSupportService));
    }

    static /* synthetic */ void a(WearSupportService wearSupportService, Runnable runnable) {
        wearSupportService.d();
        if (wearSupportService.m) {
            wearSupportService.i.post(runnable);
            return;
        }
        wearSupportService.n.add(runnable);
        if (wearSupportService.n.size() == 1) {
            wearSupportService.l = new h(wearSupportService, wearSupportService.k, FinskyApp.a().p, FinskyApp.a().o, FinskyApp.a().l, wearSupportService.f);
            String[] f = d.f();
            int length = f.length;
            if (length == 0) {
                wearSupportService.e();
                return;
            }
            wearSupportService.p++;
            av avVar = new av(wearSupportService, length);
            for (String str : f) {
                wearSupportService.k.a(str, avVar);
            }
        }
    }

    static /* synthetic */ void a(WearSupportService wearSupportService, String str, int i, String str2) {
        wearSupportService.c();
        d c2 = d.c(str);
        z a2 = z.a(wearSupportService, str, wearSupportService.f);
        ag agVar = new ag(str);
        com.google.android.finsky.api.k b2 = ad.b(str);
        String str3 = c2.i;
        FinskyApp a3 = FinskyApp.a();
        com.google.android.finsky.b.c cVar = new com.google.android.finsky.b.c(a3.y, a3.p, a2, agVar, wearSupportService.i, wearSupportService.j, null, str3, str, b2);
        cVar.a(new ax(wearSupportService, cVar, str, i, str2));
    }

    static /* synthetic */ void b(WearSupportService wearSupportService, String str, int i, String str2) {
        FinskyApp a2 = FinskyApp.a();
        bc bcVar = new bc(wearSupportService, a2, str, a2.p, wearSupportService.k.a(str), ad.b(str), wearSupportService.l, i, str2);
        String[] d = jm.d(com.google.android.finsky.c.d.ei.b());
        az azVar = new az(wearSupportService, str);
        if (!ic.a(bcVar.f5112a)) {
            FinskyLog.a("Skip update checks for node %s because the store is invalid.", bcVar.f5113b);
            bc.a((bg) azVar, false);
            return;
        }
        Account i2 = FinskyApp.a().i();
        if (i2 == null) {
            bc.a((bg) azVar, false);
            return;
        }
        if (!bcVar.d.f2060a.b()) {
            FinskyLog.e("Require loaded app states to perform update check.", new Object[0]);
            bc.a((bg) azVar, false);
        } else if (!bcVar.c.a()) {
            FinskyLog.e("Require loaded libraries to perform update check.", new Object[0]);
            bc.a((bg) azVar, false);
        } else {
            new bd(bcVar, i2, bcVar.c.b(), azVar, d).execute(new Void[0]);
        }
    }

    static /* synthetic */ void i(WearSupportService wearSupportService) {
        int size = wearSupportService.h.size();
        for (int i = 0; i < size; i++) {
            wearSupportService.h.get(i).run();
        }
        wearSupportService.h.clear();
    }

    static /* synthetic */ void b(WearSupportService wearSupportService, String str) {
        if (d.h() && d.b(str)) {
            return;
        }
        d.g();
        wearSupportService.p++;
        d.a(wearSupportService.f, new aj(wearSupportService, str));
    }

    static /* synthetic */ void a(WearSupportService wearSupportService, Uri uri) {
        if (!FinskyApp.a().e().a(12605594L)) {
            FinskyLog.a("Wear zapp experiment disabled", new Object[0]);
            return;
        }
        String host = uri.getHost();
        String str = uri.getPathSegments().get(1);
        wearSupportService.p++;
        d.a(wearSupportService.f, new an(wearSupportService, uri, host, str));
    }

    static /* synthetic */ void b(String str) {
        FinskyLog.a("New node found %s", str);
        c = 0;
        f(str);
    }

    static /* synthetic */ void a(WearSupportService wearSupportService, com.google.android.gms.wearable.l lVar, String str, String str2) {
        com.google.android.gms.wearable.o a2 = com.google.android.gms.wearable.o.a(lVar.c());
        String f = a2.f("packageName");
        int d = a2.d("packageVersion");
        ArrayList<String> g = a2.g("moduleNames");
        FinskyLog.a("Processing zapp module request from node %s, request id %s, package %s ver %d", str, str2, f, Integer.valueOf(d));
        if (lVar == null) {
            throw new IllegalStateException("provided dataItem is null");
        }
        com.google.android.gms.wearable.p pVar = new com.google.android.gms.wearable.p(lVar);
        com.google.android.gms.wearable.y yVar = new com.google.android.gms.wearable.y(PutDataRequest.a(pVar.f6634a), pVar.f6635b);
        yVar.f6636a.a("phoneskyProcessed", true);
        com.google.android.gms.wearable.aa.f6462a.a(wearSupportService.f, yVar.a());
        v vVar = new v(wearSupportService, wearSupportService.f, str, str2);
        ad.a(vVar.f5155b).a(f, d, g, new w(vVar, f), new x(vVar, f));
    }
}
