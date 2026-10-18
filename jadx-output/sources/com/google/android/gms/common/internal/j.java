package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

/* loaded from: classes.dex */
public final class j implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f5714a;

    /* renamed from: b, reason: collision with root package name */
    private final Fragment f5715b;
    private final Intent c;
    private final int d;

    public j(Activity activity, Intent intent, int i) {
        this.f5714a = activity;
        this.f5715b = null;
        this.c = intent;
        this.d = i;
    }

    public j(Fragment fragment, Intent intent, int i) {
        this.f5714a = null;
        this.f5715b = fragment;
        this.c = intent;
        this.d = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.c != null && this.f5715b != null) {
                this.f5715b.a(this.c, this.d);
            } else if (this.c != null) {
                this.f5714a.startActivityForResult(this.c, this.d);
            }
            dialogInterface.dismiss();
        } catch (ActivityNotFoundException e) {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
