package com.google.android.finsky.layout.play;

import android.view.View;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gx;

/* loaded from: classes.dex */
final class ak implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.finsky.navigationmanager.b f3398a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gx f3399b;
    final /* synthetic */ cy c;
    final /* synthetic */ PlayAvatarPack d;

    ak(PlayAvatarPack playAvatarPack, com.google.android.finsky.navigationmanager.b bVar, gx gxVar, cy cyVar) {
        this.d = playAvatarPack;
        this.f3398a = bVar;
        this.f3399b = gxVar;
        this.c = cyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f3398a.a(new Document(this.f3399b), this.c).onClick(view);
    }
}
