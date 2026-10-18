package com.google.android.play.search;

/* loaded from: classes.dex */
final class ab implements n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlaySearchToolbar f7025a;

    ab(PlaySearchToolbar playSearchToolbar) {
        this.f7025a = playSearchToolbar;
    }

    @Override // com.google.android.play.search.n
    public final void a(int i) {
        n nVar;
        n nVar2;
        nVar = this.f7025a.x;
        if (nVar != null) {
            nVar2 = this.f7025a.x;
            nVar2.a(i);
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(String str, boolean z) {
        PlaySearch playSearch;
        n nVar;
        n nVar2;
        PlaySearch playSearch2;
        playSearch = this.f7025a.u;
        if (playSearch != null) {
            playSearch2 = this.f7025a.u;
            playSearch2.setQuery(str);
        }
        nVar = this.f7025a.x;
        if (nVar != null) {
            nVar2 = this.f7025a.x;
            nVar2.a(str, z);
        }
    }

    @Override // com.google.android.play.search.n
    public final void a(v vVar) {
        n nVar;
        n nVar2;
        nVar = this.f7025a.x;
        if (nVar != null) {
            nVar2 = this.f7025a.x;
            nVar2.a(vVar);
        }
    }

    @Override // com.google.android.play.search.n
    public final boolean b(v vVar) {
        n nVar;
        n nVar2;
        nVar = this.f7025a.x;
        if (nVar == null) {
            return false;
        }
        nVar2 = this.f7025a.x;
        return nVar2.b(vVar);
    }

    @Override // com.google.android.play.search.n
    public final void a(String str) {
        n nVar;
        n nVar2;
        nVar = this.f7025a.x;
        if (nVar != null) {
            nVar2 = this.f7025a.x;
            nVar2.a(str);
        }
    }
}
