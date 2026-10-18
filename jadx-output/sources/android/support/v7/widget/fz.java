package android.support.v7.widget;

/* loaded from: classes.dex */
final class fz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Toolbar f839a;

    fz(Toolbar toolbar) {
        this.f839a = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f839a.b();
    }
}
