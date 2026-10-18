package android.support.v7.widget;

import com.deivid22srk.store.R;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public final class am extends CheckedTextView {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f660a = {android.R.attr.checkMark};

    /* renamed from: b, reason: collision with root package name */
    private ao f661b;
    private bk c;

    public am(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private am(Context context, AttributeSet attributeSet, byte b2) {
        super(fu.a(context), attributeSet, R.attr.checkedTextViewStyle);
        this.c = bk.a(this);
        this.c.a(attributeSet, R.attr.checkedTextViewStyle);
        this.c.a();
        this.f661b = ao.a();
        fx a2 = fx.a(getContext(), attributeSet, f660a, R.attr.checkedTextViewStyle);
        setCheckMarkDrawable(a2.a(0));
        a2.f836a.recycle();
    }

    @Override // android.widget.CheckedTextView
    public final void setCheckMarkDrawable(int i) {
        if (this.f661b != null) {
            setCheckMarkDrawable(this.f661b.a(getContext(), i, false));
        } else {
            super.setCheckMarkDrawable(i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.c != null) {
            this.c.a(context, i);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.c != null) {
            this.c.a();
        }
    }
}
