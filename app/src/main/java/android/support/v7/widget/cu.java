package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class cu {

    /* renamed from: a, reason: collision with root package name */
    private static Method f750a;

    /* renamed from: b, reason: collision with root package name */
    private static Method f751b;
    private final db A;
    private Runnable B;
    private final Handler C;
    private Rect D;
    private boolean E;
    private int F;
    public PopupWindow c;
    public cx d;
    int e;
    int f;
    int g;
    boolean h;
    public int i;
    int j;
    int k;
    public View l;
    public AdapterView.OnItemClickListener m;
    private Context n;
    private ListAdapter o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private View t;
    private DataSetObserver u;
    private Drawable v;
    private AdapterView.OnItemSelectedListener w;
    private final df x;
    private final de y;
    private final dd z;

    static {
        try {
            f750a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f751b = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
        } catch (NoSuchMethodException e2) {
            Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
    }

    public cu(Context context) {
        this(context, null, android.support.v7.b.b.listPopupWindowStyle);
    }

    public cu(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public cu(Context context, AttributeSet attributeSet, int i, int i2) {
        byte b2 = 0;
        this.p = -2;
        this.e = -2;
        this.q = 1002;
        this.i = 0;
        this.r = false;
        this.s = false;
        this.j = Integer.MAX_VALUE;
        this.k = 0;
        this.x = new df(this, b2);
        this.y = new de(this, b2);
        this.z = new dd(this, b2);
        this.A = new db(this, b2);
        this.D = new Rect();
        this.n = context;
        this.C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.b.l.ListPopupWindow, i, i2);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.b.l.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.g = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.b.l.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.g != 0) {
            this.h = true;
        }
        obtainStyledAttributes.recycle();
        this.c = new ax(context, attributeSet, i);
        this.c.setInputMethodMode(1);
        this.F = android.support.v4.g.h.a(this.n.getResources().getConfiguration().locale);
    }

    public void a(ListAdapter listAdapter) {
        if (this.u == null) {
            this.u = new dc(this, (byte) 0);
        } else if (this.o != null) {
            this.o.unregisterDataSetObserver(this.u);
        }
        this.o = listAdapter;
        if (this.o != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        if (this.d != null) {
            this.d.setAdapter(this.o);
        }
    }

    public final void c() {
        this.E = true;
        this.c.setFocusable(true);
    }

    public final void a(Drawable drawable) {
        this.c.setBackgroundDrawable(drawable);
    }

    public final void a(int i) {
        Drawable background = this.c.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            this.e = this.D.left + this.D.right + i;
        } else {
            this.e = i;
        }
    }

    public final void d() {
        this.c.dismiss();
        if (this.t != null) {
            ViewParent parent = this.t.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.t);
            }
        }
        this.c.setContentView(null);
        this.d = null;
        this.C.removeCallbacks(this.x);
    }

    public final void a(PopupWindow.OnDismissListener onDismissListener) {
        this.c.setOnDismissListener(onDismissListener);
    }

    public final void e() {
        this.c.setInputMethodMode(2);
    }

    public final void f() {
        cx cxVar = this.d;
        if (cxVar == null) {
            return;
        }
        cxVar.h = true;
        cxVar.requestLayout();
    }

    public final boolean g() {
        return this.c.getInputMethodMode() == 2;
    }

    private int a(View view, int i, boolean z) {
        if (f751b != null) {
            try {
                return ((Integer) f751b.invoke(this.c, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.c.getMaxAvailableHeight(view, i);
    }

    public void b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int makeMeasureSpec;
        View view;
        int i7;
        int i8;
        if (this.d == null) {
            Context context = this.n;
            this.B = new cv(this);
            this.d = new cx(context, !this.E);
            if (this.v != null) {
                this.d.setSelector(this.v);
            }
            this.d.setAdapter(this.o);
            this.d.setOnItemClickListener(this.m);
            this.d.setFocusable(true);
            this.d.setFocusableInTouchMode(true);
            this.d.setOnItemSelectedListener(new cw(this));
            this.d.setOnScrollListener(this.z);
            if (this.w != null) {
                this.d.setOnItemSelectedListener(this.w);
            }
            View view2 = this.d;
            View view3 = this.t;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                switch (this.k) {
                    case 0:
                        linearLayout.addView(view3);
                        linearLayout.addView(view2, layoutParams);
                        break;
                    case 1:
                        linearLayout.addView(view2, layoutParams);
                        linearLayout.addView(view3);
                        break;
                    default:
                        Log.e("ListPopupWindow", "Invalid hint position " + this.k);
                        break;
                }
                if (this.e >= 0) {
                    i8 = this.e;
                    i7 = Integer.MIN_VALUE;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                view3.measure(View.MeasureSpec.makeMeasureSpec(i8, i7), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i = layoutParams2.bottomMargin + view3.getMeasuredHeight() + layoutParams2.topMargin;
                view = linearLayout;
            } else {
                view = view2;
                i = 0;
            }
            this.c.setContentView(view);
        } else {
            this.c.getContentView();
            View view4 = this.t;
            if (view4 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view4.getLayoutParams();
                i = layoutParams3.bottomMargin + view4.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.c.getBackground();
        if (background != null) {
            background.getPadding(this.D);
            i2 = this.D.top + this.D.bottom;
            if (!this.h) {
                this.g = -this.D.top;
            }
        } else {
            this.D.setEmpty();
            i2 = 0;
        }
        int a2 = a(this.l, this.g, this.c.getInputMethodMode() == 2);
        if (this.r || this.p == -1) {
            i3 = a2 + i2;
        } else {
            switch (this.e) {
                case -2:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), Integer.MIN_VALUE);
                    break;
                case -1:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.n.getResources().getDisplayMetrics().widthPixels - (this.D.left + this.D.right), 1073741824);
                    break;
                default:
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.e, 1073741824);
                    break;
            }
            int a3 = this.d.a(makeMeasureSpec, a2 - i);
            if (a3 > 0) {
                i += i2;
            }
            i3 = i + a3;
        }
        boolean g = g();
        android.support.v4.widget.as.a(this.c, this.q);
        if (this.c.isShowing()) {
            if (this.e == -1) {
                i5 = -1;
            } else if (this.e == -2) {
                i5 = this.l.getWidth();
            } else {
                i5 = this.e;
            }
            if (this.p == -1) {
                int i9 = g ? i3 : -1;
                if (g) {
                    this.c.setWidth(this.e == -1 ? -1 : 0);
                    this.c.setHeight(0);
                    i6 = i9;
                } else {
                    this.c.setWidth(this.e == -1 ? -1 : 0);
                    this.c.setHeight(-1);
                    i6 = i9;
                }
            } else {
                i6 = this.p == -2 ? i3 : this.p;
            }
            this.c.setOutsideTouchable((this.s || this.r) ? false : true);
            PopupWindow popupWindow = this.c;
            View view5 = this.l;
            int i10 = this.f;
            int i11 = this.g;
            if (i5 < 0) {
                i5 = -1;
            }
            if (i6 < 0) {
                i6 = -1;
            }
            popupWindow.update(view5, i10, i11, i5, i6);
            return;
        }
        if (this.e == -1) {
            i4 = -1;
        } else if (this.e == -2) {
            i4 = this.l.getWidth();
        } else {
            i4 = this.e;
        }
        if (this.p == -1) {
            i3 = -1;
        } else if (this.p != -2) {
            i3 = this.p;
        }
        this.c.setWidth(i4);
        this.c.setHeight(i3);
        if (f750a != null) {
            try {
                f750a.invoke(this.c, true);
            } catch (Exception e) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        this.c.setOutsideTouchable((this.s || this.r) ? false : true);
        this.c.setTouchInterceptor(this.y);
        android.support.v4.widget.as.a(this.c, this.l, this.f, this.g, this.i);
        this.d.setSelection(-1);
        if (!this.E || this.d.isInTouchMode()) {
            f();
        }
        if (!this.E) {
            this.C.post(this.A);
        }
    }
}
