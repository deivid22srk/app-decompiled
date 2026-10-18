package com.google.android.finsky.wear;

import android.os.Bundle;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    final WearSupportService f5154a;

    /* renamed from: b, reason: collision with root package name */
    final String f5155b;
    final String c;
    private final com.google.android.gms.common.api.m d;
    private final String e;

    public v(WearSupportService wearSupportService, com.google.android.gms.common.api.m mVar, String str, String str2) {
        this.f5154a = wearSupportService;
        this.d = mVar;
        this.f5155b = str;
        this.e = str2;
        this.c = "/zapp_modules_response/" + this.e + "/" + this.f5155b;
    }

    static /* synthetic */ void a(v vVar, int i, String str, ArrayList arrayList) {
        FinskyLog.a("Writing module response for node %s to path %s", vVar.f5155b, vVar.c);
        com.google.android.gms.wearable.y a2 = com.google.android.gms.wearable.y.a(vVar.c);
        com.google.android.gms.wearable.o oVar = a2.f6636a;
        oVar.a("status", i);
        oVar.a("packageName", str);
        oVar.a("timestamp", System.currentTimeMillis());
        if (arrayList != null) {
            oVar.a("moduleInfos", com.google.android.gms.wearable.o.a((ArrayList<Bundle>) arrayList));
        }
        com.google.android.gms.wearable.f fVar = com.google.android.gms.wearable.aa.f6462a;
        com.google.android.gms.common.api.m mVar = vVar.d;
        PutDataRequest a3 = a2.a();
        a3.e = 0L;
        fVar.a(mVar, a3).a(new y(vVar));
    }
}
