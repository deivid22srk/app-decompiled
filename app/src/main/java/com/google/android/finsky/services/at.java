package com.google.android.finsky.services;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v4.app.bn;
import android.text.TextUtils;
import android.util.Base64;
import com.deivid22srk.store.R;
import com.android.volley.VolleyError;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.protos.in;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class at implements com.google.android.finsky.installer.p {

    /* renamed from: a, reason: collision with root package name */
    com.google.android.finsky.utils.bpkg.c f4594a;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.finsky.utils.bpkg.c f4595b;
    final /* synthetic */ RestoreService h;
    private boolean k;
    final Map<String, ap> c = new HashMap();
    final Map<String, ar> d = new HashMap();
    final Map<String, aq> e = new HashMap();
    int f = 0;
    private int i = 0;
    private int j = 0;
    String g = null;

    at(RestoreService restoreService) {
        this.h = restoreService;
    }

    static ap a(Context context, String str, Map<String, String> map) {
        if (com.google.android.finsky.api.a.a(str, context) == null) {
            FinskyLog.c("Unknown account %s", FinskyLog.a(str));
            return null;
        }
        String str2 = map.get("attempts");
        String str3 = map.get("aid");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            FinskyLog.c("Missing data for account %s", FinskyLog.a(str));
            return null;
        }
        try {
            int intValue = Integer.valueOf(str2).intValue();
            if (intValue < 0 || intValue >= com.google.android.finsky.cpkg.d.bG.b().intValue()) {
                FinskyLog.a("Reached limit %d for %s", Integer.valueOf(intValue), FinskyLog.a(str));
                return null;
            }
            ap apVar = new ap((byte) 0);
            apVar.f4586a = intValue;
            apVar.f4587b = str3;
            return apVar;
        } catch (NumberFormatException e) {
            FinskyLog.c("Bad data for account %s (%s, %s)", FinskyLog.a(str), str2, str3);
            return null;
        }
    }

    public final void a(String str, boolean z, VolleyError volleyError) {
        ap apVar = this.c.get(str);
        FinskyApp.a().f(str).b(new com.google.android.finsky.apkg.b(118).a(volleyError == null ? 0 : com.google.android.finsky.installer.n.a(volleyError)).a(volleyError).c(apVar != null ? apVar.f4586a : 0).f1473a);
        if (z) {
            this.c.remove(str);
            a(str);
        } else if (apVar != null) {
            apVar.c = false;
        }
        a();
    }

    final void a(String str) {
        String encode = Uri.encode(str);
        ap apVar = this.c.get(str);
        if (apVar == null) {
            this.f4594a.a(encode);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("attempts", Integer.toString(apVar.f4586a));
        hashMap.put("aid", apVar.f4587b);
        this.f4594a.a(encode, hashMap);
    }

    static ar b(Context context, String str, Map<String, String> map) {
        try {
            FinskyApp.a().getPackageManager().getPackageInfo(str, 0);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = map.get("attempts");
            String str3 = map.get("versionCode");
            String str4 = map.get("accountName");
            String str5 = map.get("title");
            String str6 = map.get("priority");
            String str7 = map.get("deliveryToken");
            String str8 = map.get("visible");
            String str9 = map.get("appIconUrl");
            String str10 = map.get("retryTime");
            String str11 = map.get("isVpa");
            String str12 = map.get("installDetails");
            if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str8) || TextUtils.isEmpty(str9) || TextUtils.isEmpty(str10)) {
                FinskyLog.c("Missing data for package %s", str);
                return null;
            }
            ar arVar = new ar();
            try {
                arVar.f4590a = Integer.valueOf(str2).intValue();
                arVar.f4591b = Integer.valueOf(str3).intValue();
                arVar.e = Integer.valueOf(str6).intValue();
                arVar.g = Boolean.valueOf(str8).booleanValue();
                arVar.i = Long.valueOf(str10).longValue();
                arVar.j = Boolean.valueOf(str11).booleanValue();
                if (str12 != null) {
                    byte[] decode = Base64.decode(str12, 0);
                    arVar.k = (in) com.google.protobuf.nano.c.a(new in(), decode, decode.length);
                }
                if (arVar.f4590a < 0 || arVar.f4590a >= com.google.android.finsky.cpkg.d.bI.b().intValue()) {
                    FinskyLog.a("Reached limit %d for %s", Integer.valueOf(arVar.f4590a), str);
                    return null;
                }
                if (com.google.android.finsky.api.a.a(str4, context) == null) {
                    FinskyLog.c("Unknown account %s", FinskyLog.a(str4));
                    return null;
                }
                arVar.c = str4;
                arVar.d = str5;
                arVar.f = str7;
                arVar.h = str9;
                return arVar;
            } catch (InvalidProtocolBufferNanoException | IllegalArgumentException e2) {
                FinskyLog.c("Bad data for package %s (%s, %s, %s, %s, %s, %s, %s)", str, str2, str3, FinskyLog.a(str4), str5, str6, str8, str10);
                return null;
            }
        }
    }

    public final void a(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, boolean z2, in inVar) {
        ar arVar = this.d.get(str);
        if (arVar == null) {
            arVar = new ar();
            arVar.f4590a = 0;
        }
        arVar.f4590a++;
        arVar.f4591b = i;
        arVar.c = str2;
        arVar.d = str3;
        arVar.e = i2;
        arVar.f = str4;
        arVar.g = z;
        arVar.h = str5;
        arVar.i = 0L;
        arVar.j = z2;
        arVar.k = inVar;
        this.d.put(str, arVar);
        f(str);
        b();
    }

    final void b(String str) {
        this.d.remove(str);
        f(str);
        b();
    }

    private void a(String str, boolean z, boolean z2) {
        if (z) {
            this.i++;
        } else if (!z2) {
            this.j++;
        }
        if (z || !z2) {
            b(str);
        }
        a();
    }

    public final boolean c(String str) {
        ar arVar = this.d.get(str);
        if (arVar == null) {
            return false;
        }
        if (arVar.f4590a < com.google.android.finsky.cpkg.d.bI.b().intValue()) {
            return true;
        }
        FinskyLog.a("Reached limit %d for %s", Integer.valueOf(arVar.f4590a), str);
        return false;
    }

    private void f(String str) {
        String encode = Uri.encode(str);
        ar arVar = this.d.get(str);
        if (arVar == null) {
            this.f4595b.a(encode);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("attempts", Integer.toString(arVar.f4590a));
        hashMap.put("versionCode", Integer.toString(arVar.f4591b));
        hashMap.put("accountName", arVar.c);
        hashMap.put("title", arVar.d);
        hashMap.put("priority", Integer.toString(arVar.e));
        if (!TextUtils.isEmpty(arVar.f)) {
            hashMap.put("deliveryToken", arVar.f);
        }
        hashMap.put("visible", Boolean.toString(arVar.g));
        hashMap.put("appIconUrl", arVar.h);
        hashMap.put("retryTime", Long.toString(arVar.i));
        hashMap.put("isVpa", Boolean.toString(arVar.j));
        if (arVar.k != null) {
            hashMap.put("installDetails", Base64.encodeToString(in.a(arVar.k), 0));
        }
        this.f4595b.a(encode, hashMap);
    }

    public final void d(String str) {
        this.e.remove(str);
        a();
    }

    public final void a() {
        if (this.d.isEmpty() && this.c.isEmpty() && this.e.isEmpty() && this.f <= 0) {
            FinskyLog.a("Restore complete with %d success and %d failed.", Integer.valueOf(this.i), Integer.valueOf(this.j));
            this.h.a(1, (String) null, false);
            this.h.stopSelf(this.h.e);
        }
    }

    public final boolean e(String str) {
        if (!this.c.isEmpty()) {
            Iterator<ap> it = this.c.values().iterator();
            while (it.hasNext()) {
                if (it.next().c) {
                    return true;
                }
            }
        }
        if (!this.d.isEmpty()) {
            for (Map.Entry<String, ar> entry : this.d.entrySet()) {
                if (str == null || !str.equals(entry.getKey())) {
                    if (entry.getValue().e == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        boolean z = false;
        ar arVar = this.d.get(str);
        if (arVar != null) {
            switch (i) {
                case 0:
                case 8:
                    break;
                case 1:
                case 4:
                case 7:
                    b(str, true, false);
                    break;
                case 2:
                    FinskyLog.d("Restore package %s download cancelled", str);
                    b(str, false, false);
                    a(str, false, false);
                    z = true;
                    break;
                case 3:
                    FinskyLog.d("Restore package %s download error %d", str, Integer.valueOf(i2));
                    boolean z2 = !RestoreService.b(i2) && this.h.f4555a.c(str);
                    b(str, false, z2);
                    a(str, false, z2);
                    if (!z2) {
                        z = true;
                        break;
                    } else {
                        long a2 = this.h.a(RestoreService.a(this.h, str), RestoreService.a(((arVar == null || arVar.e != 1) ? com.google.android.finsky.cpkg.d.bJ.b() : com.google.android.finsky.cpkg.d.bK.b()).longValue()));
                        at atVar = this.h.f4555a;
                        ar arVar2 = atVar.d.get(str);
                        if (arVar2 == null) {
                            FinskyLog.a("Unexpected missing package %s, can't write retry time", str);
                        } else {
                            arVar2.i = a2;
                            atVar.f(str);
                        }
                        FinskyApp.a().k.a(str, arVar.d);
                        this.h.b(str, arVar.h);
                        break;
                    }
                    break;
                case 5:
                    FinskyLog.d("Restore package %s install error %d", str, Integer.valueOf(i2));
                    b(str, false, false);
                    a(str, false, false);
                    z = true;
                    break;
                case 6:
                    FinskyLog.a("Restore package %s install complete", str);
                    b(str, false, false);
                    a(str, true, false);
                    z = true;
                    break;
                default:
                    FinskyLog.e("enum %s", Integer.valueOf(i));
                    break;
            }
            if (z) {
                RestoreService.a(this.h, str, true);
            }
        }
    }

    private void b(String str, boolean z, boolean z2) {
        ar arVar = this.d.get(str);
        if (arVar != null && arVar.e == 1) {
            if (z) {
                this.g = str;
                if (arVar.g) {
                    this.h.a(3, str, true);
                    return;
                } else {
                    this.h.a(2, str, false);
                    return;
                }
            }
            this.g = null;
            if (z2) {
                this.h.a(2, str, false);
            } else if (!e(str)) {
                this.h.a(1, str, false);
            }
        }
    }

    private void b() {
        if (this.k) {
            Resources resources = this.h.getResources();
            Context applicationContext = this.h.getApplicationContext();
            bn bnVar = new bn(applicationContext);
            NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
            PendingIntent activity = PendingIntent.getActivity(applicationContext, -555892993, MainActivity.b(applicationContext), 268435456);
            bnVar.y = applicationContext.getResources().getColor(R.color.restore_notification);
            bnVar.z = 0;
            bnVar.v = true;
            bnVar.w = "status";
            bnVar.d = activity;
            int i = this.j + this.i;
            int size = this.d.size() + i;
            if (size == i) {
                bnVar.a(resources.getString(R.string.b_and_r_setup_completed)).a(size, i, false).a(R.drawable.stat_notify_installed).b(resources.getString(R.string.b_and_r_installed_x_of_y, Integer.valueOf(i), Integer.valueOf(size)));
            } else {
                bnVar.a(resources.getString(R.string.b_and_r_button_setup)).a(size, i, true).a(android.R.drawable.stat_sys_download).b(resources.getString(R.string.b_and_r_installed_x_of_y, Integer.valueOf(i), Integer.valueOf(size))).b(2);
            }
            notificationManager.notify(-555892993, bnVar.a());
        }
    }

    static /* synthetic */ void a(at atVar) {
        if (com.google.android.finsky.cpkg.d.eI.b().booleanValue()) {
            return;
        }
        atVar.k = true;
        atVar.b();
    }
}
