package com.google.android.play.article;

import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class m implements i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f6810a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ NewsstandArticleView f6811b;

    public m(NewsstandArticleView newsstandArticleView, i iVar) {
        this.f6811b = newsstandArticleView;
        this.f6810a = iVar;
    }

    @Override // com.google.android.play.article.i
    public final void a(String str) {
        j jVar;
        jVar = this.f6811b.f6796a;
        jVar.loadDataWithBaseURL("https://play.google.com/newsstand/web/", str, "text/html", Keyczar.DEFAULT_ENCODING, null);
        this.f6811b.setArticleRendererVisible(true);
        this.f6811b.setLoadingViewVisible(false);
        this.f6811b.setErrorViewVisible(false);
        if (this.f6810a != null) {
            this.f6810a.a(str);
        }
    }

    @Override // com.google.android.play.article.i
    public final void a() {
        this.f6811b.setErrorViewVisible(true);
        this.f6811b.setLoadingViewVisible(false);
        this.f6811b.setArticleRendererVisible(false);
        if (this.f6810a != null) {
            this.f6810a.a();
        }
    }
}
