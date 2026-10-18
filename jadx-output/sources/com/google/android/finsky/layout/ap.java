package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.activities.ha;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.ik;
import com.google.android.play.layout.PlayTextView;
import com.google.android.play.utils.UrlSpanUtils;

/* loaded from: classes.dex */
public abstract class ap extends ForegroundLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected final int f3135a;

    /* renamed from: b, reason: collision with root package name */
    protected DetailsTextBlock f3136b;
    protected TextView c;
    protected boolean d;
    private com.google.android.finsky.navigationmanager.b e;
    private ha f;
    private PlayTextView g;
    private View h;

    public ap(Context context) {
        this(context, null);
    }

    public ap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3135a = context.getResources().getInteger(R.integer.details_text_collapsed_lines);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.g = (PlayTextView) findViewById(R.id.callout);
        this.h = findViewById(R.id.spacer);
        this.f3136b = (DetailsTextBlock) findViewById(R.id.body_container);
        this.c = (TextView) findViewById(R.id.footer_message);
        this.c.setText(getContext().getString(R.string.read_more).toUpperCase());
    }

    public final void a(com.google.android.finsky.navigationmanager.b bVar, Document document, int i) {
        CharSequence u = document.u();
        this.e = bVar;
        this.f = null;
        if (!TextUtils.isEmpty(u)) {
            UrlSpanUtils.a(u, null, new aq(this));
        }
        this.g.setVisibility(8);
        this.f3136b.a((CharSequence) null, u, this.f3135a);
        this.f3136b.a();
        this.h.setVisibility(0);
        setOnClickListener(new ar(this));
        this.f3136b.setBodyClickListener(new as(this));
        int color = getResources().getColor(ik.a(i) ? R.color.play_fg_primary : R.color.white);
        setBackgroundColor(i);
        this.f3136b.a(i, color);
        this.c.setTextColor(color);
        setVisibility(0);
    }

    protected void a() {
        if (this.d) {
            this.d = false;
        } else {
            if (this.f == null) {
                return;
            }
            getId();
        }
    }
}
