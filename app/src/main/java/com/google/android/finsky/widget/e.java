package com.google.android.finsky.widget;

import android.content.Context;
import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
final class e implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f5207a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5208b;
    final /* synthetic */ r c;
    final /* synthetic */ l d;
    final /* synthetic */ b e;

    e(b bVar, Context context, int i, r rVar, l lVar) {
        this.e = bVar;
        this.f5207a = context;
        this.f5208b = i;
        this.c = rVar;
        this.d = lVar;
    }

    @Override // com.google.android.finsky.widget.p
    public final void a(String str) {
        FinskyLog.d("Failed to load list for widget! %s", str);
        b.c(this.f5207a, this.f5208b);
    }

    @Override // com.google.android.finsky.widget.p
    public final void a() {
        b.b(this.f5207a, this.f5208b, this.d);
    }
}
