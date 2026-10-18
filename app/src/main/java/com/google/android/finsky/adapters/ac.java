package com.google.android.finsky.adapters;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.finsky.api.model.d;
import com.google.android.finsky.layout.play.PlayRecyclerView;

/* loaded from: classes.dex */
public abstract class ac<T extends com.google.android.finsky.api.model.d<?>> extends al {
    protected com.google.android.finsky.api.model.s<T> r;

    public void r() {
        this.r.f1988a.b(this);
    }

    public void a(PlayRecyclerView playRecyclerView, Bundle bundle) {
        bundle.putParcelable("ListTab.RecyclerViewParcelKey", playRecyclerView.n());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.al
    public final boolean O_() {
        return this.r.f1988a.m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.al
    public final void d() {
        this.r.f1988a.r();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.finsky.adapters.al
    public final String e() {
        return com.google.android.finsky.utils.aw.a(this.t, this.r.f1988a.h());
    }

    public void a(T t) {
        t.b(this);
        this.r.f1988a = t;
        t.a(this);
        this.f774a.a();
    }

    public void b(PlayRecyclerView playRecyclerView, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("ListTab.RecyclerViewParcelKey");
        if (parcelable != null) {
            playRecyclerView.a(parcelable);
        }
    }

    public ac(Context context, com.google.android.finsky.navigationmanager.b bVar, com.google.android.finsky.api.model.s<T> sVar) {
        super(context, bVar, sVar.f1988a.i(), sVar.f1988a.m);
        this.r = sVar;
        this.r.f1988a.a(this);
    }
}
