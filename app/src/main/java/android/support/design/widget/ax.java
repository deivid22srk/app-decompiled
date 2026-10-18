package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class ax {
    private static ax e;

    /* renamed from: a, reason: collision with root package name */
    final Object f97a = new Object();

    /* renamed from: b, reason: collision with root package name */
    final Handler f98b = new Handler(Looper.getMainLooper(), new ay(this));
    ba c;
    ba d;

    static ax a() {
        if (e == null) {
            e = new ax();
        }
        return e;
    }

    private ax() {
    }

    public final void a(az azVar) {
        synchronized (this.f97a) {
            if (d(azVar)) {
                this.f98b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public final void b(az azVar) {
        synchronized (this.f97a) {
            if (d(azVar)) {
                a(this.c);
            }
        }
    }

    public final boolean c(az azVar) {
        boolean z;
        synchronized (this.f97a) {
            z = d(azVar) || e(azVar);
        }
        return z;
    }

    final void b() {
        if (this.d != null) {
            this.c = this.d;
            this.d = null;
            az azVar = this.c.f100a.get();
            if (azVar != null) {
                azVar.a();
            } else {
                this.c = null;
            }
        }
    }

    final boolean d(az azVar) {
        return this.c != null && this.c.a(azVar);
    }

    final boolean e(az azVar) {
        return this.d != null && this.d.a(azVar);
    }

    final boolean a(ba baVar, int i) {
        az azVar = baVar.f100a.get();
        if (azVar == null) {
            return false;
        }
        this.f98b.removeCallbacksAndMessages(baVar);
        azVar.a(i);
        return true;
    }

    final void a(ba baVar) {
        if (baVar.f101b != -2) {
            int i = 2750;
            if (baVar.f101b <= 0) {
                if (baVar.f101b == -1) {
                    i = 1500;
                }
            } else {
                i = baVar.f101b;
            }
            this.f98b.removeCallbacksAndMessages(baVar);
            this.f98b.sendMessageDelayed(Message.obtain(this.f98b, 0, baVar), i);
        }
    }
}
