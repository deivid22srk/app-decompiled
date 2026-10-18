package com.google.android.finsky.wear;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;

/* loaded from: classes.dex */
final class ac implements com.google.android.gms.common.api.y<com.google.android.gms.wearable.g> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f5071a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f5072b;

    ac(z zVar, String str) {
        this.f5072b = zVar;
        this.f5071a = str;
    }

    @Override // com.google.android.gms.common.api.y
    public final /* synthetic */ void a(com.google.android.gms.wearable.g gVar) {
        Context context;
        String str;
        Map map;
        com.google.android.gms.wearable.l a2;
        com.google.android.finsky.bpkg.y b2;
        Map map2;
        com.google.android.gms.wearable.g gVar2 = gVar;
        boolean z = true;
        if (gVar2.b().a() && (a2 = gVar2.a()) != null) {
            b2 = z.b(a2);
            map2 = this.f5072b.f;
            map2.put(b2.f2137a, b2);
            z = false;
        }
        if (z) {
            map = this.f5072b.f;
            map.remove(this.f5071a);
        }
        this.f5072b.j = SystemClock.uptimeMillis();
        context = this.f5072b.c;
        str = this.f5072b.e;
        WearSupportService.a(context, str, this.f5071a, z);
    }
}
