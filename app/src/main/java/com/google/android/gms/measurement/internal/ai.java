package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
final class ai extends ba {

    /* renamed from: a, reason: collision with root package name */
    static final Pair<String, Long> f6301a = new Pair<>("", 0L);

    /* renamed from: b, reason: collision with root package name */
    public final ak f6302b;
    public final aj c;
    public final aj d;
    public final aj e;
    public final aj f;
    private SharedPreferences g;
    private String j;
    private boolean k;
    private long l;
    private final SecureRandom m;

    ai(ap apVar) {
        super(apVar);
        this.f6302b = new ak(this, "health_monitor", i.G(), (byte) 0);
        this.c = new aj(this, "last_upload");
        this.d = new aj(this, "last_upload_attempt");
        this.e = new aj(this, "backoff");
        this.f = new aj(this, "last_delete_stale");
        this.m = new SecureRandom();
    }

    private static MessageDigest a(String str) {
        MessageDigest messageDigest;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                return null;
            }
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException e) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
            i = i2 + 1;
        }
    }

    static String p() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences s() {
        e();
        u();
        return this.g;
    }

    @Override // com.google.android.gms.measurement.internal.ba
    protected final void a() {
        this.g = i().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
    }

    final String o() {
        String str = (String) b().first;
        MessageDigest a2 = a("MD5");
        if (a2 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, a2.digest(str.getBytes())));
    }

    final Boolean q() {
        e();
        if (s().contains("use_service")) {
            return Boolean.valueOf(s().getBoolean("use_service", false));
        }
        return null;
    }

    final boolean r() {
        e();
        return s().getBoolean("measurement_enabled", true);
    }

    final Pair<String, Boolean> b() {
        e();
        long b2 = h().b();
        if (this.j != null && b2 < this.l) {
            return new Pair<>(this.j, Boolean.valueOf(this.k));
        }
        this.l = b2 + i.w();
        com.google.android.gms.ads.bpkg.b.a(true);
        try {
            com.google.android.gms.ads.bpkg.c a2 = com.google.android.gms.ads.bpkg.b.a(i());
            this.j = a2.f5259a;
            this.k = a2.f5260b;
        } catch (Throwable th) {
            l().f.a("Unable to get advertising id", th);
            this.j = "";
        }
        com.google.android.gms.ads.bpkg.b.a(false);
        return new Pair<>(this.j, Boolean.valueOf(this.k));
    }

    final void a(boolean z) {
        e();
        l().g.a("Setting useService", Boolean.valueOf(z));
        SharedPreferences.Editor edit = s().edit();
        edit.putBoolean("use_service", z);
        edit.apply();
    }
}
