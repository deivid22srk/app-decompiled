package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.jm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ScreenshotGallery extends FrameLayout implements com.google.android.finsky.adapters.ai, am, an, by {

    /* renamed from: a, reason: collision with root package name */
    public com.google.android.finsky.navigationmanager.b f3072a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.play.image.e f3073b;
    public Document c;
    public boolean d;
    public HorizontalStrip e;
    private Resources f;
    private bv g;
    private com.google.android.finsky.adapters.ag h;
    private int i;
    private int j;
    private AsyncTask<Void, Integer, Void> k;
    private List<com.google.android.finsky.protos.ds> l;
    private final List<com.google.android.play.image.j> m;
    private SparseArray<List<com.google.android.finsky.protos.ds>> n;
    private final Handler o;
    private final Runnable p;

    static /* synthetic */ int d(ScreenshotGallery screenshotGallery) {
        int i = screenshotGallery.j + 1;
        screenshotGallery.j = i;
        return i;
    }

    public ScreenshotGallery(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScreenshotGallery(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = new ArrayList();
        this.n = new SparseArray<>();
        this.o = new Handler(Looper.myLooper());
        this.p = new dt(this);
        this.n.put(1, Collections.emptyList());
        this.n.put(3, Collections.emptyList());
        this.n.put(13, Collections.emptyList());
        this.f = context.getResources();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = (HorizontalStrip) findViewById(R.id.strip);
        this.g = new bv(this, R.id.strip, this);
        this.g.a(500);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    public final void a() {
        boolean z;
        int height = getHeight();
        if (height == 0 || height == this.i || this.f3073b == null || getVisibility() == 8) {
            return;
        }
        List<com.google.android.finsky.protos.ds> b2 = this.c.V() ? this.c.b(1) : Collections.emptyList();
        if (b2.isEmpty()) {
            if (this.d) {
                setVisibility(8);
                return;
            }
            return;
        }
        if (this.c != null && this.c.f1963a.f3890a.equals(this.c.f1963a.f3890a) && getVisibility() == 0) {
            List<com.google.android.finsky.protos.ds> list = this.n.get(1);
            if (b2.size() == list.size()) {
                int i = 0;
                while (true) {
                    if (i >= b2.size()) {
                        z = true;
                        break;
                    } else {
                        if (!b2.get(i).f.equals(list.get(i).f)) {
                            z = false;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = false;
            }
            if (z) {
                return;
            }
        }
        this.n.clear();
        this.n.put(1, b2);
        this.l = com.google.android.finsky.utils.cz.a(b2);
        if (this.h != null) {
            this.h.d.unregisterAll();
        }
        int size = b2.size();
        int[] iArr = new int[size];
        Arrays.fill(iArr, 2);
        this.e.setAppScreenshotStates(iArr);
        this.h = new com.google.android.finsky.adapters.ag(size, this);
        this.e.setAdapter(this.h);
        this.i = getHeight();
        for (com.google.android.play.image.j jVar : this.m) {
            if (jVar != null) {
                jVar.a();
            }
        }
        this.m.clear();
        if (this.k != null) {
            this.k.cancel(true);
        }
        this.k = new du(this);
        jm.a(this.k, new Void[0]);
    }

    @Override // com.google.android.finsky.adapters.ai
    public final void a(int i) {
        this.f3072a.a(this.c, i, false);
    }

    @Override // com.google.android.finsky.layout.by
    public final void n_() {
        this.i = 0;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.k != null) {
            this.k.cancel(true);
        }
        if (this.h != null) {
            this.h.d.unregisterAll();
        }
        this.o.removeCallbacks(this.p);
        this.e.setAdapter(null);
        this.h = null;
        super.onDetachedFromWindow();
    }

    static /* synthetic */ void a(ScreenshotGallery screenshotGallery, int i) {
        boolean z;
        if (screenshotGallery.h != null) {
            int size = screenshotGallery.l.size();
            screenshotGallery.j = 0;
            com.google.android.finsky.protos.ds dsVar = screenshotGallery.l.get(i);
            if (dsVar == null) {
                screenshotGallery.m.add(null);
                return;
            }
            screenshotGallery.h.c[i] = dsVar.e;
            if (dsVar.l) {
                screenshotGallery.getHeight();
            }
            com.google.android.play.image.j a2 = screenshotGallery.f3073b.a(dsVar.f, 0, screenshotGallery.getHeight(), new dv(screenshotGallery, i, size));
            screenshotGallery.m.add(a2);
            if (a2.f6944a != null) {
                z = true;
                screenshotGallery.h.a(i, new BitmapDrawable(screenshotGallery.f, a2.f6944a));
                screenshotGallery.m.set(i, null);
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            screenshotGallery.g.b();
            screenshotGallery.o.post(screenshotGallery.p);
        }
    }
}
