package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class eb extends dz {

    /* renamed from: b, reason: collision with root package name */
    WeakHashMap<View, Integer> f383b = null;

    eb() {
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public void a(dy dyVar, View view, eo eoVar) {
        view.setTag(2113929216, eoVar);
        view.animate().setListener(new ej(new ec(dyVar), view));
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void a(View view, long j) {
        view.animate().setDuration(j);
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void a(dy dyVar, View view, float f) {
        view.animate().alpha(f);
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void b(dy dyVar, View view, float f) {
        view.animate().translationX(f);
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void c(dy dyVar, View view, float f) {
        view.animate().translationY(f);
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final long a(View view) {
        return view.animate().getDuration();
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void b(View view, long j) {
        view.animate().setStartDelay(j);
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void a(dy dyVar, View view) {
        view.animate().cancel();
    }

    @Override // android.support.v4.view.dz, android.support.v4.view.eh
    public final void b(dy dyVar, View view) {
        view.animate().start();
    }
}
