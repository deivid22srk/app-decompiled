package com.google.android.wallet.ui.common;

/* loaded from: classes2.dex */
final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f7528a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FifeNetworkImageView f7529b;

    u(FifeNetworkImageView fifeNetworkImageView, String str) {
        this.f7529b = fifeNetworkImageView;
        this.f7528a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        com.android.volley.apkg.n nVar;
        FifeNetworkImageView fifeNetworkImageView = this.f7529b;
        String str = this.f7528a;
        int width = this.f7529b.getWidth();
        int height = this.f7529b.getHeight();
        z = this.f7529b.j;
        String a2 = bj.a(str, width, height, z);
        nVar = this.f7529b.i;
        fifeNetworkImageView.a(a2, nVar);
    }
}
