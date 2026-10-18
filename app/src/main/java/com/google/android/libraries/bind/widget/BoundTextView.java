package com.google.android.libraries.bind.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.by;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.f;
import com.google.android.libraries.bind.data.g;
import com.google.android.libraries.bind.e;

/* loaded from: classes.dex */
public class BoundTextView extends TextView implements f {

    /* renamed from: a, reason: collision with root package name */
    private final g f6719a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6720b;
    private Integer c;
    private Integer d;
    private Integer e;

    public BoundTextView(Context context) {
        this(context, null, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public BoundTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        String string;
        this.f6719a = new g(context, attributeSet, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.libraries.bind.e.BoundTextView, i, i2);
        if (isInEditMode() && (string = obtainStyledAttributes.getString(com.google.android.libraries.bind.e.BoundTextView_bind__editModeText)) != null) {
            setText(string);
        }
        this.f6720b = g.a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundTextView_bindText);
        this.c = g.a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundTextView_bindTextColor);
        this.d = g.a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundTextView_bindDrawableStart);
        this.e = g.a(obtainStyledAttributes, com.google.android.libraries.bind.e.BoundTextView_bindDrawableEnd);
        obtainStyledAttributes.recycle();
    }

    @Override // com.google.android.libraries.bind.data.f
    @TargetApi(17)
    public final void a_(Data data) {
        String obj;
        BoundTextView boundTextView;
        this.f6719a.a(data);
        if (this.f6720b != null) {
            if (data == null) {
                obj = null;
                boundTextView = this;
            } else {
                Object b2 = data.b(this.f6720b.intValue());
                if (b2 instanceof SpannableString) {
                    setText((SpannableString) b2, TextView.BufferType.SPANNABLE);
                } else if (b2 == null) {
                    obj = null;
                    boundTextView = this;
                } else {
                    obj = b2.toString();
                    boundTextView = this;
                }
            }
            boundTextView.setText(obj);
        }
        if (this.c != null) {
            Object b3 = data == null ? null : data.b(this.c.intValue());
            if (b3 == null) {
                setTextColor(-1);
            } else if (b3 instanceof ColorStateList) {
                setTextColor((ColorStateList) b3);
            } else {
                setTextColor(getContext().getResources().getColor(((Integer) b3).intValue()));
            }
        }
        if (this.d != null || this.e != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            a(compoundDrawables, data, this.d, true);
            a(compoundDrawables, data, this.e, false);
            setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
    }

    private void a(Drawable[] drawableArr, Data data, Integer num, boolean z) {
        if (num != null) {
            Integer c = data == null ? null : data.c(num.intValue());
            drawableArr[(by.h(this) == 0 && z) ? (char) 0 : (char) 2] = c != null ? getContext().getResources().getDrawable(c.intValue()) : null;
        }
    }
}
