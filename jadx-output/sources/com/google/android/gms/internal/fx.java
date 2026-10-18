package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@gw
/* loaded from: classes.dex */
public final class fx extends fy implements ea {

    /* renamed from: a, reason: collision with root package name */
    DisplayMetrics f5994a;

    /* renamed from: b, reason: collision with root package name */
    int f5995b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private final im h;
    private final Context i;
    private final WindowManager j;
    private final cm k;
    private float l;
    private int m;

    public fx(im imVar, Context context, cm cmVar) {
        super(imVar);
        this.f5995b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = -1;
        this.h = imVar;
        this.i = context;
        this.k = cmVar;
        this.j = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ea
    public final void a(im imVar, Map<String, String> map) {
        int i;
        this.f5994a = new DisplayMetrics();
        Display defaultDisplay = this.j.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f5994a);
        this.l = this.f5994a.density;
        this.m = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.j.a();
        this.f5995b = com.google.android.gms.ads.internal.util.client.a.b(this.f5994a, this.f5994a.widthPixels);
        com.google.android.gms.ads.internal.client.j.a();
        this.c = com.google.android.gms.ads.internal.util.client.a.b(this.f5994a, this.f5994a.heightPixels);
        Activity c = this.h.c();
        if (c == null || c.getWindow() == null) {
            this.d = this.f5995b;
            this.e = this.c;
        } else {
            com.google.android.gms.ads.internal.d.c();
            int[] a2 = hk.a(c);
            com.google.android.gms.ads.internal.client.j.a();
            this.d = com.google.android.gms.ads.internal.util.client.a.b(this.f5994a, a2[0]);
            com.google.android.gms.ads.internal.client.j.a();
            this.e = com.google.android.gms.ads.internal.util.client.a.b(this.f5994a, a2[1]);
        }
        if (this.h.h().e) {
            this.f = this.f5995b;
            this.g = this.c;
        } else {
            this.h.measure(0, 0);
            com.google.android.gms.ads.internal.client.j.a();
            this.f = com.google.android.gms.ads.internal.util.client.a.b(this.i, this.h.getMeasuredWidth());
            com.google.android.gms.ads.internal.client.j.a();
            this.g = com.google.android.gms.ads.internal.util.client.a.b(this.i, this.h.getMeasuredHeight());
        }
        a(this.f5995b, this.c, this.d, this.e, this.l, this.m);
        fw fwVar = new fw();
        cm cmVar = this.k;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        fwVar.f5993b = cmVar.a(intent);
        cm cmVar2 = this.k;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        fwVar.f5992a = cmVar2.a(intent2);
        fwVar.c = this.k.b();
        fwVar.d = this.k.a();
        fwVar.e = true;
        this.h.a("onDeviceFeaturesReceived", new fv(fwVar, (byte) 0).a());
        int[] iArr = new int[2];
        this.h.getLocationOnScreen(iArr);
        com.google.android.gms.ads.internal.client.j.a();
        int b2 = com.google.android.gms.ads.internal.util.client.a.b(this.i, iArr[0]);
        com.google.android.gms.ads.internal.client.j.a();
        int b3 = com.google.android.gms.ads.internal.util.client.a.b(this.i, iArr[1]);
        if (this.i instanceof Activity) {
            com.google.android.gms.ads.internal.d.c();
            i = hk.c((Activity) this.i)[0];
        } else {
            i = 0;
        }
        int i2 = b3 - i;
        try {
            this.s.a("onDefaultPositionReceived", new JSONObject().put("x", b2).put("y", i2).put("width", this.f).put("height", this.g));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching default position.", e);
        }
        in i3 = this.h.i();
        if (i3.o != null) {
            fp fpVar = i3.o;
            fpVar.d = b2;
            fpVar.e = b3;
        }
        if (com.google.android.gms.ads.internal.util.client.b.a(2)) {
            com.google.android.gms.ads.internal.util.client.b.c("Dispatching Ready Event.");
        }
        try {
            this.s.a("onReadyEventReceived", new JSONObject().put("js", this.h.l().f5352b));
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching ready Event.", e2);
        }
    }
}
