package android.support.v7.widget;

import android.content.Context;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
final class ep implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    int f793a;

    /* renamed from: b, reason: collision with root package name */
    int f794b;
    android.support.v4.widget.bc c;
    final /* synthetic */ RecyclerView d;
    private Interpolator e;
    private boolean f;
    private boolean g;

    public ep(RecyclerView recyclerView) {
        Interpolator interpolator;
        Interpolator interpolator2;
        this.d = recyclerView;
        interpolator = RecyclerView.ao;
        this.e = interpolator;
        this.f = false;
        this.g = false;
        Context context = recyclerView.getContext();
        interpolator2 = RecyclerView.ao;
        this.c = android.support.v4.widget.bc.a(context, interpolator2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ep.run():void");
    }

    final void a() {
        if (this.f) {
            this.g = true;
        } else {
            this.d.removeCallbacks(this);
            android.support.v4.view.by.a(this.d, this);
        }
    }

    public final void a(int i, int i2, int i3) {
        Interpolator interpolator;
        interpolator = RecyclerView.ao;
        a(i, i2, i3, interpolator);
    }

    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        if (this.e != interpolator) {
            this.e = interpolator;
            this.c = android.support.v4.widget.bc.a(this.d.getContext(), interpolator);
        }
        this.d.setScrollState(2);
        this.f794b = 0;
        this.f793a = 0;
        this.c.a(0, 0, i, i2, i3);
        a();
    }

    public final void b() {
        this.d.removeCallbacks(this);
        this.c.h();
    }

    public final void a(int i, int i2) {
        int i3;
        boolean z = Math.abs(i) > Math.abs(i2);
        int sqrt = (int) Math.sqrt(0.0d);
        int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
        int width = z ? this.d.getWidth() : this.d.getHeight();
        int i4 = width / 2;
        float sin = (((float) Math.sin((float) ((Math.min(1.0f, (sqrt2 * 1.0f) / width) - 0.5f) * 0.4712389167638204d))) * i4) + i4;
        if (sqrt > 0) {
            i3 = Math.round(1000.0f * Math.abs(sin / sqrt)) * 4;
        } else {
            i3 = (int) ((((z ? r2 : r3) / width) + 1.0f) * 300.0f);
        }
        a(i, i2, Math.min(i3, 2000));
    }
}
