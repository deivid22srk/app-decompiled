package com.google.android.finsky.adapters;

import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.layout.play.PlayCardClusterViewV2;
import com.google.android.finsky.utils.fe;

/* loaded from: classes.dex */
final class q implements com.google.android.finsky.layout.s<com.google.android.play.layout.a> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f1934a;

    /* renamed from: b, reason: collision with root package name */
    private final Document f1935b;
    private final int c;
    private final com.google.android.finsky.api.model.i d;
    private final PlayCardClusterViewV2 e;

    @Override // com.google.android.finsky.layout.s
    public final /* synthetic */ void a(com.google.android.play.layout.a aVar, int i) {
        com.google.android.play.layout.a aVar2 = aVar;
        aVar2.setThumbnailAspectRatio(a(i));
        Document c = this.d.c(i);
        if (c == null) {
            aVar2.a();
            return;
        }
        boolean aQ = c.aQ();
        com.google.android.finsky.layout.play.az s = this.f1934a.s();
        boolean z = aQ && s != null && this.f1934a.l.c(c.f1963a.f3890a);
        String str = this.f1935b.f1963a.f3890a;
        com.google.android.play.image.e eVar = this.f1934a.c;
        com.google.android.finsky.navigationmanager.b bVar = this.f1934a.u;
        if (!aQ) {
            s = null;
        }
        fe.a(aVar2, c, str, eVar, bVar, z, s, this.e.getParentOfChildren(), false, -1, true);
    }

    @Override // com.google.android.finsky.layout.s
    public final /* synthetic */ float a_(com.google.android.play.layout.a aVar) {
        Document document = (Document) aVar.getData();
        if (document == null) {
            return -1.0f;
        }
        return com.google.android.finsky.layout.play.as.b(document.f1963a.e);
    }

    public q(p pVar, Document document, int i, com.google.android.finsky.api.model.i iVar, PlayCardClusterViewV2 playCardClusterViewV2) {
        this.f1934a = pVar;
        this.f1935b = document;
        this.c = i;
        this.d = iVar;
        this.e = playCardClusterViewV2;
    }

    @Override // com.google.android.finsky.layout.s
    public final String a() {
        return this.f1935b.f1963a.f3890a;
    }

    @Override // com.google.android.finsky.layout.s
    public final int b() {
        return this.c;
    }

    @Override // com.google.android.finsky.layout.s
    public final boolean X_() {
        return this.d.m;
    }

    @Override // com.google.android.finsky.layout.s
    public final int d() {
        return this.d.p();
    }

    @Override // com.google.android.finsky.layout.s
    public final float a(int i) {
        Document a2 = this.d.a(i, false);
        if (a2 == null) {
            return -1.0f;
        }
        return com.google.android.finsky.layout.play.as.b(a2.f1963a.e);
    }
}
