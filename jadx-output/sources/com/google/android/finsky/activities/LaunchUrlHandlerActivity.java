package com.google.android.finsky.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.hi;
import com.google.android.finsky.utils.ic;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class LaunchUrlHandlerActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f1518a = Uri.parse("http://market.android.com/details");

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (com.google.android.finsky.safemode.a.b()) {
            com.google.android.finsky.safemode.a.d();
            finish();
        } else if (!ic.a(this)) {
            AccessRestrictedActivity.c(this);
            finish();
        } else {
            hi.a(new eb(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Intent a2 = a((Context) this);
        if (!com.google.android.finsky.c.d.av.b().booleanValue()) {
            startActivity(a2);
            finish();
        } else {
            com.google.android.finsky.b.a aVar = FinskyApp.a().s;
            aVar.a(new ec(this, a2, aVar));
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 20) {
            if (i2 == -1) {
                hi.a();
                a();
            } else {
                finish();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.content.Intent a(android.content.Context r10, android.content.Intent r11, com.google.android.finsky.b.a r12, com.google.android.finsky.a.i r13) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.activities.LaunchUrlHandlerActivity.a(android.content.Context, android.content.Intent, com.google.android.finsky.b.a, com.google.android.finsky.a.i):android.content.Intent");
    }

    private static boolean a(Uri uri) {
        if (FinskyApp.a().e().a(12605436L)) {
            return (TextUtils.isEmpty(uri.getQueryParameter("inline")) || TextUtils.isEmpty(uri.getQueryParameter("enifd"))) ? false : true;
        }
        return false;
    }

    private static Intent a(Context context) {
        return ik.a() ? context.getPackageManager().getLeanbackLaunchIntentForPackage(context.getPackageName()) : context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
    }
}
