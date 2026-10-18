package com.google.android.finsky.layout.play;

import com.google.android.finsky.utils.hh;

/* loaded from: classes.dex */
final class ce implements hh {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlayCardViewRate f3466a;

    ce(PlayCardViewRate playCardViewRate) {
        this.f3466a = playCardViewRate;
    }

    @Override // com.google.android.finsky.utils.hh
    public final void a(int i) {
        this.f3466a.a(i, true);
    }

    @Override // com.google.android.finsky.utils.hh
    public final void a() {
        this.f3466a.b();
    }
}
