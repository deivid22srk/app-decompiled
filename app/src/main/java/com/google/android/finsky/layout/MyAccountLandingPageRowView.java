package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class MyAccountLandingPageRowView extends cm implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.finsky.apkg.ai f3024a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.layout.play.cy f3025b;
    private CircledImageView c;
    private LinearLayout d;
    private TextView e;
    private TextView f;
    private View g;

    public MyAccountLandingPageRowView(Context context) {
        this(context, null);
    }

    public MyAccountLandingPageRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3024a = com.google.android.finsky.apkg.i.a(0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.c = (CircledImageView) findViewById(R.id.sub_page_icon);
        this.d = (LinearLayout) findViewById(R.id.title_container);
        this.e = (TextView) findViewById(R.id.title);
        this.f = (TextView) findViewById(R.id.subtitle);
        this.g = findViewById(R.id.dot_notification);
    }

    @Override // com.google.android.finsky.layout.cm
    protected final int a(boolean z) {
        return z ? this.d.getRight() : this.d.getLeft();
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.f3024a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.f3025b;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }

    public final void a(cg cgVar, com.google.android.finsky.apkg.i iVar) {
        if (cgVar.f3186a == 0 || cgVar.c == 0 || cgVar.e == 0 || cgVar.h == null || cgVar.i == null || cgVar.j == -1 || cgVar.g == null) {
            throw new IllegalArgumentException("Missing required binding params.");
        }
        if (cgVar.f3187b == 0 || cgVar.d != 0) {
            this.f3025b = cgVar.i;
            this.f3024a.f1453a = cgVar.j;
            Resources resources = getResources();
            this.e.setText(cgVar.f3186a);
            if (cgVar.f3187b != 0) {
                this.f.setText(cgVar.f3187b);
                this.f.setTextColor(resources.getColor(cgVar.d));
                this.f.setVisibility(0);
            } else {
                this.f.setVisibility(8);
            }
            if (cgVar.f) {
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
            this.e.setText(cgVar.f3186a);
            this.c.setColor(resources.getColor(cgVar.e));
            this.c.setImageResource(cgVar.c);
            if (!cgVar.g.booleanValue()) {
                if (cgVar.f) {
                    iVar.a(299, (com.google.android.finsky.layout.play.cy) this);
                } else {
                    iVar.a(0L, (com.google.android.finsky.layout.play.cy) this);
                }
            }
            setOnClickListener(new cf(this, cgVar, iVar));
            return;
        }
        throw new IllegalArgumentException("Text color is required for subtitle.");
    }
}
