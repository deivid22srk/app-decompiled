package android.support.v7.widget;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ActionBarContextView extends a {
    public View g;
    public boolean h;
    private CharSequence i;
    private CharSequence j;
    private View k;
    private LinearLayout l;
    private TextView m;
    private TextView n;
    private int o;
    private int p;
    private int q;

    @Override // android.support.v7.widget.a
    public final /* bridge */ /* synthetic */ android.support.v4.view.dy a(int i, long j) {
        return super.a(i, j);
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // android.support.v7.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.support.v7.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.support.v7.b.b.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fx a2 = fx.a(context, attributeSet, android.support.v7.b.l.ActionMode, i);
        setBackgroundDrawable(a2.a(android.support.v7.b.l.ActionMode_background));
        this.o = a2.e(android.support.v7.b.l.ActionMode_titleTextStyle, 0);
        this.p = a2.e(android.support.v7.b.l.ActionMode_subtitleTextStyle, 0);
        this.e = a2.d(android.support.v7.b.l.ActionMode_height, 0);
        this.q = a2.e(android.support.v7.b.l.ActionMode_closeItemLayout, android.support.v7.b.i.abc_action_mode_close_item_material);
        a2.f836a.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.d();
            this.d.f();
        }
    }

    @Override // android.support.v7.widget.a
    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        if (this.k != null) {
            removeView(this.k);
        }
        this.k = view;
        if (view != null && this.l != null) {
            removeView(this.l);
            this.l = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        c();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.j = charSequence;
        c();
    }

    public CharSequence getTitle() {
        return this.i;
    }

    public CharSequence getSubtitle() {
        return this.j;
    }

    private void c() {
        if (this.l == null) {
            LayoutInflater.from(getContext()).inflate(android.support.v7.b.i.abc_action_bar_title_item, this);
            this.l = (LinearLayout) getChildAt(getChildCount() - 1);
            this.m = (TextView) this.l.findViewById(android.support.v7.b.g.action_bar_title);
            this.n = (TextView) this.l.findViewById(android.support.v7.b.g.action_bar_subtitle);
            if (this.o != 0) {
                this.m.setTextAppearance(getContext(), this.o);
            }
            if (this.p != 0) {
                this.n.setTextAppearance(getContext(), this.p);
            }
        }
        this.m.setText(this.i);
        this.n.setText(this.j);
        boolean z = !TextUtils.isEmpty(this.i);
        boolean z2 = TextUtils.isEmpty(this.j) ? false : true;
        this.n.setVisibility(z2 ? 0 : 8);
        this.l.setVisibility((z || z2) ? 0 : 8);
        if (this.l.getParent() == null) {
            addView(this.l);
        }
    }

    public final void a(android.support.v7.view.b bVar) {
        if (this.g == null) {
            this.g = LayoutInflater.from(getContext()).inflate(this.q, (ViewGroup) this, false);
            addView(this.g);
        } else if (this.g.getParent() == null) {
            addView(this.g);
        }
        this.g.findViewById(android.support.v7.b.g.action_mode_close_button).setOnClickListener(new e(this, bVar));
        android.support.v7.view.menu.i iVar = (android.support.v7.view.menu.i) bVar.b();
        if (this.d != null) {
            this.d.e();
        }
        this.d = new k(getContext());
        this.d.b();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        iVar.a(this.d, this.f641b);
        this.c = (ActionMenuView) this.d.a(this);
        this.c.setBackgroundDrawable(null);
        addView(this.c, layoutParams);
    }

    public final void b() {
        removeAllViews();
        this.k = null;
        this.c = null;
    }

    @Override // android.support.v7.widget.a
    public final boolean a() {
        if (this.d != null) {
            return this.d.c();
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = 0;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e > 0 ? this.e : View.MeasureSpec.getSize(i2);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = size2 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        if (this.g != null) {
            int a2 = a(this.g, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            paddingLeft = a2 - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
        }
        if (this.c != null && this.c.getParent() == this) {
            paddingLeft = a(this.c, paddingLeft, makeMeasureSpec);
        }
        if (this.l != null && this.k == null) {
            if (this.h) {
                this.l.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.l.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.l.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = a(this.l, paddingLeft, makeMeasureSpec);
            }
        }
        if (this.k != null) {
            ViewGroup.LayoutParams layoutParams = this.k.getLayoutParams();
            int i5 = layoutParams.width != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (layoutParams.width >= 0) {
                paddingLeft = Math.min(layoutParams.width, paddingLeft);
            }
            this.k.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(layoutParams.height >= 0 ? Math.min(layoutParams.height, i4) : i4, layoutParams.height == -2 ? Integer.MIN_VALUE : 1073741824));
        }
        if (this.e <= 0) {
            int childCount = getChildCount();
            int i6 = 0;
            while (i3 < childCount) {
                int measuredHeight = getChildAt(i3).getMeasuredHeight() + paddingTop;
                if (measuredHeight <= i6) {
                    measuredHeight = i6;
                }
                i3++;
                i6 = measuredHeight;
            }
            setMeasuredDimension(size, i6);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a2 = gm.a(this);
        int paddingRight = a2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (this.g != null && this.g.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            int i5 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a3 = a(paddingRight, i5, a2);
            paddingRight = a(a3 + a(this.g, a3, paddingTop, paddingTop2, a2), i6, a2);
        }
        if (this.l != null && this.k == null && this.l.getVisibility() != 8) {
            paddingRight += a(this.l, paddingRight, paddingTop, paddingTop2, a2);
        }
        if (this.k != null) {
            a(this.k, paddingRight, paddingTop, paddingTop2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            a(this.c, paddingLeft, paddingTop, paddingTop2, !a2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.setSource(this);
                accessibilityEvent.setClassName(getClass().getName());
                accessibilityEvent.setPackageName(getContext().getPackageName());
                accessibilityEvent.setContentDescription(this.i);
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    public void setTitleOptional(boolean z) {
        if (z != this.h) {
            requestLayout();
        }
        this.h = z;
    }
}
