package com.google.android.wallet.d;

/* loaded from: classes.dex */
final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f7316a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f7317b;
    final /* synthetic */ String c;
    final /* synthetic */ b d;
    final /* synthetic */ d e;

    e(d dVar, int i, g gVar, String str, b bVar) {
        this.e = dVar;
        this.f7316a = i;
        this.f7317b = gVar;
        this.c = str;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7316a) {
            case 1:
                this.f7317b.b(this.c, this.d);
                return;
            case 2:
                this.f7317b.a(this.c, this.d);
                return;
            case 3:
                this.f7317b.y();
                return;
            default:
                throw new IllegalArgumentException(new StringBuilder(38).append("Unknown interception type: ").append(this.f7316a).toString());
        }
    }
}
