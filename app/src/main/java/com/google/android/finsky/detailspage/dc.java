package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.activities.ff;

/* loaded from: classes.dex */
final class dc implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2604a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f2605b;
    final /* synthetic */ ff c;
    final /* synthetic */ db d;

    dc(db dbVar, String str, String str2, ff ffVar) {
        this.d = dbVar;
        this.f2604a = str;
        this.f2605b = str2;
        this.c = ffVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.b(this.f2604a, this.f2605b, this.c);
    }
}
