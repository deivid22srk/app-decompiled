package com.google.android.wallet.common.util;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;

/* loaded from: classes.dex */
public final class c extends android.support.v4.h.g<String, Bitmap> implements com.android.volley.a.s {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.h.g
    @TargetApi(19)
    public final /* synthetic */ int c(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (Build.VERSION.SDK_INT >= 19) {
            return bitmap2.getAllocationByteCount() / 1024;
        }
        return (bitmap2.getRowBytes() * bitmap2.getHeight()) / 1024;
    }

    @Override // com.android.volley.a.s
    public final Bitmap a(String str) {
        return a((c) str);
    }

    @Override // com.android.volley.a.s
    public final void a(String str, Bitmap bitmap) {
        a((c) str, (String) bitmap);
    }

    public c(Context context, int i) {
        super(Math.min((((ActivityManager) context.getSystemService("activity")).getMemoryClass() * 1024) / 8, (((int) (Math.pow(a.b(context).densityDpi / 160.0d, 2.0d) * i)) * 4) / 1024));
    }
}
