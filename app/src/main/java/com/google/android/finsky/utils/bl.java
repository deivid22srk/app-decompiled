package com.google.android.finsky.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class bl implements com.google.android.finsky.installer.p {

    /* renamed from: a, reason: collision with root package name */
    protected static bl f4779a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f4780b;
    protected final com.google.android.finsky.receivers.f c;

    public bl(Context context, com.google.android.finsky.receivers.f fVar) {
        f4779a = this;
        this.f4780b = context;
        this.c = fVar;
        this.c.a(this);
    }

    @Override // com.google.android.finsky.installer.p
    public final void a(String str, int i, int i2) {
        Intent intent;
        switch (i) {
            case 0:
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_ENQUEUED");
                break;
            case 1:
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_DOWNLOADING");
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_DEQUEUED");
                intent.putExtra("com.android.launcher.action.INSTALL_COMPLETED", i == 6);
                break;
            case 4:
                intent = new Intent("com.android.launcher.action.ACTION_PACKAGE_INSTALLING");
                break;
            default:
                intent = null;
                break;
        }
        if (intent != null) {
            intent.setPackage(com.google.android.finsky.cpkg.d.dB.b());
            intent.setData(Uri.fromParts("package", str, null));
            FinskyLog.b("GEL broadcast uri=[%s], action=[%s], for package=[%s]", intent.getData(), intent.getAction(), str);
            this.f4780b.sendBroadcast(intent);
        }
    }
}
