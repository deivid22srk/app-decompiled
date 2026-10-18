package android.support.v7.a;

/* loaded from: classes.dex */
final class aq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap f480a;

    aq(ap apVar) {
        this.f480a = apVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        i = this.f480a.I;
        if ((i & 1) != 0) {
            ap.a(this.f480a, 0);
        }
        i2 = this.f480a.I;
        if ((i2 & 4096) != 0) {
            ap.a(this.f480a, 108);
        }
        ap.b(this.f480a);
        ap.c(this.f480a);
    }
}
