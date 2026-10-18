package com.google.android.finsky.layout.play;

import android.view.View;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
final class cb implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cc f3463a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayCardViewMyApps f3464b;

    cb(PlayCardViewMyApps playCardViewMyApps, cc ccVar) {
        this.f3464b = playCardViewMyApps;
        this.f3463a = ccVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3463a.a((Document) this.f3464b.getData());
    }
}
