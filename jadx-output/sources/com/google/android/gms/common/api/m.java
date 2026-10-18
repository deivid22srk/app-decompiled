package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.kr;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<m> f5578a = Collections.newSetFromMap(new WeakHashMap());

    public Looper a() {
        throw new UnsupportedOperationException();
    }

    public abstract ConnectionResult a(long j, TimeUnit timeUnit);

    public <C extends g> C a(h<C> hVar) {
        throw new UnsupportedOperationException();
    }

    public <A extends g, R extends x, T extends kr<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(p pVar);

    public abstract void a(q qVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public <A extends g, T extends kr<? extends x, A>> T b(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void b();

    public abstract void b(p pVar);

    public abstract void b(q qVar);

    public abstract ConnectionResult c();

    public abstract void d();

    public abstract boolean e();

    public abstract boolean f();
}
