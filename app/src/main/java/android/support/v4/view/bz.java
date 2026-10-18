package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class bz implements cl {

    /* renamed from: a, reason: collision with root package name */
    WeakHashMap<View, dy> f360a = null;

    bz() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[ORIG_RETURN, RETURN] */
    @Override // android.support.v4.view.cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.View r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            boolean r2 = r6 instanceof android.support.v4.view.bs
            if (r2 == 0) goto L29
            android.support.v4.view.bs r6 = (android.support.v4.view.bs) r6
            int r2 = r6.computeHorizontalScrollOffset()
            int r3 = r6.computeHorizontalScrollRange()
            int r4 = r6.computeHorizontalScrollExtent()
            int r3 = r3 - r4
            if (r3 == 0) goto L27
            if (r7 >= 0) goto L21
            if (r2 <= 0) goto L1f
            r2 = r0
        L1c:
            if (r2 == 0) goto L29
        L1e:
            return r0
        L1f:
            r2 = r1
            goto L1c
        L21:
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L27
            r2 = r0
            goto L1c
        L27:
            r2 = r1
            goto L1c
        L29:
            r0 = r1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.bz.a(android.view.View, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e A[ORIG_RETURN, RETURN] */
    @Override // android.support.v4.view.cl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.view.View r6, int r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            boolean r2 = r6 instanceof android.support.v4.view.bs
            if (r2 == 0) goto L29
            android.support.v4.view.bs r6 = (android.support.v4.view.bs) r6
            int r2 = r6.computeVerticalScrollOffset()
            int r3 = r6.computeVerticalScrollRange()
            int r4 = r6.computeVerticalScrollExtent()
            int r3 = r3 - r4
            if (r3 == 0) goto L27
            if (r7 >= 0) goto L21
            if (r2 <= 0) goto L1f
            r2 = r0
        L1c:
            if (r2 == 0) goto L29
        L1e:
            return r0
        L1f:
            r2 = r1
            goto L1c
        L21:
            int r3 = r3 + (-1)
            if (r2 >= r3) goto L27
            r2 = r0
            goto L1c
        L27:
            r2 = r1
            goto L1c
        L29:
            r0 = r1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.bz.b(android.view.View, int):boolean");
    }

    @Override // android.support.v4.view.cl
    public int a(View view) {
        return 2;
    }

    @Override // android.support.v4.view.cl
    public void a(View view, a aVar) {
    }

    @Override // android.support.v4.view.cl
    public boolean b(View view) {
        return false;
    }

    @Override // android.support.v4.view.cl
    public boolean c(View view) {
        return false;
    }

    @Override // android.support.v4.view.cl
    public void d(View view) {
        view.invalidate();
    }

    @Override // android.support.v4.view.cl
    public void a(View view, Runnable runnable) {
        view.postDelayed(runnable, a());
    }

    @Override // android.support.v4.view.cl
    public void a(View view, Runnable runnable, long j) {
        view.postDelayed(runnable, a() + j);
    }

    long a() {
        return 10L;
    }

    @Override // android.support.v4.view.cl
    public int e(View view) {
        return 0;
    }

    @Override // android.support.v4.view.cl
    public void c(View view, int i) {
    }

    @Override // android.support.v4.view.cl
    public float f(View view) {
        return 1.0f;
    }

    @Override // android.support.v4.view.cl
    public void a(View view, int i, Paint paint) {
    }

    @Override // android.support.v4.view.cl
    public int g(View view) {
        return 0;
    }

    @Override // android.support.v4.view.cl
    public int h(View view) {
        return 0;
    }

    @Override // android.support.v4.view.cl
    public ViewParent i(View view) {
        return view.getParent();
    }

    @Override // android.support.v4.view.cl
    public int a(int i, int i2, int i3) {
        return View.resolveSize(i, i2);
    }

    @Override // android.support.v4.view.cl
    public int j(View view) {
        return view.getMeasuredWidth();
    }

    @Override // android.support.v4.view.cl
    public int k(View view) {
        return view.getMeasuredHeight();
    }

    @Override // android.support.v4.view.cl
    public int l(View view) {
        return 0;
    }

    @Override // android.support.v4.view.cl
    public void m(View view) {
    }

    @Override // android.support.v4.view.cl
    public int n(View view) {
        return view.getPaddingLeft();
    }

    @Override // android.support.v4.view.cl
    public int o(View view) {
        return view.getPaddingRight();
    }

    @Override // android.support.v4.view.cl
    public void a(View view, int i, int i2, int i3, int i4) {
        view.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.v4.view.cl
    public boolean p(View view) {
        return true;
    }

    @Override // android.support.v4.view.cl
    public float q(View view) {
        return 0.0f;
    }

    @Override // android.support.v4.view.cl
    public float r(View view) {
        return 0.0f;
    }

    @Override // android.support.v4.view.cl
    public float s(View view) {
        return 0.0f;
    }

    @Override // android.support.v4.view.cl
    public int t(View view) {
        return cm.a(view);
    }

    @Override // android.support.v4.view.cl
    public int u(View view) {
        return cm.b(view);
    }

    @Override // android.support.v4.view.cl
    public dy v(View view) {
        return new dy(view);
    }

    @Override // android.support.v4.view.cl
    public void a(View view, float f) {
    }

    @Override // android.support.v4.view.cl
    public void b(View view, float f) {
    }

    @Override // android.support.v4.view.cl
    public void c(View view, float f) {
    }

    @Override // android.support.v4.view.cl
    public void d(View view, float f) {
    }

    @Override // android.support.v4.view.cl
    public void e(View view, float f) {
    }

    @Override // android.support.v4.view.cl
    public int w(View view) {
        return 0;
    }

    @Override // android.support.v4.view.cl
    public void x(View view) {
    }

    @Override // android.support.v4.view.cl
    public void f(View view, float f) {
    }

    @Override // android.support.v4.view.cl
    public float y(View view) {
        return 0.0f;
    }

    @Override // android.support.v4.view.cl
    public void g(View view, float f) {
    }

    public float z(View view) {
        return 0.0f;
    }

    @Override // android.support.v4.view.cl
    public void a(ViewGroup viewGroup) {
    }

    @Override // android.support.v4.view.cl
    public boolean A(View view) {
        return false;
    }

    @Override // android.support.v4.view.cl
    public void B(View view) {
    }

    @Override // android.support.v4.view.cl
    public void a(View view, bm bmVar) {
    }

    @Override // android.support.v4.view.cl
    public er a(View view, er erVar) {
        return erVar;
    }

    @Override // android.support.v4.view.cl
    public er b(View view, er erVar) {
        return erVar;
    }

    @Override // android.support.v4.view.cl
    public void C(View view) {
    }

    @Override // android.support.v4.view.cl
    public void a(View view, boolean z) {
    }

    @Override // android.support.v4.view.cl
    public boolean D(View view) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.cl
    public boolean E(View view) {
        if (view instanceof bi) {
            return ((bi) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.cl
    public void H(View view) {
        if (view instanceof bi) {
            ((bi) view).stopNestedScroll();
        }
    }

    @Override // android.support.v4.view.cl
    public int a(int i, int i2) {
        return i | i2;
    }

    @Override // android.support.v4.view.cl
    public float J(View view) {
        return z(view) + y(view);
    }

    @Override // android.support.v4.view.cl
    public boolean L(View view) {
        return false;
    }

    @Override // android.support.v4.view.cl
    public void d(View view, int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.cl
    public ColorStateList F(View view) {
        if (view instanceof bt) {
            return ((bt) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.cl
    public void a(View view, ColorStateList colorStateList) {
        if (!(view instanceof bt)) {
            return;
        }
        ((bt) view).setSupportBackgroundTintList(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.cl
    public void a(View view, PorterDuff.Mode mode) {
        if (!(view instanceof bt)) {
            return;
        }
        ((bt) view).setSupportBackgroundTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.support.v4.view.cl
    public PorterDuff.Mode G(View view) {
        if (view instanceof bt) {
            return ((bt) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    @Override // android.support.v4.view.cl
    public boolean I(View view) {
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    @Override // android.support.v4.view.cl
    public boolean K(View view) {
        return view.getWindowToken() != null;
    }
}
