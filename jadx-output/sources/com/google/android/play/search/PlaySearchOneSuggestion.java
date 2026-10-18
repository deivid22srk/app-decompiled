package com.google.android.play.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PlaySearchOneSuggestion extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final aj f7013a;

    /* renamed from: b, reason: collision with root package name */
    private FifeImageView f7014b;
    private TextView c;
    private TextView d;
    private Drawable e;

    public PlaySearchOneSuggestion(Context context) {
        this(context, null);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7013a = new d(context);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f7014b = (FifeImageView) findViewById(com.google.android.play.k.icon);
        this.c = (TextView) findViewById(com.google.android.play.k.suggest_text);
        this.d = (TextView) findViewById(com.google.android.play.k.suggest_subtext);
        this.e = getContext().getResources().getDrawable(com.google.android.play.j.ic_search);
    }

    public final void a(v vVar, com.google.android.play.image.e eVar, String str) {
        this.c.setText(this.f7013a.a(str, vVar.e, com.google.android.play.n.PlaySearchSuggestionText_Query, com.google.android.play.n.PlaySearchSuggestionText_Suggested));
        if (TextUtils.isEmpty(vVar.f)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.setText(vVar.f);
        }
        Drawable drawable = vVar.h != null ? vVar.h : this.e;
        this.f7014b.a();
        this.f7014b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f7014b.setBackgroundDrawable(null);
        this.f7014b.setDefaultDrawable(drawable);
        if (vVar.i != null) {
            Uri parse = Uri.parse(vVar.i);
            if ("android.resource".equals(parse.getScheme())) {
                this.f7014b.setImageURI(parse);
                return;
            } else if (eVar != null) {
                this.f7014b.setOnLoadedListener(new p(this, vVar));
                this.f7014b.a(vVar.i, vVar.j, eVar);
                return;
            }
        }
        this.f7014b.setOnLoadedListener(null);
        this.f7014b.setImageDrawable(drawable);
    }
}
