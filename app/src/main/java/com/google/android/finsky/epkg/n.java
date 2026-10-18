package com.google.android.finsky.epkg;

import android.os.Bundle;
import android.transition.Transition;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.apkg.ai;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.ContentFrame;
import com.google.android.finsky.layout.bv;
import com.google.android.play.article.NewsstandArticleView;

/* loaded from: classes.dex */
public final class n extends q {

    /* renamed from: a, reason: collision with root package name */
    public String f2761a;

    /* renamed from: b, reason: collision with root package name */
    public String f2762b;
    public int c;
    public ai d = com.google.android.finsky.apkg.i.a(15);

    public static n a(DfeToc dfeToc, String str, String str2, int i) {
        n nVar = new n();
        Bundle bundle = new Bundle();
        bundle.putString("NewsstandArticleFragment_postId", str);
        bundle.putString("NewsstandArticleFragment_article_title", str2);
        bundle.putInt("NewsstandArticleFragment_backendId", i);
        nVar.f(bundle);
        nVar.a("finsky.PageFragment.toc", dfeToc);
        return nVar;
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void a(Bundle bundle) {
        super.a(bundle);
        k();
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.f2761a = this.r.getString("NewsstandArticleFragment_postId");
        this.f2762b = this.r.getString("NewsstandArticleFragment_article_title");
        this.c = this.r.getInt("NewsstandArticleFragment_backendId");
        o_();
        u();
        this.at.z().getViewTreeObserver().addOnGlobalLayoutListener(new o(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final Transition v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final bv a(ContentFrame contentFrame) {
        return new bv(contentFrame, R.id.page_content, R.id.loading_indicator, this, 2);
    }

    @Override // com.google.android.finsky.epkg.q
    public final void o_() {
        this.ao.b_(this.f2762b);
        this.ao.a(this.c, false);
        this.ao.s_();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final int w() {
        return R.layout.newsstand_article_view;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void y() {
    }

    @Override // com.google.android.finsky.epkg.q, android.support.v4.app.Fragment
    public final void d() {
        super.d();
    }

    @Override // com.google.android.finsky.epkg.q
    public final int D() {
        return this.ap.getResources().getColor(R.color.play_white);
    }

    @Override // com.google.android.finsky.epkg.q
    public final int B() {
        return com.google.android.finsky.utils.ai.a(this.ap, this.c);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final ai getPlayStoreUiElement() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.epkg.q
    public final void u() {
        NewsstandArticleView newsstandArticleView = (NewsstandArticleView) this.R.findViewById(R.id.article_view);
        com.google.android.finsky.s l = FinskyApp.a().l();
        String str = this.f2761a;
        p pVar = new p(this);
        com.google.android.play.article.a aVar = l.f4510a;
        newsstandArticleView.setErrorViewVisible(false);
        newsstandArticleView.setArticleRendererVisible(false);
        newsstandArticleView.setLoadingViewVisible(true);
        aVar.a(str, new com.google.android.play.article.m(newsstandArticleView, pVar));
    }
}
