package com.google.android.finsky.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.activities.FamilyMemberSettingsActivity;
import com.google.android.finsky.protos.qv;
import com.google.android.finsky.protos.qx;

/* loaded from: classes.dex */
public final class bb {
    public static com.google.android.finsky.protos.hl a(String str) {
        qv c = jb.c(str);
        if (c != null) {
            return c.c;
        }
        return null;
    }

    public static boolean b(String str) {
        return FinskyApp.a().d(str).a(12603252L);
    }

    public static com.google.android.finsky.protos.hm a(com.google.android.finsky.protos.hi hiVar) {
        if (hiVar != null && hiVar.f3910a != null) {
            for (com.google.android.finsky.protos.hm hmVar : hiVar.f3910a) {
                if (hmVar.c != null && hmVar.c.z != null && hmVar.c.z.l != null && hmVar.c.z.l.f3876a) {
                    return hmVar;
                }
            }
        }
        return null;
    }

    public static boolean c(String str) {
        com.google.android.finsky.protos.hm a2;
        com.google.android.finsky.protos.hl a3 = a(str);
        return (a3 == null || (a2 = a(a3.c)) == null || a2.f3916a != 1) ? false : true;
    }

    public static com.google.android.finsky.protos.hm a(com.google.android.finsky.protos.hi hiVar, String str) {
        if (hiVar != null && hiVar.f3910a != null) {
            for (com.google.android.finsky.protos.hm hmVar : hiVar.f3910a) {
                if (str.equals(hmVar.c.c)) {
                    return hmVar;
                }
            }
        }
        return null;
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("accountName should never be null");
        }
        if (!TextUtils.isEmpty(str2)) {
            qx qxVar = new qx();
            qxVar.f4317a = "X-DFE-Family-Consistency-Token";
            qxVar.f4318b = true;
            qxVar.c = str2;
            qxVar.d = true;
            jb.a(str, qxVar);
        }
    }

    public static boolean a(int i, Intent intent) {
        FinskyLog.a("Family activity result, resultCode: %d", Integer.valueOf(i));
        if (intent == null) {
            FinskyLog.a("Family activity returned null data from early exit.", new Object[0]);
            return false;
        }
        String stringExtra = intent.getStringExtra("accountName");
        if (TextUtils.isEmpty(stringExtra)) {
            FinskyLog.e("Family activity result expected to return an account name.", new Object[0]);
            return false;
        }
        if (!(i == 8 || i == 9 || intent.getBooleanExtra("familyChanged", false))) {
            return false;
        }
        String stringExtra2 = intent.getStringExtra("consistencyToken");
        if (stringExtra2 != null) {
            FinskyLog.a("Saving consistency token from family creation.", new Object[0]);
            a(stringExtra, stringExtra2);
        }
        return true;
    }

    public static Intent a(Activity activity, String str) {
        Intent intent = activity.getIntent();
        String stringExtra = intent == null ? null : intent.getStringExtra("family_app_id");
        return new Intent("com.google.android.gms.kids.familymanagement.MANAGE").setPackage(com.google.android.finsky.cpkg.d.eC.b()).putExtra("accountName", str).putExtra("appId", stringExtra == null ? "play.and" : stringExtra).putExtra("manageMemberIntent", new Intent(activity, (Class<?>) FamilyMemberSettingsActivity.class).putExtra("accountName", str));
    }

    public static boolean a(Context context, String str) {
        if (!FinskyApp.a().d(str).a(12603428L)) {
            FinskyLog.a("Family experiment not enabled; cannot show family card.", new Object[0]);
            return false;
        }
        com.google.android.gms.common.b.a();
        if (com.google.android.gms.common.b.d(context) <= com.google.android.finsky.cpkg.d.eD.b().intValue()) {
            FinskyLog.d("GmsCore too old; cannot show family card.", new Object[0]);
            return false;
        }
        com.google.android.finsky.protos.hl a2 = a(str);
        if (a2 == null) {
            FinskyLog.a("Family card: user not in family or user setting not available", new Object[0]);
            return false;
        }
        return (FinskyApp.a().d(str).a(12603772L) && a2.f3914a == 3) || (a(a2.c) != null && a2.f3914a != 4);
    }
}
