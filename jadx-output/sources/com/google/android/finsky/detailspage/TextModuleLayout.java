package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.layout.DecoratedTextView;
import com.google.android.finsky.layout.DetailsTextBlock;
import com.google.android.finsky.layout.DetailsTextIconContainer;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.utils.UrlSpanUtils;

/* loaded from: classes.dex */
public class TextModuleLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    PlayTextView f2524a;

    /* renamed from: b, reason: collision with root package name */
    View f2525b;
    DetailsTextBlock c;
    DetailsTextIconContainer d;
    DecoratedTextView e;
    TextView f;
    int g;
    final int h;
    final int i;
    final CharSequence j;
    View.OnClickListener k;
    com.google.android.play.utils.k l;
    private boolean m;

    static /* synthetic */ boolean a(TextModuleLayout textModuleLayout) {
        textModuleLayout.m = true;
        return true;
    }

    public TextModuleLayout(Context context) {
        this(context, null);
    }

    public TextModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.g = resources.getInteger(R.integer.details_text_collapsed_lines);
        this.h = resources.getColor(R.color.top_developer);
        this.i = resources.getDimensionPixelSize(R.dimen.details_whatsnew_vmargin);
        this.j = resources.getString(R.string.details_whats_new).toUpperCase();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2524a = (PlayTextView) findViewById(R.id.callout);
        this.f2524a.setMovementMethod(LinkMovementMethod.getInstance());
        this.f2525b = findViewById(R.id.spacer);
        this.c = (DetailsTextBlock) findViewById(R.id.body_container);
        this.d = (DetailsTextIconContainer) findViewById(R.id.icon_container);
        this.e = (DecoratedTextView) findViewById(R.id.top_developer_label);
        this.f = (TextView) findViewById(R.id.footer_message);
        this.f.setText(getContext().getString(R.string.read_more).toUpperCase());
    }

    final void a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        UrlSpanUtils.a(charSequence, null, new eq(this));
    }

    static /* synthetic */ void a(TextModuleLayout textModuleLayout, View view) {
        if (textModuleLayout.m) {
            textModuleLayout.m = false;
        } else {
            if (textModuleLayout.k == null) {
                return;
            }
            textModuleLayout.k.onClick(view);
        }
    }
}
