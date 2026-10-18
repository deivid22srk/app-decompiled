package com.google.android.finsky.layout;

import android.view.View;
import com.google.android.finsky.protos.pe;

/* loaded from: classes.dex */
public final class bg implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pe f3157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FreeSongOfTheDaySummary f3158b;

    public bg(FreeSongOfTheDaySummary freeSongOfTheDaySummary, pe peVar) {
        this.f3158b = freeSongOfTheDaySummary;
        this.f3157a = peVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.google.android.finsky.j.b.a(this.f3157a);
    }
}
