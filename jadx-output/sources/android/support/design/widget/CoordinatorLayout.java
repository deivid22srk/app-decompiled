package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.er;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements android.support.v4.view.bk {

    /* renamed from: a, reason: collision with root package name */
    static final String f63a;

    /* renamed from: b, reason: collision with root package name */
    static final Class<?>[] f64b;
    static final ThreadLocal<Map<String, Constructor<i>>> c;
    static final Comparator<View> e;
    static final p f;
    final Comparator<View> d;
    final List<View> g;
    final Rect h;
    final Rect i;
    private final List<View> j;
    private final List<View> k;
    private final Rect l;
    private final int[] m;
    private boolean n;
    private int[] o;
    private View p;
    private View q;
    private View r;
    private m s;
    private boolean t;
    private er u;
    private boolean v;
    private Drawable w;
    private ViewGroup.OnHierarchyChangeListener x;
    private final android.support.v4.view.bl y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f63a = r0 != null ? r0.getName() : null;
        if (Build.VERSION.SDK_INT >= 21) {
            e = new o();
            f = new q();
        } else {
            e = null;
            f = null;
        }
        f64b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal<>();
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new g(this);
        this.g = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.h = new Rect();
        this.i = new Rect();
        this.l = new Rect();
        this.m = new int[2];
        this.y = new android.support.v4.view.bl(this);
        bi.a(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.design.i.CoordinatorLayout, i, android.support.design.h.Widget_Design_CoordinatorLayout);
        int resourceId = obtainStyledAttributes.getResourceId(android.support.design.i.CoordinatorLayout_keylines, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.o = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.o.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.o[i2] = (int) (r4[i2] * f2);
            }
        }
        this.w = obtainStyledAttributes.getDrawable(android.support.design.i.CoordinatorLayout_statusBarBackground);
        obtainStyledAttributes.recycle();
        if (f != null) {
            f.a(this, new h(this));
        }
        super.setOnHierarchyChangeListener(new k(this));
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.x = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        if (this.t) {
            if (this.s == null) {
                this.s = new m(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.u == null && android.support.v4.view.by.y(this)) {
            android.support.v4.view.by.x(this);
        }
        this.n = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        if (this.r != null) {
            onStopNestedScroll(this.r);
        }
        this.n = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.w = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackground() {
        return this.w;
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? android.support.v4.b.g.a(getContext(), i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowInsets(er erVar) {
        if (this.u != erVar) {
            this.u = erVar;
            this.v = erVar != null && erVar.b() > 0;
            setWillNotDraw(!this.v && getBackground() == null);
            if (!erVar.e()) {
                int childCount = getChildCount();
                er erVar2 = erVar;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (android.support.v4.view.by.y(childAt)) {
                        if (((l) childAt.getLayoutParams()).f138a != null && erVar2.e()) {
                            break;
                        }
                        erVar2 = android.support.v4.view.by.b(childAt, erVar2);
                        if (erVar2.e()) {
                            break;
                        }
                    }
                }
            }
            requestLayout();
        }
    }

    private void a() {
        if (this.p != null) {
            i iVar = ((l) this.p.getLayoutParams()).f138a;
            if (iVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                iVar.a(obtain);
                obtain.recycle();
            }
            this.p = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((l) getChildAt(i).getLayoutParams()).i = false;
        }
    }

    private boolean a(MotionEvent motionEvent, int i) {
        boolean z;
        MotionEvent motionEvent2;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        boolean z5 = false;
        int a2 = android.support.v4.view.bc.a(motionEvent);
        List<View> list = this.j;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        if (e != null) {
            Collections.sort(list, e);
        }
        int size = list.size();
        int i3 = 0;
        MotionEvent motionEvent3 = null;
        while (true) {
            if (i3 < size) {
                View view = list.get(i3);
                l lVar = (l) view.getLayoutParams();
                i iVar = lVar.f138a;
                if ((z4 || z5) && a2 != 0) {
                    if (iVar != null) {
                        if (motionEvent3 == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        } else {
                            motionEvent2 = motionEvent3;
                        }
                        switch (i) {
                            case 0:
                                iVar.a(this, (CoordinatorLayout) view, motionEvent2);
                                z2 = z5;
                                z = z4;
                                continue;
                            case 1:
                                iVar.a(motionEvent2);
                                break;
                        }
                        z2 = z5;
                        z = z4;
                    } else {
                        motionEvent2 = motionEvent3;
                        z = z4;
                        z2 = z5;
                    }
                } else {
                    if (!z4 && iVar != null) {
                        switch (i) {
                            case 0:
                                z4 = iVar.a(this, (CoordinatorLayout) view, motionEvent);
                                break;
                            case 1:
                                z4 = iVar.a(motionEvent);
                                break;
                        }
                        if (z4) {
                            this.p = view;
                        }
                    }
                    z = z4;
                    if (lVar.f138a == null) {
                        lVar.i = false;
                    }
                    boolean z6 = lVar.i;
                    if (lVar.i) {
                        z3 = true;
                    } else {
                        z3 = lVar.i | false;
                        lVar.i = z3;
                    }
                    boolean z7 = z3 && !z6;
                    if (!z3 || z7) {
                        MotionEvent motionEvent4 = motionEvent3;
                        z2 = z7;
                        motionEvent2 = motionEvent4;
                    }
                }
                i3++;
                z5 = z2;
                z4 = z;
                motionEvent3 = motionEvent2;
            } else {
                z = z4;
            }
        }
        list.clear();
        return z;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (a2 == 0) {
            a();
        }
        boolean a3 = a(motionEvent, 0);
        if (a2 == 1 || a2 == 3) {
            a();
        }
        return a3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            r4 = 3
            r10 = 1
            r5 = 0
            r7 = 0
            r2 = 0
            int r9 = android.support.v4.view.bc.a(r12)
            android.view.View r0 = r11.p
            if (r0 != 0) goto L53
            boolean r0 = r11.a(r12, r10)
            if (r0 == 0) goto L50
            r1 = r0
        L14:
            android.view.View r0 = r11.p
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.support.design.widget.l r0 = (android.support.design.widget.l) r0
            android.support.design.widget.i r0 = r0.f138a
            if (r0 == 0) goto L4e
            boolean r0 = r0.a(r12)
            r8 = r0
        L25:
            android.view.View r0 = r11.p
            if (r0 != 0) goto L3c
            boolean r0 = super.onTouchEvent(r12)
            r8 = r8 | r0
            r0 = r2
        L2f:
            if (r0 == 0) goto L34
            r0.recycle()
        L34:
            if (r9 == r10) goto L38
            if (r9 != r4) goto L3b
        L38:
            r11.a()
        L3b:
            return r8
        L3c:
            if (r1 == 0) goto L4c
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = r0
            r6 = r5
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r0, r2, r4, r5, r6, r7)
            super.onTouchEvent(r0)
            goto L2f
        L4c:
            r0 = r2
            goto L2f
        L4e:
            r8 = r7
            goto L25
        L50:
            r1 = r0
            r8 = r7
            goto L25
        L53:
            r1 = r7
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            a();
        }
    }

    private int a(int i) {
        if (this.o == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i < 0 || i >= this.o.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
            return 0;
        }
        return this.o[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    static i a(Context context, AttributeSet attributeSet, String str) {
        Map<String, Constructor<i>> map;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0 && !TextUtils.isEmpty(f63a)) {
            str = f63a + '.' + str;
        }
        try {
            Map<String, Constructor<i>> map2 = c.get();
            if (map2 == null) {
                HashMap hashMap = new HashMap();
                c.set(hashMap);
                map = hashMap;
            } else {
                map = map2;
            }
            Constructor<i> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, true, context.getClassLoader()).getConstructor(f64b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private static l b(View view) {
        l lVar = (l) view.getLayoutParams();
        if (!lVar.f139b) {
            j jVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                jVar = (j) cls.getAnnotation(j.class);
                if (jVar != null) {
                    break;
                }
            }
            j jVar2 = jVar;
            if (jVar2 != null) {
                try {
                    lVar.a(jVar2.a().newInstance());
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + jVar2.a().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            lVar.f139b = true;
        }
        return lVar;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void a(View view, int i) {
        int i2;
        int i3;
        l lVar = (l) view.getLayoutParams();
        if (lVar.g == null && lVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (lVar.g != null) {
            View view2 = lVar.g;
            view.getLayoutParams();
            Rect rect = this.h;
            Rect rect2 = this.i;
            bt.a(this, view2, rect);
            a(view, i, rect, rect2);
            view.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            return;
        }
        if (lVar.e >= 0) {
            int i4 = lVar.e;
            l lVar2 = (l) view.getLayoutParams();
            int a2 = android.support.v4.view.v.a(c(lVar2.c), i);
            int i5 = a2 & 7;
            int i6 = a2 & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (i == 1) {
                i4 = width - i4;
            }
            int a3 = a(i4) - measuredWidth;
            switch (i5) {
                case 1:
                    i2 = a3 + (measuredWidth / 2);
                    break;
                case 5:
                    i2 = a3 + measuredWidth;
                    break;
                default:
                    i2 = a3;
                    break;
            }
            switch (i6) {
                case 16:
                    i3 = (measuredHeight / 2) + 0;
                    break;
                case 80:
                    i3 = measuredHeight + 0;
                    break;
                default:
                    i3 = 0;
                    break;
            }
            int max = Math.max(getPaddingLeft() + lVar2.leftMargin, Math.min(i2, ((width - getPaddingRight()) - measuredWidth) - lVar2.rightMargin));
            int max2 = Math.max(getPaddingTop() + lVar2.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight) - lVar2.bottomMargin));
            view.layout(max, max2, max + measuredWidth, max2 + measuredHeight);
            return;
        }
        l lVar3 = (l) view.getLayoutParams();
        Rect rect3 = this.h;
        rect3.set(getPaddingLeft() + lVar3.leftMargin, getPaddingTop() + lVar3.topMargin, (getWidth() - getPaddingRight()) - lVar3.rightMargin, (getHeight() - getPaddingBottom()) - lVar3.bottomMargin);
        if (this.u != null && android.support.v4.view.by.y(this) && !android.support.v4.view.by.y(view)) {
            rect3.left += this.u.a();
            rect3.top += this.u.b();
            rect3.right -= this.u.c();
            rect3.bottom -= this.u.d();
        }
        Rect rect4 = this.i;
        android.support.v4.view.v.a(b(lVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect3, rect4, i);
        view.layout(rect4.left, rect4.top, rect4.right, rect4.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int h = android.support.v4.view.by.h(this);
        int size = this.g.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.g.get(i5);
            i iVar = ((l) view.getLayoutParams()).f138a;
            if (iVar == null || !iVar.a(this, (CoordinatorLayout) view, h)) {
                a(view, h);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.v && this.w != null) {
            int b2 = this.u != null ? this.u.b() : 0;
            if (b2 > 0) {
                this.w.setBounds(0, 0, getWidth(), b2);
                this.w.draw(canvas);
            }
        }
    }

    final void a(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.set(0, 0, 0, 0);
        } else if (!z) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            bt.a(this, view, rect);
        }
    }

    private void a(View view, int i, Rect rect, Rect rect2) {
        int width;
        int height;
        l lVar = (l) view.getLayoutParams();
        int i2 = lVar.c;
        if (i2 == 0) {
            i2 = 17;
        }
        int a2 = android.support.v4.view.v.a(i2, i);
        int a3 = android.support.v4.view.v.a(b(lVar.d), i);
        int i3 = a2 & 7;
        int i4 = a2 & 112;
        int i5 = a3 & 7;
        int i6 = a3 & 112;
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        switch (i5) {
            case 1:
                width = (rect.width() / 2) + rect.left;
                break;
            case 5:
                width = rect.right;
                break;
            default:
                width = rect.left;
                break;
        }
        switch (i6) {
            case 16:
                height = rect.top + (rect.height() / 2);
                break;
            case 80:
                height = rect.bottom;
                break;
            default:
                height = rect.top;
                break;
        }
        switch (i3) {
            case 1:
                width -= measuredWidth / 2;
                break;
            case 5:
                break;
            default:
                width -= measuredWidth;
                break;
        }
        switch (i4) {
            case 16:
                height -= measuredHeight / 2;
                break;
            case 80:
                break;
            default:
                height -= measuredHeight;
                break;
        }
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getPaddingLeft() + lVar.leftMargin, Math.min(width, ((width2 - getPaddingRight()) - measuredWidth) - lVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + lVar.topMargin, Math.min(height, ((height2 - getPaddingBottom()) - measuredHeight) - lVar.bottomMargin));
        rect2.set(max, max2, max + measuredWidth, max2 + measuredHeight);
    }

    private static int b(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    private static int c(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    final void a(boolean z) {
        i iVar;
        int h = android.support.v4.view.by.h(this);
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            View view = this.g.get(i);
            l lVar = (l) view.getLayoutParams();
            for (int i2 = 0; i2 < i; i2++) {
                if (lVar.h == this.g.get(i2)) {
                    l lVar2 = (l) view.getLayoutParams();
                    if (lVar2.g != null) {
                        Rect rect = this.h;
                        Rect rect2 = this.i;
                        Rect rect3 = this.l;
                        bt.a(this, lVar2.g, rect);
                        a(view, false, rect2);
                        a(view, h, rect, rect3);
                        int i3 = rect3.left - rect2.left;
                        int i4 = rect3.top - rect2.top;
                        if (i3 != 0) {
                            view.offsetLeftAndRight(i3);
                        }
                        if (i4 != 0) {
                            view.offsetTopAndBottom(i4);
                        }
                        if ((i3 != 0 || i4 != 0) && (iVar = lVar2.f138a) != null) {
                            iVar.a(this, (CoordinatorLayout) view, lVar2.g);
                        }
                    }
                }
            }
            Rect rect4 = this.h;
            Rect rect5 = this.i;
            rect4.set(((l) view.getLayoutParams()).l);
            a(view, true, rect5);
            if (!rect4.equals(rect5)) {
                ((l) view.getLayoutParams()).l.set(rect5);
                for (int i5 = i + 1; i5 < size; i5++) {
                    View view2 = this.g.get(i5);
                    l lVar3 = (l) view2.getLayoutParams();
                    i iVar2 = lVar3.f138a;
                    if (iVar2 != null && iVar2.a(view)) {
                        if (z || !lVar3.k) {
                            iVar2.a(this, (CoordinatorLayout) view2, view);
                            if (z) {
                                lVar3.k = false;
                            }
                        } else {
                            lVar3.k = false;
                        }
                    }
                }
            }
        }
    }

    public final List<View> a(View view) {
        l lVar = (l) view.getLayoutParams();
        List<View> list = this.k;
        list.clear();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != view && lVar.a(childAt)) {
                list.add(childAt);
            }
        }
        return list;
    }

    private void b() {
        boolean z;
        boolean z2;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            l lVar = (l) childAt.getLayoutParams();
            if (lVar.g == null) {
                int childCount2 = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 < childCount2) {
                        View childAt2 = getChildAt(i2);
                        if (childAt2 != childAt && lVar.a(childAt2)) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    } else {
                        z2 = false;
                        break;
                    }
                }
            } else {
                z2 = true;
            }
            if (z2) {
                z = true;
                break;
            }
            i++;
        }
        if (z != this.t) {
            if (z) {
                if (this.n) {
                    if (this.s == null) {
                        this.s = new m(this);
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.s);
                }
                this.t = true;
                return;
            }
            if (this.n && this.s != null) {
                getViewTreeObserver().removeOnPreDrawListener(this.s);
            }
            this.t = false;
        }
    }

    public final boolean a(View view, int i, int i2) {
        Rect rect = this.h;
        bt.a(this, view, rect);
        return rect.contains(i, i2);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof l) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onStartNestedScroll(View view, View view2, int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((l) getChildAt(i2).getLayoutParams()).j = false;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.y.f353a = i;
        this.q = view;
        this.r = view2;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).getLayoutParams();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onStopNestedScroll(View view) {
        this.y.f353a = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            l lVar = (l) getChildAt(i).getLayoutParams();
            if (lVar.j) {
                lVar.j = false;
                lVar.k = false;
            }
        }
        this.q = null;
        this.r = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        boolean z = false;
        while (i5 < childCount) {
            l lVar = (l) getChildAt(i5).getLayoutParams();
            i5++;
            z = (!lVar.j || lVar.f138a == null) ? z : true;
        }
        if (z) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        int i3;
        int i4;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (i5 < childCount) {
            l lVar = (l) getChildAt(i5).getLayoutParams();
            if (!lVar.j || lVar.f138a == null) {
                z = z2;
                i3 = i6;
                i4 = i7;
            } else {
                int[] iArr2 = this.m;
                this.m[1] = 0;
                iArr2[0] = 0;
                int max = i > 0 ? Math.max(i7, this.m[0]) : Math.min(i7, this.m[0]);
                int max2 = i2 > 0 ? Math.max(i6, this.m[1]) : Math.min(i6, this.m[1]);
                i4 = max;
                i3 = max2;
                z = true;
            }
            i5++;
            i7 = i4;
            i6 = i3;
            z2 = z;
        }
        iArr[0] = i7;
        iArr[1] = i6;
        if (z2) {
            a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.bk
    public boolean onNestedPreFling(View view, float f2, float f3) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.y.f353a;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        SparseArray<Parcelable> sparseArray = savedState.f65a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            i iVar = b(childAt).f138a;
            if (id != -1 && iVar != null) {
                sparseArray.get(id);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        AbsSavedState absSavedState;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            i iVar = ((l) childAt.getLayoutParams()).f138a;
            if (id != -1 && iVar != null && (absSavedState = View.BaseSavedState.EMPTY_STATE) != null) {
                sparseArray.append(id, absSavedState);
            }
        }
        savedState.f65a = sparseArray;
        return savedState;
    }

    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = android.support.v4.os.b.a(new n());

        /* renamed from: a, reason: collision with root package name */
        SparseArray<Parcelable> f65a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f65a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f65a.append(iArr[i], readParcelableArray[i]);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int size = this.f65a != null ? this.f65a.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f65a.keyAt(i2);
                parcelableArr[i2] = this.f65a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    private static void a(List<View> list, Comparator<View> comparator) {
        if (list != null && list.size() >= 2) {
            View[] viewArr = new View[list.size()];
            list.toArray(viewArr);
            int length = viewArr.length;
            for (int i = 0; i < length; i++) {
                int i2 = i;
                for (int i3 = i + 1; i3 < length; i3++) {
                    if (comparator.compare(viewArr[i3], viewArr[i2]) < 0) {
                        i2 = i3;
                    }
                }
                if (i != i2) {
                    View view = viewArr[i2];
                    viewArr[i2] = viewArr[i];
                    viewArr[i] = view;
                }
            }
            list.clear();
            for (View view2 : viewArr) {
                list.add(view2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.view.ViewParent] */
    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        this.g.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            l b2 = b(childAt);
            if (b2.f == -1) {
                b2.h = null;
                b2.g = null;
            } else {
                if (b2.g != null) {
                    if (b2.g.getId() != b2.f) {
                        z = false;
                    } else {
                        CoordinatorLayout coordinatorLayout = b2.g;
                        for (CoordinatorLayout coordinatorLayout2 = b2.g.getParent(); coordinatorLayout2 != this; coordinatorLayout2 = coordinatorLayout2.getParent()) {
                            if (coordinatorLayout2 == null || coordinatorLayout2 == childAt) {
                                b2.h = null;
                                b2.g = null;
                                z = false;
                                break;
                            }
                            if (coordinatorLayout2 instanceof View) {
                                coordinatorLayout = coordinatorLayout2;
                            }
                        }
                        b2.h = coordinatorLayout;
                        z = true;
                    }
                    if (z) {
                        continue;
                    }
                }
                b2.g = findViewById(b2.f);
                if (b2.g != null) {
                    if (b2.g == this) {
                        if (isInEditMode()) {
                            b2.h = null;
                            b2.g = null;
                        } else {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        CoordinatorLayout coordinatorLayout3 = b2.g;
                        for (CoordinatorLayout coordinatorLayout4 = b2.g.getParent(); coordinatorLayout4 != this && coordinatorLayout4 != null; coordinatorLayout4 = coordinatorLayout4.getParent()) {
                            if (coordinatorLayout4 == childAt) {
                                if (isInEditMode()) {
                                    b2.h = null;
                                    b2.g = null;
                                } else {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (coordinatorLayout4 instanceof View) {
                                    coordinatorLayout3 = coordinatorLayout4;
                                }
                            }
                        }
                        b2.h = coordinatorLayout3;
                    }
                } else if (isInEditMode()) {
                    b2.h = null;
                    b2.g = null;
                } else {
                    throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + getResources().getResourceName(b2.f) + " to anchor view " + childAt);
                }
            }
            this.g.add(childAt);
        }
        a(this.g, this.d);
        b();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int h = android.support.v4.view.by.h(this);
        boolean z2 = h == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i6 = paddingLeft + paddingRight;
        int i7 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int i8 = 0;
        boolean z3 = this.u != null && android.support.v4.view.by.y(this);
        int size3 = this.g.size();
        int i9 = 0;
        while (true) {
            int i10 = i9;
            int i11 = i8;
            int i12 = suggestedMinimumHeight;
            int i13 = suggestedMinimumWidth;
            if (i10 < size3) {
                View view = this.g.get(i10);
                l lVar = (l) view.getLayoutParams();
                int i14 = 0;
                if (lVar.e >= 0 && mode != 0) {
                    int a2 = a(lVar.e);
                    int a3 = android.support.v4.view.v.a(c(lVar.c), h) & 7;
                    if ((a3 == 3 && !z2) || (a3 == 5 && z2)) {
                        i14 = Math.max(0, (size - paddingRight) - a2);
                    } else if ((a3 == 5 && !z2) || (a3 == 3 && z2)) {
                        i14 = Math.max(0, a2 - paddingLeft);
                    }
                }
                if (!z3 || android.support.v4.view.by.y(view)) {
                    i3 = i2;
                    i4 = i;
                } else {
                    int a4 = this.u.a() + this.u.c();
                    int d = this.u.d() + this.u.b();
                    i4 = View.MeasureSpec.makeMeasureSpec(size - a4, mode);
                    i3 = View.MeasureSpec.makeMeasureSpec(size2 - d, mode2);
                }
                measureChildWithMargins(view, i4, i14, i3, 0);
                suggestedMinimumWidth = Math.max(i13, view.getMeasuredWidth() + i6 + lVar.leftMargin + lVar.rightMargin);
                suggestedMinimumHeight = Math.max(i12, view.getMeasuredHeight() + i7 + lVar.topMargin + lVar.bottomMargin);
                i8 = android.support.v4.view.by.a(i11, android.support.v4.view.by.l(view));
                i9 = i10 + 1;
            } else {
                setMeasuredDimension(android.support.v4.view.by.a(i13, i, (-16777216) & i11), android.support.v4.view.by.a(i12, i2, i11 << 16));
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new l();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof l) {
            return new l((l) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new l((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new l(layoutParams);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l(getContext(), attributeSet);
    }
}
