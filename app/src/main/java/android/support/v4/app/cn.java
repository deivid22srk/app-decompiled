package android.support.v4.app;

import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class cn extends cv {

    /* renamed from: a, reason: collision with root package name */
    public static final cw f213a;
    private static final cp g;

    /* renamed from: b, reason: collision with root package name */
    private final String f214b;
    private final CharSequence c;
    private final CharSequence[] d;
    private final boolean e;
    private final Bundle f;

    @Override // android.support.v4.app.cv
    public final String a() {
        return this.f214b;
    }

    @Override // android.support.v4.app.cv
    public final CharSequence b() {
        return this.c;
    }

    @Override // android.support.v4.app.cv
    public final CharSequence[] c() {
        return this.d;
    }

    @Override // android.support.v4.app.cv
    public final boolean d() {
        return this.e;
    }

    @Override // android.support.v4.app.cv
    public final Bundle e() {
        return this.f;
    }

    static {
        if (Build.VERSION.SDK_INT >= 20) {
            g = new cq();
        } else if (Build.VERSION.SDK_INT >= 16) {
            g = new cs();
        } else {
            g = new cr();
        }
        f213a = new co();
    }
}
