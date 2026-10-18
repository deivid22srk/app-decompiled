package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class bj extends cf {
    public static final cg d = new bk();

    /* renamed from: a, reason: collision with root package name */
    public int f195a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f196b;
    public PendingIntent c;
    private final Bundle e;
    private final cn[] f;

    public bj(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle());
    }

    private bj(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f195a = i;
        this.f196b = bn.d(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
    }

    @Override // android.support.v4.app.cf
    public final int a() {
        return this.f195a;
    }

    @Override // android.support.v4.app.cf
    public final CharSequence b() {
        return this.f196b;
    }

    @Override // android.support.v4.app.cf
    public final PendingIntent c() {
        return this.c;
    }

    @Override // android.support.v4.app.cf
    public final Bundle d() {
        return this.e;
    }

    @Override // android.support.v4.app.cf
    public final /* bridge */ /* synthetic */ cv[] e() {
        return this.f;
    }
}
