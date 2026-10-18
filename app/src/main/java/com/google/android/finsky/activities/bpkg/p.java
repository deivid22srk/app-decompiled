package com.google.android.finsky.activities.bpkg;

import android.content.Context;
import android.widget.Toast;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.jb;

/* loaded from: classes.dex */
public final class p implements com.google.android.finsky.utils.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f1591a;

    p(l lVar) {
        this.f1591a = lVar;
    }

    @Override // com.google.android.finsky.utils.m
    public final void a() {
        Context context;
        context = this.f1591a.ap;
        Toast.makeText(context, R.string.refunding, 1).show();
    }

    @Override // com.google.android.finsky.utils.m
    public final void a(boolean z) {
        com.google.android.finsky.api.b bVar;
        if (z) {
            this.f1591a.Q();
            if (FinskyApp.a().e().a(12603718L)) {
                bVar = this.f1591a.aq;
                jb.a(bVar.c(), 5);
            }
        }
    }
}
