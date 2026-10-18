package com.google.android.finsky.utils;

import android.location.Location;

/* loaded from: classes.dex */
final class dc implements y {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Runnable f4821a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ db f4822b;

    dc(db dbVar, Runnable runnable) {
        this.f4822b = dbVar;
        this.f4821a = runnable;
    }

    @Override // com.google.android.finsky.utils.y
    public final void a(Location location) {
        this.f4822b.f4820b = false;
        if (this.f4822b.a(location)) {
            this.f4822b.d.b(location);
            db.a(1001);
        }
        db.b(this.f4821a);
    }
}
