package com.google.android.play.image;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.play.utils.PlayCommonLog;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e {
    private static int d = 6;

    /* renamed from: b, reason: collision with root package name */
    public o f6938b;
    private final com.android.volley.o c;
    private final int e;
    private final b f;
    private Runnable i;
    private ag j;
    private boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, n> f6937a = new HashMap<>();
    private final HashMap<String, n> g = new HashMap<>();
    private final Handler h = new Handler(Looper.getMainLooper());

    static /* synthetic */ Runnable f(e eVar) {
        eVar.i = null;
        return null;
    }

    public e(com.android.volley.o oVar, int i, int i2, ag agVar) {
        int i3;
        this.c = oVar;
        int intValue = com.google.android.play.utils.b.j.s.b().intValue();
        if (intValue == -1) {
            i3 = (int) (com.google.android.play.utils.b.j.t.b().floatValue() * i * i2 * 4);
        } else {
            i3 = intValue * 1024 * 1024;
        }
        this.e = Math.max(com.google.android.play.utils.b.j.u.b().intValue(), i3 / d);
        this.f = new b(i3);
        this.j = agVar;
    }

    public final j a(String str, int i, int i2, boolean z, k kVar, boolean z2) {
        c cVar;
        String a2 = (i > 0 || i2 > 0) ? u.a(str, i, i2) : str;
        f fVar = new f(this, i, i2, a2, str, z2);
        if (TextUtils.isEmpty(str)) {
            return new j(this, null, null, null, i, i2, null);
        }
        ArrayList<c> a3 = this.f.f6933a.a((d) str);
        if (a3 == null) {
            cVar = null;
        } else {
            boolean z3 = i != 0;
            boolean z4 = i2 != 0;
            c cVar2 = null;
            int i3 = 0;
            while (true) {
                if (i3 < a3.size()) {
                    cVar = a3.get(i3);
                    if (cVar.f6935b == i && cVar.c == i2) {
                        break;
                    }
                    if (cVar2 != null || ((z3 && cVar.f6934a.getWidth() < i) || (z4 && cVar.f6934a.getHeight() < i2))) {
                        cVar = cVar2;
                    }
                    i3++;
                    cVar2 = cVar;
                } else {
                    cVar = cVar2 != null ? cVar2 : a3.get(a3.size() - 1);
                }
            }
        }
        if (cVar != null && cVar.f6935b == i && cVar.c == i2) {
            return new j(this, cVar.f6934a, str, a2, i, i2, null);
        }
        Bitmap bitmap = null;
        if (z && cVar != null) {
            bitmap = cVar.f6934a;
        }
        j jVar = new j(this, bitmap, str, a2, i, i2, kVar);
        n nVar = this.f6937a.get(a2);
        if (nVar == null) {
            com.android.volley.l<?> a4 = fVar.a();
            this.c.a(a4);
            this.f6937a.put(a2, new n(this, a4, jVar));
            return jVar;
        }
        nVar.c.add(jVar);
        return jVar;
    }

    public l a(String str, int i, int i2, Bitmap.Config config, com.android.volley.t<Bitmap> tVar, com.android.volley.s sVar) {
        return new l(str, i, i2, config, tVar, sVar);
    }

    public final j a(String str, int i, int i2, k kVar) {
        return a(str, i, i2, true, kVar, false);
    }

    public final j b(String str, int i, int i2, k kVar) {
        return a(str, i, i2, false, kVar, false);
    }

    private void a(String str, n nVar) {
        this.g.put(str, nVar);
        if (this.i == null) {
            this.i = new i(this);
            this.h.postDelayed(this.i, 100L);
        }
    }

    static /* synthetic */ void a(e eVar, String str, String str2, int i, int i2, Bitmap bitmap, boolean z) {
        if (!z && bitmap.getHeight() * bitmap.getRowBytes() <= eVar.e) {
            b bVar = eVar.f;
            ArrayList<c> b2 = bVar.f6933a.b(str2);
            ArrayList<c> arrayList = b2 == null ? new ArrayList<>() : b2;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    i3 = size;
                    break;
                }
                int width = arrayList.get(i3).f6934a.getWidth();
                int width2 = bitmap.getWidth();
                if (width < width2) {
                    i3++;
                } else if (width == width2) {
                    arrayList.remove(i3);
                }
            }
            arrayList.add(i3, new c(bitmap, i, i2));
            bVar.f6933a.a(str2, arrayList);
        } else {
            PlayCommonLog.a("%s is not cached", str);
        }
        n remove = eVar.f6937a.remove(str);
        if (remove == null) {
            return;
        }
        remove.f6947b = bitmap;
        eVar.a(str, remove);
        PlayCommonLog.e("Loaded bitmap %s", remove.f6946a.b());
    }

    static /* synthetic */ void a(e eVar, String str) {
        n remove = eVar.f6937a.remove(str);
        if (remove == null) {
            return;
        }
        eVar.a(str, remove);
        PlayCommonLog.e("Bitmap error %s", remove.f6946a != null ? remove.f6946a.b() : "<null request>");
    }
}
