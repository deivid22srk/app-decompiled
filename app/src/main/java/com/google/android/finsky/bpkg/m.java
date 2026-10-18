package com.google.android.finsky.bpkg;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class m implements com.google.android.finsky.download.aj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.finsky.apkg.i f2123a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2124b;

    m(com.google.android.finsky.apkg.i iVar, String str) {
        this.f2123a = iVar;
        this.f2124b = str;
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar) {
        com.google.android.finsky.download.b bVar2;
        com.google.android.finsky.apkg.n nVar;
        bVar2 = l.d;
        if (bVar == bVar2) {
            com.google.android.finsky.apkg.i iVar = this.f2123a;
            String str = this.f2124b;
            nVar = l.c;
            iVar.a(101, str, (String) null, 0, (String) null, nVar);
            FinskyLog.a("NLP fixer download started", new Object[0]);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void b(com.google.android.finsky.download.b bVar) {
        com.google.android.finsky.download.b bVar2;
        com.google.android.finsky.apkg.n nVar;
        bVar2 = l.d;
        if (bVar == bVar2) {
            com.google.android.finsky.apkg.i iVar = this.f2123a;
            String str = this.f2124b;
            nVar = l.c;
            iVar.a(102, str, (String) null, 0, (String) null, nVar);
            FinskyLog.a("NLP fixer download completed", new Object[0]);
            l.a(bVar, this.f2124b);
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, int i) {
        com.google.android.finsky.download.b bVar2;
        com.google.android.finsky.apkg.n nVar;
        bVar2 = l.d;
        if (bVar == bVar2) {
            com.google.android.finsky.apkg.i iVar = this.f2123a;
            String str = this.f2124b;
            nVar = l.c;
            iVar.a(104, str, (String) null, i, (String) null, nVar);
            FinskyLog.d("NLP fixer download failed with HTTP status: %d", Integer.valueOf(i));
        }
    }

    @Override // com.google.android.finsky.download.aj
    public final void c(com.google.android.finsky.download.b bVar) {
    }

    @Override // com.google.android.finsky.download.aj
    public final void d(com.google.android.finsky.download.b bVar) {
    }

    @Override // com.google.android.finsky.download.aj
    public final void a(com.google.android.finsky.download.b bVar, com.google.android.finsky.download.r rVar) {
    }
}
