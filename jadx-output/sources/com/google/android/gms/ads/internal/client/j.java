package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.gw;

@gw
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f5306a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static j f5307b;
    private final com.google.android.gms.ads.internal.util.client.a c = new com.google.android.gms.ads.internal.util.client.a();
    private final f d = new f();
    private final b e = new b();
    private final dl f = new dl();
    private final com.google.android.gms.ads.internal.reward.a.d g = new com.google.android.gms.ads.internal.reward.a.d();

    protected j() {
    }

    public static com.google.android.gms.ads.internal.util.client.a a() {
        return b().c;
    }

    private static j b() {
        j jVar;
        synchronized (f5306a) {
            jVar = f5307b;
        }
        return jVar;
    }

    static {
        j jVar = new j();
        synchronized (f5306a) {
            f5307b = jVar;
        }
    }
}
