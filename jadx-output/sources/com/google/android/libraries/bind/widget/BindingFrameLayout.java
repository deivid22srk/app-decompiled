package com.google.android.libraries.bind.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.k;
import com.google.android.libraries.bind.e;

/* loaded from: classes.dex */
public class BindingFrameLayout extends b implements com.google.android.libraries.bind.data.d {
    protected final a c;

    public BindingFrameLayout(Context context) {
        this(context, null, 0);
    }

    public BindingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BindingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new a(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.BindingFrameLayout);
        this.c.g = obtainStyledAttributes.getBoolean(e.BindingFrameLayout_bind__isOwnedByParent, false);
        this.c.h = obtainStyledAttributes.getBoolean(e.BindingFrameLayout_bind__supportsAnimationCapture, true);
        obtainStyledAttributes.recycle();
    }

    public a getBindingViewGroupHelper() {
        return this.c;
    }

    @Override // com.google.android.libraries.bind.data.o
    public void setDataRow(k kVar) {
        this.c.a(kVar);
    }

    @Override // com.google.android.libraries.bind.data.o
    public k getDataRow() {
        return this.c.f6699a;
    }

    public Data getData() {
        return this.c.a();
    }

    @Override // com.google.android.libraries.bind.data.d
    public final void a() {
        a aVar = this.c;
        aVar.a((k) null);
        aVar.e = null;
        aVar.f = -1;
        aVar.d.setOnLongClickListener(null);
        aVar.d.setLongClickable(false);
        if (Build.VERSION.SDK_INT >= 14) {
            aVar.d.animate().cancel();
        }
        if (Build.VERSION.SDK_INT >= 12) {
            aVar.d.setTranslationX(0.0f);
            aVar.d.setTranslationY(0.0f);
            aVar.d.setScaleX(1.0f);
            aVar.d.setScaleY(1.0f);
            aVar.d.setAlpha(1.0f);
            aVar.d.setRotation(0.0f);
        }
        if (!(aVar.d instanceof com.google.android.libraries.bind.data.d)) {
            return;
        }
        ((com.google.android.libraries.bind.data.d) aVar.d).d();
    }

    @Override // com.google.android.libraries.bind.data.d
    public final boolean b() {
        a aVar = this.c;
        if (aVar.e != null) {
            com.google.android.libraries.bind.card.a aVar2 = aVar.e;
            ViewGroup viewGroup = aVar.d;
            int i = aVar.f;
            com.google.android.libraries.bind.card.a.f6670a.d("startEditing position: %d", Integer.valueOf(i));
            ViewParent parent = viewGroup.getParent();
            com.google.android.libraries.bind.experimental.card.a aVar3 = null;
            while (true) {
                if (parent == null) {
                    break;
                }
                if (parent instanceof com.google.android.libraries.bind.experimental.card.a) {
                    aVar3 = (com.google.android.libraries.bind.experimental.card.a) parent;
                    break;
                }
                parent = parent.getParent();
            }
            if (aVar3 != null) {
                Object b2 = aVar2.f6671b.a(i).b(com.google.android.libraries.bind.experimental.card.a.f6715a);
                if (b2 == null ? false : ((Boolean) b2).booleanValue()) {
                    aVar2.f6671b.b(i);
                    return aVar3.a();
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        a.a(this.c.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.c;
        aVar.f6700b = false;
        aVar.c = false;
        aVar.c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.c;
        aVar.f6700b = true;
        aVar.c = false;
        aVar.c();
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        a aVar = this.c;
        aVar.c = true;
        aVar.c();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.c.b();
    }

    @Override // com.google.android.libraries.bind.data.o
    public final void b(Data data) {
        a aVar = this.c;
        ((com.google.android.libraries.bind.data.d) aVar.d).a(data);
        aVar.r = data;
        aVar.d();
        aVar.a(aVar.d, data);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        a aVar = this.c;
        if (aVar.j != com.google.android.libraries.bind.data.e.SHOW_SOURCE_HIDE_DESTINATION && (aVar.d instanceof com.google.android.libraries.bind.data.d)) {
            ((com.google.android.libraries.bind.data.d) aVar.d).a(canvas);
        }
        if (aVar.k == null || aVar.i) {
            return;
        }
        if ((System.currentTimeMillis() - aVar.o) / aVar.p >= 1.0f) {
            aVar.d();
            return;
        }
        if (!aVar.n) {
            aVar.m.left = 0;
            aVar.m.top = 0;
            aVar.m.right = aVar.d.getWidth();
            aVar.m.bottom = aVar.d.getHeight();
            if (aVar.l.left < 0) {
                aVar.m.left += ((-aVar.l.left) * aVar.d.getWidth()) / aVar.l.width();
            }
            if (aVar.l.top < 0) {
                aVar.m.top += ((-aVar.l.top) * aVar.d.getHeight()) / aVar.l.height();
            }
            if (aVar.l.right > aVar.k.getWidth()) {
                aVar.m.right -= ((aVar.l.right - aVar.k.getWidth()) * aVar.d.getWidth()) / aVar.l.width();
            }
            if (aVar.l.bottom > aVar.k.getHeight()) {
                aVar.m.bottom -= ((aVar.l.bottom - aVar.k.getHeight()) * aVar.d.getHeight()) / aVar.l.height();
            }
            aVar.l.left = Math.max(0, aVar.l.left);
            aVar.l.top = Math.max(0, aVar.l.top);
            aVar.l.right = Math.min(aVar.k.getWidth(), aVar.l.right);
            aVar.l.bottom = Math.min(aVar.k.getHeight(), aVar.l.bottom);
            aVar.n = true;
        }
        if (aVar.j == com.google.android.libraries.bind.data.e.FADE_SOURCE_ONLY) {
            a.q.setAlpha((int) Math.floor((1.0f - r0) * 255.0f));
        }
        canvas.drawBitmap(aVar.k, aVar.l, aVar.m, a.q);
        aVar.d.invalidate();
    }

    @Override // com.google.android.libraries.bind.data.d
    public void setOwnedByParent(boolean z) {
        this.c.g = z;
    }

    @Override // com.google.android.libraries.bind.data.d
    public final boolean c() {
        return this.c.g;
    }

    @Override // com.google.android.libraries.bind.data.d
    public final void a(Bitmap bitmap, Rect rect, long j, com.google.android.libraries.bind.data.e eVar) {
        a aVar = this.c;
        com.google.android.libraries.bind.d.a.a(j > 0);
        aVar.j = eVar;
        aVar.k = bitmap;
        if (aVar.k == null) {
            return;
        }
        aVar.l.set(rect);
        aVar.o = System.currentTimeMillis();
        aVar.p = j;
        aVar.d.setWillNotDraw(false);
        aVar.d.invalidate();
    }

    @Override // com.google.android.libraries.bind.data.d
    public final boolean a(Bitmap bitmap, float f, float f2) {
        a aVar = this.c;
        if (!aVar.h || aVar.d.getWidth() <= 0 || aVar.d.getHeight() <= 0) {
            return false;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.translate(f, f2);
        canvas.clipRect(new Rect(0, 0, aVar.d.getWidth(), aVar.d.getHeight()));
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        aVar.i = true;
        aVar.d.draw(canvas);
        aVar.i = false;
        return true;
    }

    @Override // com.google.android.libraries.bind.data.d
    public final void a(Data data) {
        a_(data);
    }

    @Override // com.google.android.libraries.bind.data.d
    public final void a(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.libraries.bind.data.d
    public final void d() {
        setMeasuredDimension(0, 0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        a aVar = this.c;
        if (aVar.c) {
            aVar.b();
        }
        super.onMeasure(i, i2);
    }
}
