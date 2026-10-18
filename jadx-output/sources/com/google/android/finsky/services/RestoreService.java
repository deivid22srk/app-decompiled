package com.google.android.finsky.services;

import android.accounts.Account;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.in;
import com.google.android.finsky.protos.nv;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.jm;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class RestoreService extends Service {

    /* renamed from: b, reason: collision with root package name */
    private static final Boolean f4554b = false;
    private static int[] c;
    private static RestoreService h;

    /* renamed from: a, reason: collision with root package name */
    at f4555a;
    private ay d;
    private int e;
    private boolean f;
    private boolean g;
    private int i;
    private int j;
    private int k;
    private int l;
    private com.google.android.finsky.installer.s m;
    private int n;
    private Map<String, com.google.android.play.image.j> o = new HashMap();

    static /* synthetic */ int c(RestoreService restoreService) {
        restoreService.i = 0;
        return 0;
    }

    static /* synthetic */ int d(RestoreService restoreService) {
        restoreService.j = 0;
        return 0;
    }

    static /* synthetic */ int e(RestoreService restoreService) {
        restoreService.k = 0;
        return 0;
    }

    static /* synthetic */ int f(RestoreService restoreService) {
        restoreService.l = 0;
        return 0;
    }

    public static void a(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) RestoreService.class);
        intent.putExtra("startup", true);
        intent.setData(Uri.parse("restoreservice://startup"));
        applicationContext.startService(intent);
    }

    public static void a(Context context, String str, String str2) {
        if (com.google.android.finsky.utils.bg.au.a().booleanValue()) {
            FinskyLog.a("Skipping restore for %s because directedRestoreStarted=true", FinskyLog.a(str2));
        } else {
            Context applicationContext = context.getApplicationContext();
            applicationContext.startService(b(str, str2, applicationContext));
        }
    }

    public static void a(Context context, String str, nv[] nvVarArr) {
        String[] strArr = new String[nvVarArr.length];
        int[] iArr = new int[nvVarArr.length];
        String[] strArr2 = new String[nvVarArr.length];
        int[] iArr2 = new int[nvVarArr.length];
        String[] strArr3 = new String[nvVarArr.length];
        in[] inVarArr = new in[nvVarArr.length];
        for (int i = 0; i < nvVarArr.length; i++) {
            nv nvVar = nvVarArr[i];
            strArr[i] = nvVar.f4187a.f3740a;
            iArr[i] = nvVar.d;
            strArr2[i] = nvVar.f4188b;
            iArr2[i] = 3;
            if (nvVar.h && nvVar.g < 100) {
                iArr2[i] = 1;
            }
            if (nvVar.f != null && nvVar.f.g && nvVar.f.m && nvVar.f.l) {
                strArr3[i] = nvVar.f.f;
            } else {
                strArr3[i] = null;
            }
            inVarArr[i] = nvVar.i;
        }
        a(context, true, str, true, strArr, iArr, strArr2, iArr2, null, strArr3, inVarArr, false);
    }

    public static void a(Context context, boolean z, String str, boolean z2, String[] strArr, int[] iArr, String[] strArr2, int[] iArr2, String[] strArr3, String[] strArr4, in[] inVarArr, boolean z3) {
        if (z) {
            com.google.android.finsky.utils.bg.au.a((com.google.android.finsky.c.o<Boolean>) true);
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) RestoreService.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("visible", z2);
        intent.putExtra("array_packages", strArr);
        intent.putExtra("array_version_codes", iArr);
        intent.putExtra("array_titles", strArr2);
        intent.putExtra("array_priorities", iArr2);
        intent.putExtra("is_vpa", z3);
        if (strArr3 != null) {
            intent.putExtra("array_delivery_tokens", strArr3);
        }
        intent.putExtra("array_app_icon_urls", strArr4);
        intent.putExtra("install_details", ParcelableProtoArray.a(inVarArr));
        intent.setData(Uri.parse("restoreservice://restorepackages"));
        applicationContext.startService(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent b(String str, String str2, Context context) {
        Intent intent = new Intent(context, (Class<?>) RestoreService.class);
        intent.putExtra("aid", str);
        intent.putExtra("authAccount", str2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("restoreservice").appendPath("restoreaccount").appendPath(str);
        if (!TextUtils.isEmpty(str2)) {
            builder.appendPath(str2);
        }
        intent.setData(builder.build());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) RestoreService.class);
        intent.putExtra("kick_installer", true);
        intent.setData(Uri.parse("restoreservice://kick"));
        return intent;
    }

    @Override // android.app.Service
    public void onCreate() {
        h = this;
        this.f4555a = new at(this);
        this.m = com.google.android.finsky.installer.u.f2871a;
        this.n = this.m.a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.f) {
            FinskyApp.a().k.b(this.f4555a);
        }
        this.f4555a = null;
        a(1, (String) null, false);
        h = null;
    }

    public static void b(Context context) {
        try {
            File[] listFiles = context.getDir("RestoreTracker", 0).listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    file.delete();
                }
            }
        } catch (Exception e) {
            FinskyLog.c("Error while cleaning stores: %s", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(int i) {
        if (c == null) {
            String[] d = jm.d(com.google.android.finsky.c.d.bL.b());
            c = new int[d.length];
            for (int i2 = 0; i2 < d.length; i2++) {
                try {
                    c[i2] = Integer.valueOf(d[i2]).intValue();
                } catch (NumberFormatException e) {
                    c[i2] = Integer.MIN_VALUE;
                }
            }
        }
        for (int i3 = 0; i3 < c.length; i3++) {
            if (i == c[i3]) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.e = i2;
        this.f4555a.f++;
        al alVar = new al(this, intent);
        at atVar = this.f4555a;
        Context applicationContext = getApplicationContext();
        if (atVar.f4594a == null) {
            atVar.f4594a = new com.google.android.finsky.utils.b.c(new com.google.android.finsky.utils.b.a(applicationContext.getDir("RestoreTracker", 0), "account-"));
            atVar.f4594a.a(new au(atVar, alVar));
        } else {
            atVar.f4594a.a(alVar);
        }
        at atVar2 = this.f4555a;
        Context applicationContext2 = getApplicationContext();
        if (atVar2.f4595b == null) {
            atVar2.f4595b = new com.google.android.finsky.utils.b.c(new com.google.android.finsky.utils.b.a(applicationContext2.getDir("RestoreTracker", 0), "package-"));
            atVar2.f4595b.a(new av(atVar2, alVar));
        } else {
            atVar2.f4595b.a(alVar);
        }
        FinskyApp.a().p.a(alVar);
        FinskyApp.a().s.a(alVar);
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Intent intent) {
        int i;
        boolean z;
        if (intent.getBooleanExtra("startup", false)) {
            return b();
        }
        if (intent.getBooleanExtra("kick_installer", false)) {
            FinskyApp.a().k.a();
            return false;
        }
        if (!intent.hasExtra("package")) {
            if (intent.hasExtra("array_packages")) {
                String stringExtra = intent.getStringExtra("authAccount");
                boolean booleanExtra = intent.getBooleanExtra("visible", false);
                String[] stringArrayExtra = intent.getStringArrayExtra("array_packages");
                int[] intArrayExtra = intent.getIntArrayExtra("array_version_codes");
                String[] stringArrayExtra2 = intent.getStringArrayExtra("array_titles");
                int[] intArrayExtra2 = intent.getIntArrayExtra("array_priorities");
                String[] stringArrayExtra3 = intent.getStringArrayExtra("array_delivery_tokens");
                String[] stringArrayExtra4 = intent.getStringArrayExtra("array_app_icon_urls");
                in[] inVarArr = (in[]) ParcelableProtoArray.a(intent, "install_details");
                boolean booleanExtra2 = intent.getBooleanExtra("is_vpa", false);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    i = i2;
                    if (i4 >= stringArrayExtra.length) {
                        break;
                    }
                    String str = stringArrayExtra3 != null ? stringArrayExtra3[i4] : null;
                    String str2 = stringArrayExtra[i4];
                    int i5 = intArrayExtra[i4];
                    String str3 = stringArrayExtra2[i4];
                    int i6 = intArrayExtra2[i4];
                    String str4 = stringArrayExtra4[i4];
                    in inVar = inVarArr != null ? inVarArr[i4] : null;
                    com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
                    if (!a(str2, i5, stringExtra, fVar)) {
                        z = false;
                    } else {
                        this.f4555a.a(str2, i5, stringExtra, str3, i6, str, booleanExtra, str4, booleanExtra2, inVar);
                        fVar.a(str2, com.google.android.finsky.c.d.eI.b().booleanValue(), false, false);
                        if (!TextUtils.isEmpty(str)) {
                            fVar.b(str2, str);
                        }
                        fVar.a(str2, i5, stringExtra, str3, true, booleanExtra2 ? "restore_vpa" : "restore", i6, inVar);
                        if (!TextUtils.isEmpty(str4)) {
                            b(str2, str4);
                        }
                        z = true;
                    }
                    i2 = z ? i + 1 : i;
                    i3 = i4 + 1;
                }
                FinskyLog.a("Start restore of %d packages (%d skipped) for acct:%s", Integer.valueOf(stringArrayExtra.length), Integer.valueOf(stringArrayExtra.length - i), FinskyLog.a(stringExtra));
                if (i > 0) {
                    if (com.google.android.finsky.utils.bg.aw.a().booleanValue()) {
                        FinskyApp.a().k.a();
                    } else {
                        a(d(getApplicationContext()), com.google.android.finsky.c.d.bF.b().longValue());
                    }
                }
                at.a(this.f4555a);
                return false;
            }
            String stringExtra2 = intent.getStringExtra("aid");
            if (TextUtils.isEmpty(stringExtra2)) {
                FinskyLog.d("Expecting a non-empty aid extra", new Object[0]);
                return false;
            }
            if (f4554b.booleanValue() && stringExtra2.equals("self")) {
                stringExtra2 = Long.toHexString(com.google.android.finsky.api.d.p.b().longValue());
                FinskyLog.a("Using own current android-id %s for test restore", stringExtra2);
            }
            String str5 = stringExtra2;
            try {
                Long.parseLong(str5, 16);
                String stringExtra3 = intent.getStringExtra("authAccount");
                if (stringExtra3 != null) {
                    if (com.google.android.finsky.api.a.a(stringExtra3, FinskyApp.a()) == null) {
                        FinskyLog.d("Can't find restore acct:%s", FinskyLog.a(stringExtra3));
                        return false;
                    }
                    a(str5, stringExtra3);
                } else {
                    Account[] a2 = com.google.android.finsky.api.a.a(this);
                    if (a2.length <= 0) {
                        FinskyLog.d("RestoreService can't run - no accounts configured on device!", new Object[0]);
                        return false;
                    }
                    for (Account account : a2) {
                        a(str5, account.name);
                    }
                }
                return true;
            } catch (NumberFormatException e) {
                FinskyLog.d("Provided aid can't be parsed as long", new Object[0]);
                return false;
            }
        }
        String stringExtra4 = intent.getStringExtra("package");
        if (jm.a(FinskyApp.a().k.i(stringExtra4))) {
            return true;
        }
        return a(stringExtra4);
    }

    private boolean a(String str) {
        com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
        this.f4555a.d.get(str);
        if (this.f4555a.c(str)) {
            ar arVar = this.f4555a.d.get(str);
            if (a(str, arVar.f4591b, arVar.c, fVar)) {
                this.f4555a.a(str, arVar.f4591b, arVar.c, arVar.d, arVar.e, arVar.f, arVar.g, arVar.h, arVar.j, arVar.k);
                fVar.a(str, com.google.android.finsky.c.d.eI.b().booleanValue(), false, false);
                if (!TextUtils.isEmpty(arVar.f)) {
                    fVar.b(str, arVar.f);
                }
                fVar.a(str, arVar.f4591b, arVar.c, arVar.d, false, arVar.j ? "restore_vpa" : "restore", arVar.e, arVar.k);
                if (!TextUtils.isEmpty(arVar.h)) {
                    b(str, arVar.h);
                }
                return true;
            }
            this.f4555a.b(str);
            return false;
        }
        this.f4555a.b(str);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long a(Intent intent, long j) {
        if (TextUtils.isEmpty(intent.getDataString())) {
            throw new IllegalArgumentException("Alarm intent needs data URI");
        }
        Context applicationContext = getApplicationContext();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        long currentTimeMillis = System.currentTimeMillis() + j;
        alarmManager.set(0, currentTimeMillis, PendingIntent.getService(applicationContext, 0, intent, 0));
        return currentTimeMillis;
    }

    private void a(String str, String str2) {
        ap apVar = this.f4555a.c.get(str2);
        if (apVar != null && apVar.c) {
            FinskyLog.a("Skip restore acct:%s already started", FinskyLog.a(str2));
            return;
        }
        try {
            long parseLong = Long.parseLong(str, 16);
            FinskyLog.a("Start restore aid:%s acct:%s", FinskyLog.a(str), FinskyLog.a(str2));
            at atVar = this.f4555a;
            ap apVar2 = atVar.c.get(str2);
            if (apVar2 == null) {
                apVar2 = new ap((byte) 0);
                apVar2.f4586a = 0;
                atVar.c.put(str2, apVar2);
            }
            apVar2.f4586a++;
            apVar2.f4587b = str;
            apVar2.c = true;
            atVar.a(str2);
            FinskyApp.a().b(str2).a(parseLong, new as(this, str2), new am(this, str2, str));
        } catch (NumberFormatException e) {
            FinskyLog.d("Provided aid can't be parsed as long: %s", FinskyLog.a(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str, int i, String str2, com.google.android.finsky.receivers.f fVar) {
        com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
        nVar.f1490a = i;
        nVar.f1491b = true;
        if (this.f4555a.d.get(str) != null && !this.f4555a.c(str)) {
            this.l++;
            FinskyApp.a().h().a(113, str, "retry-expired", 0, (String) null, nVar);
            return false;
        }
        ar arVar = this.f4555a.d.get(str);
        if (arVar != null && !str2.equals(arVar.c)) {
            this.j++;
            FinskyApp.a().h().a(113, str, "other-account", 0, (String) null, nVar);
            FinskyLog.a("Skipping restore of %s v:%d because already restoring for another account", str, Integer.valueOf(i));
            return false;
        }
        if (jm.a(fVar.i(str))) {
            this.i++;
            FinskyApp.a().h().a(113, str, "is-tracked", 0, (String) null, nVar);
            FinskyLog.a("Skipping restore of %s because already restoring", str);
            return false;
        }
        com.google.android.finsky.b.y a2 = FinskyApp.a().v.a(str);
        if (a2 != null && a2.c >= i) {
            this.k++;
            nVar.c = a2.c;
            nVar.d = true;
            FinskyApp.a().h().a(113, str, "already-installed", 0, (String) null, nVar);
            FinskyLog.a("Skipping restore of %s v:%d because v:%d is installed", str, Integer.valueOf(i), Integer.valueOf(a2.c));
            ar arVar2 = new ar();
            arVar2.c = str2;
            arVar2.f4591b = a2.c;
            return false;
        }
        FinskyLog.a("Should attempt restore of %s", str);
        return true;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        if (this.n >= 0 && !TextUtils.isEmpty(str2)) {
            if (this.o.containsKey(str)) {
                FinskyLog.c("Request for already-downloading bitmap for %s", str);
                return;
            }
            at atVar = this.f4555a;
            aq aqVar = atVar.e.get(str);
            if (aqVar == null) {
                aqVar = new aq((byte) 0);
                aqVar.f4588a = 0;
                atVar.e.put(str, aqVar);
            }
            aqVar.f4588a++;
            aqVar.f4589b = str2;
            aqVar.c = 0L;
            com.google.android.play.image.j b2 = FinskyApp.a().d.b(str2, this.n, this.n, new an(this, str));
            Bitmap bitmap = b2.f6944a;
            if (bitmap != null) {
                FinskyLog.a("Received cached bitmap for %s", str);
                a(str, bitmap);
            } else {
                FinskyLog.a("Waiting for bitmap for %s", str);
                this.o.put(str, b2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Bitmap bitmap) {
        this.m.a(str, bitmap);
        this.f4555a.d(str);
    }

    public static boolean a() {
        return h != null && h.f4555a.e(null);
    }

    public static boolean a(ay ayVar) {
        if (ayVar == null) {
            if (h == null) {
                return true;
            }
            h.d = null;
            return true;
        }
        if (h == null || !h.f4555a.e(null)) {
            return false;
        }
        RestoreService restoreService = h;
        restoreService.d = ayVar;
        new Handler(restoreService.getMainLooper()).post(new ao(restoreService));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, boolean z) {
        if (this.d != null) {
            this.d.a(i, str, z, "RestoreService");
            if (i == 1) {
                this.d = null;
            }
        }
    }

    private boolean b() {
        boolean z;
        try {
            if (this.g) {
                FinskyLog.c("Redelivery of startup intent - dropping it", new Object[0]);
                return false;
            }
            this.g = true;
            if (this.f4555a.c.isEmpty()) {
                z = false;
            } else {
                z = false;
                for (String str : this.f4555a.c.keySet()) {
                    FinskyLog.a("Recover fetch for account %s", FinskyLog.a(str));
                    a(this.f4555a.c.get(str).f4587b, str);
                    z = true;
                }
            }
            if (this.f4555a.d.isEmpty()) {
                return z;
            }
            com.google.android.finsky.receivers.f fVar = FinskyApp.a().k;
            boolean z2 = z;
            for (String str2 : cz.a(this.f4555a.d.keySet())) {
                if (jm.a(fVar.i(str2))) {
                    z2 = true;
                } else {
                    ar arVar = this.f4555a.d.get(str2);
                    if (arVar != null && (arVar.i == 0 || System.currentTimeMillis() >= arVar.i + com.google.android.finsky.c.d.bJ.b().longValue())) {
                        FinskyLog.a("Overdue alarm for %s so retry immediately", str2);
                        if (!a(str2)) {
                            this.f4555a.b(str2);
                        }
                    }
                }
            }
            return z2;
        } catch (Exception e) {
            FinskyLog.c("Exception restarting: ", e);
            b((Context) this);
            return false;
        }
    }

    static /* synthetic */ Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) RestoreService.class);
        intent.putExtra("package", str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("restoreservice").appendPath("restorepackage").appendPath(str);
        intent.setData(builder.build());
        return intent;
    }

    static /* synthetic */ long a(long j) {
        return (long) ((0.75d + (Math.random() / 2.0d)) * j);
    }

    static /* synthetic */ void a(RestoreService restoreService, String str, boolean z) {
        FinskyLog.a("Canceling bitmap for %s", str);
        com.google.android.play.image.j remove = restoreService.o.remove(str);
        if (remove != null && z) {
            remove.a();
        }
        restoreService.f4555a.d(str);
    }

    static /* synthetic */ void b(RestoreService restoreService) {
        if (restoreService.f) {
            return;
        }
        FinskyApp.a().k.a(restoreService.f4555a);
        restoreService.f = true;
    }
}
