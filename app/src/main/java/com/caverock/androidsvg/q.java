package com.caverock.androidsvg;

import android.content.res.Resources;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class q {
    private static cs h = new cs();

    /* renamed from: a, reason: collision with root package name */
    bf f1391a = null;

    /* renamed from: b, reason: collision with root package name */
    String f1392b = "";
    String c = "";
    cv d = null;
    private float i = 96.0f;
    i e = new i();
    Map<String, bl> f = new HashMap();
    float g = 1.0f;

    protected q() {
    }

    private static q a(Resources resources, int i) {
        cw cwVar = new cw();
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return cwVar.a(openRawResource);
        } finally {
            try {
                openRawResource.close();
            } catch (IOException e) {
            }
        }
    }

    @Deprecated
    public static Drawable a(Resources resources, int i, int i2) {
        at atVar = new at();
        if (i2 != 0) {
            atVar.a(resources.getColor(i2));
        }
        try {
            return a(resources, i, atVar);
        } catch (SVGParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Drawable a(Resources resources, int i, at atVar) {
        q qVar;
        ArrayList<q> a2 = h.f1349a.a((ct) cs.a("res" + i, a(resources)));
        if (a2 == null || a2.isEmpty()) {
            qVar = null;
        } else {
            qVar = a2.get(0);
        }
        if (qVar == null) {
            qVar = a(resources, i);
            float a3 = a(resources);
            float b2 = qVar.b();
            float a4 = qVar.a();
            if (b2 > 0.0f && a4 > 0.0f) {
                float f = b2 * a3;
                if (qVar.f1391a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                qVar.f1391a.d = new ag(f);
                float f2 = a4 * a3;
                if (qVar.f1391a == null) {
                    throw new IllegalArgumentException("SVG document is empty");
                }
                qVar.f1391a.c = new ag(f2);
                qVar.g = a3 * qVar.g;
            }
            cs csVar = h;
            String str = "res" + i;
            if (qVar != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(qVar);
                csVar.f1349a.a(cs.a(str, qVar.g), arrayList);
            }
        }
        return new cu(qVar, atVar);
    }

    public final Picture a(at atVar) {
        float a2;
        ag agVar = this.f1391a.c;
        if (agVar != null) {
            float a3 = agVar.a(this.i);
            s sVar = this.f1391a.x;
            if (sVar != null) {
                a2 = (sVar.d * a3) / sVar.c;
            } else {
                ag agVar2 = this.f1391a.d;
                a2 = agVar2 != null ? agVar2.a(this.i) : a3;
            }
            return a((int) Math.ceil(a3), (int) Math.ceil(a2), atVar);
        }
        return a(512, 512, atVar);
    }

    private static float a(Resources resources) {
        return resources.getDisplayMetrics().densityDpi / 160.0f;
    }

    private Picture a(int i, int i2, at atVar) {
        Picture picture = new Picture();
        cg cgVar = new cg(picture.beginRecording(i, i2), new s(0.0f, 0.0f, i, i2), this.i);
        if (atVar != null) {
            cgVar.f1330b = atVar.f1292b;
            cgVar.c = atVar.f1291a;
        }
        cgVar.a(this);
        picture.endRecording();
        return picture;
    }

    public final float a() {
        if (this.f1391a == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return a(this.i).c;
    }

    public final float b() {
        if (this.f1391a == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        return a(this.i).d;
    }

    protected final bn a(String str) {
        String substring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (substring = str.substring(1)) == null || substring.length() == 0) {
            return null;
        }
        if (substring.equals(this.f1391a.p)) {
            return this.f1391a;
        }
        if (this.f.containsKey(substring)) {
            return this.f.get(substring);
        }
        bl a2 = a(this.f1391a, substring);
        this.f.put(substring, a2);
        return a2;
    }

    private s a(float f) {
        float f2;
        ag agVar = this.f1391a.c;
        ag agVar2 = this.f1391a.d;
        if (agVar == null || agVar.a() || agVar.f1273b == cd.percent || agVar.f1273b == cd.em || agVar.f1273b == cd.ex) {
            return new s(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float a2 = agVar.a(f);
        if (agVar2 != null) {
            if (agVar2.a() || agVar2.f1273b == cd.percent || agVar2.f1273b == cd.em || agVar2.f1273b == cd.ex) {
                return new s(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            f2 = agVar2.a(f);
        } else {
            f2 = this.f1391a.x != null ? (this.f1391a.x.d * a2) / this.f1391a.x.c : a2;
        }
        return new s(0.0f, 0.0f, a2, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private bl a(bj bjVar, String str) {
        bl a2;
        bl blVar = (bl) bjVar;
        if (!str.equals(blVar.p)) {
            for (Object obj : bjVar.a()) {
                if (obj instanceof bl) {
                    bl blVar2 = (bl) obj;
                    if (str.equals(blVar2.p)) {
                        return blVar2;
                    }
                    if ((obj instanceof bj) && (a2 = a((bj) obj, str)) != null) {
                        return a2;
                    }
                }
            }
            return null;
        }
        return blVar;
    }
}
