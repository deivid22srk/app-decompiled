package com.google.android.play.hats;

import android.view.View;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f6882a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PlayHappinessSurvey f6883b;

    public a(PlayHappinessSurvey playHappinessSurvey, d dVar) {
        this.f6883b = playHappinessSurvey;
        this.f6882a = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar;
        b bVar2;
        bVar = this.f6883b.e;
        if (bVar != null) {
            bVar2 = this.f6883b.e;
            bVar2.a(this.f6882a);
        }
    }
}
