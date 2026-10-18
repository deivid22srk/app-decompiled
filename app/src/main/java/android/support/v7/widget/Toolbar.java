package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private CharSequence A;
    private CharSequence B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private final ArrayList<View> G;
    private final int[] H;
    private gd I;
    private final w J;
    private gf K;
    private boolean L;
    private final Runnable M;
    private final ao N;

    /* renamed from: a, reason: collision with root package name */
    ActionMenuView f634a;

    /* renamed from: b, reason: collision with root package name */
    TextView f635b;
    TextView c;
    View d;
    Context e;
    int f;
    int g;
    int h;
    final et i;
    final ArrayList<View> j;
    k k;
    gb l;
    android.support.v7.view.menu.y m;
    android.support.v7.view.menu.j n;
    private ImageButton o;
    private ImageView p;
    private Drawable q;
    private CharSequence r;
    private ImageButton s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = new et();
        this.z = 8388627;
        this.G = new ArrayList<>();
        this.j = new ArrayList<>();
        this.H = new int[2];
        this.J = new fy(this);
        this.M = new fz(this);
        fx a2 = fx.a(getContext(), attributeSet, android.support.v7.b.l.Toolbar, i);
        this.g = a2.e(android.support.v7.b.l.Toolbar_titleTextAppearance, 0);
        this.h = a2.e(android.support.v7.b.l.Toolbar_subtitleTextAppearance, 0);
        this.z = a2.f836a.getInteger(android.support.v7.b.l.Toolbar_android_gravity, this.z);
        this.t = 48;
        int b2 = a2.b(android.support.v7.b.l.Toolbar_titleMargins, 0);
        this.y = b2;
        this.x = b2;
        this.w = b2;
        this.v = b2;
        int b3 = a2.b(android.support.v7.b.l.Toolbar_titleMarginStart, -1);
        if (b3 >= 0) {
            this.v = b3;
        }
        int b4 = a2.b(android.support.v7.b.l.Toolbar_titleMarginEnd, -1);
        if (b4 >= 0) {
            this.w = b4;
        }
        int b5 = a2.b(android.support.v7.b.l.Toolbar_titleMarginTop, -1);
        if (b5 >= 0) {
            this.x = b5;
        }
        int b6 = a2.b(android.support.v7.b.l.Toolbar_titleMarginBottom, -1);
        if (b6 >= 0) {
            this.y = b6;
        }
        this.u = a2.c(android.support.v7.b.l.Toolbar_maxButtonHeight, -1);
        int b7 = a2.b(android.support.v7.b.l.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b8 = a2.b(android.support.v7.b.l.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a2.c(android.support.v7.b.l.Toolbar_contentInsetLeft, 0);
        int c2 = a2.c(android.support.v7.b.l.Toolbar_contentInsetRight, 0);
        et etVar = this.i;
        etVar.h = false;
        if (c != Integer.MIN_VALUE) {
            etVar.e = c;
            etVar.f799a = c;
        }
        if (c2 != Integer.MIN_VALUE) {
            etVar.f = c2;
            etVar.f800b = c2;
        }
        if (b7 != Integer.MIN_VALUE || b8 != Integer.MIN_VALUE) {
            this.i.a(b7, b8);
        }
        this.q = a2.a(android.support.v7.b.l.Toolbar_collapseIcon);
        this.r = a2.c(android.support.v7.b.l.Toolbar_collapseContentDescription);
        CharSequence c3 = a2.c(android.support.v7.b.l.Toolbar_title);
        if (!TextUtils.isEmpty(c3)) {
            setTitle(c3);
        }
        CharSequence c4 = a2.c(android.support.v7.b.l.Toolbar_subtitle);
        if (!TextUtils.isEmpty(c4)) {
            setSubtitle(c4);
        }
        this.e = getContext();
        setPopupTheme(a2.e(android.support.v7.b.l.Toolbar_popupTheme, 0));
        Drawable a3 = a2.a(android.support.v7.b.l.Toolbar_navigationIcon);
        if (a3 != null) {
            setNavigationIcon(a3);
        }
        CharSequence c5 = a2.c(android.support.v7.b.l.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(c5)) {
            setNavigationContentDescription(c5);
        }
        Drawable a4 = a2.a(android.support.v7.b.l.Toolbar_logo);
        if (a4 != null) {
            setLogo(a4);
        }
        CharSequence c6 = a2.c(android.support.v7.b.l.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(c6)) {
            setLogoDescription(c6);
        }
        if (a2.e(android.support.v7.b.l.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.d(android.support.v7.b.l.Toolbar_titleTextColor));
        }
        if (a2.e(android.support.v7.b.l.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.d(android.support.v7.b.l.Toolbar_subtitleTextColor));
        }
        a2.f836a.recycle();
        this.N = ao.a();
    }

    public void setPopupTheme(int i) {
        if (this.f != i) {
            this.f = i;
            if (i == 0) {
                this.e = getContext();
            } else {
                this.e = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.f;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        et etVar = this.i;
        boolean z = i == 1;
        if (z != etVar.g) {
            etVar.g = z;
            if (etVar.h) {
                if (z) {
                    etVar.f799a = etVar.d != Integer.MIN_VALUE ? etVar.d : etVar.e;
                    etVar.f800b = etVar.c != Integer.MIN_VALUE ? etVar.c : etVar.f;
                    return;
                } else {
                    etVar.f799a = etVar.c != Integer.MIN_VALUE ? etVar.c : etVar.e;
                    etVar.f800b = etVar.d != Integer.MIN_VALUE ? etVar.d : etVar.f;
                    return;
                }
            }
            etVar.f799a = etVar.e;
            etVar.f800b = etVar.f;
        }
    }

    public void setLogo(int i) {
        setLogo(this.N.a(getContext(), i, false));
    }

    public final boolean a() {
        if (this.f634a != null) {
            ActionMenuView actionMenuView = this.f634a;
            if (actionMenuView.c != null && actionMenuView.c.g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        if (this.f634a != null) {
            ActionMenuView actionMenuView = this.f634a;
            if (actionMenuView.c != null && actionMenuView.c.c()) {
                return true;
            }
        }
        return false;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!d(this.p)) {
                a((View) this.p, true);
            }
        } else if (this.p != null && d(this.p)) {
            removeView(this.p);
            this.j.remove(this.p);
        }
        if (this.p != null) {
            this.p.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.p != null) {
            return this.p.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        if (this.p != null) {
            this.p.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.p != null) {
            return this.p.getContentDescription();
        }
        return null;
    }

    private void g() {
        if (this.p == null) {
            this.p = new ImageView(getContext());
        }
    }

    public final boolean c() {
        return (this.l == null || this.l.f843b == null) ? false : true;
    }

    public final void d() {
        android.support.v7.view.menu.m mVar = this.l == null ? null : this.l.f843b;
        if (mVar != null) {
            mVar.collapseActionView();
        }
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f635b == null) {
                Context context = getContext();
                this.f635b = new TextView(context);
                this.f635b.setSingleLine();
                this.f635b.setEllipsize(TextUtils.TruncateAt.END);
                if (this.g != 0) {
                    this.f635b.setTextAppearance(context, this.g);
                }
                if (this.C != 0) {
                    this.f635b.setTextColor(this.C);
                }
            }
            if (!d(this.f635b)) {
                a((View) this.f635b, true);
            }
        } else if (this.f635b != null && d(this.f635b)) {
            removeView(this.f635b);
            this.j.remove(this.f635b);
        }
        if (this.f635b != null) {
            this.f635b.setText(charSequence);
        }
        this.A = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new TextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.h != 0) {
                    this.c.setTextAppearance(context, this.h);
                }
                if (this.D != 0) {
                    this.c.setTextColor(this.D);
                }
            }
            if (!d(this.c)) {
                a((View) this.c, true);
            }
        } else if (this.c != null && d(this.c)) {
            removeView(this.c);
            this.j.remove(this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleTextColor(int i) {
        this.C = i;
        if (this.f635b != null) {
            this.f635b.setTextColor(i);
        }
    }

    public void setSubtitleTextColor(int i) {
        this.D = i;
        if (this.c != null) {
            this.c.setTextColor(i);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.o != null) {
            return this.o.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        if (this.o != null) {
            this.o.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(this.N.a(getContext(), i, false));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!d(this.o)) {
                a((View) this.o, true);
            }
        } else if (this.o != null && d(this.o)) {
            removeView(this.o);
            this.j.remove(this.o);
        }
        if (this.o != null) {
            this.o.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.o != null) {
            return this.o.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        i();
        this.o.setOnClickListener(onClickListener);
    }

    public Menu getMenu() {
        h();
        return this.f634a.getMenu();
    }

    public void setOverflowIcon(Drawable drawable) {
        h();
        this.f634a.setOverflowIcon(drawable);
    }

    public Drawable getOverflowIcon() {
        h();
        return this.f634a.getOverflowIcon();
    }

    private void h() {
        e();
        if (this.f634a.f610a == null) {
            android.support.v7.view.menu.i iVar = (android.support.v7.view.menu.i) this.f634a.getMenu();
            if (this.l == null) {
                this.l = new gb(this, (byte) 0);
            }
            this.f634a.setExpandedActionViewsExclusive(true);
            iVar.a(this.l, this.e);
        }
    }

    final void e() {
        if (this.f634a == null) {
            this.f634a = new ActionMenuView(getContext());
            this.f634a.setPopupTheme(this.f);
            this.f634a.setOnMenuItemClickListener(this.J);
            this.f634a.a(this.m, this.n);
            gc gcVar = new gc();
            gcVar.f491a = 8388613 | (this.t & 112);
            this.f634a.setLayoutParams(gcVar);
            a((View) this.f634a, false);
        }
    }

    private MenuInflater getMenuInflater() {
        return new android.support.v7.view.i(getContext());
    }

    public void setOnMenuItemClickListener(gd gdVar) {
        this.I = gdVar;
    }

    public int getContentInsetStart() {
        et etVar = this.i;
        return etVar.g ? etVar.f800b : etVar.f799a;
    }

    public int getContentInsetEnd() {
        et etVar = this.i;
        return etVar.g ? etVar.f799a : etVar.f800b;
    }

    public int getContentInsetLeft() {
        return this.i.f799a;
    }

    public int getContentInsetRight() {
        return this.i.f800b;
    }

    private void i() {
        if (this.o == null) {
            this.o = new ImageButton(getContext(), null, android.support.v7.b.b.toolbarNavigationButtonStyle);
            gc gcVar = new gc();
            gcVar.f491a = 8388611 | (this.t & 112);
            this.o.setLayoutParams(gcVar);
        }
    }

    private void a(View view, boolean z) {
        gc gcVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (!checkLayoutParams(layoutParams)) {
                gcVar = a(layoutParams);
            } else {
                gcVar = (gc) layoutParams;
            }
        } else {
            gcVar = new gc();
        }
        gcVar.f844b = 1;
        if (z && this.d != null) {
            view.setLayoutParams(gcVar);
            this.j.add(view);
        } else {
            addView(view, gcVar);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.l != null && this.l.f843b != null) {
            savedState.f636a = this.l.f843b.getItemId();
        }
        savedState.f637b = a();
        return savedState;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        android.support.v7.view.menu.i iVar;
        MenuItem findItem;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.f634a == null) {
            iVar = null;
        } else {
            iVar = this.f634a.f610a;
        }
        if (savedState.f636a != 0 && this.l != null && iVar != null && (findItem = iVar.findItem(savedState.f636a)) != null) {
            android.support.v4.view.as.b(findItem);
        }
        if (!savedState.f637b) {
            return;
        }
        removeCallbacks(this.M);
        post(this.M);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.M);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (a2 == 0) {
            this.E = false;
        }
        if (!this.E) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a2 == 0 && !onTouchEvent) {
                this.E = true;
            }
        }
        if (a2 == 1 || a2 == 3) {
            this.E = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int a2 = android.support.v4.view.bc.a(motionEvent);
        if (a2 == 9) {
            this.F = false;
        }
        if (!this.F) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (a2 == 9 && !onHoverEvent) {
                this.F = true;
            }
        }
        if (a2 == 10 || a2 == 3) {
            this.F = false;
        }
        return true;
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int[] iArr = this.H;
        if (gm.a(this)) {
            c = 0;
            c2 = 1;
        } else {
            c = 1;
            c2 = 0;
        }
        int i7 = 0;
        if (!a(this.o)) {
            i3 = 0;
            i4 = 0;
        } else {
            a(this.o, i, 0, i2, this.u);
            i7 = this.o.getMeasuredWidth() + b(this.o);
            int max = Math.max(0, this.o.getMeasuredHeight() + c(this.o));
            i3 = gm.a(0, android.support.v4.view.by.l(this.o));
            i4 = max;
        }
        if (a(this.s)) {
            a(this.s, i, 0, i2, this.u);
            i7 = this.s.getMeasuredWidth() + b(this.s);
            i4 = Math.max(i4, this.s.getMeasuredHeight() + c(this.s));
            i3 = gm.a(i3, android.support.v4.view.by.l(this.s));
        }
        int contentInsetStart = getContentInsetStart();
        int max2 = Math.max(contentInsetStart, i7) + 0;
        iArr[c2] = Math.max(0, contentInsetStart - i7);
        int i8 = 0;
        if (a(this.f634a)) {
            a(this.f634a, i, max2, i2, this.u);
            i8 = this.f634a.getMeasuredWidth() + b(this.f634a);
            i4 = Math.max(i4, this.f634a.getMeasuredHeight() + c(this.f634a));
            i3 = gm.a(i3, android.support.v4.view.by.l(this.f634a));
        }
        int contentInsetEnd = getContentInsetEnd();
        int max3 = max2 + Math.max(contentInsetEnd, i8);
        iArr[c] = Math.max(0, contentInsetEnd - i8);
        if (a(this.d)) {
            max3 += a(this.d, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + c(this.d));
            i3 = gm.a(i3, android.support.v4.view.by.l(this.d));
        }
        if (a(this.p)) {
            max3 += a(this.p, i, max3, i2, 0, iArr);
            i4 = Math.max(i4, this.p.getMeasuredHeight() + c(this.p));
            i3 = gm.a(i3, android.support.v4.view.by.l(this.p));
        }
        int childCount = getChildCount();
        int i9 = 0;
        int i10 = i3;
        int i11 = i4;
        while (i9 < childCount) {
            View childAt = getChildAt(i9);
            if (((gc) childAt.getLayoutParams()).f844b == 0 && a(childAt)) {
                max3 += a(childAt, i, max3, i2, 0, iArr);
                int max4 = Math.max(i11, childAt.getMeasuredHeight() + c(childAt));
                i5 = gm.a(i10, android.support.v4.view.by.l(childAt));
                i6 = max4;
            } else {
                i5 = i10;
                i6 = i11;
            }
            i9++;
            i10 = i5;
            i11 = i6;
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = this.x + this.y;
        int i15 = this.v + this.w;
        if (a(this.f635b)) {
            a(this.f635b, i, max3 + i15, i2, i14, iArr);
            i12 = b(this.f635b) + this.f635b.getMeasuredWidth();
            i13 = this.f635b.getMeasuredHeight() + c(this.f635b);
            i10 = gm.a(i10, android.support.v4.view.by.l(this.f635b));
        }
        if (a(this.c)) {
            i12 = Math.max(i12, a(this.c, i, max3 + i15, i2, i14 + i13, iArr));
            i13 += this.c.getMeasuredHeight() + c(this.c);
            i10 = gm.a(i10, android.support.v4.view.by.l(this.c));
        }
        int max5 = Math.max(i11, i13);
        int paddingLeft = i12 + max3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max5 + getPaddingTop() + getPaddingBottom();
        int a2 = android.support.v4.view.by.a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i10);
        int a3 = android.support.v4.view.by.a(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i10 << 16);
        if (this.L) {
            int childCount2 = getChildCount();
            int i16 = 0;
            while (true) {
                if (i16 < childCount2) {
                    View childAt2 = getChildAt(i16);
                    if (!a(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                        i16++;
                    } else {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
        }
        if (z) {
            a3 = 0;
        }
        setMeasuredDimension(a2, a3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int max;
        boolean z2 = android.support.v4.view.by.h(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i15 = width - paddingRight;
        int[] iArr = this.H;
        iArr[1] = 0;
        iArr[0] = 0;
        int s = android.support.v4.view.by.s(this);
        if (!a(this.o)) {
            i5 = paddingLeft;
        } else if (z2) {
            i15 = b(this.o, i15, iArr, s);
            i5 = paddingLeft;
        } else {
            i5 = a(this.o, paddingLeft, iArr, s);
        }
        if (a(this.s)) {
            if (z2) {
                i15 = b(this.s, i15, iArr, s);
            } else {
                i5 = a(this.s, i5, iArr, s);
            }
        }
        if (a(this.f634a)) {
            if (z2) {
                i5 = a(this.f634a, i5, iArr, s);
            } else {
                i15 = b(this.f634a, i15, iArr, s);
            }
        }
        iArr[0] = Math.max(0, getContentInsetLeft() - i5);
        iArr[1] = Math.max(0, getContentInsetRight() - ((width - paddingRight) - i15));
        int max2 = Math.max(i5, getContentInsetLeft());
        int min = Math.min(i15, (width - paddingRight) - getContentInsetRight());
        if (a(this.d)) {
            if (z2) {
                min = b(this.d, min, iArr, s);
            } else {
                max2 = a(this.d, max2, iArr, s);
            }
        }
        if (!a(this.p)) {
            i6 = min;
            i7 = max2;
        } else if (z2) {
            i6 = b(this.p, min, iArr, s);
            i7 = max2;
        } else {
            i6 = min;
            i7 = a(this.p, max2, iArr, s);
        }
        boolean a2 = a(this.f635b);
        boolean a3 = a(this.c);
        int i16 = 0;
        if (a2) {
            gc gcVar = (gc) this.f635b.getLayoutParams();
            i16 = gcVar.bottomMargin + gcVar.topMargin + this.f635b.getMeasuredHeight() + 0;
        }
        if (a3) {
            gc gcVar2 = (gc) this.c.getLayoutParams();
            i8 = gcVar2.bottomMargin + gcVar2.topMargin + this.c.getMeasuredHeight() + i16;
        } else {
            i8 = i16;
        }
        if (a2 || a3) {
            TextView textView = a2 ? this.f635b : this.c;
            TextView textView2 = a3 ? this.c : this.f635b;
            gc gcVar3 = (gc) textView.getLayoutParams();
            gc gcVar4 = (gc) textView2.getLayoutParams();
            boolean z3 = (a2 && this.f635b.getMeasuredWidth() > 0) || (a3 && this.c.getMeasuredWidth() > 0);
            switch (this.z & 112) {
                case 48:
                    i9 = gcVar3.topMargin + getPaddingTop() + this.x;
                    break;
                case 80:
                    i9 = (((height - paddingBottom) - gcVar4.bottomMargin) - this.y) - i8;
                    break;
                default:
                    int i17 = (((height - paddingTop) - paddingBottom) - i8) / 2;
                    if (i17 < gcVar3.topMargin + this.x) {
                        max = gcVar3.topMargin + this.x;
                    } else {
                        int i18 = (((height - paddingBottom) - i8) - i17) - paddingTop;
                        max = i18 < gcVar3.bottomMargin + this.y ? Math.max(0, i17 - ((gcVar4.bottomMargin + this.y) - i18)) : i17;
                    }
                    i9 = paddingTop + max;
                    break;
            }
            if (z2) {
                int i19 = (z3 ? this.v : 0) - iArr[1];
                int max3 = i6 - Math.max(0, i19);
                iArr[1] = Math.max(0, -i19);
                if (a2) {
                    gc gcVar5 = (gc) this.f635b.getLayoutParams();
                    int measuredWidth = max3 - this.f635b.getMeasuredWidth();
                    int measuredHeight = this.f635b.getMeasuredHeight() + i9;
                    this.f635b.layout(measuredWidth, i9, max3, measuredHeight);
                    int i20 = measuredWidth - this.w;
                    i9 = measuredHeight + gcVar5.bottomMargin;
                    i13 = i20;
                } else {
                    i13 = max3;
                }
                if (a3) {
                    gc gcVar6 = (gc) this.c.getLayoutParams();
                    int i21 = gcVar6.topMargin + i9;
                    this.c.layout(max3 - this.c.getMeasuredWidth(), i21, max3, this.c.getMeasuredHeight() + i21);
                    int i22 = max3 - this.w;
                    int i23 = gcVar6.bottomMargin;
                    i14 = i22;
                } else {
                    i14 = max3;
                }
                i6 = z3 ? Math.min(i13, i14) : max3;
            } else {
                int i24 = (z3 ? this.v : 0) - iArr[0];
                i7 += Math.max(0, i24);
                iArr[0] = Math.max(0, -i24);
                if (a2) {
                    gc gcVar7 = (gc) this.f635b.getLayoutParams();
                    int measuredWidth2 = this.f635b.getMeasuredWidth() + i7;
                    int measuredHeight2 = this.f635b.getMeasuredHeight() + i9;
                    this.f635b.layout(i7, i9, measuredWidth2, measuredHeight2);
                    int i25 = measuredWidth2 + this.w;
                    int i26 = gcVar7.bottomMargin + measuredHeight2;
                    i10 = i25;
                    i11 = i26;
                } else {
                    i10 = i7;
                    i11 = i9;
                }
                if (a3) {
                    gc gcVar8 = (gc) this.c.getLayoutParams();
                    int i27 = i11 + gcVar8.topMargin;
                    int measuredWidth3 = this.c.getMeasuredWidth() + i7;
                    this.c.layout(i7, i27, measuredWidth3, this.c.getMeasuredHeight() + i27);
                    int i28 = this.w + measuredWidth3;
                    int i29 = gcVar8.bottomMargin;
                    i12 = i28;
                } else {
                    i12 = i7;
                }
                if (z3) {
                    i7 = Math.max(i10, i12);
                }
            }
        }
        a(this.G, 3);
        int size = this.G.size();
        int i30 = i7;
        for (int i31 = 0; i31 < size; i31++) {
            i30 = a(this.G.get(i31), i30, iArr, s);
        }
        a(this.G, 5);
        int size2 = this.G.size();
        int i32 = 0;
        int i33 = i6;
        while (i32 < size2) {
            int b2 = b(this.G.get(i32), i33, iArr, s);
            i32++;
            i33 = b2;
        }
        a(this.G, 1);
        ArrayList<View> arrayList = this.G;
        int i34 = iArr[0];
        int i35 = iArr[1];
        int size3 = arrayList.size();
        int i36 = i35;
        int i37 = i34;
        int i38 = 0;
        int i39 = 0;
        while (i38 < size3) {
            View view = arrayList.get(i38);
            gc gcVar9 = (gc) view.getLayoutParams();
            int i40 = gcVar9.leftMargin - i37;
            int i41 = gcVar9.rightMargin - i36;
            int max4 = Math.max(0, i40);
            int max5 = Math.max(0, i41);
            i37 = Math.max(0, -i40);
            i36 = Math.max(0, -i41);
            i38++;
            i39 += view.getMeasuredWidth() + max4 + max5;
        }
        int i42 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i39 / 2);
        int i43 = i42 + i39;
        if (i42 < i30) {
            i42 = i30;
        } else if (i43 > i33) {
            i42 -= i43 - i33;
        }
        int size4 = this.G.size();
        int i44 = i42;
        for (int i45 = 0; i45 < size4; i45++) {
            i44 = a(this.G.get(i45), i44, iArr, s);
        }
        this.G.clear();
    }

    private int a(View view, int i, int[] iArr, int i2) {
        gc gcVar = (gc) view.getLayoutParams();
        int i3 = gcVar.leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return gcVar.rightMargin + measuredWidth + max;
    }

    private int b(View view, int i, int[] iArr, int i2) {
        gc gcVar = (gc) view.getLayoutParams();
        int i3 = gcVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (gcVar.leftMargin + measuredWidth);
    }

    private int a(View view, int i) {
        int max;
        gc gcVar = (gc) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = gcVar.f491a & 112;
        switch (i3) {
            case 16:
            case 48:
            case 80:
                break;
            default:
                i3 = this.z & 112;
                break;
        }
        switch (i3) {
            case 48:
                return getPaddingTop() - i2;
            case 80:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - gcVar.bottomMargin) - i2;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i4 < gcVar.topMargin) {
                    max = gcVar.topMargin;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    max = i5 < gcVar.bottomMargin ? Math.max(0, i4 - (gcVar.bottomMargin - i5)) : i4;
                }
                return max + paddingTop;
        }
    }

    private void a(List<View> list, int i) {
        boolean z = android.support.v4.view.by.h(this) == 1;
        int childCount = getChildCount();
        int a2 = android.support.v4.view.v.a(i, android.support.v4.view.by.h(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                gc gcVar = (gc) childAt.getLayoutParams();
                if (gcVar.f844b == 0 && a(childAt) && a(gcVar.f491a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            gc gcVar2 = (gc) childAt2.getLayoutParams();
            if (gcVar2.f844b == 0 && a(childAt2) && a(gcVar2.f491a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int a(int i) {
        int h = android.support.v4.view.by.h(this);
        int a2 = android.support.v4.view.v.a(i, h) & 7;
        switch (a2) {
            case 1:
            case 3:
            case 5:
                return a2;
            case 2:
            case 4:
            default:
                return h == 1 ? 5 : 3;
        }
    }

    private boolean a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return android.support.v4.view.ao.b(marginLayoutParams) + android.support.v4.view.ao.a(marginLayoutParams);
    }

    private static int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private static gc a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof gc) {
            return new gc((gc) layoutParams);
        }
        if (layoutParams instanceof android.support.v7.a.b) {
            return new gc((android.support.v7.a.b) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new gc((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new gc(layoutParams);
    }

    protected static gc f() {
        return new gc();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof gc);
    }

    public bs getWrapper() {
        if (this.K == null) {
            this.K = new gf(this, true);
        }
        return this.K;
    }

    private boolean d(View view) {
        return view.getParent() == this || this.j.contains(view);
    }

    public void setCollapsible(boolean z) {
        this.L = z;
        requestLayout();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new ge();

        /* renamed from: a, reason: collision with root package name */
        int f636a;

        /* renamed from: b, reason: collision with root package name */
        boolean f637b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f636a = parcel.readInt();
            this.f637b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f636a);
            parcel.writeInt(this.f637b ? 1 : 0);
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gc();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gc(getContext(), attributeSet);
    }

    static /* synthetic */ void b(Toolbar toolbar) {
        if (toolbar.s != null) {
            return;
        }
        toolbar.s = new ImageButton(toolbar.getContext(), null, android.support.v7.b.b.toolbarNavigationButtonStyle);
        toolbar.s.setImageDrawable(toolbar.q);
        toolbar.s.setContentDescription(toolbar.r);
        gc gcVar = new gc();
        gcVar.f491a = 8388611 | (toolbar.t & 112);
        gcVar.f844b = 2;
        toolbar.s.setLayoutParams(gcVar);
        toolbar.s.setOnClickListener(new ga(toolbar));
    }
}
