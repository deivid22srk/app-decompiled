package com.google.android.finsky.download.a;

import android.os.Build;
import com.google.android.finsky.receivers.aq;
import java.io.File;

/* loaded from: classes.dex */
public final class e implements aq {

    /* renamed from: a, reason: collision with root package name */
    private final int f2680a = 10;

    @Override // com.google.android.finsky.receivers.aq
    public final void b(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void c(String str) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String[] strArr) {
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void a(String str, boolean z) {
        if (Build.VERSION.SDK_INT <= 10 && !z) {
            File a2 = c.a(str);
            if (a2.exists()) {
                for (File file : a2.listFiles()) {
                    file.delete();
                }
                a2.delete();
            }
        }
    }

    @Override // com.google.android.finsky.receivers.aq
    public final void d(String str) {
    }
}
