package android.support.v4.widget;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
final class an implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ak f427a;

    an(ak akVar) {
        this.f427a = akVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f427a.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f427a.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f427a.unscheduleSelf(runnable);
    }
}
