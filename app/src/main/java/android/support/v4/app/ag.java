package android.support.v4.app;

/* loaded from: classes.dex */
final class ag implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f168a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f169b;
    final /* synthetic */ ad c;

    ag(ad adVar, String str, int i) {
        this.c = adVar;
        this.f168a = str;
        this.f169b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ad adVar = this.c;
        z zVar = this.c.o;
        adVar.a(this.f168a, -1, this.f169b);
    }
}
