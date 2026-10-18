package com.google.android.play.layout;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.view.by;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewDebug;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.play.o;

/* loaded from: classes.dex */
public class PlayCardLabelView extends View {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f6964a;

    /* renamed from: b, reason: collision with root package name */
    private String f6965b;
    private String c;
    private int d;
    private int e;
    private final int f;
    private final int g;
    private final float h;
    private final int i;
    private final TextPaint j;
    private final TextPaint k;
    private final int l;
    private final int m;
    private boolean n;

    public PlayCardLabelView(Context context) {
        this(context, null);
    }

    public PlayCardLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(com.google.android.play.i.play_card_label_icon_gap);
        this.g = resources.getDimensionPixelSize(com.google.android.play.i.play_card_label_texts_gap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.PlayCardLabelView);
        this.h = obtainStyledAttributes.getDimension(o.PlayCardLabelView_play_label_text_size, resources.getDimension(com.google.android.play.i.play_medium_size));
        String string = obtainStyledAttributes.getString(o.PlayCardLabelView_play_label_font_family);
        obtainStyledAttributes.recycle();
        this.k = new TextPaint(1);
        this.k.density = resources.getDisplayMetrics().density;
        this.k.setTextSize(this.h);
        this.k.setFakeBoldText(false);
        this.j = new TextPaint(1);
        this.j.density = resources.getDisplayMetrics().density;
        this.j.setTextSize(this.h);
        this.i = resources.getColor(com.google.android.play.h.play_fg_secondary);
        this.j.setColor(this.i);
        this.j.setStrikeThruText(true);
        this.j.setFakeBoldText(false);
        if (string != null) {
            Typeface create = Typeface.create(string, 0);
            this.k.setTypeface(create);
            this.j.setTypeface(create);
        }
        Paint.FontMetrics fontMetrics = this.k.getFontMetrics();
        this.l = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.m = (int) Math.abs(fontMetrics.top);
        setWillNotDraw(false);
    }

    public final void a(int i, int i2) {
        a(getResources().getString(i), i2);
    }

    public final void a(String str, int i) {
        a(str, null, i, str);
    }

    public final void a(String str, String str2, int i, String str3) {
        int defaultColor = com.google.android.play.utils.h.a(getContext(), i).getDefaultColor();
        int i2 = this.i;
        this.c = str != null ? str.toUpperCase() : null;
        this.f6965b = str2 != null ? str2.toUpperCase() : null;
        this.k.setColor(defaultColor);
        this.j.setColor(i2);
        setContentDescription(str3);
        invalidate();
        requestLayout();
    }

    public String getText() {
        return this.c;
    }

    public String getStrikeText() {
        return this.f6965b;
    }

    public void setIcon(int i) {
        this.f6964a = android.support.v4.b.apkg.a.a(getResources(), i, getContext().getTheme());
        this.f6964a.setBounds(0, 0, this.f6964a.getIntrinsicWidth(), this.f6964a.getIntrinsicHeight());
        invalidate();
        requestLayout();
    }

    @Override // android.view.View
    @ViewDebug.ExportedProperty(category = "layout")
    public int getBaseline() {
        return getPaddingTop() + this.m;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 8) {
            accessibilityEvent.getText().add(getContentDescription());
            return true;
        }
        return dispatchPopulateAccessibilityEvent;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        boolean z = View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getSize(i) == 0;
        int size = View.MeasureSpec.getSize(i);
        this.e = 0;
        this.n = false;
        boolean z2 = !TextUtils.isEmpty(this.c);
        if (!z) {
            if (this.f6964a != null) {
                i3 = this.f6964a.getIntrinsicWidth();
                if (z2) {
                    i3 += this.f;
                }
            } else {
                i3 = 0;
            }
            if (z2) {
                this.d = (int) this.k.measureText(this.c);
                i3 += this.d;
            }
            if (!TextUtils.isEmpty(this.f6965b)) {
                this.e = (int) this.j.measureText(this.f6965b);
                int i5 = (z2 ? this.g : 0) + this.e;
                if (size > 0 && i3 + i5 <= size) {
                    i3 += i5;
                    this.n = true;
                } else {
                    this.n = false;
                }
            }
            i4 = i3 + by.n(this) + by.o(this);
        }
        setMeasuredDimension(i4, (this.f6964a == null ? this.l : Math.max(this.l, this.f6964a.getIntrinsicHeight())) + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i;
        canvas.save();
        int n = by.n(this);
        int paddingTop = getPaddingTop();
        boolean z = by.h(this) == 0;
        int width = getWidth();
        boolean z2 = TextUtils.isEmpty(this.c) ? false : true;
        if (this.f6964a != null) {
            int height = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.f6964a.getIntrinsicHeight()) / 2) + paddingTop;
            canvas.translate(com.google.android.play.utils.j.a(width, this.f6964a.getIntrinsicWidth(), z, n), height);
            this.f6964a.draw(canvas);
            canvas.translate(-r6, -height);
            i = this.f6964a.getIntrinsicWidth() + this.f + n;
        } else {
            i = n;
        }
        if (this.n) {
            canvas.drawText(this.f6965b, com.google.android.play.utils.j.a(width, this.e, z, i), this.m + paddingTop, this.j);
            i += this.e + this.g;
        }
        if (z2) {
            canvas.drawText(this.c, com.google.android.play.utils.j.a(width, this.d, z, i), this.m + paddingTop, this.k);
        }
        canvas.restore();
    }
}
