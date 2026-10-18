package com.google.android.finsky.services;

/* loaded from: classes.dex */
final class af implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationUpdaterService f4571a;

    af(LocationUpdaterService locationUpdaterService) {
        this.f4571a = locationUpdaterService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        LocationUpdaterService.a(this.f4571a);
        i = this.f4571a.f4550b;
        if (i <= 0) {
            LocationUpdaterService locationUpdaterService = this.f4571a;
            i2 = this.f4571a.f4549a;
            locationUpdaterService.stopSelf(i2);
        }
    }
}
