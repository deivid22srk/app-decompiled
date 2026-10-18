package android.support.v4.view;

/* loaded from: classes.dex */
final class df implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ViewPager f370a;

    df(ViewPager viewPager) {
        this.f370a = viewPager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f370a.setScrollState(0);
        this.f370a.ac_();
    }
}
