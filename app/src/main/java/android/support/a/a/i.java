package android.support.a.a;

import android.content.res.TypedArray;
import android.graphics.Paint;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    int f46a;

    /* renamed from: b, reason: collision with root package name */
    float f47b;
    int c;
    float d;
    int e;
    float f;
    float g;
    float h;
    float i;
    Paint.Cap j;
    Paint.Join k;
    float l;
    private int[] p;

    public i() {
        this.f46a = 0;
        this.f47b = 0.0f;
        this.c = 0;
        this.d = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
    }

    public i(i iVar) {
        super(iVar);
        this.f46a = 0;
        this.f47b = 0.0f;
        this.c = 0;
        this.d = 1.0f;
        this.f = 1.0f;
        this.g = 0.0f;
        this.h = 1.0f;
        this.i = 0.0f;
        this.j = Paint.Cap.BUTT;
        this.k = Paint.Join.MITER;
        this.l = 4.0f;
        this.p = iVar.p;
        this.f46a = iVar.f46a;
        this.f47b = iVar.f47b;
        this.d = iVar.d;
        this.c = iVar.c;
        this.e = iVar.e;
        this.f = iVar.f;
        this.g = iVar.g;
        this.h = iVar.h;
        this.i = iVar.i;
        this.j = iVar.j;
        this.k = iVar.k;
        this.l = iVar.l;
    }

    final void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        this.p = null;
        if (e.a(xmlPullParser, "pathData")) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(2);
            if (string2 != null) {
                this.m = b.a(string2);
            }
            this.c = e.a(typedArray, xmlPullParser, "fillColor", 1, this.c);
            this.f = e.a(typedArray, xmlPullParser, "fillAlpha", 12, this.f);
            int a2 = e.a(typedArray, xmlPullParser, "strokeLineCap", 8);
            Paint.Cap cap = this.j;
            switch (a2) {
                case 0:
                    cap = Paint.Cap.BUTT;
                    break;
                case 1:
                    cap = Paint.Cap.ROUND;
                    break;
                case 2:
                    cap = Paint.Cap.SQUARE;
                    break;
            }
            this.j = cap;
            int a3 = e.a(typedArray, xmlPullParser, "strokeLineJoin", 9);
            Paint.Join join = this.k;
            switch (a3) {
                case 0:
                    join = Paint.Join.MITER;
                    break;
                case 1:
                    join = Paint.Join.ROUND;
                    break;
                case 2:
                    join = Paint.Join.BEVEL;
                    break;
            }
            this.k = join;
            this.l = e.a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.l);
            this.f46a = e.a(typedArray, xmlPullParser, "strokeColor", 3, this.f46a);
            this.d = e.a(typedArray, xmlPullParser, "strokeAlpha", 11, this.d);
            this.f47b = e.a(typedArray, xmlPullParser, "strokeWidth", 4, this.f47b);
            this.h = e.a(typedArray, xmlPullParser, "trimPathEnd", 6, this.h);
            this.i = e.a(typedArray, xmlPullParser, "trimPathOffset", 7, this.i);
            this.g = e.a(typedArray, xmlPullParser, "trimPathStart", 5, this.g);
        }
    }
}
