package com.google.android.play.article;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class NewsstandArticleView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final j f6796a;

    /* renamed from: b, reason: collision with root package name */
    private final View f6797b;
    private final View c;

    public NewsstandArticleView(Context context) {
        this(context, null, 0);
    }

    public NewsstandArticleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NewsstandArticleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6796a = new j(getContext());
        addView(this.f6796a);
        this.f6797b = a(com.google.android.play.l.play_article_loading_view);
        addView(this.f6797b);
        this.c = a(com.google.android.play.l.play_article_error_view);
        addView(this.c);
    }

    private View a(int i) {
        return LayoutInflater.from(getContext()).inflate(i, (ViewGroup) this, false);
    }

    public void setErrorViewVisible(boolean z) {
        this.c.setVisibility(z ? 0 : 4);
    }

    public void setLoadingViewVisible(boolean z) {
        this.f6797b.setVisibility(z ? 0 : 4);
    }

    public void setArticleRendererVisible(boolean z) {
        this.f6796a.setVisibility(z ? 0 : 4);
    }

    public void setOnArticleScrollListener(n nVar) {
        this.f6796a.f6807a = nVar;
    }
}
