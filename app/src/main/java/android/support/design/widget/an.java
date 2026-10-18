package android.support.design.widget;

/* loaded from: classes.dex */
final class an implements bg {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Snackbar f88a;

    an(Snackbar snackbar) {
        this.f88a = snackbar;
    }

    @Override // android.support.design.widget.bg
    public final void a() {
        Snackbar.a(this.f88a, 0);
    }

    @Override // android.support.design.widget.bg
    public final void a(int i) {
        az azVar;
        az azVar2;
        switch (i) {
            case 0:
                ax a2 = ax.a();
                azVar = this.f88a.c;
                a2.b(azVar);
                break;
            case 1:
            case 2:
                ax a3 = ax.a();
                azVar2 = this.f88a.c;
                a3.a(azVar2);
                break;
        }
    }
}
