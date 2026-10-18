package com.google.android.vending.verifier;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.net.InetAddress;

/* loaded from: classes.dex */
final class l {
    public Activity A;
    public int B = 1;
    public String C;
    public byte[] D;
    public int E;

    /* renamed from: a, reason: collision with root package name */
    public final int f7165a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f7166b;
    public final int c;
    public final Uri d;
    public final Uri e;
    public final int f;
    public final int g;
    public final boolean h;
    public final Intent i;
    public InetAddress j;
    public InetAddress k;
    public String[] l;
    public byte[][] m;
    public String[] n;
    public byte[][] o;
    public String p;
    public Integer q;
    public byte[][] r;
    public boolean s;
    public com.google.android.vending.verifier.apkg.e[] t;
    public String u;
    public byte[] v;
    public long w;
    public byte[][] x;
    public String y;
    public boolean z;

    public l(Intent intent) {
        Bundle extras = intent.getExtras();
        this.f7165a = extras.getInt("android.content.pm.extra.VERIFICATION_ID");
        this.f7166b = intent.getData();
        this.c = extras.getInt("android.content.pm.extra.VERIFICATION_INSTALL_FLAGS");
        this.d = (Uri) extras.getParcelable("android.intent.extra.ORIGINATING_URI");
        this.e = (Uri) extras.getParcelable("android.intent.extra.REFERRER");
        this.f = extras.getInt("android.intent.extra.ORIGINATING_UID", -1);
        this.g = extras.getInt("android.content.pm.extra.VERIFICATION_INSTALLER_UID", -1);
        this.h = extras.getBoolean("com.google.android.vending.verifier.extra.FROM_VERIFICATION_ACTIVITY");
        this.i = intent;
        this.p = extras.getString("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
        this.q = (Integer) extras.get("android.content.pm.extra.VERIFICATION_VERSION_CODE");
    }

    public final String toString() {
        return String.format("id = %d, data=%s flags=%d fromVerificationActivity=%b", Integer.valueOf(this.f7165a), this.f7166b, Integer.valueOf(this.c), Boolean.valueOf(this.h));
    }
}
