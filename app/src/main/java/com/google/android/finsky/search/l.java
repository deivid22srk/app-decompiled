package com.google.android.finsky.search;

import android.content.Context;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public abstract class l {
    protected final String c;
    protected final Context d;
    protected long e;

    protected abstract void a();

    protected abstract void a(n nVar);

    public l(String str, Context context) {
        this.c = str;
        this.d = context;
    }

    public final void b() {
        this.e = System.currentTimeMillis();
    }

    public final void c() {
        Semaphore semaphore = new Semaphore(0);
        a(new m(this, semaphore));
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
        }
    }
}
