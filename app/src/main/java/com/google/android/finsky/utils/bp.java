package com.google.android.finsky.utils;

import android.app.Activity;
import android.content.res.Resources;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.List;

/* loaded from: classes.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    public static bt f4781a;

    /* renamed from: b, reason: collision with root package name */
    public static String f4782b;
    public static boolean c;

    public static void a(Activity activity) {
        if (b(activity)) {
            activity.startActivityForResult(com.google.android.gms.common.bpkg.a.a(FinskyApp.a().j(), activity.getResources().getString(R.string.gplus_sign_up_text)), 35);
        }
    }

    static boolean b(Activity activity) {
        int a2 = com.google.android.gms.common.c.a(activity);
        if (a2 == 0) {
            return true;
        }
        com.google.android.gms.common.c.a(a2, activity).show();
        return false;
    }

    public static String a(List<AudienceMember> list, Resources resources) {
        if (list == null || list.size() == 0) {
            return resources.getString(R.string.circles_follow);
        }
        if (list.size() != 1) {
            return resources.getQuantityString(R.plurals.circles_multiple, list.size(), Integer.valueOf(list.size()));
        }
        return list.get(0).f;
    }

    static String a(String str) {
        return "g:" + str;
    }
}
