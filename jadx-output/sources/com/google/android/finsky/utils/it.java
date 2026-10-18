package com.google.android.finsky.utils;

import android.widget.Toast;
import com.android.vending.R;

/* loaded from: classes.dex */
final class it implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ is f5006a;

    it(is isVar) {
        this.f5006a = isVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f5006a.f5005a.f5001a, R.string.refunded, 1).show();
    }
}
