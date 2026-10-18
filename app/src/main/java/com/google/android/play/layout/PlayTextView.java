package com.google.android.play.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.widget.bq;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.play.o;
import java.util.Locale;

/* loaded from: classes.dex */
public class PlayTextView extends TextView {
    private static final boolean c;

    /* renamed from: a, reason: collision with root package name */
    public Paint f6976a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6977b;
    private final float d;
    private boolean e;
    private boolean f;
    private final String g;
    private Paint h;
    private Paint i;
    private GradientDrawable j;
    private int k;
    private int l;
    private float m;
    private int n;

    static {
        c = Build.VERSION.SDK_INT >= 16;
    }

    public PlayTextView(Context context) {
        this(context, null);
    }

    @TargetApi(16)
    public PlayTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.PlayTextView);
        this.e = obtainStyledAttributes.hasValue(o.PlayTextView_lastLineOverdrawColor);
        this.f = obtainStyledAttributes.getBoolean(o.PlayTextView_lastLineOverdrawHintAlways, false);
        if (this.e) {
            int color = obtainStyledAttributes.getColor(o.PlayTextView_lastLineOverdrawColor, resources.getColor(com.google.android.play.h.play_white));
            this.h = new Paint();
            this.h.setColor(color);
            this.h.setStyle(Paint.Style.FILL_AND_STROKE);
            this.k = resources.getDimensionPixelSize(com.google.android.play.i.play_text_view_fadeout);
            this.j = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{16777215 & color, color});
            this.l = resources.getDimensionPixelSize(com.google.android.play.i.play_text_view_fadeout_hint_margin);
        }
        String string = obtainStyledAttributes.getString(o.PlayTextView_lastLineOverdrawHint);
        this.g = obtainStyledAttributes.getBoolean(o.PlayTextView_lastLineOverdrawAllCaps, false) ? string.toUpperCase(Locale.getDefault()) : string;
        if (!TextUtils.isEmpty(this.g)) {
            this.i = new Paint();
            this.i.setColor(obtainStyledAttributes.getColor(o.PlayTextView_lastLineOverdrawHintColor, getCurrentTextColor()));
            this.i.setTextSize(getTextSize());
            this.i.setTypeface(getTypeface());
            this.i.setAntiAlias(true);
        }
        int i = obtainStyledAttributes.getInt(o.PlayTextView_decoration_position, 3);
        boolean b2 = com.google.android.play.utils.j.b(context);
        switch (i) {
            case 0:
                this.n = b2 ? 2 : 3;
                break;
            case 1:
                this.n = b2 ? 3 : 2;
                break;
            default:
                this.n = i;
                break;
        }
        float textSize = getTextSize();
        boolean z = resources.getBoolean(com.google.android.play.g.play_text_compact_mode_enable);
        boolean z2 = obtainStyledAttributes.getBoolean(o.PlayTextView_allowsCompactLineSpacing, false);
        if (z && z2) {
            Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
            this.d = Math.max(0.0f, 1.0f - ((1.172f * textSize) / (Math.abs(fontMetrics.descent) + Math.abs(fontMetrics.ascent))));
        } else {
            this.d = 0.0f;
        }
        if (this.d > 0.0f) {
            float f = textSize * (-this.d);
            setLineSpacing(c ? f + (getLineHeight() * (getLineSpacingMultiplier() - 1.0f)) : f, 1.0f);
        }
        obtainStyledAttributes.recycle();
        this.m = context.getResources().getDimension(com.google.android.play.i.play_text_view_outline);
        this.f6976a = new Paint();
        this.f6976a.setStrokeWidth(this.m);
        this.f6976a.setStyle(Paint.Style.STROKE);
        setWillNotDraw(false);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.d != 0.0f && View.MeasureSpec.getMode(i2) != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + ((int) (this.d * getLineHeight())));
        }
    }

    public void setDecorationBitmap(Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        switch (this.n) {
            case 2:
                bq.a(this, bitmapDrawable, null, null);
                break;
            case 3:
                bq.a(this, null, null, bitmapDrawable);
                break;
        }
    }

    public final void a(int i, boolean z) {
        int color = getResources().getColor(i);
        setTextColor(color);
        this.f6977b = z;
        if (this.f6977b) {
            this.f6976a.setColor(color);
        }
        invalidate();
    }

    public void setLastLineOverdrawColor(int i) {
        if (!this.e) {
            this.h = new Paint();
            this.h.setStyle(Paint.Style.FILL_AND_STROKE);
            Resources resources = getResources();
            this.k = resources.getDimensionPixelSize(com.google.android.play.i.play_text_view_fadeout);
            this.l = resources.getDimensionPixelSize(com.google.android.play.i.play_text_view_fadeout_hint_margin);
        }
        this.h.setColor(i);
        this.j = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{16777215 & i, i});
        this.e = true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f6977b) {
            int ceil = (int) Math.ceil(this.m / 2.0f);
            canvas.save();
            canvas.translate(getScrollX(), 0.0f);
            canvas.drawRect(ceil, ceil, getWidth() - ceil, getHeight() - ceil, this.f6976a);
            canvas.restore();
        }
        if (this.e) {
            int height = getHeight() - getPaddingBottom();
            int width = getWidth();
            Layout layout = getLayout();
            if (layout != null) {
                setContentDescription(layout.getText());
                int paddingTop = getPaddingTop();
                int lineCount = layout.getLineCount();
                for (int i = 0; i < lineCount; i++) {
                    int lineTop = layout.getLineTop(i);
                    int lineBottom = layout.getLineBottom(i);
                    if (lineTop <= height && lineBottom > height) {
                        canvas.drawRect(0.0f, lineTop + paddingTop, width, height, this.h);
                        if (i > 0) {
                            a(canvas, width, i - 1, true);
                            return;
                        }
                        return;
                    }
                    if (i == lineCount - 1 && this.f) {
                        a(canvas, width, i, false);
                    }
                }
            }
        }
    }

    private void a(Canvas canvas, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        Layout layout = getLayout();
        int paddingTop = getPaddingTop();
        int i7 = -1;
        int i8 = i2;
        while (i8 >= 0) {
            Layout layout2 = getLayout();
            CharSequence text = layout2.getText();
            int lineStart = layout2.getLineStart(i8);
            i7 = layout2.getLineEnd(i8);
            while (true) {
                if (i7 > lineStart) {
                    if (!Character.isWhitespace(text.charAt(i7 - 1))) {
                        break;
                    } else {
                        i7--;
                    }
                } else {
                    i7 = -1;
                    break;
                }
            }
            if (i7 != -1) {
                break;
            } else {
                i8--;
            }
        }
        if (i7 == -1) {
            i3 = 0;
            i4 = 0;
        } else {
            i3 = i8;
            i4 = i7;
        }
        int lineTop = layout.getLineTop(i3);
        int lineBottom = layout.getLineBottom(i3);
        boolean z2 = layout.getParagraphDirection(i3) == -1;
        int primaryHorizontal = (int) layout.getPrimaryHorizontal(i4);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i9 = paddingLeft + primaryHorizontal;
        if (!TextUtils.isEmpty(this.g)) {
            int measureText = (int) this.i.measureText(this.g);
            if (!z2) {
                paddingLeft = (i - paddingRight) - measureText;
            }
            int i10 = paddingLeft + measureText;
            if (z2 && this.l + i10 > primaryHorizontal) {
                z = true;
                int i11 = i10 + this.l;
                canvas.drawRect(paddingLeft, paddingTop + lineTop, i11, paddingTop + lineBottom, this.h);
                i5 = i11;
            } else if (z2 || paddingLeft - this.l >= primaryHorizontal) {
                i5 = i9;
            } else {
                z = true;
                int i12 = paddingLeft - this.l;
                canvas.drawRect(i12, paddingTop + lineTop, i10, paddingTop + lineBottom, this.h);
                i5 = i12;
            }
            if (z2 && this.l + i10 < primaryHorizontal) {
                i6 = (primaryHorizontal - this.l) - measureText;
            } else {
                i6 = (z2 || paddingLeft - this.l <= primaryHorizontal) ? paddingLeft : this.l + primaryHorizontal;
            }
            canvas.drawText(this.g, i6, layout.getLineBaseline(i2), this.i);
            int offsetForHorizontal = layout.getOffsetForHorizontal(i3, i5);
            CharSequence text2 = getLayout().getText();
            while (offsetForHorizontal < text2.length() && !Character.isWhitespace(text2.charAt(offsetForHorizontal))) {
                offsetForHorizontal++;
            }
            CharSequence subSequence = getLayout().getText().subSequence(0, offsetForHorizontal);
            if (subSequence.length() > 0 && subSequence.charAt(subSequence.length() - 1) != '.') {
                subSequence = ((Object) subSequence) + ".";
            }
            setContentDescription(((Object) subSequence) + " " + this.g);
            i9 = i5;
        }
        if (z) {
            canvas.save(1);
            canvas.translate(i9, paddingTop);
            if (z2) {
                canvas.scale(-1.0f, 1.0f);
            }
            this.j.setBounds(-this.k, lineTop, 0, lineBottom);
            this.j.draw(canvas);
            canvas.restore();
        }
    }
}
