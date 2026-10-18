package com.google.android.finsky.activities.b;

import android.view.View;
import com.google.android.finsky.utils.bg;

/* loaded from: classes.dex */
final class b implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f1574a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a f1575b;

    b(a aVar, int i) {
        this.f1575b = aVar;
        this.f1574a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bg.aG.a((com.google.android.finsky.c.o<Boolean>) true);
        this.f1575b.d.remove(this.f1575b.e);
        this.f1575b.e(this.f1574a);
    }
}
