package android.support.v4.app;

/* loaded from: classes.dex */
final class ah implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f170a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f171b = 1;
    final /* synthetic */ ad c;

    ah(ad adVar, int i) {
        this.c = adVar;
        this.f170a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.c;
        z zVar = this.c.o;
        adVar.a((String) null, this.f170a, this.f171b);
    }
}
