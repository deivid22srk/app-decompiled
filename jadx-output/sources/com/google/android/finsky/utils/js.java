package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class js {

    /* renamed from: a, reason: collision with root package name */
    private static long f5040a;

    /* renamed from: b, reason: collision with root package name */
    private static List<jx> f5041b = new ArrayList();

    public static void a(jx jxVar) {
        f5041b.add(jxVar);
    }

    public static void b(jx jxVar) {
        f5041b.remove(jxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(String str, boolean z, boolean z2) {
        for (int size = f5041b.size() - 1; size >= 0; size--) {
            f5041b.get(size).a(str, z, z2);
        }
    }

    public static boolean a(Document document, com.google.android.finsky.api.b bVar) {
        boolean z;
        if (a(document, FinskyApp.a().i())) {
            return false;
        }
        if (document.P() || document.ah() || document.f1963a.e == 20 || document.f1963a.e == 4 || document.f1963a.e == 30 || document.f1963a.e == 8 || document.f1963a.e == 34 || document.f1963a.e == 44 || document.f1963a.e == 3) {
            return true;
        }
        com.google.android.finsky.g.h hVar = FinskyApp.a().p;
        Account a2 = cy.a(document, hVar, bVar.b());
        if (a2 == null && document.f1963a.g == 6 && document.aM()) {
            a2 = cy.a(document.aN(), hVar, FinskyApp.a().i());
        }
        if (document.f1963a.e == 1) {
            z = FinskyApp.a().v.a(document.E().w) != null;
        } else {
            z = false;
        }
        return a2 != null || z;
    }

    public static boolean a(Document document, Account account) {
        return FinskyApp.a().p.a(account).b(com.google.android.finsky.g.r.a(account.name, "u-wl", document, 1));
    }

    public static void a(View view, Document document, com.google.android.finsky.api.b bVar) {
        if (document == null) {
            FinskyLog.c("Tried to wishlist an item but there is no document active", new Object[0]);
            return;
        }
        Context context = view.getContext();
        boolean a2 = a(document, bVar.b());
        String str = document.f1963a.f3890a;
        String str2 = document.f1963a.i;
        Resources resources = context.getResources();
        jt jtVar = new jt(bVar, str, a2);
        jv jvVar = new jv(a2, resources, str2, str);
        boolean c = ik.c(context);
        if (a2) {
            bVar.b(cz.a(str), "u-wl", jtVar, jvVar);
        } else {
            if (!c) {
                Toast.makeText(context, R.string.wishlist_adding, 0).show();
            }
            bVar.a(cz.a(str), "u-wl", jtVar, jvVar);
        }
        a(str, a2 ? false : true, false);
        if (c) {
            new Handler(Looper.myLooper()).post(new jw(context, a2, view));
        }
    }

    public static boolean a(long j) {
        return j < f5040a;
    }
}
