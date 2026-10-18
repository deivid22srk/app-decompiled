package com.google.android.libraries.bind.widget;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.e;
import com.google.android.libraries.bind.data.f;
import com.google.android.libraries.bind.data.k;
import com.google.android.libraries.bind.data.o;
import com.google.android.libraries.bind.data.p;

/* loaded from: classes.dex */
public final class a extends p {
    static final Paint q = new Paint();
    final ViewGroup d;
    com.google.android.libraries.bind.card.a e;
    int f;
    boolean g;
    boolean h;
    public boolean i;
    e j;
    Bitmap k;
    final Rect l;
    final Rect m;
    boolean n;
    long o;
    long p;
    Data r;

    /* JADX WARN: Multi-variable type inference failed */
    public a(o oVar) {
        super(oVar);
        this.f = -1;
        this.l = new Rect();
        this.m = new Rect();
        com.google.android.libraries.bind.dpkg.a.a(oVar instanceof com.google.android.libraries.bind.data.d);
        com.google.android.libraries.bind.dpkg.a.a(oVar instanceof ViewGroup);
        this.d = (ViewGroup) oVar;
    }

    @Override // com.google.android.libraries.bind.data.p
    public final void a(k kVar) {
        this.r = null;
        super.a(kVar);
    }

    final void a(ViewGroup viewGroup, Data data) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof com.google.android.libraries.bind.data.d) {
                if (((com.google.android.libraries.bind.data.d) childAt).c()) {
                    ((com.google.android.libraries.bind.data.d) childAt).b(data);
                }
            } else if (childAt instanceof f) {
                ((f) childAt).a_(data);
            }
            if ((childAt instanceof ViewGroup) && !(childAt instanceof com.google.android.libraries.bind.data.d)) {
                a((ViewGroup) childAt, data);
            }
        }
    }

    final void d() {
        if (this.k != null) {
            this.k = null;
            this.j = null;
            this.o = 0L;
            this.p = 0L;
            this.n = false;
            this.d.setWillNotDraw(true);
        }
    }

    public static void a(ViewGroup viewGroup) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                if (childAt instanceof com.google.android.libraries.bind.data.d) {
                    ((com.google.android.libraries.bind.data.d) childAt).setOwnedByParent(true);
                }
                a((ViewGroup) childAt);
            }
        }
    }

    @Override // com.google.android.libraries.bind.data.p
    public final Data a() {
        return this.f6699a != null ? this.f6699a.a(0) : this.r;
    }
}
