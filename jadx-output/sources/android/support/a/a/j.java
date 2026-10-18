package android.support.a.a;

import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    final Matrix f48a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<Object> f49b;
    float c;
    float d;
    float e;
    float f;
    float g;
    float h;
    float i;
    final Matrix j;
    int k;
    int[] l;
    String m;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.support.a.a.i] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.support.v4.h.a, android.support.v4.h.a<java.lang.String, java.lang.Object>] */
    public j(j jVar, android.support.v4.h.a<String, Object> aVar) {
        h hVar;
        this.f48a = new Matrix();
        this.f49b = new ArrayList<>();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
        this.c = jVar.c;
        this.d = jVar.d;
        this.e = jVar.e;
        this.f = jVar.f;
        this.g = jVar.g;
        this.h = jVar.h;
        this.i = jVar.i;
        this.l = jVar.l;
        this.m = jVar.m;
        this.k = jVar.k;
        if (this.m != null) {
            aVar.put(this.m, this);
        }
        this.j.set(jVar.j);
        ArrayList<Object> arrayList = jVar.f49b;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < arrayList.size()) {
                Object obj = arrayList.get(i2);
                if (obj instanceof j) {
                    this.f49b.add(new j((j) obj, aVar));
                } else {
                    if (obj instanceof i) {
                        hVar = new i((i) obj);
                    } else if (obj instanceof h) {
                        hVar = new h((h) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f49b.add(hVar);
                    if (hVar.n != null) {
                        aVar.put(hVar.n, hVar);
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public j() {
        this.f48a = new Matrix();
        this.f49b = new ArrayList<>();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }
}
