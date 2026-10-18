package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class em {

    /* renamed from: a, reason: collision with root package name */
    public int f789a;

    /* renamed from: b, reason: collision with root package name */
    public int f790b;
    int c;
    public Interpolator d;
    public boolean e;
    private int f;
    private int g;

    public em() {
        this((byte) 0);
    }

    private em(byte b2) {
        this.c = -1;
        this.e = false;
        this.g = 0;
        this.f789a = 0;
        this.f = 0;
        this.f790b = Integer.MIN_VALUE;
        this.d = null;
    }

    public final void a(int i, int i2, int i3, Interpolator interpolator) {
        this.f789a = i;
        this.f = i2;
        this.f790b = i3;
        this.d = interpolator;
        this.e = true;
    }

    static /* synthetic */ void a(em emVar, RecyclerView recyclerView) {
        if (emVar.c >= 0) {
            int i = emVar.c;
            emVar.c = -1;
            RecyclerView.c(recyclerView, i);
            emVar.e = false;
            return;
        }
        if (!emVar.e) {
            emVar.g = 0;
            return;
        }
        if (emVar.d != null && emVar.f790b <= 0) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        if (emVar.f790b > 0) {
            if (emVar.d != null) {
                recyclerView.ab.a(emVar.f789a, emVar.f, emVar.f790b, emVar.d);
            } else if (emVar.f790b == Integer.MIN_VALUE) {
                recyclerView.ab.a(emVar.f789a, emVar.f);
            } else {
                recyclerView.ab.a(emVar.f789a, emVar.f, emVar.f790b);
            }
            emVar.g++;
            if (emVar.g > 10) {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            emVar.e = false;
            return;
        }
        throw new IllegalStateException("Scroll duration must be a positive number");
    }
}
