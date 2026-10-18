package com.google.android.finsky.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.fe;

/* loaded from: classes.dex */
public class FreeSongOfTheDayAlbumView extends LinearLayout implements com.google.android.finsky.api.model.x {

    /* renamed from: a, reason: collision with root package name */
    protected com.google.android.finsky.api.b f2993a;

    /* renamed from: b, reason: collision with root package name */
    protected com.google.android.finsky.navigationmanager.b f2994b;
    public Document c;
    public String d;
    public TextView e;
    public com.google.android.finsky.layout.play.cy f;
    private com.google.android.play.image.e g;
    private com.google.android.finsky.api.model.h h;
    private com.google.android.play.layout.a i;

    public FreeSongOfTheDayAlbumView(Context context) {
        this(context, null);
    }

    public FreeSongOfTheDayAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.i = (com.google.android.play.layout.a) findViewById(R.id.play_card);
        this.e = (TextView) findViewById(R.id.header);
    }

    public final void a(com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar) {
        this.f2993a = bVar;
        this.f2994b = bVar2;
        this.g = eVar;
    }

    private void b() {
        if (this.h != null) {
            this.h.b(this);
        }
    }

    public final void a() {
        if (!TextUtils.isEmpty(this.d)) {
            setVisibility(0);
            b();
            this.h = new com.google.android.finsky.api.model.h(this.f2993a, this.d);
            this.h.a(this);
            if (this.h.b() != null) {
                setVisibility(0);
                c();
                return;
            } else {
                this.i.a();
                return;
            }
        }
        setVisibility(8);
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (this.h != null && this.h.a() && this.h.b() != null) {
            c();
        } else {
            setVisibility(8);
        }
    }

    private void c() {
        fe.a(this.i, this.h.b(), this.c.f1963a.f3890a, this.g, this.f2994b, this.f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }
}
