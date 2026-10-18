package android.support.v4.view.apkg;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    public static final am f321a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f322b;

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            f321a = new an();
            return;
        }
        if (Build.VERSION.SDK_INT >= 15) {
            f321a = new al();
        } else if (Build.VERSION.SDK_INT >= 14) {
            f321a = new ak();
        } else {
            f321a = new ao();
        }
    }

    public aj(Object obj) {
        this.f322b = obj;
    }

    public static aj a() {
        return new aj(f321a.a());
    }

    public final void a(View view) {
        f321a.a(this.f322b, view);
    }

    public final void a(boolean z) {
        f321a.a(this.f322b, z);
    }

    public final void a(int i) {
        f321a.b(this.f322b, i);
    }

    public final void b(int i) {
        f321a.a(this.f322b, i);
    }

    public final void c(int i) {
        f321a.e(this.f322b, i);
    }

    public final int hashCode() {
        if (this.f322b == null) {
            return 0;
        }
        return this.f322b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aj ajVar = (aj) obj;
            return this.f322b == null ? ajVar.f322b == null : this.f322b.equals(ajVar.f322b);
        }
        return false;
    }
}
