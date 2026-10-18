package com.google.android.gms.googlehelp;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Activity f5812a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.m f5813b;

    public a(Activity activity) {
        this(activity, new n(activity).a(h.c).b());
    }

    private a(Activity activity, com.google.android.gms.common.api.m mVar) {
        this.f5812a = activity;
        this.f5813b = mVar;
    }

    public final void a(Intent intent) {
        if (!intent.getAction().equals("com.google.android.gms.googlehelp.HELP") || !intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            throw new IllegalArgumentException("The intent you are trying to launch is not GoogleHelp intent! This class only supports GoogleHelp intents.");
        }
        int a2 = com.google.android.gms.common.c.a(this.f5812a);
        if (a2 == 0) {
            h.a(this.f5813b, new b(this, intent));
        } else {
            a(a2, intent);
        }
    }

    public final void a(int i, Intent intent) {
        Intent data = new Intent("android.intent.action.VIEW").setData(((GoogleHelp) intent.getParcelableExtra("EXTRA_GOOGLE_HELP")).q);
        if (i != 7) {
            if (this.f5812a.getPackageManager().queryIntentActivities(data, 0).size() > 0) {
                this.f5812a.startActivity(data);
                return;
            }
        }
        com.google.android.gms.common.c.b(i, this.f5812a);
    }
}
