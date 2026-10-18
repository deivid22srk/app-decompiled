package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
final class bg extends cu {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f694a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AppCompatSpinner f695b;
    private ListAdapter n;
    private final Rect o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f695b = appCompatSpinner;
        this.o = new Rect();
        this.l = appCompatSpinner;
        c();
        this.k = 0;
        this.m = new bh(this, appCompatSpinner);
    }

    @Override // android.support.v7.widget.cu
    public final void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.n = listAdapter;
    }

    final void a() {
        Rect rect;
        Rect rect2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int a2;
        Rect rect3;
        Rect rect4;
        Rect rect5;
        Rect rect6;
        int i6;
        Rect rect7;
        Drawable background = this.c.getBackground();
        if (background != null) {
            rect5 = this.f695b.l;
            background.getPadding(rect5);
            if (gm.a(this.f695b)) {
                rect7 = this.f695b.l;
                i6 = rect7.right;
            } else {
                rect6 = this.f695b.l;
                i6 = -rect6.left;
            }
            i = i6;
        } else {
            rect = this.f695b.l;
            rect2 = this.f695b.l;
            rect2.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.f695b.getPaddingLeft();
        int paddingRight = this.f695b.getPaddingRight();
        int width = this.f695b.getWidth();
        i2 = this.f695b.k;
        if (i2 == -2) {
            a2 = this.f695b.a((SpinnerAdapter) this.n, this.c.getBackground());
            int i7 = this.f695b.getContext().getResources().getDisplayMetrics().widthPixels;
            rect3 = this.f695b.l;
            int i8 = i7 - rect3.left;
            rect4 = this.f695b.l;
            int i9 = i8 - rect4.right;
            if (a2 <= i9) {
                i9 = a2;
            }
            a(Math.max(i9, (width - paddingLeft) - paddingRight));
        } else {
            i3 = this.f695b.k;
            if (i3 != -1) {
                i4 = this.f695b.k;
                a(i4);
            } else {
                a((width - paddingLeft) - paddingRight);
            }
        }
        if (gm.a(this.f695b)) {
            i5 = ((width - paddingRight) - this.e) + i;
        } else {
            i5 = i + paddingLeft;
        }
        this.f = i5;
    }

    @Override // android.support.v7.widget.cu
    public final void b() {
        ViewTreeObserver viewTreeObserver;
        boolean isShowing = this.c.isShowing();
        a();
        e();
        super.b();
        this.d.setChoiceMode(1);
        int selectedItemPosition = this.f695b.getSelectedItemPosition();
        cx cxVar = this.d;
        if (this.c.isShowing() && cxVar != null) {
            cxVar.h = false;
            cxVar.setSelection(selectedItemPosition);
            if (Build.VERSION.SDK_INT >= 11 && cxVar.getChoiceMode() != 0) {
                cxVar.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = this.f695b.getViewTreeObserver()) != null) {
            bi biVar = new bi(this);
            viewTreeObserver.addOnGlobalLayoutListener(biVar);
            a(new bj(this, biVar));
        }
    }

    static /* synthetic */ boolean a(bg bgVar, View view) {
        return android.support.v4.view.by.J(view) && view.getGlobalVisibleRect(bgVar.o);
    }
}
