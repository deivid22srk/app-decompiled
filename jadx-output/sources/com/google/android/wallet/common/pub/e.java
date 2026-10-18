package com.google.android.wallet.common.pub;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.wallet.common.util.i;
import com.google.android.wallet.common.util.m;

/* loaded from: classes.dex */
public final class e {
    public static byte[] a(Context context, int i) {
        int[] iArr;
        com.google.android.a.g.a(context.getApplicationContext());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{com.google.android.wallet.instrumentmanager.b.imPopupRedirectActivitySupported, com.google.android.wallet.instrumentmanager.b.imTitleIconType});
        com.google.d.b.a.a.a.b bVar = new com.google.d.b.a.a.a.b();
        if (obtainStyledAttributes.getBoolean(0, false)) {
            iArr = new int[]{1, 2};
        } else {
            iArr = new int[]{1};
        }
        bVar.c = iArr;
        bVar.f7733a = obtainStyledAttributes.getInt(1, 1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, new int[]{com.google.android.wallet.instrumentmanager.b.imBodyIconType});
        bVar.f7734b = obtainStyledAttributes2.getInt(0, 1);
        obtainStyledAttributes2.recycle();
        com.google.d.b.a.a.a.d dVar = new com.google.d.b.a.a.a.d();
        dVar.f7735a = i.a(context, (byte[]) null);
        dVar.f7736b = bVar;
        m.a(dVar, "ClientToken=");
        return com.google.protobuf.nano.c.a(dVar);
    }
}
