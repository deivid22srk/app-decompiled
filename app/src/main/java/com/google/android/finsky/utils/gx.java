package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ny;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gx {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f4925a = {R.string.review_dialog_unrated, R.string.review_dialog_poor, R.string.review_dialog_below_average, R.string.review_dialog_average, R.string.review_dialog_above_average, R.string.review_dialog_excellent};

    public static void a(android.support.v4.app.t tVar, hg hgVar, boolean z) {
        FinskyApp.a().a((Account) null).a(new gy(tVar, hgVar, z), new gz(tVar, hgVar), true);
    }

    public static void a(String str, String str2, String str3, int i, String str4, String str5, Document document, Context context, hh hhVar, int i2) {
        String str6;
        String str7;
        ac a2 = FinskyApp.a().a(str);
        if (!TextUtils.isEmpty(str5) || TextUtils.isEmpty(str4)) {
            str6 = str5;
            str7 = str4;
        } else {
            str7 = "";
            str6 = str4;
        }
        a2.a(str2, i, str7, str6, document, str3);
        a(str, str2, str3, i, str7, str6, context, hhVar);
        int length = (TextUtils.isEmpty(str7) ? 0 : str7.length()) + (TextUtils.isEmpty(str6) ? 0 : str6.length());
        com.google.android.finsky.apkg.i f = FinskyApp.a().f(str);
        com.google.android.finsky.apkg.an anVar = new com.google.android.finsky.apkg.an();
        anVar.f1463a = i2;
        anVar.f1464b = true;
        anVar.c = i;
        anVar.d = true;
        if (length > 0) {
            anVar.e = length;
            anVar.f = true;
        }
        com.google.android.finsky.apkg.b bVar = new com.google.android.finsky.apkg.b(513);
        bVar.f1473a.K = anVar;
        f.b(bVar.f1473a);
    }

    private static void a(String str, String str2, String str3, int i, String str4, String str5, Context context, hh hhVar) {
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(str);
        ac a2 = FinskyApp.a().a(str);
        b2.a(str2, str4, str5, i, FinskyApp.a().g.f1961a.D, new ha(a2, str2, b2, str3, hhVar, i, str4, str5), new hb(a2, str2, context, hhVar));
    }

    public static void a(String str, Context context) {
        ac a2 = FinskyApp.a().a(str);
        ArrayList<ah> arrayList = new ArrayList();
        for (ah ahVar : a2.f4726b.values()) {
            if (ahVar != ac.f4725a && !ahVar.d) {
                arrayList.add(ahVar);
            }
        }
        if (!arrayList.isEmpty()) {
            for (ah ahVar2 : arrayList) {
                FinskyLog.c("Sending unsubmitted review for account: %s and docId: %s", FinskyLog.a(str), ahVar2.f4733b);
                ny nyVar = ahVar2.f4732a;
                a(str, ahVar2.f4733b, ahVar2.c, nyVar.d, nyVar.g, nyVar.i, context, null);
            }
        }
    }

    public static void a(String str, String str2, String str3, Context context, hh hhVar) {
        ac a2 = FinskyApp.a().a(str);
        a2.b(str2);
        com.google.android.finsky.api.b b2 = FinskyApp.a().b(str);
        b2.d(str2, new hc(b2, str3, hhVar), new hd(a2, str2, context, hhVar));
    }

    public static void a(String str, String str2, String str3, int i, android.support.v4.app.t tVar, hh hhVar) {
        a(tVar, new he(str, str2, i, str3, hhVar, tVar), true);
    }

    public static int a(int i) {
        return f4925a[i];
    }

    static /* synthetic */ void a(Context context, String str) {
        if (context == null) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        CharSequence charSequence = str;
        if (isEmpty) {
            charSequence = context.getResources().getText(R.string.review_error);
        }
        Toast.makeText(context, charSequence, 0).show();
    }

    static /* synthetic */ void a(Context context) {
        if (context == null) {
            return;
        }
        Toast.makeText(context, R.string.review_deleted_error, 0).show();
    }
}
