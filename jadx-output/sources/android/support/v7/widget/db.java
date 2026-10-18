package android.support.v7.widget;

/* loaded from: classes.dex */
final class db implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cu f758a;

    private db(cu cuVar) {
        this.f758a = cuVar;
    }

    /* synthetic */ db(cu cuVar, byte b2) {
        this(cuVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f758a.f();
    }
}
