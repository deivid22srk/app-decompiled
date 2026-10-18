package com.google.android.finsky.utils;

import android.os.Build;
import java.security.Provider;
import java.security.Security;

/* loaded from: classes.dex */
public final class bh extends Provider {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f4775a = new byte[0];

    public static void a() {
        bh unused;
        unused = bk.f4778a;
    }

    public bh() {
        super("FixBrokenCipherSpiProvider", 1.0d, "Workaround for bug in pre-ICS Harmony");
        if (Build.VERSION.SDK_INT < 14) {
            put("Cipher.AES", bj.class.getName());
            Security.insertProviderAt(this, 1);
        }
    }
}
