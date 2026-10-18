package com.google.android.finsky.services;

/* loaded from: classes.dex */
final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ DailyHygiene f4627a;

    /* renamed from: b, reason: collision with root package name */
    private int f4628b;

    o(DailyHygiene dailyHygiene) {
        this.f4627a = dailyHygiene;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4628b++;
        if (this.f4628b == 4) {
            DailyHygiene.e(this.f4627a);
        }
    }
}
