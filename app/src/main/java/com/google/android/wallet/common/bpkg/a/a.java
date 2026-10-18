package com.google.android.wallet.common.bpkg.a;

import android.util.Log;
import com.google.android.wallet.analytics.WebViewPageLoadEvent;
import com.google.android.wallet.analytics.e;
import com.google.android.wallet.analytics.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public static void a(int i, int i2, byte[] bArr) {
        com.google.android.wallet.common.pub.apkg.apkg.a(new com.google.android.wallet.analytics.apkg.a(i, 0, null, -1L, -1L, i2, bArr));
    }

    public static void b(int i, int i2, byte[] bArr) {
        a(i, i2, null, -1L, -1L, bArr);
    }

    public static void a(int i, int i2, String str, long j, long j2, byte[] bArr) {
        com.google.android.wallet.common.pub.apkg.apkg.a(new com.google.android.wallet.analytics.apkg.a(i, i2, str, j, j2, -1, bArr));
    }

    public static void a(int i, WebViewPageLoadEvent webViewPageLoadEvent, byte[] bArr) {
        com.google.android.wallet.common.pub.apkg.apkg.a(new com.google.android.wallet.analytics.apkg.a(i, webViewPageLoadEvent, bArr));
    }

    public static void a(e eVar) {
        a(eVar, -1, 1622);
    }

    public static void a(e eVar, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(i2));
        if (i != -1) {
            arrayList.add(new f(i));
        }
        while (eVar != null) {
            arrayList.add(eVar.getUiElement());
            eVar = eVar.getParentUiNode();
        }
        com.google.android.wallet.common.pub.apkg.apkg.a aVar = new com.google.android.wallet.common.pub.apkg.apkg.a(arrayList);
        if (com.google.android.wallet.common.pub.apkg.a.f7286a != null) {
            com.google.android.wallet.common.pub.apkg.a.f7286a.a(aVar);
        } else if (Log.isLoggable("OrchAnalyticsDispatcher", 3)) {
            Log.d("OrchAnalyticsDispatcher", new StringBuilder(78).append("No listener found for sending click event from the clicked element ").append(aVar.f7287a.get(0).f7240a).toString());
        }
    }

    public static void a(e eVar, int i) {
        e eVar2 = eVar;
        while (eVar2.getParentUiNode() != null) {
            eVar2 = eVar2.getParentUiNode();
        }
        f a2 = a(eVar2.getUiElement());
        a(a2, eVar2.getChildren(), eVar.getUiElement().f7240a, i);
        com.google.android.wallet.common.pub.apkg.apkg.b bVar = new com.google.android.wallet.common.pub.apkg.apkg.b(a2);
        if (com.google.android.wallet.common.pub.apkg.a.f7286a != null) {
            com.google.android.wallet.common.pub.apkg.a.f7286a.a(bVar);
        } else if (Log.isLoggable("OrchAnalyticsDispatcher", 3)) {
            String valueOf = String.valueOf(bVar.toString());
            Log.d("OrchAnalyticsDispatcher", valueOf.length() != 0 ? "No listener found for sending the following impression event ".concat(valueOf) : new String("No listener found for sending the following impression event "));
        }
    }

    public static void a(f fVar, List<e> list, int i, int i2) {
        if ((list != null && !list.isEmpty()) || (i2 != -1 && fVar.f7240a == i)) {
            ArrayList arrayList = new ArrayList();
            if (i2 != -1 && fVar.f7240a == i) {
                arrayList.add(new f(i2));
            }
            if (list != null) {
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    e eVar = list.get(i3);
                    f a2 = a(eVar.getUiElement());
                    arrayList.add(a2);
                    a(a2, eVar.getChildren(), i, i2);
                }
            }
            fVar.c = arrayList;
        }
    }

    public static f a(f fVar) {
        return new f(fVar.f7240a, fVar.f7241b);
    }
}
