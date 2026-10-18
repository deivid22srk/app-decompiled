package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class dg extends ListView {
    private static final int[] h = {0};

    /* renamed from: a, reason: collision with root package name */
    final Rect f763a;

    /* renamed from: b, reason: collision with root package name */
    int f764b;
    int c;
    int d;
    int e;
    protected int f;
    Field g;
    private dh i;

    public dg(Context context, int i) {
        super(context, null, i);
        this.f763a = new Rect();
        this.f764b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        try {
            this.g = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.g.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.i = drawable != null ? new dh(drawable) : null;
        super.setSelector(this.i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f764b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector == null) {
            return;
        }
        if (!(a() && isPressed())) {
            return;
        }
        selector.setState(getDrawableState());
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    protected boolean a() {
        return false;
    }

    public final int a(int i, int i2) {
        View view;
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        int i5 = 0;
        View view2 = null;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i5) {
                i5 = itemViewType;
                view = null;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(i, makeMeasureSpec);
            view2.forceLayout();
            i3 = view2.getMeasuredHeight() + (i4 > 0 ? i3 + dividerHeight : i3);
            if (i3 < i2) {
                i4++;
            } else {
                return i2;
            }
        }
        return i3;
    }

    protected void setSelectorEnabled(boolean z) {
        if (this.i == null) {
            return;
        }
        this.i.f765a = z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f763a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f763a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
