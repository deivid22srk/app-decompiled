package android.support.v4.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.cw;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements ac {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f406a;
    static final s m;
    private static final int[] n = {R.attr.layout_gravity};
    private static final boolean o;
    private int A;
    private int B;
    private int C;
    private boolean D;
    private float E;
    private float F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private Object J;
    private boolean K;
    private final ArrayList<View> L;

    /* renamed from: b, reason: collision with root package name */
    final by f407b;
    final by c;
    int d;
    boolean e;
    v f;
    public CharSequence g;
    public CharSequence h;
    public Drawable i;
    public Drawable j;
    public Drawable k;
    public Drawable l;
    private final r p;
    private float q;
    private int r;
    private int s;
    private float t;
    private Paint u;
    private final y v;
    private final y w;
    private boolean x;
    private boolean y;
    private int z;

    static {
        o = Build.VERSION.SDK_INT >= 19;
        f406a = Build.VERSION.SDK_INT >= 21;
        if (Build.VERSION.SDK_INT >= 21) {
            m = new t();
        } else {
            m = new u();
        }
    }

    public DrawerLayout(Context context) {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.p = new r(this);
        this.s = -1728053248;
        this.u = new Paint();
        this.y = true;
        this.z = 3;
        this.A = 3;
        this.B = 3;
        this.C = 3;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.r = (int) ((64.0f * f) + 0.5f);
        float f2 = 400.0f * f;
        this.v = new y(this, 3);
        this.w = new y(this, 5);
        this.f407b = by.a(this, 1.0f, this.v);
        this.f407b.j = 1;
        this.f407b.h = f2;
        this.v.f469b = this.f407b;
        this.c = by.a(this, 1.0f, this.w);
        this.c.j = 2;
        this.c.h = f2;
        this.w.f469b = this.c;
        setFocusableInTouchMode(true);
        android.support.v4.view.by.c((View) this, 1);
        android.support.v4.view.by.a(this, new q(this));
        cw.a(this);
        if (android.support.v4.view.by.y(this)) {
            m.a((View) this);
            this.G = m.a(context);
        }
        this.q = f * 10.0f;
        this.L = new ArrayList<>();
    }

    public void setDrawerElevation(float f) {
        this.q = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (d(childAt)) {
                android.support.v4.view.by.f(childAt, this.q);
            }
        }
    }

    public float getDrawerElevation() {
        if (f406a) {
            return this.q;
        }
        return 0.0f;
    }

    @Override // android.support.v4.widget.ac
    public final void a(Object obj, boolean z) {
        this.J = obj;
        this.K = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.s = i;
        invalidate();
    }

    public void setDrawerListener(v vVar) {
        this.f = vVar;
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    private void a(int i, int i2) {
        int a2 = android.support.v4.view.v.a(i2, android.support.v4.view.by.h(this));
        switch (i2) {
            case 3:
                this.z = i;
                break;
            case 5:
                this.A = i;
                break;
            case 8388611:
                this.B = i;
                break;
            case 8388613:
                this.C = i;
                break;
        }
        if (i != 0) {
            (a2 == 3 ? this.f407b : this.c).a();
        }
        switch (i) {
            case 1:
                View a3 = a(a2);
                if (a3 != null) {
                    f(a3);
                    break;
                }
                break;
            case 2:
                View a4 = a(a2);
                if (a4 != null) {
                    e(a4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.view.View r4) {
        /*
            r3 = this;
            r2 = 3
            boolean r0 = d(r4)
            if (r0 != 0) goto L22
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " is not a drawer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L22:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.support.v4.widget.w r0 = (android.support.v4.widget.w) r0
            int r0 = r0.f466a
            int r1 = android.support.v4.view.by.h(r3)
            switch(r0) {
                case 3: goto L33;
                case 5: goto L44;
                case 8388611: goto L55;
                case 8388613: goto L66;
                default: goto L31;
            }
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            int r0 = r3.z
            if (r0 == r2) goto L3a
            int r0 = r3.z
            goto L32
        L3a:
            if (r1 != 0) goto L41
            int r0 = r3.B
        L3e:
            if (r0 == r2) goto L31
            goto L32
        L41:
            int r0 = r3.C
            goto L3e
        L44:
            int r0 = r3.A
            if (r0 == r2) goto L4b
            int r0 = r3.A
            goto L32
        L4b:
            if (r1 != 0) goto L52
            int r0 = r3.C
        L4f:
            if (r0 == r2) goto L31
            goto L32
        L52:
            int r0 = r3.B
            goto L4f
        L55:
            int r0 = r3.B
            if (r0 == r2) goto L5c
            int r0 = r3.B
            goto L32
        L5c:
            if (r1 != 0) goto L63
            int r0 = r3.z
        L60:
            if (r0 == r2) goto L31
            goto L32
        L63:
            int r0 = r3.A
            goto L60
        L66:
            int r0 = r3.C
            if (r0 == r2) goto L6d
            int r0 = r3.C
            goto L32
        L6d:
            if (r1 != 0) goto L74
            int r0 = r3.A
        L71:
            if (r0 == r2) goto L31
            goto L32
        L74:
            int r0 = r3.z
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.a(android.view.View):int");
    }

    final void a(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !d(childAt)) || (z && childAt == view)) {
                android.support.v4.view.by.c(childAt, 1);
            } else {
                android.support.v4.view.by.c(childAt, 4);
            }
        }
    }

    final void a_(View view, float f) {
        w wVar = (w) view.getLayoutParams();
        if (f == wVar.f467b) {
            return;
        }
        wVar.f467b = f;
        if (this.f == null) {
            return;
        }
        this.f.a(view, f);
    }

    static float b(View view) {
        return ((w) view.getLayoutParams()).f467b;
    }

    final int c(View view) {
        return android.support.v4.view.v.a(((w) view.getLayoutParams()).f466a, android.support.v4.view.by.h(this));
    }

    final boolean a(View view, int i) {
        return (c(view) & i) == i;
    }

    private View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((w) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View a(int i) {
        int a2 = android.support.v4.view.v.a(i, android.support.v4.view.by.h(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((c(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public final void a() {
        Drawable drawable;
        Drawable drawable2;
        if (f406a) {
            return;
        }
        int h = android.support.v4.view.by.h(this);
        if (h == 0) {
            if (this.i != null) {
                a(this.i, h);
                drawable = this.i;
            }
            drawable = this.k;
        } else {
            if (this.j != null) {
                a(this.j, h);
                drawable = this.j;
            }
            drawable = this.k;
        }
        this.H = drawable;
        int h2 = android.support.v4.view.by.h(this);
        if (h2 == 0) {
            if (this.j != null) {
                a(this.j, h2);
                drawable2 = this.j;
            }
            drawable2 = this.l;
        } else {
            if (this.i != null) {
                a(this.i, h2);
                drawable2 = this.i;
            }
            drawable2 = this.l;
        }
        this.I = drawable2;
    }

    private static boolean a(Drawable drawable, int i) {
        if (drawable == null || !android.support.v4.c.a.a.b(drawable)) {
            return false;
        }
        android.support.v4.c.a.a.b(drawable, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.x = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                w wVar = (w) childAt.getLayoutParams();
                if (i(childAt)) {
                    childAt.layout(wVar.leftMargin, wVar.topMargin, wVar.leftMargin + childAt.getMeasuredWidth(), wVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        i5 = ((int) (measuredWidth * wVar.f467b)) + (-measuredWidth);
                        f = (measuredWidth + i5) / measuredWidth;
                    } else {
                        i5 = i6 - ((int) (measuredWidth * wVar.f467b));
                        f = (i6 - i5) / measuredWidth;
                    }
                    boolean z2 = f != wVar.f467b;
                    switch (wVar.f466a & 112) {
                        case 16:
                            int i8 = i4 - i2;
                            int i9 = (i8 - measuredHeight) / 2;
                            if (i9 < wVar.topMargin) {
                                i9 = wVar.topMargin;
                            } else if (i9 + measuredHeight > i8 - wVar.bottomMargin) {
                                i9 = (i8 - wVar.bottomMargin) - measuredHeight;
                            }
                            childAt.layout(i5, i9, measuredWidth + i5, measuredHeight + i9);
                            break;
                        case 80:
                            int i10 = i4 - i2;
                            childAt.layout(i5, (i10 - wVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i10 - wVar.bottomMargin);
                            break;
                        default:
                            childAt.layout(i5, wVar.topMargin, measuredWidth + i5, measuredHeight + wVar.topMargin);
                            break;
                    }
                    if (z2) {
                        a_(childAt, f);
                    }
                    int i11 = wVar.f467b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i11) {
                        childAt.setVisibility(i11);
                    }
                }
            }
        }
        this.x = false;
        this.y = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.x) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((w) getChildAt(i).getLayoutParams()).f467b);
        }
        this.t = f;
        if (this.f407b.b() | this.c.b()) {
            android.support.v4.view.by.d(this);
        }
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.G = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.G;
    }

    public void setStatusBarBackground(int i) {
        this.G = i != 0 ? android.support.v4.b.g.a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.G = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        a();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int a2;
        super.onDraw(canvas);
        if (this.K && this.G != null && (a2 = m.a(this.J)) > 0) {
            this.G.setBounds(0, 0, getWidth(), a2);
            this.G.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        boolean z;
        int height = getHeight();
        boolean i2 = i(view);
        int i3 = 0;
        int width = getWidth();
        int save = canvas.save();
        if (i2) {
            int childCount = getChildCount();
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background != null) {
                        z = background.getOpacity() == -1;
                    } else {
                        z = false;
                    }
                    if (z && d(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right <= i3) {
                                right = i3;
                            }
                            i3 = right;
                            i = width;
                        } else {
                            i = childAt.getLeft();
                            if (i < width) {
                            }
                        }
                        i4++;
                        width = i;
                    }
                }
                i = width;
                i4++;
                width = i;
            }
            canvas.clipRect(i3, 0, width, getHeight());
        }
        int i5 = width;
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.t > 0.0f && i2) {
            this.u.setColor((((int) (((this.s & (-16777216)) >>> 24) * this.t)) << 24) | (this.s & 16777215));
            canvas.drawRect(i3, 0.0f, i5, getHeight(), this.u);
        } else if (this.H != null && a(view, 3)) {
            int intrinsicWidth = this.H.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(right2 / this.f407b.i, 1.0f));
            this.H.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.H.setAlpha((int) (255.0f * max));
            this.H.draw(canvas);
        } else if (this.I != null && a(view, 5)) {
            int intrinsicWidth2 = this.I.getIntrinsicWidth();
            int left = view.getLeft();
            float max2 = Math.max(0.0f, Math.min((getWidth() - left) / this.c.i, 1.0f));
            this.I.setBounds(left - intrinsicWidth2, view.getTop(), left, view.getBottom());
            this.I.setAlpha((int) (255.0f * max2));
            this.I.draw(canvas);
        }
        return drawChild;
    }

    private static boolean i(View view) {
        return ((w) view.getLayoutParams()).f466a == 0;
    }

    static boolean d(View view) {
        int a2 = android.support.v4.view.v.a(((w) view.getLayoutParams()).f466a, android.support.v4.view.by.h(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        View b2;
        boolean z4;
        int a2 = android.support.v4.view.bc.a(motionEvent);
        boolean a3 = this.c.a(motionEvent) | this.f407b.a(motionEvent);
        switch (a2) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.E = x;
                this.F = y;
                z2 = this.t > 0.0f && (b2 = this.f407b.b((int) x, (int) y)) != null && i(b2);
                this.D = false;
                this.e = false;
                break;
            case 1:
            case 3:
                a(true);
                this.D = false;
                this.e = false;
                z2 = false;
                break;
            case 2:
                by byVar = this.f407b;
                int length = byVar.c.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if ((byVar.g & (1 << i)) != 0) {
                            float f = byVar.e[i] - byVar.c[i];
                            float f2 = byVar.f[i] - byVar.d[i];
                            z3 = (f * f) + (f2 * f2) > ((float) (byVar.f449b * byVar.f449b));
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.v.a();
                    this.w.a();
                    z2 = false;
                    break;
                }
                z2 = false;
                break;
            default:
                z2 = false;
                break;
        }
        if (!a3 && !z2) {
            int childCount = getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    z4 = false;
                } else if (((w) getChildAt(i2).getLayoutParams()).c) {
                    z4 = true;
                } else {
                    i2++;
                }
            }
            if (!z4 && !this.e) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0015, code lost:
    
        return true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r1 = 1
            r2 = 0
            android.support.v4.widget.by r0 = r7.f407b
            r0.b(r8)
            android.support.v4.widget.by r0 = r7.c
            r0.b(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L16;
                case 1: goto L27;
                case 2: goto L15;
                case 3: goto L69;
                default: goto L15;
            }
        L15:
            return r1
        L16:
            float r0 = r8.getX()
            float r3 = r8.getY()
            r7.E = r0
            r7.F = r3
            r7.D = r2
            r7.e = r2
            goto L15
        L27:
            float r0 = r8.getX()
            float r3 = r8.getY()
            android.support.v4.widget.by r4 = r7.f407b
            int r5 = (int) r0
            int r6 = (int) r3
            android.view.View r4 = r4.b(r5, r6)
            if (r4 == 0) goto L71
            boolean r4 = i(r4)
            if (r4 == 0) goto L71
            float r4 = r7.E
            float r0 = r0 - r4
            float r4 = r7.F
            float r3 = r3 - r4
            android.support.v4.widget.by r4 = r7.f407b
            int r4 = r4.f449b
            float r0 = r0 * r0
            float r3 = r3 * r3
            float r0 = r0 + r3
            int r3 = r4 * r4
            float r3 = (float) r3
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L71
            android.view.View r0 = r7.e()
            if (r0 == 0) goto L71
            int r0 = r7.a(r0)
            r3 = 2
            if (r0 != r3) goto L67
            r0 = r1
        L61:
            r7.a(r0)
            r7.D = r2
            goto L15
        L67:
            r0 = r2
            goto L61
        L69:
            r7.a(r1)
            r7.D = r2
            r7.e = r2
            goto L15
        L71:
            r0 = r1
            goto L61
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.D = z;
        if (z) {
            a(true);
        }
    }

    private void a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            w wVar = (w) childAt.getLayoutParams();
            if (d(childAt) && (!z || wVar.c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    z2 |= this.f407b.a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.c.a(childAt, getWidth(), childAt.getTop());
                }
                wVar.c = false;
            }
        }
        this.v.a();
        this.w.a();
        if (z2) {
            invalidate();
        }
    }

    public final void e(View view) {
        if (!d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        w wVar = (w) view.getLayoutParams();
        if (!this.y) {
            w.b(wVar, 2);
            if (a(view, 3)) {
                this.f407b.a(view, 0, view.getTop());
            } else {
                this.c.a(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            wVar.f467b = 1.0f;
            wVar.d = 1;
            a(view, true);
        }
        invalidate();
    }

    public final void f(View view) {
        if (!d(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        w wVar = (w) view.getLayoutParams();
        if (!this.y) {
            w.b(wVar, 4);
            if (a(view, 3)) {
                this.f407b.a(view, -view.getWidth(), view.getTop());
            } else {
                this.c.a(view, getWidth(), view.getTop());
            }
        } else {
            wVar.f467b = 0.0f;
            wVar.d = 0;
        }
        invalidate();
    }

    public static boolean g(View view) {
        if (d(view)) {
            return (((w) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final boolean b() {
        View a2 = a(8388611);
        if (a2 != null) {
            return g(a2);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new w();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof w ? new w((w) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new w((ViewGroup.MarginLayoutParams) layoutParams) : new w(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof w) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new w(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (d(childAt)) {
                    if (g(childAt)) {
                        z = true;
                        childAt.addFocusables(arrayList, i, i2);
                    }
                } else {
                    this.L.add(childAt);
                }
            }
            if (!z) {
                int size = this.L.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.L.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.L.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (d(childAt)) {
                if (d(childAt)) {
                    if (((w) childAt.getLayoutParams()).f467b > 0.0f) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (f() != null) {
                android.support.v4.view.z.c(keyEvent);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View f = f();
        if (f != null && a(f) == 0) {
            a(false);
        }
        return f != null;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View a2;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f408a != 0 && (a2 = a(savedState.f408a)) != null) {
            e(a2);
        }
        if (savedState.f409b != 3) {
            a(savedState.f409b, 3);
        }
        if (savedState.c != 3) {
            a(savedState.c, 5);
        }
        if (savedState.d != 3) {
            a(savedState.d, 8388611);
        }
        if (savedState.e != 3) {
            a(savedState.e, 8388613);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            w wVar = (w) getChildAt(i).getLayoutParams();
            boolean z = wVar.d == 1;
            boolean z2 = wVar.d == 2;
            if (z || z2) {
                savedState.f408a = wVar.f466a;
                break;
            }
        }
        savedState.f409b = this.z;
        savedState.c = this.A;
        savedState.d = this.B;
        savedState.e = this.C;
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (e() != null || d(view)) {
            android.support.v4.view.by.c(view, 4);
        } else {
            android.support.v4.view.by.c(view, 1);
        }
        if (!o) {
            android.support.v4.view.by.a(view, this.p);
        }
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new x();

        /* renamed from: a, reason: collision with root package name */
        int f408a;

        /* renamed from: b, reason: collision with root package name */
        int f409b;
        int c;
        int d;
        int e;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f408a = 0;
            this.f408a = parcel.readInt();
            this.f409b = parcel.readInt();
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f408a = 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f408a);
            parcel.writeInt(this.f409b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
        }
    }

    static /* synthetic */ boolean h(View view) {
        return (android.support.v4.view.by.e(view) == 4 || android.support.v4.view.by.e(view) == 2) ? false : true;
    }
}
