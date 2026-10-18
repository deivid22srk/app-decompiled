package android.support.v4.app;

import android.app.Activity;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String[] f189a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f190b;
    final /* synthetic */ int c;

    b(String[] strArr, Activity activity, int i) {
        this.f189a = strArr;
        this.f190b = activity;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr = new int[this.f189a.length];
        PackageManager packageManager = this.f190b.getPackageManager();
        String packageName = this.f190b.getPackageName();
        int length = this.f189a.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = packageManager.checkPermission(this.f189a[i], packageName);
        }
        ((c) this.f190b).onRequestPermissionsResult(this.c, this.f189a, iArr);
    }
}
