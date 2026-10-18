package android.support.v7.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class ActivityChooserView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    android.support.v4.view.n f612a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f613b;
    private final ae c;
    private final cm d;
    private final FrameLayout e;
    private final ImageView f;
    private final FrameLayout g;
    private final int h;
    private final DataSetObserver i;
    private final ViewTreeObserver.OnGlobalLayoutListener j;
    private cu k;
    private PopupWindow.OnDismissListener l;
    private boolean m;
    private int n;
    private boolean o;
    private int p;

    public final void setActivityChooserModel(x xVar) {
        ad adVar = this.f613b;
        x xVar2 = adVar.c.f613b.f645a;
        if (xVar2 != null && adVar.c.isShown()) {
            xVar2.unregisterObserver(adVar.c.i);
        }
        adVar.f645a = xVar;
        if (xVar != null && adVar.c.isShown()) {
            xVar.registerObserver(adVar.c.i);
        }
        adVar.notifyDataSetChanged();
        if (getListPopupWindow().c.isShowing()) {
            a();
            if (getListPopupWindow().c.isShowing() || !this.o) {
                return;
            }
            this.m = false;
            a(this.n);
        }
    }

    public final void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f.setImageDrawable(drawable);
    }

    public final void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f.setContentDescription(getContext().getString(i));
    }

    public final void setProvider(android.support.v4.view.n nVar) {
        this.f612a = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.f613b.f645a == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.j);
        boolean z = this.g.getVisibility() == 0;
        int a2 = this.f613b.f645a.a();
        int i2 = z ? 1 : 0;
        if (i != Integer.MAX_VALUE && a2 > i2 + i) {
            this.f613b.a(true);
            this.f613b.a(i - 1);
        } else {
            this.f613b.a(false);
            this.f613b.a(i);
        }
        cu listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.c.isShowing()) {
            if (this.m || !z) {
                this.f613b.a(true, z);
            } else {
                this.f613b.a(false, false);
            }
            listPopupWindow.a(Math.min(this.f613b.a(), this.h));
            listPopupWindow.b();
            if (this.f612a != null) {
                this.f612a.a(true);
            }
            listPopupWindow.d.setContentDescription(getContext().getString(android.support.v7.b.j.abc_activitychooserview_choose_application));
        }
    }

    private boolean b() {
        return getListPopupWindow().c.isShowing();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x xVar = this.f613b.f645a;
        if (xVar != null) {
            xVar.registerObserver(this.i);
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x xVar = this.f613b.f645a;
        if (xVar != null) {
            xVar.unregisterObserver(this.i);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.j);
        }
        if (b()) {
            a();
        }
        this.o = false;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        cm cmVar = this.d;
        if (this.g.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(cmVar, i, i2);
        setMeasuredDimension(cmVar.getMeasuredWidth(), cmVar.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.d.layout(0, 0, i3 - i, i4 - i2);
        if (!b()) {
            a();
        }
    }

    public final x getDataModel() {
        return this.f613b.f645a;
    }

    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.l = onDismissListener;
    }

    public final void setInitialActivityCount(int i) {
        this.n = i;
    }

    public final void setDefaultActionButtonContentDescription(int i) {
        this.p = i;
    }

    private cu getListPopupWindow() {
        if (this.k == null) {
            this.k = new cu(getContext());
            this.k.a(this.f613b);
            this.k.l = this;
            this.k.c();
            this.k.m = this.c;
            this.k.a(this.c);
        }
        return this.k;
    }

    public class InnerLayout extends cm {

        /* renamed from: a, reason: collision with root package name */
        private static final int[] f614a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            fx a2 = fx.a(context, attributeSet, f614a);
            setBackgroundDrawable(a2.a(0));
            a2.f836a.recycle();
        }
    }

    public final boolean a() {
        if (getListPopupWindow().c.isShowing()) {
            getListPopupWindow().d();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.j);
                return true;
            }
            return true;
        }
        return true;
    }
}
