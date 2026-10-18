package com.google.android.finsky;

import android.accounts.Account;
import android.text.TextUtils;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.bpkg.y;
import com.google.android.finsky.protos.ac;
import com.google.android.finsky.protos.fw;
import com.google.android.finsky.protos.kf;
import com.google.android.finsky.protos.qn;
import com.google.android.finsky.protos.qu;
import com.google.android.finsky.utils.ExternalReferrer;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kf f2468a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2469b;
    final /* synthetic */ b c;

    d(b bVar, kf kfVar, String str) {
        this.c = bVar;
        this.f2468a = kfVar;
        this.f2469b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.f2468a.f4031a) {
            case 1:
                b bVar = this.c;
                kf kfVar = this.f2468a;
                ac acVar = kfVar.m;
                if (kfVar.m == null) {
                    FinskyLog.a("Ignoring PurchaseDeliveryNotification because AppData was null.", new Object[0]);
                    break;
                } else if (kfVar.n == null) {
                    FinskyLog.a("Ignoring PurchaseDeliveryNotification because delivery data was null", new Object[0]);
                    break;
                } else {
                    String str = kfVar.g.f3740a;
                    if (!kfVar.n.t) {
                        FinskyLog.a("Ignoring PurchaseDeliveryNotification with !server_initiated: pkg=%s", str);
                        break;
                    } else {
                        y a2 = bVar.f.f2061b.a(str);
                        int i2 = a2 != null ? a2.c : -1;
                        if (i2 >= acVar.f3580a) {
                            FinskyLog.a("Skip remote install of %s because %d is not newer than %d", str, Integer.valueOf(acVar.f3580a), Integer.valueOf(i2));
                            com.google.android.finsky.apkg.n nVar = new com.google.android.finsky.apkg.n();
                            nVar.f1490a = acVar.f3580a;
                            nVar.f1491b = true;
                            if (i2 >= 0) {
                                nVar.c = i2;
                                nVar.d = true;
                            }
                            if (a2 != null) {
                                nVar.e = a2.d;
                                nVar.f = true;
                            }
                            FinskyApp.a().h().a(112, str, "older-version", 0, (String) null, nVar);
                            break;
                        } else {
                            String str2 = kfVar.j;
                            com.google.android.finsky.apkg.n nVar2 = new com.google.android.finsky.apkg.n();
                            nVar2.f1490a = acVar.f3580a;
                            nVar2.f1491b = true;
                            FinskyApp.a().h().a(201, str, (String) null, 0, (String) null, nVar2);
                            if (kfVar.n.C) {
                                FinskyApp.a().l.a(str, kfVar.n.B);
                            }
                            if (FinskyApp.a().e().a(12604059L) && !TextUtils.isEmpty(acVar.e)) {
                                FinskyLog.a("Capturing referrer for %s from notification", str);
                                ExternalReferrer.a(acVar.e, kfVar.g, "tickle");
                            }
                            if (FinskyApp.a().e().a(12605208L) && acVar.g != null) {
                                for (fw fwVar : Document.a(str, acVar.g.e)) {
                                    FinskyLog.a("Package %s depends on %s min %d", str, fwVar.f3849a, Integer.valueOf(fwVar.c));
                                }
                            }
                            bVar.c.a(str, acVar.f3580a, str2, kfVar.h, false, "tickle", 2, acVar.g);
                            break;
                        }
                    }
                }
                break;
            case 2:
                b bVar2 = this.c;
                kf kfVar2 = this.f2468a;
                String str3 = kfVar2.g.f3740a;
                boolean z = kfVar2.o != null && kfVar2.o.f4152a;
                String str4 = kfVar2.h;
                FinskyLog.a("Removing package '%s'. Malicious='%s'", str3, Boolean.valueOf(z));
                y a3 = bVar2.f.f2061b.a(str3);
                com.google.android.finsky.apkg.n nVar3 = null;
                if (a3 != null) {
                    nVar3 = new com.google.android.finsky.apkg.n();
                    nVar3.c = a3.c;
                    nVar3.d = true;
                    nVar3.e = a3.d;
                    nVar3.f = true;
                }
                FinskyApp.a().h().a(202, str3, (String) null, 0, (String) null, nVar3);
                if (a3 != null) {
                    if (z) {
                        bVar2.d.a(str4);
                    } else {
                        bVar2.d.c(str4, str3);
                    }
                }
                if (z) {
                    bVar2.c.h(str3);
                    break;
                } else {
                    bVar2.c.b(str3, true);
                    break;
                }
                break;
            case 3:
                kf kfVar3 = this.f2468a;
                int i3 = kfVar3.p.f4146a;
                String str5 = kfVar3.g.f3740a;
                FinskyLog.a("Received PURCHASE_DECLINED tickle for %s reason=%d", str5, Integer.valueOf(i3));
                FinskyApp.a().h().a(200, str5, String.valueOf(i3), 0, (String) null, (com.google.android.finsky.apkg.n) null);
                break;
            case 4:
                b bVar3 = this.c;
                qn qnVar = this.f2468a.q;
                bVar3.d.e(qnVar.f4300a, qnVar.c);
                break;
            case 5:
            case 7:
            default:
                FinskyLog.d("Unhandled notification type [%s]", Integer.valueOf(this.f2468a.f4031a));
                break;
            case 6:
                b bVar4 = this.c;
                kf kfVar4 = this.f2468a;
                if (kfVar4.s == null) {
                    FinskyLog.d("Received LibraryDirty notification without LibraryDirtyData: id=%s", kfVar4.c);
                    break;
                } else {
                    Account a4 = com.google.android.finsky.api.a.a(kfVar4.j, bVar4.e);
                    if (a4 == null) {
                        FinskyLog.d("Received LibraryDirty notification for invalid account: id=%s, account=%s", kfVar4.c, FinskyLog.a(kfVar4.j));
                        break;
                    } else {
                        String[] strArr = new String[1];
                        if (kfVar4.s.c.length() > 0) {
                            strArr[0] = kfVar4.s.c;
                        } else {
                            strArr[0] = com.google.android.finsky.gpkg.a.a(kfVar4.s.f3967a);
                        }
                        bVar4.g.a(a4, strArr, (Runnable) null, "notification-" + kfVar4.c);
                        break;
                    }
                }
            case 8:
                b bVar5 = this.c;
                kf kfVar5 = this.f2468a;
                Account a5 = com.google.android.finsky.api.a.a(kfVar5.j, bVar5.e);
                if (a5 == null) {
                    FinskyLog.d("UserSettingsDirty notification has invalid account: id=%s, account=%s", kfVar5.c, FinskyLog.a(kfVar5.j));
                    break;
                } else {
                    qu quVar = kfVar5.t;
                    if (quVar != null) {
                        jb.a(a5.name, quVar);
                        break;
                    } else {
                        jb.a(a5.name);
                        break;
                    }
                }
            case 9:
                b bVar6 = this.c;
                kf kfVar6 = this.f2468a;
                String str6 = kfVar6.g.f3740a;
                if (kfVar6.m == null || !kfVar6.m.f3581b) {
                    i = -1;
                } else {
                    i = kfVar6.m.f3580a;
                }
                FinskyLog.a("Received update check tickle for package '%s', maxVersionCode %d.", str6, Integer.valueOf(i));
                y a6 = bVar6.f.f2061b.a(str6);
                com.google.android.finsky.apkg.n nVar4 = null;
                if (a6 != null) {
                    nVar4 = new com.google.android.finsky.apkg.n();
                    if (i >= 0) {
                        nVar4.f1490a = i;
                        nVar4.f1491b = true;
                    }
                    nVar4.c = a6.c;
                    nVar4.d = true;
                    nVar4.e = a6.d;
                    nVar4.f = true;
                }
                FinskyApp.a().h().a(203, str6, (String) null, 0, (String) null, nVar4);
                if (a6 != null && (i < 0 || a6.c < i)) {
                    FinskyLog.a("run auto update", new Object[0]);
                    break;
                }
                break;
        }
        this.c.f2058a.add(this.f2469b);
        this.c.a();
        if (this.f2468a.u) {
            while (this.c.f2059b.size() >= 10) {
                this.c.f2059b.remove(0);
            }
            this.c.f2059b.add(this.f2469b);
            b.b(this.c);
            this.c.a(this.f2469b);
        }
    }
}
