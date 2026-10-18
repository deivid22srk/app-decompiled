package android.support.v4.os;

import android.os.Build;
import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f306a;

    /* renamed from: b, reason: collision with root package name */
    public Object f307b;
    public boolean c;

    public final boolean a() {
        boolean z;
        synchronized (this) {
            z = this.f306a;
        }
        return z;
    }

    public final Object b() {
        Object obj;
        if (Build.VERSION.SDK_INT < 16) {
            return null;
        }
        synchronized (this) {
            if (this.f307b == null) {
                this.f307b = new CancellationSignal();
                if (this.f306a) {
                    ((CancellationSignal) this.f307b).cancel();
                }
            }
            obj = this.f307b;
        }
        return obj;
    }
}
