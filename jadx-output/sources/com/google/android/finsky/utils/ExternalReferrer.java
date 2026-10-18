package com.google.android.finsky.utils;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ExternalReferrer {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f4703a;

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f4704b;

    static {
        f4703a = Build.VERSION.SDK_INT >= 14;
        f4704b = Build.VERSION.SDK_INT >= 12;
    }

    public static void a(String str, String str2, String str3) {
        b(str, Uri.parse(str2).getQueryParameter("doc"), str3);
    }

    public static void b(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && as.a(str2) == 3) {
            a(str, as.a(3, 1, str2), str3);
        }
    }

    public static void a(String str, com.google.android.finsky.protos.dp dpVar, String str2) {
        if (dpVar.e == 3 && dpVar.c == 1) {
            String str3 = dpVar.f3740a;
            com.google.android.finsky.b.a aVar = FinskyApp.a().s;
            ay ayVar = new ay(aVar, str3, str, str2);
            if (Looper.myLooper() == Looper.getMainLooper() && aVar.f2060a.b()) {
                ayVar.run();
            } else {
                aVar.a(ayVar);
            }
        }
    }

    static String a(String str, String str2, com.google.android.finsky.b.b bVar, int i, com.google.android.finsky.b.s sVar) {
        boolean z;
        boolean z2;
        String str3;
        int i2;
        boolean a2 = jm.a(i);
        boolean z3 = (bVar == null || bVar.c == null) ? false : true;
        if (!a2 && !z3) {
            z = false;
            z2 = true;
            str3 = null;
        } else {
            String str4 = null;
            if (bVar == null || bVar.d == null) {
                z = false;
            } else {
                com.google.android.finsky.b.t tVar = bVar.d;
                String str5 = tVar.k;
                if (!TextUtils.isEmpty(str5)) {
                    long j = tVar.q;
                    long longValue = com.google.android.finsky.c.d.ay.b().longValue();
                    if (longValue > 0 && j + longValue < System.currentTimeMillis()) {
                        str4 = null;
                        z = true;
                    }
                }
                str4 = str5;
                z = false;
            }
            if (TextUtils.isEmpty(str4)) {
                z2 = false;
                str3 = "already-installed";
            } else if (str4.equals(str)) {
                z2 = true;
                str3 = null;
            } else {
                z2 = false;
                str3 = "already-captured";
            }
        }
        com.google.android.finsky.b.t a3 = sVar.a(str2);
        int i3 = a3 == null ? 0 : a3.r;
        if (z) {
            i2 = i3 & (-9);
            sVar.a(str2, (String) null);
            sVar.c(str2, 0L);
        } else {
            i2 = i3;
        }
        if (z2) {
            i2 = i3 | 8;
            sVar.a(str2, str);
            sVar.c(str2, System.currentTimeMillis());
        }
        if (i2 != i3) {
            sVar.e(str2, i2);
        }
        return str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, String str, int i2, String str2) {
        com.google.android.finsky.a.b b2 = new com.google.android.finsky.a.b(i).a(str).b(str2);
        if (i2 >= 0) {
            com.google.android.finsky.a.n nVar = new com.google.android.finsky.a.n();
            nVar.f1490a = i2;
            nVar.f1491b = true;
            b2.a(nVar);
        }
        FinskyApp.a().h().b(b2.f1473a);
    }

    public static String a(Uri uri) {
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("gclid");
            if (TextUtils.isEmpty(queryParameter2)) {
                return null;
            }
            return Uri.encode("gclid=" + queryParameter2);
        }
        return queryParameter;
    }

    public class ExternalReferrerService extends Service {

        /* renamed from: a, reason: collision with root package name */
        private int f4705a;

        /* renamed from: b, reason: collision with root package name */
        private int f4706b;

        static /* synthetic */ int a(ExternalReferrerService externalReferrerService) {
            int i = externalReferrerService.f4706b;
            externalReferrerService.f4706b = i - 1;
            return i;
        }

        @Override // android.app.Service
        public IBinder onBind(Intent intent) {
            return null;
        }

        public static void a(Context context, String str, boolean z) {
            Intent intent = new Intent(context, (Class<?>) ExternalReferrerService.class);
            intent.putExtra("package_name", str);
            intent.putExtra("is_added", z);
            intent.setData(Uri.parse("externalreferrerservice://sendreferrer/" + str));
            context.startService(intent);
        }

        @Override // android.app.Service
        public int onStartCommand(Intent intent, int i, int i2) {
            this.f4705a = i2;
            this.f4706b++;
            az azVar = new az(this, intent.getStringExtra("package_name"), intent.getBooleanExtra("is_added", false));
            FinskyApp.a().p.a(azVar);
            FinskyApp.a().s.a(azVar);
            return 3;
        }
    }

    static /* synthetic */ void a(String str, boolean z) {
        long j;
        String str2;
        boolean z2;
        String str3;
        boolean z3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        boolean z4;
        com.google.android.finsky.b.a aVar = FinskyApp.a().s;
        com.google.android.finsky.b.b a2 = aVar.a(str);
        if (a2 == null || a2.d == null) {
            FinskyLog.a("Package state data is missing for %s", str);
            b(516, str, -1, "missing-app-state");
            return;
        }
        com.google.android.finsky.b.t tVar = a2.d;
        boolean z5 = tVar.e != null && tVar.e.v;
        if (f4704b == z && !z5) {
            b(516, str, a2.c.c, f4704b ? "awaiting-launch" : "pre-h-launch");
            return;
        }
        boolean a3 = FinskyApp.a().e().a(12603380L);
        boolean a4 = FinskyApp.a().e().a(12603394L);
        boolean a5 = FinskyApp.a().e().a(12603791L);
        boolean a6 = FinskyApp.a().e().a(12603106L);
        boolean z6 = (tVar.r & 8) != 0;
        if (z5) {
            j = 0;
            str7 = "forced";
            str6 = "forced-launch";
            z3 = z6;
            str3 = "unknown";
        } else {
            String str9 = tVar.k;
            j = tVar.q;
            if (j <= 0 || com.google.android.finsky.c.d.ay.b().longValue() + j >= System.currentTimeMillis()) {
                str2 = str9;
                z2 = z6;
                str3 = "unknown";
            } else {
                str2 = null;
                str3 = "expired";
                z2 = false;
                j = 0;
            }
            if (TextUtils.isEmpty(str2)) {
                if (a4 && z2) {
                    FinskyLog.a("Backfilling empty external referrer for deep link for %s", str);
                    z3 = z2;
                    str4 = com.google.android.finsky.c.d.ax.b();
                    str5 = "notset";
                } else if (!a3) {
                    z3 = z2;
                    str4 = str2;
                    str5 = null;
                } else {
                    FinskyLog.a("Backfilling empty external referrer for %s", str);
                    j = 0;
                    z3 = false;
                    str4 = com.google.android.finsky.c.d.aw.b();
                    str5 = "organic";
                }
            } else {
                z3 = z2;
                str4 = str2;
                str5 = "external";
            }
            if (a5) {
                String str10 = str5;
                str6 = str4;
                str7 = str10;
            } else {
                FinskyLog.a("Suppress referrer timestamp for %s", str);
                j = 0;
                String str11 = str5;
                str6 = str4;
                str7 = str11;
            }
        }
        if (TextUtils.isEmpty(str6) || FinskyApp.a().p.a(str).size() > 0) {
            str8 = str6;
        } else {
            j = 0;
            str3 = "not-owned";
            str8 = null;
        }
        com.google.android.finsky.b.ab abVar = aVar.f2060a;
        com.google.android.finsky.b.u a7 = com.google.android.finsky.b.u.a(tVar, str);
        a7.b((String) null);
        a7.c(0L);
        a7.f(tVar.r & (-9));
        abVar.a(a7.f2132a);
        if (!TextUtils.isEmpty(str8)) {
            FinskyApp a8 = FinskyApp.a();
            Intent intent = new Intent("com.android.vending.INSTALL_REFERRER");
            if (z5 && Build.VERSION.SDK_INT >= 13) {
                intent.addFlags(32);
                FinskyLog.a("Forcing %s to wake up", str);
            }
            intent.putExtra("referrer", str8);
            if (j > 0) {
                intent.putExtra("referrer_timestamp_seconds", j / 1000);
            }
            intent.setPackage(str);
            List<ResolveInfo> queryBroadcastReceivers = a8.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers.size() > 0) {
                boolean z7 = false;
                if (f4703a) {
                    a8.sendBroadcast(intent);
                    z4 = true;
                } else {
                    Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                    while (true) {
                        z4 = z7;
                        if (!it.hasNext()) {
                            break;
                        }
                        ResolveInfo next = it.next();
                        if (str.equals(next.activityInfo.packageName)) {
                            Intent intent2 = new Intent(intent);
                            intent2.setClassName(str, next.activityInfo.name);
                            a8.sendBroadcast(intent2);
                            z7 = true;
                        } else {
                            z7 = z4;
                        }
                    }
                }
                if (z4) {
                    FinskyLog.a("Delivered referrer for %s", str);
                    b(517, str, a2.c.c, str7);
                } else {
                    FinskyLog.a("Couldn't find referrer receiver for %s", str);
                    b(516, str, a2.c.c, "cant-find-receiver");
                }
            } else {
                b(516, str, a2.c.c, "no-receiver");
            }
        } else {
            FinskyLog.a("Referrer is empty for %s", str);
            FinskyLog.a("Dropped referrer for %s because %s", str, str3);
            b(516, str, a2.c.c, str3);
        }
        if (!a6) {
            return;
        }
        FinskyApp.a().h().b(new com.google.android.finsky.a.b(128).a(str).b(z3 ? "deeplink" : "organic").e(str8).f1473a);
    }
}
