package com.google.android.finsky.services;

/* loaded from: classes.dex */
final class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ RestoreService f4585a;

    ao(RestoreService restoreService) {
        this.f4585a = restoreService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ar arVar;
        if (!this.f4585a.f4555a.e(null)) {
            this.f4585a.a(1, (String) null, false);
        } else if (this.f4585a.f4555a.g == null || (arVar = this.f4585a.f4555a.d.get((str = this.f4585a.f4555a.g))) == null || !arVar.g) {
            this.f4585a.a(2, (String) null, false);
        } else {
            this.f4585a.a(3, str, true);
        }
    }
}
