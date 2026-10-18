package android.support.design.widget;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class ba {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference<az> f100a;

    /* renamed from: b, reason: collision with root package name */
    int f101b;

    ba(int i, az azVar) {
        this.f100a = new WeakReference<>(azVar);
        this.f101b = i;
    }

    final boolean a(az azVar) {
        return azVar != null && this.f100a.get() == azVar;
    }
}
