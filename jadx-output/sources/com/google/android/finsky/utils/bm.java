package com.google.android.finsky.utils;

import android.content.Context;
import android.widget.Toast;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;

/* loaded from: classes.dex */
public final class bm {
    public static void a(android.support.v4.app.aa aaVar, Context context) {
        if (!FinskyApp.a().g.f1961a.D) {
            Toast.makeText(context, context.getResources().getText(R.string.google_plus_disabled_error), 0).show();
        } else {
            bo.z().a(aaVar, (String) null);
        }
    }

    public static boolean a() {
        return bg.ad.b(FinskyApp.a().j()).a().booleanValue();
    }
}
