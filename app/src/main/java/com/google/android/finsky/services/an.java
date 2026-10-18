package com.google.android.finsky.services;

import android.graphics.Bitmap;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

/* loaded from: classes.dex */
final class an implements com.google.android.play.image.k {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f4583a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ RestoreService f4584b;

    an(RestoreService restoreService, String str) {
        this.f4584b = restoreService;
        this.f4583a = str;
    }

    @Override // com.android.volley.t
    /* renamed from: a */
    public final void a_(com.google.android.play.image.j jVar) {
        boolean z;
        Map map;
        Bitmap bitmap = jVar.f6944a;
        if (bitmap != null) {
            FinskyLog.a("Received appIcon for %s", this.f4583a);
            map = this.f4584b.o;
            map.remove(this.f4583a);
            this.f4584b.a(this.f4583a, bitmap);
            return;
        }
        FinskyLog.c("Unable to download appIcon for %s", this.f4583a);
        at atVar = this.f4584b.f4555a;
        String str = this.f4583a;
        aq aqVar = atVar.e.get(str);
        if (aqVar == null) {
            z = false;
        } else if (aqVar.f4588a >= com.google.android.finsky.cpkg.d.bM.b().intValue()) {
            FinskyLog.a("Reached limit %d for %s", Integer.valueOf(aqVar.f4588a), str);
            z = false;
        } else if (atVar.d.containsKey(str)) {
            z = FinskyApp.a().v.a(str) == null;
        } else {
            z = false;
        }
        if (z) {
            FinskyLog.c("Unable to download appIcon for %s", this.f4583a);
        }
        RestoreService.a(this.f4584b, this.f4583a, false);
    }
}
