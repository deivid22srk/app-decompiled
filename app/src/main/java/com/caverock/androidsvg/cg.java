package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes.dex */
public final class cg {
    private static HashSet<String> n = null;

    /* renamed from: a, reason: collision with root package name */
    float f1329a;

    /* renamed from: b, reason: collision with root package name */
    w f1330b;
    w c;
    co d;
    public Canvas e;
    private s f;
    private boolean g;
    private q h;
    private Stack<co> i;
    private Stack<bj> j;
    private Stack<Matrix> k;
    private Stack<Canvas> l;
    private Stack<Bitmap> m;

    protected cg(Canvas canvas, s sVar, float f) {
        this.e = canvas;
        this.f1329a = f;
        this.f = sVar;
    }

    protected final float a() {
        return this.d.d.getTextSize();
    }

    protected final s b() {
        return this.d.g != null ? this.d.g : this.d.f;
    }

    protected final void a(q qVar) {
        this.h = qVar;
        this.g = false;
        bf bfVar = qVar.f1391a;
        if (bfVar == null) {
            c("Nothing to render. Document is empty.", new Object[0]);
            return;
        }
        this.d = new co(this);
        this.i = new Stack<>();
        a(this.d, aw.a());
        this.d.f = this.f;
        this.d.h = false;
        this.d.i = this.g;
        this.i.push((co) this.d.clone());
        this.l = new Stack<>();
        this.m = new Stack<>();
        this.k = new Stack<>();
        this.j = new Stack<>();
        b((bn) bfVar);
        a(bfVar, bfVar.c, bfVar.d, bfVar.x, bfVar.w);
    }

    private void a(bn bnVar) {
        Path.FillType fillType;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (!(bnVar instanceof ak)) {
            c();
            b(bnVar);
            if (bnVar instanceof bf) {
                bf bfVar = (bf) bnVar;
                a(bfVar, bfVar.c, bfVar.d);
            } else if (bnVar instanceof ce) {
                ce ceVar = (ce) bnVar;
                if ((ceVar.e == null || !ceVar.e.a()) && (ceVar.f == null || !ceVar.f.a())) {
                    a(this.d, ceVar);
                    if (j()) {
                        bn a2 = ceVar.u.a(ceVar.f1328a);
                        if (a2 == null) {
                            d("Use reference '%s' not found", ceVar.f1328a);
                        } else {
                            if (ceVar.f1269b != null) {
                                this.e.concat(ceVar.f1269b);
                            }
                            Matrix matrix = new Matrix();
                            matrix.preTranslate(ceVar.c != null ? ceVar.c.a(this) : 0.0f, ceVar.d != null ? ceVar.d.b(this) : 0.0f);
                            this.e.concat(matrix);
                            d(ceVar);
                            boolean f = f();
                            a((bj) ceVar);
                            if (a2 instanceof bf) {
                                c();
                                bf bfVar2 = (bf) a2;
                                a(bfVar2, ceVar.e != null ? ceVar.e : bfVar2.c, ceVar.f != null ? ceVar.f : bfVar2.d);
                                d();
                            } else if (a2 instanceof bt) {
                                ag agVar = ceVar.e != null ? ceVar.e : new ag(100.0f, cd.percent);
                                ag agVar2 = ceVar.f != null ? ceVar.f : new ag(100.0f, cd.percent);
                                c();
                                bt btVar = (bt) a2;
                                if ((agVar == null || !agVar.a()) && (agVar2 == null || !agVar2.a())) {
                                    n nVar = btVar.w != null ? btVar.w : com.caverock.androidsvg.n.e;
                                    a(this.d, btVar);
                                    this.d.f = new s(0.0f, 0.0f, agVar != null ? agVar.a(this) : this.d.f.c, agVar2 != null ? agVar2.a(this) : this.d.f.d);
                                    if (!this.d.f1343a.v.booleanValue()) {
                                        a(this.d.f.f1394a, this.d.f.f1395b, this.d.f.c, this.d.f.d);
                                    }
                                    if (btVar.x != null) {
                                        this.e.concat(a(this.d.f, btVar.x, nVar));
                                        this.d.g = btVar.x;
                                    }
                                    boolean f2 = f();
                                    a((bj) btVar, true);
                                    if (f2) {
                                        b((bk) btVar);
                                    }
                                    a((bk) btVar);
                                }
                                d();
                            } else {
                                a(a2);
                            }
                            e();
                            if (f) {
                                b((bk) ceVar);
                            }
                            a((bk) ceVar);
                        }
                    }
                }
            } else if (bnVar instanceof bs) {
                bs bsVar = (bs) bnVar;
                a(this.d, bsVar);
                if (j()) {
                    if (bsVar.f1269b != null) {
                        this.e.concat(bsVar.f1269b);
                    }
                    d(bsVar);
                    boolean f3 = f();
                    a(bsVar);
                    if (f3) {
                        b((bk) bsVar);
                    }
                    a((bk) bsVar);
                }
            } else if (bnVar instanceof ad) {
                ad adVar = (ad) bnVar;
                a(this.d, adVar);
                if (j()) {
                    if (adVar.f1269b != null) {
                        this.e.concat(adVar.f1269b);
                    }
                    d(adVar);
                    boolean f4 = f();
                    a((bj) adVar, true);
                    if (f4) {
                        b((bk) adVar);
                    }
                    a((bk) adVar);
                }
            } else if (bnVar instanceof af) {
                af afVar = (af) bnVar;
                if (afVar.d != null && !afVar.d.a() && afVar.e != null && !afVar.e.a() && afVar.f1270a != null) {
                    n nVar2 = afVar.w != null ? afVar.w : com.caverock.androidsvg.n.e;
                    String str = afVar.f1270a;
                    if (!str.startsWith("data:")) {
                        bitmap = null;
                    } else if (str.length() < 14) {
                        bitmap = null;
                    } else {
                        int indexOf = str.indexOf(44);
                        if (indexOf == -1 || indexOf < 12) {
                            bitmap = null;
                        } else if (";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        } else {
                            bitmap = null;
                        }
                    }
                    if (bitmap != null) {
                        bitmap2 = bitmap;
                    } else if (this.h.d != null) {
                        bitmap2 = null;
                    }
                    if (bitmap2 == null) {
                        d("Could not locate image '%s'", afVar.f1270a);
                    } else {
                        a(this.d, afVar);
                        if (j() && k()) {
                            if (afVar.f != null) {
                                this.e.concat(afVar.f);
                            }
                            this.d.f = new s(afVar.f1271b != null ? afVar.f1271b.a(this) : 0.0f, afVar.c != null ? afVar.c.b(this) : 0.0f, afVar.d.a(this), afVar.e.a(this));
                            if (!this.d.f1343a.v.booleanValue()) {
                                a(this.d.f.f1394a, this.d.f.f1395b, this.d.f.c, this.d.f.d);
                            }
                            afVar.o = new s(0.0f, 0.0f, bitmap2.getWidth(), bitmap2.getHeight());
                            this.e.concat(a(this.d.f, afVar.o, nVar2));
                            a((bk) afVar);
                            d(afVar);
                            boolean f5 = f();
                            l();
                            this.e.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint());
                            if (f5) {
                                b((bk) afVar);
                            }
                        }
                    }
                }
            } else if (bnVar instanceof am) {
                am amVar = (am) bnVar;
                if (amVar.f1282a != null) {
                    a(this.d, amVar);
                    if (j() && k() && (this.d.c || this.d.f1344b)) {
                        if (amVar.e != null) {
                            this.e.concat(amVar.e);
                        }
                        Path path = new ck(this, amVar.f1282a).f1337a;
                        if (amVar.o == null) {
                            amVar.o = b(path);
                        }
                        a((bk) amVar);
                        c((bk) amVar);
                        d(amVar);
                        boolean f6 = f();
                        if (this.d.f1344b) {
                            if (this.d.f1343a.c != null) {
                                switch (ch.d[this.d.f1343a.c.ordinal()]) {
                                    case 1:
                                        fillType = Path.FillType.EVEN_ODD;
                                        break;
                                }
                                path.setFillType(fillType);
                                a(amVar, path);
                            }
                            fillType = Path.FillType.WINDING;
                            path.setFillType(fillType);
                            a(amVar, path);
                        }
                        if (this.d.c) {
                            a(path);
                        }
                        a((ac) amVar);
                        if (f6) {
                            b((bk) amVar);
                        }
                    }
                }
            } else if (bnVar instanceof as) {
                as asVar = (as) bnVar;
                if (asVar.c != null && asVar.d != null && !asVar.c.a() && !asVar.d.a()) {
                    a(this.d, asVar);
                    if (j() && k()) {
                        if (asVar.e != null) {
                            this.e.concat(asVar.e);
                        }
                        Path a3 = a(asVar);
                        a((bk) asVar);
                        c((bk) asVar);
                        d(asVar);
                        boolean f7 = f();
                        if (this.d.f1344b) {
                            a(asVar, a3);
                        }
                        if (this.d.c) {
                            a(a3);
                        }
                        if (f7) {
                            b((bk) asVar);
                        }
                    }
                }
            } else if (bnVar instanceof u) {
                u uVar = (u) bnVar;
                if (uVar.c != null && !uVar.c.a()) {
                    a(this.d, uVar);
                    if (j() && k()) {
                        if (uVar.e != null) {
                            this.e.concat(uVar.e);
                        }
                        Path a4 = a(uVar);
                        a((bk) uVar);
                        c((bk) uVar);
                        d(uVar);
                        boolean f8 = f();
                        if (this.d.f1344b) {
                            a(uVar, a4);
                        }
                        if (this.d.c) {
                            a(a4);
                        }
                        if (f8) {
                            b((bk) uVar);
                        }
                    }
                }
            } else if (bnVar instanceof z) {
                z zVar = (z) bnVar;
                if (zVar.c != null && zVar.d != null && !zVar.c.a() && !zVar.d.a()) {
                    a(this.d, zVar);
                    if (j() && k()) {
                        if (zVar.e != null) {
                            this.e.concat(zVar.e);
                        }
                        Path a5 = a(zVar);
                        a((bk) zVar);
                        c((bk) zVar);
                        d(zVar);
                        boolean f9 = f();
                        if (this.d.f1344b) {
                            a(zVar, a5);
                        }
                        if (this.d.c) {
                            a(a5);
                        }
                        if (f9) {
                            b((bk) zVar);
                        }
                    }
                }
            } else if (bnVar instanceof ah) {
                ah ahVar = (ah) bnVar;
                a(this.d, ahVar);
                if (j() && k() && this.d.c) {
                    if (ahVar.e != null) {
                        this.e.concat(ahVar.e);
                    }
                    float a6 = ahVar.f1274a == null ? 0.0f : ahVar.f1274a.a(this);
                    float b2 = ahVar.f1275b == null ? 0.0f : ahVar.f1275b.b(this);
                    float a7 = ahVar.c == null ? 0.0f : ahVar.c.a(this);
                    float r2 = ahVar.d != null ? ahVar.d.b(this) : 0.0f;
                    if (ahVar.o == null) {
                        ahVar.o = new s(Math.min(a6, b2), Math.min(b2, r2), Math.abs(a7 - a6), Math.abs(r2 - b2));
                    }
                    Path path2 = new Path();
                    path2.moveTo(a6, b2);
                    path2.lineTo(a7, r2);
                    a((bk) ahVar);
                    c((bk) ahVar);
                    d(ahVar);
                    boolean f10 = f();
                    a(path2);
                    a((ac) ahVar);
                    if (f10) {
                        b((bk) ahVar);
                    }
                }
            } else if (bnVar instanceof ar) {
                ar arVar = (ar) bnVar;
                a(this.d, arVar);
                if (j() && k() && (this.d.c || this.d.f1344b)) {
                    if (arVar.e != null) {
                        this.e.concat(arVar.e);
                    }
                    if (arVar.f1288a.length >= 2) {
                        Path b3 = b((aq) arVar);
                        a((bk) arVar);
                        c((bk) arVar);
                        d(arVar);
                        boolean f11 = f();
                        if (this.d.f1344b) {
                            a(arVar, b3);
                        }
                        if (this.d.c) {
                            a(b3);
                        }
                        a((ac) arVar);
                        if (f11) {
                            b((bk) arVar);
                        }
                    }
                }
            } else if (bnVar instanceof aq) {
                aq aqVar = (aq) bnVar;
                a(this.d, aqVar);
                if (j() && k() && (this.d.c || this.d.f1344b)) {
                    if (aqVar.e != null) {
                        this.e.concat(aqVar.e);
                    }
                    if (aqVar.f1288a.length >= 2) {
                        Path b4 = b(aqVar);
                        a((bk) aqVar);
                        c((bk) aqVar);
                        d(aqVar);
                        boolean f12 = f();
                        if (this.d.f1344b) {
                            a(aqVar, b4);
                        }
                        if (this.d.c) {
                            a(b4);
                        }
                        a((ac) aqVar);
                        if (f12) {
                            b((bk) aqVar);
                        }
                    }
                }
            } else if (bnVar instanceof bw) {
                bw bwVar = (bw) bnVar;
                a(this.d, bwVar);
                if (j()) {
                    if (bwVar.f1318a != null) {
                        this.e.concat(bwVar.f1318a);
                    }
                    float a8 = (bwVar.f1323b == null || bwVar.f1323b.size() == 0) ? 0.0f : bwVar.f1323b.get(0).a(this);
                    float b5 = (bwVar.c == null || bwVar.c.size() == 0) ? 0.0f : bwVar.c.get(0).b(this);
                    float a9 = (bwVar.d == null || bwVar.d.size() == 0) ? 0.0f : bwVar.d.get(0).a(this);
                    if (bwVar.e != null && bwVar.e.size() != 0) {
                        r2 = bwVar.e.get(0).b(this);
                    }
                    bb i = i();
                    if (i != bb.Start) {
                        float a10 = a((by) bwVar);
                        if (i == bb.Middle) {
                            a8 -= a10 / 2.0f;
                        } else {
                            a8 -= a10;
                        }
                    }
                    if (bwVar.o == null) {
                        cp cpVar = new cp(this, a8, b5);
                        a(bwVar, cpVar);
                        bwVar.o = new s(cpVar.c.left, cpVar.c.top, cpVar.c.width(), cpVar.c.height());
                    }
                    a((bk) bwVar);
                    c((bk) bwVar);
                    d(bwVar);
                    boolean f13 = f();
                    a(bwVar, new cm(this, a8 + a9, r2 + b5));
                    if (f13) {
                        b((bk) bwVar);
                    }
                }
            }
            d();
        }
    }

    private void a(bj bjVar, boolean z) {
        if (z) {
            a(bjVar);
        }
        Iterator<bn> it = bjVar.a().iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        if (z) {
            e();
        }
    }

    private void c() {
        this.e.save();
        this.i.push(this.d);
        this.d = (co) this.d.clone();
    }

    private void d() {
        this.e.restore();
        this.d = this.i.pop();
    }

    private void a(bj bjVar) {
        this.j.push(bjVar);
        this.k.push(this.e.getMatrix());
    }

    public void e() {
        this.j.pop();
        this.k.pop();
    }

    private void a(co coVar, bl blVar) {
        boolean a2;
        boolean z = blVar.v == null;
        aw awVar = coVar.f1343a;
        awVar.A = Boolean.TRUE;
        awVar.v = z ? Boolean.TRUE : Boolean.FALSE;
        awVar.w = null;
        awVar.E = null;
        awVar.m = Float.valueOf(1.0f);
        awVar.C = w.f1401b;
        awVar.D = Float.valueOf(1.0f);
        awVar.G = null;
        awVar.H = null;
        awVar.I = Float.valueOf(1.0f);
        awVar.J = null;
        awVar.K = Float.valueOf(1.0f);
        awVar.L = be.None;
        if (blVar.r != null) {
            a(coVar, blVar.r);
        }
        i iVar = this.h.e;
        if (!(iVar.f1376a == null || iVar.f1376a.isEmpty())) {
            for (h hVar : this.h.e.f1376a) {
                j jVar = hVar.f1374a;
                ArrayList arrayList = new ArrayList();
                for (Object obj = blVar.v; obj != null; obj = ((bn) obj).v) {
                    arrayList.add(0, obj);
                }
                int size = arrayList.size() - 1;
                if (jVar.a() == 1) {
                    a2 = a.a(jVar.a(0), arrayList, size, blVar);
                } else {
                    a2 = a.a(jVar, jVar.a() - 1, arrayList, size, blVar);
                }
                if (a2) {
                    a(coVar, hVar.f1375b);
                }
            }
        }
        if (blVar.s != null) {
            a(coVar, blVar.s);
        }
    }

    private void b(bn bnVar) {
        if (bnVar instanceof bl) {
            bl blVar = (bl) bnVar;
            if (blVar.q != null) {
                this.d.h = blVar.q.booleanValue();
            }
        }
    }

    private void a(bk bkVar, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        if (this.d.f1343a.f1295b instanceof al) {
            bn a2 = this.h.a(((al) this.d.f1343a.f1295b).f1280a);
            if (a2 instanceof ap) {
                ap apVar = (ap) a2;
                boolean z = apVar.f1286a != null && apVar.f1286a.booleanValue();
                if (apVar.h != null) {
                    String str = apVar.h;
                    while (true) {
                        bn a3 = apVar.u.a(str);
                        if (a3 == null) {
                            c("Pattern reference '%s' not found", str);
                            break;
                        }
                        if (!(a3 instanceof ap)) {
                            d("Pattern href attributes must point to other pattern elements", new Object[0]);
                            break;
                        }
                        if (a3 == apVar) {
                            d("Circular reference in pattern href attribute '%s'", str);
                            break;
                        }
                        ap apVar2 = (ap) a3;
                        if (apVar.f1286a == null) {
                            apVar.f1286a = apVar2.f1286a;
                        }
                        if (apVar.f1287b == null) {
                            apVar.f1287b = apVar2.f1287b;
                        }
                        if (apVar.c == null) {
                            apVar.c = apVar2.c;
                        }
                        if (apVar.d == null) {
                            apVar.d = apVar2.d;
                        }
                        if (apVar.e == null) {
                            apVar.e = apVar2.e;
                        }
                        if (apVar.f == null) {
                            apVar.f = apVar2.f;
                        }
                        if (apVar.g == null) {
                            apVar.g = apVar2.g;
                        }
                        if (apVar.i.isEmpty()) {
                            apVar.i = apVar2.i;
                        }
                        if (apVar.x == null) {
                            apVar.x = apVar2.x;
                        }
                        if (apVar.w == null) {
                            apVar.w = apVar2.w;
                        }
                        if (apVar2.h == null) {
                            break;
                        } else {
                            str = apVar2.h;
                        }
                    }
                }
                if (z) {
                    float a4 = apVar.d != null ? apVar.d.a(this) : 0.0f;
                    float b2 = apVar.e != null ? apVar.e.b(this) : 0.0f;
                    float a5 = apVar.f != null ? apVar.f.a(this) : 0.0f;
                    f = apVar.g != null ? apVar.g.b(this) : 0.0f;
                    f2 = a5;
                    f3 = b2;
                    f4 = a4;
                } else {
                    float a6 = apVar.d != null ? apVar.d.a(this, 1.0f) : 0.0f;
                    float a7 = apVar.e != null ? apVar.e.a(this, 1.0f) : 0.0f;
                    float a8 = apVar.f != null ? apVar.f.a(this, 1.0f) : 0.0f;
                    float a9 = apVar.g != null ? apVar.g.a(this, 1.0f) : 0.0f;
                    float f5 = (a6 * bkVar.o.c) + bkVar.o.f1394a;
                    float f6 = (a7 * bkVar.o.d) + bkVar.o.f1395b;
                    float f7 = a8 * bkVar.o.c;
                    f = a9 * bkVar.o.d;
                    f2 = f7;
                    f3 = f6;
                    f4 = f5;
                }
                if (f2 == 0.0f || f == 0.0f) {
                    return;
                }
                n nVar = apVar.w != null ? apVar.w : com.caverock.androidsvg.n.e;
                c();
                this.e.clipPath(path);
                co coVar = new co(this);
                a(coVar, aw.a());
                coVar.f1343a.v = false;
                this.d = a(apVar, coVar);
                s sVar = bkVar.o;
                if (apVar.c != null) {
                    this.e.concat(apVar.c);
                    Matrix matrix = new Matrix();
                    if (apVar.c.invert(matrix)) {
                        float[] fArr = {bkVar.o.f1394a, bkVar.o.f1395b, bkVar.o.a(), bkVar.o.f1395b, bkVar.o.a(), bkVar.o.b(), bkVar.o.f1394a, bkVar.o.b()};
                        matrix.mapPoints(fArr);
                        RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                        for (int i = 2; i <= 6; i += 2) {
                            if (fArr[i] < rectF.left) {
                                rectF.left = fArr[i];
                            }
                            if (fArr[i] > rectF.right) {
                                rectF.right = fArr[i];
                            }
                            if (fArr[i + 1] < rectF.top) {
                                rectF.top = fArr[i + 1];
                            }
                            if (fArr[i + 1] > rectF.bottom) {
                                rectF.bottom = fArr[i + 1];
                            }
                        }
                        sVar = new s(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
                    }
                }
                float floor = f4 + (((float) Math.floor((sVar.f1394a - f4) / f2)) * f2);
                float floor2 = f3 + (((float) Math.floor((sVar.f1395b - f3) / f)) * f);
                float a10 = sVar.a();
                float b3 = sVar.b();
                s sVar2 = new s(0.0f, 0.0f, f2, f);
                for (float f8 = floor2; f8 < b3; f8 += f) {
                    for (float f9 = floor; f9 < a10; f9 += f2) {
                        sVar2.f1394a = f9;
                        sVar2.f1395b = f8;
                        c();
                        if (!this.d.f1343a.v.booleanValue()) {
                            a(sVar2.f1394a, sVar2.f1395b, sVar2.c, sVar2.d);
                        }
                        if (apVar.x != null) {
                            this.e.concat(a(sVar2, apVar.x, nVar));
                        } else {
                            boolean z2 = apVar.f1287b == null || apVar.f1287b.booleanValue();
                            this.e.translate(f9, f8);
                            if (!z2) {
                                this.e.scale(bkVar.o.c, bkVar.o.d);
                            }
                        }
                        boolean f10 = f();
                        Iterator<bn> it = apVar.i.iterator();
                        while (it.hasNext()) {
                            a(it.next());
                        }
                        if (f10) {
                            b((bk) apVar);
                        }
                        d();
                    }
                }
                d();
                return;
            }
        }
        this.e.drawPath(path, this.d.d);
    }

    private void a(Path path) {
        if (this.d.f1343a.L == be.NonScalingStroke) {
            Matrix matrix = this.e.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            this.e.setMatrix(new Matrix());
            Shader shader = this.d.e.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            this.e.drawPath(path2, this.d.e);
            this.e.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        this.e.drawPath(path, this.d.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void a(bf bfVar, ag agVar, ag agVar2) {
        a(bfVar, agVar, agVar2, bfVar.x, bfVar.w);
    }

    private void a(bf bfVar, ag agVar, ag agVar2, s sVar, n nVar) {
        n nVar2;
        float f;
        float f2 = 0.0f;
        if (agVar == null || !agVar.a()) {
            if (agVar2 == null || !agVar2.a()) {
                if (nVar == null) {
                    nVar2 = bfVar.w != null ? bfVar.w : com.caverock.androidsvg.n.e;
                } else {
                    nVar2 = nVar;
                }
                a(this.d, bfVar);
                if (j()) {
                    if (bfVar.v != null) {
                        f = bfVar.f1313a != null ? bfVar.f1313a.a(this) : 0.0f;
                        if (bfVar.f1314b != null) {
                            f2 = bfVar.f1314b.b(this);
                        }
                    } else {
                        f = 0.0f;
                    }
                    s b2 = b();
                    this.d.f = new s(f, f2, agVar != null ? agVar.a(this) : b2.c, agVar2 != null ? agVar2.b(this) : b2.d);
                    if (!this.d.f1343a.v.booleanValue()) {
                        a(this.d.f.f1394a, this.d.f.f1395b, this.d.f.c, this.d.f.d);
                    }
                    a(bfVar, this.d.f);
                    if (sVar != null) {
                        this.e.concat(a(this.d.f, sVar, nVar2));
                        this.d.g = bfVar.x;
                    } else {
                        this.e.translate(f, f2);
                    }
                    boolean f3 = f();
                    l();
                    a((bj) bfVar, true);
                    if (f3) {
                        b((bk) bfVar);
                    }
                    a((bk) bfVar);
                }
            }
        }
    }

    private void a(bk bkVar) {
        if (bkVar.v != null && bkVar.o != null) {
            Matrix matrix = new Matrix();
            if (this.k.peek().invert(matrix)) {
                float[] fArr = {bkVar.o.f1394a, bkVar.o.f1395b, bkVar.o.a(), bkVar.o.f1395b, bkVar.o.a(), bkVar.o.b(), bkVar.o.f1394a, bkVar.o.b()};
                matrix.preConcat(this.e.getMatrix());
                matrix.mapPoints(fArr);
                RectF rectF = new RectF(fArr[0], fArr[1], fArr[0], fArr[1]);
                for (int i = 2; i <= 6; i += 2) {
                    if (fArr[i] < rectF.left) {
                        rectF.left = fArr[i];
                    }
                    if (fArr[i] > rectF.right) {
                        rectF.right = fArr[i];
                    }
                    if (fArr[i + 1] < rectF.top) {
                        rectF.top = fArr[i + 1];
                    }
                    if (fArr[i + 1] > rectF.bottom) {
                        rectF.bottom = fArr[i + 1];
                    }
                }
                bk bkVar2 = (bk) this.j.peek();
                if (bkVar2.o == null) {
                    bkVar2.o = s.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
                s sVar = bkVar2.o;
                s a2 = s.a(rectF.left, rectF.top, rectF.right, rectF.bottom);
                if (a2.f1394a < sVar.f1394a) {
                    sVar.f1394a = a2.f1394a;
                }
                if (a2.f1395b < sVar.f1395b) {
                    sVar.f1395b = a2.f1395b;
                }
                if (a2.a() > sVar.a()) {
                    sVar.c = a2.a() - sVar.f1394a;
                }
                if (a2.b() > sVar.b()) {
                    sVar.d = a2.b() - sVar.f1395b;
                }
            }
        }
    }

    private void b(bk bkVar) {
        float f;
        float f2;
        if (this.d.f1343a.G != null && this.d.i) {
            bn a2 = this.h.a(this.d.f1343a.G);
            g();
            aj ajVar = (aj) a2;
            if (ajVar.f1278a != null && ajVar.f1278a.booleanValue()) {
                f = ajVar.e != null ? ajVar.e.a(this) : bkVar.o.c;
                f2 = ajVar.f != null ? ajVar.f.b(this) : bkVar.o.d;
                if (ajVar.c != null) {
                    ajVar.c.a(this);
                }
                if (ajVar.d != null) {
                    ajVar.d.b(this);
                }
            } else {
                if (ajVar.c != null) {
                    ajVar.c.a(this, 1.0f);
                }
                if (ajVar.d != null) {
                    ajVar.d.a(this, 1.0f);
                }
                float a3 = ajVar.e != null ? ajVar.e.a(this, 1.0f) : 1.2f;
                float a4 = ajVar.f != null ? ajVar.f.a(this, 1.0f) : 1.2f;
                f = a3 * bkVar.o.c;
                f2 = a4 * bkVar.o.d;
            }
            if (f != 0.0f && f2 != 0.0f) {
                c();
                this.d = c((bn) ajVar);
                this.d.f1343a.m = Float.valueOf(1.0f);
                if (!(ajVar.f1279b == null || ajVar.f1279b.booleanValue())) {
                    this.e.translate(bkVar.o.f1394a, bkVar.o.f1395b);
                    this.e.scale(bkVar.o.c, bkVar.o.d);
                }
                a((bj) ajVar, false);
                d();
            }
            Bitmap pop = this.m.pop();
            Bitmap pop2 = this.m.pop();
            int width = pop.getWidth();
            int height = pop.getHeight();
            int[] iArr = new int[width];
            int[] iArr2 = new int[width];
            for (int i = 0; i < height; i++) {
                pop.getPixels(iArr, 0, width, 0, i, width, 1);
                pop2.getPixels(iArr2, 0, width, 0, i, width, 1);
                for (int i2 = 0; i2 < width; i2++) {
                    int i3 = iArr[i2];
                    int i4 = i3 & 255;
                    int i5 = (i3 >> 8) & 255;
                    int i6 = (i3 >> 16) & 255;
                    int i7 = (i3 >> 24) & 255;
                    if (i7 == 0) {
                        iArr2[i2] = 0;
                    } else {
                        int i8 = (i7 * ((i4 * 2362) + ((i5 * 23442) + (i6 * 6963)))) / 8355840;
                        int i9 = iArr2[i2];
                        iArr2[i2] = (((i8 * ((i9 >> 24) & 255)) / 255) << 24) | (i9 & 16777215);
                    }
                }
                pop2.setPixels(iArr2, 0, width, 0, i, width, 1);
            }
            pop.recycle();
            this.e = this.l.pop();
            this.e.save();
            this.e.setMatrix(new Matrix());
            this.e.drawBitmap(pop2, 0.0f, 0.0f, this.d.d);
            pop2.recycle();
            this.e.restore();
        }
        d();
    }

    private void g() {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
            this.m.push(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setMatrix(this.e.getMatrix());
            this.e = canvas;
        } catch (OutOfMemoryError e) {
            d("Not enough memory to create temporary bitmaps for mask processing", new Object[0]);
            throw e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a(bs bsVar) {
        Set<String> d;
        String language = Locale.getDefault().getLanguage();
        cv cvVar = this.h.d;
        for (bn bnVar : bsVar.i) {
            if (bnVar instanceof bg) {
                bg bgVar = (bg) bnVar;
                if (bgVar.c() == null && ((d = bgVar.d()) == null || (!d.isEmpty() && d.contains(language)))) {
                    Set<String> b2 = bgVar.b();
                    if (b2 != null) {
                        if (n == null) {
                            h();
                        }
                        if (!b2.isEmpty() && n.containsAll(b2)) {
                        }
                    }
                    Set<String> e = bgVar.e();
                    if (e != null) {
                        if (!e.isEmpty() && cvVar != null) {
                            Iterator<String> it = e.iterator();
                            if (it.hasNext()) {
                                it.next();
                            }
                        }
                    }
                    Set<String> f = bgVar.f();
                    if (f != null) {
                        if (!f.isEmpty() && cvVar != null) {
                            Iterator<String> it2 = f.iterator();
                            if (it2.hasNext()) {
                                it2.next();
                                this.d.f1343a.q.intValue();
                                String.valueOf(this.d.f1343a.r);
                            }
                        }
                    }
                    a(bnVar);
                    return;
                }
            }
        }
    }

    private static synchronized void h() {
        synchronized (cg.class) {
            HashSet<String> hashSet = new HashSet<>();
            n = hashSet;
            hashSet.add("Structure");
            n.add("BasicStructure");
            n.add("ConditionalProcessing");
            n.add("Image");
            n.add("Style");
            n.add("ViewportAttribute");
            n.add("Shape");
            n.add("BasicText");
            n.add("PaintAttribute");
            n.add("BasicPaintAttribute");
            n.add("OpacityAttribute");
            n.add("BasicGraphicsAttribute");
            n.add("Marker");
            n.add("Gradient");
            n.add("Pattern");
            n.add("Clip");
            n.add("BasicClip");
            n.add("Mask");
            n.add("View");
        }
    }

    private static s b(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new s(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private List<cj> a(aq aqVar) {
        int i = 2;
        float f = 0.0f;
        int length = aqVar.f1288a.length;
        if (length < 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        cj cjVar = new cj(this, aqVar.f1288a[0], aqVar.f1288a[1], 0.0f, 0.0f);
        while (i < length) {
            f2 = aqVar.f1288a[i];
            float f3 = aqVar.f1288a[i + 1];
            cjVar.a(f2, f3);
            arrayList.add(cjVar);
            i += 2;
            f = f3;
            cjVar = new cj(this, f2, f3, f2 - cjVar.f1335a, f3 - cjVar.f1336b);
        }
        if (!(aqVar instanceof ar)) {
            arrayList.add(cjVar);
        } else if (f2 != aqVar.f1288a[0] && f != aqVar.f1288a[1]) {
            float f4 = aqVar.f1288a[0];
            float f5 = aqVar.f1288a[1];
            cjVar.a(f4, f5);
            arrayList.add(cjVar);
            cj cjVar2 = new cj(this, f4, f5, f4 - cjVar.f1335a, f5 - cjVar.f1336b);
            cjVar2.a((cj) arrayList.get(0));
            arrayList.add(cjVar2);
            arrayList.set(0, cjVar2);
        }
        return arrayList;
    }

    private bb i() {
        if (this.d.f1343a.t == bd.LTR || this.d.f1343a.u == bb.Middle) {
            return this.d.f1343a.u;
        }
        return this.d.f1343a.u == bb.Start ? bb.End : bb.Start;
    }

    private void a(by byVar, cq cqVar) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (j()) {
            Iterator<bn> it = byVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                bn next = it.next();
                if (next instanceof cc) {
                    cqVar.a(a(((cc) next).f1324a, z, !it.hasNext()));
                } else if (cqVar.a((by) next)) {
                    if (next instanceof bz) {
                        c();
                        bz bzVar = (bz) next;
                        a(this.d, bzVar);
                        if (j() && k()) {
                            bn a2 = bzVar.u.a(bzVar.f1319a);
                            if (a2 == null) {
                                d("TextPath reference '%s' not found", bzVar.f1319a);
                            } else {
                                am amVar = (am) a2;
                                Path path = new ck(this, amVar.f1282a).f1337a;
                                if (amVar.e != null) {
                                    path.transform(amVar.e);
                                }
                                float a3 = bzVar.f1320b != null ? bzVar.f1320b.a(this, new PathMeasure(path, false).getLength()) : 0.0f;
                                bb i = i();
                                if (i != bb.Start) {
                                    float a4 = a((by) bzVar);
                                    if (i == bb.Middle) {
                                        f5 = a3 - (a4 / 2.0f);
                                    } else {
                                        f5 = a3 - a4;
                                    }
                                } else {
                                    f5 = a3;
                                }
                                c((bk) bzVar.c);
                                boolean f6 = f();
                                a(bzVar, new cl(this, path, f5));
                                if (f6) {
                                    b((bk) bzVar);
                                }
                            }
                        }
                        d();
                    } else if (next instanceof bv) {
                        c();
                        bv bvVar = (bv) next;
                        a(this.d, bvVar);
                        if (j()) {
                            if (cqVar instanceof cm) {
                                float a5 = (bvVar.f1323b == null || bvVar.f1323b.size() == 0) ? ((cm) cqVar).f1340b : bvVar.f1323b.get(0).a(this);
                                f3 = (bvVar.c == null || bvVar.c.size() == 0) ? ((cm) cqVar).c : bvVar.c.get(0).b(this);
                                f2 = (bvVar.d == null || bvVar.d.size() == 0) ? 0.0f : bvVar.d.get(0).a(this);
                                f4 = a5;
                                f = (bvVar.e == null || bvVar.e.size() == 0) ? 0.0f : bvVar.e.get(0).b(this);
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                                f4 = 0.0f;
                            }
                            c((bk) bvVar.f1317a);
                            if (cqVar instanceof cm) {
                                ((cm) cqVar).f1340b = f2 + f4;
                                ((cm) cqVar).c = f + f3;
                            }
                            boolean f7 = f();
                            a(bvVar, cqVar);
                            if (f7) {
                                b((bk) bvVar);
                            }
                        }
                        d();
                    } else if (next instanceof bu) {
                        c();
                        bu buVar = (bu) next;
                        a(this.d, buVar);
                        if (j()) {
                            c((bk) buVar.f1316b);
                            bn a6 = next.u.a(buVar.f1315a);
                            if (a6 != null && (a6 instanceof by)) {
                                StringBuilder sb = new StringBuilder();
                                a((by) a6, sb);
                                if (sb.length() > 0) {
                                    cqVar.a(sb.toString());
                                }
                            } else {
                                d("Tref reference '%s' not found", buVar.f1315a);
                            }
                        }
                        d();
                    }
                }
                z = false;
            }
        }
    }

    private float a(by byVar) {
        cr crVar = new cr(this, (byte) 0);
        a(byVar, crVar);
        return crVar.f1347a;
    }

    private void a(by byVar, StringBuilder sb) {
        Iterator<bn> it = byVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            bn next = it.next();
            if (next instanceof by) {
                a((by) next, sb);
            } else if (next instanceof cc) {
                sb.append(a(((cc) next).f1324a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    private String a(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private boolean j() {
        if (this.d.f1343a.A != null) {
            return this.d.f1343a.A.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        if (this.d.f1343a.B != null) {
            return this.d.f1343a.B.booleanValue();
        }
        return true;
    }

    private static Matrix a(s sVar, s sVar2, n nVar) {
        Matrix matrix = new Matrix();
        if (nVar == null || nVar.f1385a == null) {
            return matrix;
        }
        float f = sVar.c / sVar2.c;
        float f2 = sVar.d / sVar2.d;
        float f3 = -sVar2.f1394a;
        float f4 = -sVar2.f1395b;
        if (nVar.equals(com.caverock.androidsvg.n.d)) {
            matrix.preTranslate(sVar.f1394a, sVar.f1395b);
            matrix.preScale(f, f2);
            matrix.preTranslate(f3, f4);
            return matrix;
        }
        float max = nVar.f1386b == p.Slice ? Math.max(f, f2) : Math.min(f, f2);
        float f5 = sVar.c / max;
        float f6 = sVar.d / max;
        switch (ch.f1331a[nVar.f1385a.ordinal()]) {
            case 1:
            case 2:
            case 3:
                f3 -= (sVar2.c - f5) / 2.0f;
                break;
            case 4:
            case 5:
            case 6:
                f3 -= sVar2.c - f5;
                break;
        }
        switch (ch.f1331a[nVar.f1385a.ordinal()]) {
            case 2:
            case 5:
            case 7:
                f4 -= (sVar2.d - f6) / 2.0f;
                break;
            case 3:
            case 6:
            case 8:
                f4 -= sVar2.d - f6;
                break;
        }
        matrix.preTranslate(sVar.f1394a, sVar.f1395b);
        matrix.preScale(max, max);
        matrix.preTranslate(f3, f4);
        return matrix;
    }

    private static boolean a(aw awVar, long j) {
        return (awVar.f1294a & j) != 0;
    }

    private void a(co coVar, aw awVar) {
        Typeface typeface;
        if (a(awVar, 4096L)) {
            coVar.f1343a.n = awVar.n;
        }
        if (a(awVar, 2048L)) {
            coVar.f1343a.m = awVar.m;
        }
        if (a(awVar, 1L)) {
            coVar.f1343a.f1295b = awVar.f1295b;
            coVar.f1344b = awVar.f1295b != null;
        }
        if (a(awVar, 4L)) {
            coVar.f1343a.d = awVar.d;
        }
        if (a(awVar, 6149L)) {
            a(coVar, true, coVar.f1343a.f1295b);
        }
        if (a(awVar, 2L)) {
            coVar.f1343a.c = awVar.c;
        }
        if (a(awVar, 8L)) {
            coVar.f1343a.e = awVar.e;
            coVar.c = awVar.e != null;
        }
        if (a(awVar, 16L)) {
            coVar.f1343a.f = awVar.f;
        }
        if (a(awVar, 6168L)) {
            a(coVar, false, coVar.f1343a.e);
        }
        if (a(awVar, 34359738368L)) {
            coVar.f1343a.L = awVar.L;
        }
        if (a(awVar, 32L)) {
            coVar.f1343a.g = awVar.g;
            coVar.e.setStrokeWidth(coVar.f1343a.g.c(this));
        }
        if (a(awVar, 64L)) {
            coVar.f1343a.h = awVar.h;
            switch (ch.f1332b[awVar.h.ordinal()]) {
                case 1:
                    coVar.e.setStrokeCap(Paint.Cap.BUTT);
                    break;
                case 2:
                    coVar.e.setStrokeCap(Paint.Cap.ROUND);
                    break;
                case 3:
                    coVar.e.setStrokeCap(Paint.Cap.SQUARE);
                    break;
            }
        }
        if (a(awVar, 128L)) {
            coVar.f1343a.i = awVar.i;
            switch (ch.c[awVar.i.ordinal()]) {
                case 1:
                    coVar.e.setStrokeJoin(Paint.Join.MITER);
                    break;
                case 2:
                    coVar.e.setStrokeJoin(Paint.Join.ROUND);
                    break;
                case 3:
                    coVar.e.setStrokeJoin(Paint.Join.BEVEL);
                    break;
            }
        }
        if (a(awVar, 256L)) {
            coVar.f1343a.j = awVar.j;
            coVar.e.setStrokeMiter(awVar.j.floatValue());
        }
        if (a(awVar, 512L)) {
            coVar.f1343a.k = awVar.k;
        }
        if (a(awVar, 1024L)) {
            coVar.f1343a.l = awVar.l;
        }
        if (a(awVar, 1536L)) {
            if (coVar.f1343a.k == null) {
                coVar.e.setPathEffect(null);
            } else {
                int length = coVar.f1343a.k.length;
                int i = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i];
                float f = 0.0f;
                for (int i2 = 0; i2 < i; i2++) {
                    fArr[i2] = coVar.f1343a.k[i2 % length].c(this);
                    f += fArr[i2];
                }
                if (f == 0.0f) {
                    coVar.e.setPathEffect(null);
                } else {
                    float c = coVar.f1343a.l.c(this);
                    if (c < 0.0f) {
                        c = (c % f) + f;
                    }
                    coVar.e.setPathEffect(new DashPathEffect(fArr, c));
                }
            }
        }
        if (a(awVar, 16384L)) {
            float a2 = a();
            coVar.f1343a.p = awVar.p;
            coVar.d.setTextSize(awVar.p.a(this, a2));
            coVar.e.setTextSize(awVar.p.a(this, a2));
        }
        if (a(awVar, 8192L)) {
            coVar.f1343a.o = awVar.o;
        }
        if (a(awVar, 32768L)) {
            if (awVar.q.intValue() == -1 && coVar.f1343a.q.intValue() > 100) {
                coVar.f1343a.q = Integer.valueOf(r0.q.intValue() - 100);
            } else if (awVar.q.intValue() == 1 && coVar.f1343a.q.intValue() < 900) {
                aw awVar2 = coVar.f1343a;
                awVar2.q = Integer.valueOf(awVar2.q.intValue() + 100);
            } else {
                coVar.f1343a.q = awVar.q;
            }
        }
        if (a(awVar, 65536L)) {
            coVar.f1343a.r = awVar.r;
        }
        if (a(awVar, 106496L)) {
            if (coVar.f1343a.o == null || this.h == null) {
                typeface = null;
            } else {
                cv cvVar = this.h.d;
                Iterator<String> it = coVar.f1343a.o.iterator();
                typeface = null;
                while (it.hasNext()) {
                    typeface = a(it.next(), coVar.f1343a.q, coVar.f1343a.r);
                    if (typeface == null && cvVar != null) {
                        coVar.f1343a.q.intValue();
                        String.valueOf(coVar.f1343a.r);
                        typeface = null;
                    }
                    if (typeface != null) {
                    }
                }
            }
            if (typeface == null) {
                typeface = a("sans-serif", coVar.f1343a.q, coVar.f1343a.r);
            }
            coVar.d.setTypeface(typeface);
            coVar.e.setTypeface(typeface);
        }
        if (a(awVar, 131072L)) {
            coVar.f1343a.s = awVar.s;
            coVar.d.setStrikeThruText(awVar.s == bc.LineThrough);
            coVar.d.setUnderlineText(awVar.s == bc.Underline);
            if (Build.VERSION.SDK_INT >= 17) {
                coVar.e.setStrikeThruText(awVar.s == bc.LineThrough);
                coVar.e.setUnderlineText(awVar.s == bc.Underline);
            }
        }
        if (a(awVar, 68719476736L)) {
            coVar.f1343a.t = awVar.t;
        }
        if (a(awVar, 262144L)) {
            coVar.f1343a.u = awVar.u;
        }
        if (a(awVar, 524288L)) {
            coVar.f1343a.v = awVar.v;
        }
        if (a(awVar, 2097152L)) {
            coVar.f1343a.x = awVar.x;
        }
        if (a(awVar, 4194304L)) {
            coVar.f1343a.y = awVar.y;
        }
        if (a(awVar, 8388608L)) {
            coVar.f1343a.z = awVar.z;
        }
        if (a(awVar, 16777216L)) {
            coVar.f1343a.A = awVar.A;
        }
        if (a(awVar, 33554432L)) {
            coVar.f1343a.B = awVar.B;
        }
        if (a(awVar, 1048576L)) {
            coVar.f1343a.w = awVar.w;
        }
        if (a(awVar, 268435456L)) {
            coVar.f1343a.E = awVar.E;
        }
        if (a(awVar, 536870912L)) {
            coVar.f1343a.F = awVar.F;
        }
        if (a(awVar, 1073741824L)) {
            coVar.f1343a.G = awVar.G;
        }
        if (a(awVar, 67108864L)) {
            coVar.f1343a.C = awVar.C;
        }
        if (a(awVar, 134217728L)) {
            coVar.f1343a.D = awVar.D;
        }
        if (a(awVar, 8589934592L)) {
            coVar.f1343a.J = awVar.J;
        }
        if (a(awVar, 17179869184L)) {
            coVar.f1343a.K = awVar.K;
        }
        if (this.f1330b != null) {
            coVar.f1343a.d = Float.valueOf(Color.alpha(this.f1330b.f1402a) / 255.0f);
            a(coVar, true, (bo) this.f1330b);
        }
        if (this.c != null) {
            coVar.f1343a.f = Float.valueOf(Color.alpha(this.c.f1402a) / 255.0f);
            a(coVar, false, (bo) this.c);
        }
    }

    private static void a(co coVar, boolean z, bo boVar) {
        int i;
        float floatValue = (z ? coVar.f1343a.d : coVar.f1343a.f).floatValue();
        if (boVar instanceof w) {
            i = ((w) boVar).f1402a;
        } else if (boVar instanceof x) {
            i = coVar.f1343a.n.f1402a;
        } else {
            return;
        }
        int a2 = i | (a(floatValue) << 24);
        if (z) {
            coVar.d.setColor(a2);
        } else {
            coVar.e.setColor(a2);
        }
    }

    private static Typeface a(String str, Integer num, ay ayVar) {
        int i = 1;
        boolean z = ayVar == ay.Italic;
        if (num.intValue() <= 500) {
            i = z ? 2 : 0;
        } else if (z) {
            i = 3;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i);
        }
        if (!str.equals("fantasy")) {
            return null;
        }
        return Typeface.create(Typeface.SANS_SERIF, i);
    }

    private static int a(float f) {
        int i = (int) (256.0f * f);
        if (i < 0) {
            return 0;
        }
        if (i <= 255) {
            return i;
        }
        return 255;
    }

    private void a(float f, float f2, float f3, float f4) {
        float f5 = f + f3;
        float f6 = f2 + f4;
        if (this.d.f1343a.w != null) {
            f += this.d.f1343a.w.d.a(this);
            f2 += this.d.f1343a.w.f1396a.b(this);
            f5 -= this.d.f1343a.w.f1397b.a(this);
            f6 -= this.d.f1343a.w.c.b(this);
        }
        this.e.clipRect(f, f2, f5, f6);
    }

    private void l() {
        int i;
        if (this.d.f1343a.J instanceof w) {
            i = ((w) this.d.f1343a.J).f1402a;
        } else if (this.d.f1343a.J instanceof x) {
            i = this.d.f1343a.n.f1402a;
        } else {
            return;
        }
        if (this.d.f1343a.K != null) {
            i |= a(this.d.f1343a.K.floatValue()) << 24;
        }
        this.e.drawColor(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.caverock.androidsvg.ac r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.cg.a(com.caverock.androidsvg.ac):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(com.caverock.androidsvg.ai r13, com.caverock.androidsvg.cj r14) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.caverock.androidsvg.cg.a(com.caverock.androidsvg.ai, com.caverock.androidsvg.cj):void");
    }

    private co c(bn bnVar) {
        co coVar = new co(this);
        a(coVar, aw.a());
        return a(bnVar, coVar);
    }

    private co a(bn bnVar, co coVar) {
        ArrayList arrayList = new ArrayList();
        bn bnVar2 = bnVar;
        while (true) {
            if (bnVar2 instanceof bl) {
                arrayList.add(0, (bl) bnVar2);
            }
            if (bnVar2.v == null) {
                break;
            }
            bnVar2 = (bn) bnVar2.v;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(coVar, (bl) it.next());
        }
        coVar.g = this.h.f1391a.x;
        if (coVar.g == null) {
            coVar.g = this.f;
        }
        coVar.f = this.f;
        coVar.i = this.d.i;
        return coVar;
    }

    private void c(bk bkVar) {
        if (this.d.f1343a.f1295b instanceof al) {
            a(true, bkVar.o, (al) this.d.f1343a.f1295b);
        }
        if (this.d.f1343a.e instanceof al) {
            a(false, bkVar.o, (al) this.d.f1343a.e);
        }
    }

    private void a(boolean z, s sVar, al alVar) {
        float a2;
        float a3;
        float a4;
        float a5;
        bn a6 = this.h.a(alVar.f1280a);
        if (a6 == null) {
            Object[] objArr = new Object[2];
            objArr[0] = z ? "Fill" : "Stroke";
            objArr[1] = alVar.f1280a;
            d("%s reference '%s' not found", objArr);
            if (alVar.f1281b != null) {
                a(this.d, z, alVar.f1281b);
                return;
            } else if (z) {
                this.d.f1344b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (a6 instanceof bm) {
            bm bmVar = (bm) a6;
            if (bmVar.e != null) {
                a(bmVar, bmVar.e);
            }
            boolean z2 = bmVar.f1266b != null && bmVar.f1266b.booleanValue();
            Paint paint = z ? this.d.d : this.d.e;
            if (z2) {
                s b2 = b();
                a2 = bmVar.f != null ? bmVar.f.a(this) : 0.0f;
                a3 = bmVar.g != null ? bmVar.g.b(this) : 0.0f;
                a4 = bmVar.h != null ? bmVar.h.a(this) : b2.c;
                a5 = bmVar.i != null ? bmVar.i.b(this) : 0.0f;
            } else {
                a2 = bmVar.f != null ? bmVar.f.a(this, 1.0f) : 0.0f;
                a3 = bmVar.g != null ? bmVar.g.a(this, 1.0f) : 0.0f;
                a4 = bmVar.h != null ? bmVar.h.a(this, 1.0f) : 1.0f;
                a5 = bmVar.i != null ? bmVar.i.a(this, 1.0f) : 0.0f;
            }
            c();
            this.d = c(bmVar);
            Matrix matrix = new Matrix();
            if (!z2) {
                matrix.preTranslate(sVar.f1394a, sVar.f1395b);
                matrix.preScale(sVar.c, sVar.d);
            }
            if (bmVar.c != null) {
                matrix.preConcat(bmVar.c);
            }
            int size = bmVar.f1265a.size();
            if (size == 0) {
                d();
                if (z) {
                    this.d.f1344b = false;
                } else {
                    this.d.c = false;
                }
            } else {
                int[] iArr = new int[size];
                float[] fArr = new float[size];
                Iterator<bn> it = bmVar.f1265a.iterator();
                int i = 0;
                float f = -1.0f;
                while (it.hasNext()) {
                    av avVar = (av) it.next();
                    if (i == 0 || avVar.f1293a.floatValue() >= f) {
                        fArr[i] = avVar.f1293a.floatValue();
                        f = avVar.f1293a.floatValue();
                    } else {
                        fArr[i] = f;
                    }
                    c();
                    a(this.d, avVar);
                    w wVar = (w) this.d.f1343a.C;
                    if (wVar == null) {
                        wVar = w.f1401b;
                    }
                    iArr[i] = wVar.f1402a | (a(this.d.f1343a.D.floatValue()) << 24);
                    d();
                    i++;
                }
                if ((a2 == a4 && a3 == a5) || size == 1) {
                    d();
                    paint.setColor(iArr[size - 1]);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    if (bmVar.d != null) {
                        if (bmVar.d == ab.reflect) {
                            tileMode = Shader.TileMode.MIRROR;
                        } else if (bmVar.d == ab.repeat) {
                            tileMode = Shader.TileMode.REPEAT;
                        }
                    }
                    d();
                    LinearGradient linearGradient = new LinearGradient(a2, a3, a4, a5, iArr, fArr, tileMode);
                    linearGradient.setLocalMatrix(matrix);
                    paint.setShader(linearGradient);
                }
            }
        }
        if (a6 instanceof bq) {
            a(z, sVar, (bq) a6);
        }
        if (a6 instanceof au) {
            au auVar = (au) a6;
            if (z) {
                if (a(auVar.r, 2147483648L)) {
                    this.d.f1343a.f1295b = auVar.r.H;
                    this.d.f1344b = auVar.r.H != null;
                }
                if (a(auVar.r, 4294967296L)) {
                    this.d.f1343a.d = auVar.r.I;
                }
                if (a(auVar.r, 6442450944L)) {
                    a(this.d, z, this.d.f1343a.f1295b);
                    return;
                }
                return;
            }
            if (a(auVar.r, 2147483648L)) {
                this.d.f1343a.e = auVar.r.H;
                this.d.c = auVar.r.H != null;
            }
            if (a(auVar.r, 4294967296L)) {
                this.d.f1343a.f = auVar.r.I;
            }
            if (!a(auVar.r, 6442450944L)) {
                return;
            }
            a(this.d, z, this.d.f1343a.e);
        }
    }

    private void a(boolean z, s sVar, bq bqVar) {
        float a2;
        float f;
        float f2;
        if (bqVar.e != null) {
            a(bqVar, bqVar.e);
        }
        boolean z2 = bqVar.f1266b != null && bqVar.f1266b.booleanValue();
        Paint paint = z ? this.d.d : this.d.e;
        if (z2) {
            ag agVar = new ag(50.0f, cd.percent);
            float a3 = bqVar.f != null ? bqVar.f.a(this) : agVar.a(this);
            float b2 = bqVar.g != null ? bqVar.g.b(this) : agVar.b(this);
            a2 = bqVar.h != null ? bqVar.h.c(this) : agVar.c(this);
            f = b2;
            f2 = a3;
        } else {
            float a4 = bqVar.f != null ? bqVar.f.a(this, 1.0f) : 0.5f;
            float a5 = bqVar.g != null ? bqVar.g.a(this, 1.0f) : 0.5f;
            a2 = bqVar.h != null ? bqVar.h.a(this, 1.0f) : 0.5f;
            f = a5;
            f2 = a4;
        }
        c();
        this.d = c(bqVar);
        Matrix matrix = new Matrix();
        if (!z2) {
            matrix.preTranslate(sVar.f1394a, sVar.f1395b);
            matrix.preScale(sVar.c, sVar.d);
        }
        if (bqVar.c != null) {
            matrix.preConcat(bqVar.c);
        }
        int size = bqVar.f1265a.size();
        if (size == 0) {
            d();
            if (z) {
                this.d.f1344b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        int[] iArr = new int[size];
        float[] fArr = new float[size];
        Iterator<bn> it = bqVar.f1265a.iterator();
        int i = 0;
        float f3 = -1.0f;
        while (it.hasNext()) {
            av avVar = (av) it.next();
            if (i == 0 || avVar.f1293a.floatValue() >= f3) {
                fArr[i] = avVar.f1293a.floatValue();
                f3 = avVar.f1293a.floatValue();
            } else {
                fArr[i] = f3;
            }
            c();
            a(this.d, avVar);
            w wVar = (w) this.d.f1343a.C;
            if (wVar == null) {
                wVar = w.f1401b;
            }
            iArr[i] = wVar.f1402a | (a(this.d.f1343a.D.floatValue()) << 24);
            d();
            i++;
        }
        if (a2 == 0.0f || size == 1) {
            d();
            paint.setColor(iArr[size - 1]);
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        if (bqVar.d != null) {
            if (bqVar.d == ab.reflect) {
                tileMode = Shader.TileMode.MIRROR;
            } else if (bqVar.d == ab.repeat) {
                tileMode = Shader.TileMode.REPEAT;
            }
        }
        d();
        RadialGradient radialGradient = new RadialGradient(f2, f, a2, iArr, fArr, tileMode);
        radialGradient.setLocalMatrix(matrix);
        paint.setShader(radialGradient);
    }

    private static void a(aa aaVar, String str) {
        while (true) {
            bn a2 = aaVar.u.a(str);
            if (a2 == null) {
                c("Gradient reference '%s' not found", str);
                return;
            }
            if (!(a2 instanceof aa)) {
                d("Gradient href attributes must point to other gradient elements", new Object[0]);
                return;
            }
            if (a2 == aaVar) {
                d("Circular reference in gradient href attribute '%s'", str);
                return;
            }
            aa aaVar2 = (aa) a2;
            if (aaVar.f1266b == null) {
                aaVar.f1266b = aaVar2.f1266b;
            }
            if (aaVar.c == null) {
                aaVar.c = aaVar2.c;
            }
            if (aaVar.d == null) {
                aaVar.d = aaVar2.d;
            }
            if (aaVar.f1265a.isEmpty()) {
                aaVar.f1265a = aaVar2.f1265a;
            }
            try {
                if (aaVar instanceof bm) {
                    bm bmVar = (bm) aaVar;
                    bm bmVar2 = (bm) a2;
                    if (bmVar.f == null) {
                        bmVar.f = bmVar2.f;
                    }
                    if (bmVar.g == null) {
                        bmVar.g = bmVar2.g;
                    }
                    if (bmVar.h == null) {
                        bmVar.h = bmVar2.h;
                    }
                    if (bmVar.i == null) {
                        bmVar.i = bmVar2.i;
                    }
                } else {
                    bq bqVar = (bq) aaVar;
                    bq bqVar2 = (bq) a2;
                    if (bqVar.f == null) {
                        bqVar.f = bqVar2.f;
                    }
                    if (bqVar.g == null) {
                        bqVar.g = bqVar2.g;
                    }
                    if (bqVar.h == null) {
                        bqVar.h = bqVar2.h;
                    }
                    if (bqVar.i == null) {
                        bqVar.i = bqVar2.i;
                    }
                    if (bqVar.j == null) {
                        bqVar.j = bqVar2.j;
                    }
                }
            } catch (ClassCastException e) {
            }
            if (aaVar2.e != null) {
                str = aaVar2.e;
            } else {
                return;
            }
        }
    }

    private void d(bk bkVar) {
        a(bkVar, bkVar.o);
    }

    private void a(bk bkVar, s sVar) {
        if (this.d.f1343a.E != null) {
            bn a2 = bkVar.u.a(this.d.f1343a.E);
            if (a2 == null) {
                d("ClipPath reference '%s' not found", this.d.f1343a.E);
                return;
            }
            v vVar = (v) a2;
            if (vVar.i.isEmpty()) {
                this.e.clipRect(0, 0, 0, 0);
                return;
            }
            boolean z = vVar.f1400a == null || vVar.f1400a.booleanValue();
            if ((bkVar instanceof ad) && !z) {
                c("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", bkVar.getClass().getSimpleName());
                return;
            }
            this.i.push(this.d);
            this.d = (co) this.d.clone();
            Matrix matrix = new Matrix();
            if (!z) {
                Matrix matrix2 = new Matrix();
                matrix2.preTranslate(sVar.f1394a, sVar.f1395b);
                matrix2.preScale(sVar.c, sVar.d);
                this.e.concat(matrix2);
                Matrix matrix3 = new Matrix();
                if (matrix2.invert(matrix3)) {
                    matrix.postConcat(matrix3);
                }
            }
            if (vVar.f1269b != null) {
                Matrix matrix4 = vVar.f1269b;
                this.e.concat(matrix4);
                Matrix matrix5 = new Matrix();
                if (matrix4.invert(matrix5)) {
                    matrix.postConcat(matrix5);
                }
            }
            this.d = c((bn) vVar);
            d(vVar);
            Path path = new Path();
            Iterator<bn> it = vVar.i.iterator();
            while (it.hasNext()) {
                a(it.next(), true, path, new Matrix());
            }
            this.e.clipPath(path);
            this.d = this.i.pop();
            this.e.concat(matrix);
        }
    }

    private void a(bn bnVar, boolean z, Path path, Matrix matrix) {
        Path b2;
        float f = 0.0f;
        if (!j()) {
            return;
        }
        this.e.save(1);
        this.i.push(this.d);
        this.d = (co) this.d.clone();
        if (bnVar instanceof ce) {
            if (z) {
                ce ceVar = (ce) bnVar;
                a(this.d, ceVar);
                if (j() && k()) {
                    if (ceVar.f1269b != null) {
                        matrix.preConcat(ceVar.f1269b);
                    }
                    bn a2 = ceVar.u.a(ceVar.f1328a);
                    if (a2 == null) {
                        d("Use reference '%s' not found", ceVar.f1328a);
                    } else {
                        d(ceVar);
                        a(a2, false, path, matrix);
                    }
                }
            } else {
                d("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
        } else if (bnVar instanceof am) {
            am amVar = (am) bnVar;
            a(this.d, amVar);
            if (j() && k()) {
                if (amVar.e != null) {
                    matrix.preConcat(amVar.e);
                }
                Path path2 = new ck(this, amVar.f1282a).f1337a;
                if (amVar.o == null) {
                    amVar.o = b(path2);
                }
                d(amVar);
                path.setFillType(m());
                path.addPath(path2, matrix);
            }
        } else if (bnVar instanceof bw) {
            bw bwVar = (bw) bnVar;
            a(this.d, bwVar);
            if (j()) {
                if (bwVar.f1318a != null) {
                    matrix.preConcat(bwVar.f1318a);
                }
                float a3 = (bwVar.f1323b == null || bwVar.f1323b.size() == 0) ? 0.0f : bwVar.f1323b.get(0).a(this);
                float b3 = (bwVar.c == null || bwVar.c.size() == 0) ? 0.0f : bwVar.c.get(0).b(this);
                float a4 = (bwVar.d == null || bwVar.d.size() == 0) ? 0.0f : bwVar.d.get(0).a(this);
                if (bwVar.e != null && bwVar.e.size() != 0) {
                    f = bwVar.e.get(0).b(this);
                }
                if (this.d.f1343a.u != bb.Start) {
                    float a5 = a((by) bwVar);
                    if (this.d.f1343a.u == bb.Middle) {
                        a3 -= a5 / 2.0f;
                    } else {
                        a3 -= a5;
                    }
                }
                if (bwVar.o == null) {
                    cp cpVar = new cp(this, a3, b3);
                    a(bwVar, cpVar);
                    bwVar.o = new s(cpVar.c.left, cpVar.c.top, cpVar.c.width(), cpVar.c.height());
                }
                d(bwVar);
                Path path3 = new Path();
                a(bwVar, new cn(this, a3 + a4, f + b3, path3));
                path.setFillType(m());
                path.addPath(path3, matrix);
            }
        } else if (bnVar instanceof ac) {
            ac acVar = (ac) bnVar;
            a(this.d, acVar);
            if (j() && k()) {
                if (acVar.e != null) {
                    matrix.preConcat(acVar.e);
                }
                if (acVar instanceof as) {
                    b2 = a((as) acVar);
                } else if (acVar instanceof u) {
                    b2 = a((u) acVar);
                } else if (acVar instanceof z) {
                    b2 = a((z) acVar);
                } else if (acVar instanceof aq) {
                    b2 = b((aq) acVar);
                }
                d(acVar);
                path.setFillType(b2.getFillType());
                path.addPath(b2, matrix);
            }
        } else {
            d("Invalid %s element found in clipPath definition", bnVar.getClass().getSimpleName());
        }
        this.e.restore();
        this.d = this.i.pop();
    }

    private Path.FillType m() {
        if (this.d.f1343a.F == null) {
            return Path.FillType.WINDING;
        }
        switch (ch.d[this.d.f1343a.F.ordinal()]) {
        }
        return Path.FillType.WINDING;
    }

    private Path a(as asVar) {
        float a2;
        float b2;
        if (asVar.f == null && asVar.g == null) {
            a2 = 0.0f;
            b2 = 0.0f;
        } else if (asVar.f == null) {
            b2 = asVar.g.b(this);
            a2 = b2;
        } else if (asVar.g == null) {
            b2 = asVar.f.a(this);
            a2 = b2;
        } else {
            a2 = asVar.f.a(this);
            b2 = asVar.g.b(this);
        }
        float min = Math.min(a2, asVar.c.a(this) / 2.0f);
        float min2 = Math.min(b2, asVar.d.b(this) / 2.0f);
        float a3 = asVar.f1289a != null ? asVar.f1289a.a(this) : 0.0f;
        float b3 = asVar.f1290b != null ? asVar.f1290b.b(this) : 0.0f;
        float a4 = asVar.c.a(this);
        float b4 = asVar.d.b(this);
        if (asVar.o == null) {
            asVar.o = new s(a3, b3, a4, b4);
        }
        float f = a3 + a4;
        float f2 = b3 + b4;
        Path path = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path.moveTo(a3, b3);
            path.lineTo(f, b3);
            path.lineTo(f, f2);
            path.lineTo(a3, f2);
            path.lineTo(a3, b3);
        } else {
            float f3 = min * 0.5522848f;
            float f4 = min2 * 0.5522848f;
            path.moveTo(a3, b3 + min2);
            path.cubicTo(a3, (b3 + min2) - f4, (a3 + min) - f3, b3, a3 + min, b3);
            path.lineTo(f - min, b3);
            path.cubicTo((f - min) + f3, b3, f, (b3 + min2) - f4, f, b3 + min2);
            path.lineTo(f, f2 - min2);
            path.cubicTo(f, (f2 - min2) + f4, (f - min) + f3, f2, f - min, f2);
            path.lineTo(a3 + min, f2);
            path.cubicTo((a3 + min) - f3, f2, a3, (f2 - min2) + f4, a3, f2 - min2);
            path.lineTo(a3, b3 + min2);
        }
        path.close();
        return path;
    }

    private Path a(u uVar) {
        float a2 = uVar.f1398a != null ? uVar.f1398a.a(this) : 0.0f;
        float b2 = uVar.f1399b != null ? uVar.f1399b.b(this) : 0.0f;
        float c = uVar.c.c(this);
        float f = a2 - c;
        float f2 = b2 - c;
        float f3 = a2 + c;
        float f4 = b2 + c;
        if (uVar.o == null) {
            uVar.o = new s(f, f2, 2.0f * c, 2.0f * c);
        }
        float f5 = c * 0.5522848f;
        Path path = new Path();
        path.moveTo(a2, f2);
        path.cubicTo(a2 + f5, f2, f3, b2 - f5, f3, b2);
        path.cubicTo(f3, b2 + f5, a2 + f5, f4, a2, f4);
        path.cubicTo(a2 - f5, f4, f, b2 + f5, f, b2);
        path.cubicTo(f, b2 - f5, a2 - f5, f2, a2, f2);
        path.close();
        return path;
    }

    private Path a(z zVar) {
        float a2 = zVar.f1404a != null ? zVar.f1404a.a(this) : 0.0f;
        float b2 = zVar.f1405b != null ? zVar.f1405b.b(this) : 0.0f;
        float a3 = zVar.c.a(this);
        float b3 = zVar.d.b(this);
        float f = a2 - a3;
        float f2 = b2 - b3;
        float f3 = a2 + a3;
        float f4 = b2 + b3;
        if (zVar.o == null) {
            zVar.o = new s(f, f2, 2.0f * a3, 2.0f * b3);
        }
        float f5 = a3 * 0.5522848f;
        float f6 = b3 * 0.5522848f;
        Path path = new Path();
        path.moveTo(a2, f2);
        path.cubicTo(a2 + f5, f2, f3, b2 - f6, f3, b2);
        path.cubicTo(f3, b2 + f6, a2 + f5, f4, a2, f4);
        path.cubicTo(a2 - f5, f4, f, b2 + f6, f, b2);
        path.cubicTo(f, b2 - f6, a2 - f5, f2, a2, f2);
        path.close();
        return path;
    }

    private Path b(aq aqVar) {
        Path path = new Path();
        path.moveTo(aqVar.f1288a[0], aqVar.f1288a[1]);
        for (int i = 2; i < aqVar.f1288a.length; i += 2) {
            path.lineTo(aqVar.f1288a[i], aqVar.f1288a[i + 1]);
        }
        if (aqVar instanceof ar) {
            path.close();
        }
        if (aqVar.o == null) {
            aqVar.o = b(path);
        }
        path.setFillType(m());
        return path;
    }

    private boolean f() {
        if (this.d.f1343a.G != null && !this.d.i) {
            c("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (!(this.d.f1343a.m.floatValue() < 1.0f || (this.d.f1343a.G != null && this.d.i))) {
            return false;
        }
        this.e.saveLayerAlpha(null, a(this.d.f1343a.m.floatValue()), 4);
        this.i.push(this.d);
        this.d = (co) this.d.clone();
        if (this.d.f1343a.G != null && this.d.i) {
            bn a2 = this.h.a(this.d.f1343a.G);
            if (a2 == null || !(a2 instanceof aj)) {
                d("Mask reference '%s' not found", this.d.f1343a.G);
                this.d.f1343a.G = null;
                return true;
            }
            this.l.push(this.e);
            g();
        }
        return true;
    }

    static /* synthetic */ void a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, ao aoVar) {
        double d;
        float f8;
        float f9;
        double d2;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            aoVar.b(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        float radians = (float) Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (f - f6) / 2.0d;
        double d4 = (f2 - f7) / 2.0d;
        double d5 = (cos * d3) + (sin * d4);
        double d6 = (d3 * (-sin)) + (d4 * cos);
        double d7 = abs * abs;
        double d8 = abs2 * abs2;
        double d9 = d5 * d5;
        double d10 = d6 * d6;
        double d11 = (d9 / d7) + (d10 / d8);
        if (d11 > 1.0d) {
            float sqrt = abs * ((float) Math.sqrt(d11));
            float sqrt2 = abs2 * ((float) Math.sqrt(d11));
            d = sqrt * sqrt;
            f8 = sqrt2;
            f9 = sqrt;
            d2 = sqrt2 * sqrt2;
        } else {
            d = d7;
            f8 = abs2;
            f9 = abs;
            d2 = d8;
        }
        double d12 = z == z2 ? -1.0d : 1.0d;
        double d13 = (((d * d2) - (d * d10)) - (d2 * d9)) / ((d2 * d9) + (d * d10));
        if (d13 < 0.0d) {
            d13 = 0.0d;
        }
        double sqrt3 = Math.sqrt(d13) * d12;
        double d14 = ((f9 * d6) / f8) * sqrt3;
        double d15 = sqrt3 * (-((f8 * d5) / f9));
        double d16 = ((f + f6) / 2.0d) + ((cos * d14) - (sin * d15));
        double d17 = ((f2 + f7) / 2.0d) + (cos * d15) + (sin * d14);
        double d18 = (d5 - d14) / f9;
        double d19 = (d6 - d15) / f8;
        double d20 = ((-d5) - d14) / f9;
        double d21 = ((-d6) - d15) / f8;
        double degrees = Math.toDegrees((d19 < 0.0d ? -1.0d : 1.0d) * Math.acos(d18 / Math.sqrt((d18 * d18) + (d19 * d19))));
        double degrees2 = Math.toDegrees(((d18 * d21) - (d20 * d19) < 0.0d ? -1.0d : 1.0d) * Math.acos(((d19 * d21) + (d18 * d20)) / Math.sqrt(((d18 * d18) + (d19 * d19)) * ((d20 * d20) + (d21 * d21)))));
        if (!z2 && degrees2 > 0.0d) {
            degrees2 -= 360.0d;
        } else if (z2 && degrees2 < 0.0d) {
            degrees2 += 360.0d;
        }
        double d22 = degrees2 % 360.0d;
        int ceil = (int) Math.ceil(Math.abs(d22) / 90.0d);
        double radians2 = Math.toRadians(degrees % 360.0d);
        float radians3 = (float) (Math.toRadians(d22) / ceil);
        double sin2 = (1.3333333333333333d * Math.sin(radians3 / 2.0d)) / (1.0d + Math.cos(radians3 / 2.0d));
        float[] fArr = new float[ceil * 6];
        int i = 0;
        for (int i2 = 0; i2 < ceil; i2++) {
            double d23 = (i2 * radians3) + radians2;
            double cos2 = Math.cos(d23);
            double sin3 = Math.sin(d23);
            int i3 = i + 1;
            fArr[i] = (float) (cos2 - (sin2 * sin3));
            int i4 = i3 + 1;
            fArr[i3] = (float) ((cos2 * sin2) + sin3);
            double d24 = d23 + radians3;
            double cos3 = Math.cos(d24);
            double sin4 = Math.sin(d24);
            int i5 = i4 + 1;
            fArr[i4] = (float) ((sin2 * sin4) + cos3);
            int i6 = i5 + 1;
            fArr[i5] = (float) (sin4 - (sin2 * cos3));
            int i7 = i6 + 1;
            fArr[i6] = (float) cos3;
            i = i7 + 1;
            fArr[i7] = (float) sin4;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f9, f8);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d16, (float) d17);
        matrix.mapPoints(fArr);
        fArr[fArr.length - 2] = f6;
        fArr[fArr.length - 1] = f7;
        int i8 = 0;
        while (true) {
            int i9 = i8;
            if (i9 >= fArr.length) {
                return;
            }
            aoVar.a(fArr[i9], fArr[i9 + 1], fArr[i9 + 2], fArr[i9 + 3], fArr[i9 + 4], fArr[i9 + 5]);
            i8 = i9 + 6;
        }
    }
}
