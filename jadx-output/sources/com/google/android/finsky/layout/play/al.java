package com.google.android.finsky.layout.play;

import android.view.View;

/* loaded from: classes.dex */
final class al implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3400a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayAvatarPack f3401b;

    al(PlayAvatarPack playAvatarPack, com.google.android.finsky.navigationmanager.b bVar) {
        this.f3401b = playAvatarPack;
        this.f3400a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.utils.bm.a(this.f3400a.f3539b, this.f3401b.getContext());
    }
}
