package com.google.android.finsky.wear;

/* loaded from: classes.dex */
final class av implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5100a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WearSupportService f5101b;
    private int c = 0;

    av(WearSupportService wearSupportService, int i) {
        this.f5101b = wearSupportService;
        this.f5100a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c++;
        if (this.c == this.f5100a) {
            WearSupportService.a(this.f5101b);
            this.f5101b.e();
        }
    }
}
