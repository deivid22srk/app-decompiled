package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.ArrowKeyMovementMethod;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.layout.PlayTextView;

/* loaded from: classes.dex */
public class DetailsTextBlock extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f2966a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f2967b;
    private PlayTextView c;
    private final int d;
    private final int e;

    public DetailsTextBlock(Context context) {
        this(context, null);
    }

    public DetailsTextBlock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.deivid22srk.store.b.DetailsTextBlock);
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2966a = (ImageView) findViewById(R.id.icon);
        this.f2967b = (TextView) findViewById(R.id.body_header);
        this.c = (PlayTextView) findViewById(R.id.body);
        this.c.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f2967b.setText(charSequence);
            this.f2967b.setVisibility(0);
        } else {
            this.f2967b.setVisibility(8);
        }
        setBody(charSequence2);
        setBodyMaxLines(i);
        setVisibility(0);
    }

    public void setBody(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
        }
    }

    public void setBodyMaxLines(int i) {
        this.c.setMaxLines(i);
    }

    public void setBodyTextIsSelectable(boolean z) {
        if (Build.VERSION.SDK_INT >= 11) {
            this.c.setTextIsSelectable(z);
            this.c.setAutoLinkMask(15);
            this.c.setMovementMethod(ArrowKeyMovementMethod.getInstance());
        }
    }

    public final void a(int i, int i2) {
        this.c.setLastLineOverdrawColor(i);
        this.c.setTextColor(i2);
        this.c.setLinkTextColor(i2);
        this.f2966a.setVisibility(8);
    }

    public final void a(int i, int i2, int i3) {
        Context context = getContext();
        Resources resources = context.getResources();
        int f = com.google.android.finsky.utils.ai.f(context, i);
        setBackgroundColor(f);
        this.c.setLastLineOverdrawColor(f);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.details_new_content_margin);
        android.support.v4.view.by.a(this, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        ColorStateList c = com.google.android.finsky.utils.ai.c(context, i);
        this.f2967b.setTextColor(c);
        this.c.setTextColor(c);
        this.c.setLinkTextColor(c);
        this.f2966a.setVisibility(0);
        Drawable c2 = android.support.v4.c.apkg.a.c(android.support.v4.b.apkg.a.a(resources, R.drawable.ic_whats_new, context.getTheme()).mutate());
        android.support.v4.c.apkg.a.a(c2, c.getDefaultColor());
        this.f2966a.setImageDrawable(c2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.bottomMargin = i3;
        marginLayoutParams.leftMargin = this.e;
        marginLayoutParams.rightMargin = this.e;
        setLayoutParams(marginLayoutParams);
    }

    public final void a() {
        setBackgroundResource(0);
        this.c.setLastLineOverdrawColor(-1);
        Resources resources = getResources();
        int color = resources.getColor(R.color.play_fg_primary);
        this.c.setTextColor(color);
        this.c.setLinkTextColor(color);
        this.f2967b.setTextColor(resources.getColor(R.color.play_fg_secondary));
        this.f2966a.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = 0;
        marginLayoutParams.leftMargin = this.d;
        marginLayoutParams.rightMargin = this.d;
        setLayoutParams(marginLayoutParams);
    }

    public void setBodyClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public final boolean b() {
        return this.c.getVisibility() == 0 && !TextUtils.isEmpty(this.c.getText());
    }

    public int getBodyLineCount() {
        return this.c.getLineCount();
    }
}
