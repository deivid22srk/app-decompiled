package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    private int f638a;

    /* renamed from: b, reason: collision with root package name */
    private int f639b;
    private WeakReference<View> c;
    private LayoutInflater d;
    private gl e;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f638a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.b.l.ViewStubCompat, i, 0);
        this.f639b = obtainStyledAttributes.getResourceId(android.support.v7.b.l.ViewStubCompat_android_inflatedId, -1);
        this.f638a = obtainStyledAttributes.getResourceId(android.support.v7.b.l.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(android.support.v7.b.l.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final int getInflatedId() {
        return this.f639b;
    }

    public final void setInflatedId(int i) {
        this.f639b = i;
    }

    public final int getLayoutResource() {
        return this.f638a;
    }

    public final void setLayoutResource(int i) {
        this.f638a = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.d;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (this.c != null) {
            View view = this.c.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            a();
        }
    }

    public final View a() {
        LayoutInflater from;
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ViewGroup)) {
            if (this.f638a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (this.d != null) {
                    from = this.d;
                } else {
                    from = LayoutInflater.from(getContext());
                }
                View inflate = from.inflate(this.f638a, viewGroup, false);
                if (this.f639b != -1) {
                    inflate.setId(this.f639b);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.c = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public final void setOnInflateListener(gl glVar) {
        this.e = glVar;
    }
}
