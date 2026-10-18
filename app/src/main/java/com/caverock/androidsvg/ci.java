package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ci implements ao {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cg f1334b;
    private float c;
    private float d;
    private boolean i;

    /* renamed from: a, reason: collision with root package name */
    List<cj> f1333a = new ArrayList();
    private cj e = null;
    private boolean f = false;
    private boolean g = true;
    private int h = -1;

    public ci(cg cgVar, an anVar) {
        this.f1334b = cgVar;
        if (anVar != null) {
            anVar.a(this);
            if (this.i) {
                this.e.a(this.f1333a.get(this.h));
                this.f1333a.set(this.h, this.e);
                this.i = false;
            }
            if (this.e != null) {
                this.f1333a.add(this.e);
            }
        }
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2) {
        if (this.i) {
            this.e.a(this.f1333a.get(this.h));
            this.f1333a.set(this.h, this.e);
            this.i = false;
        }
        if (this.e != null) {
            this.f1333a.add(this.e);
        }
        this.c = f;
        this.d = f2;
        this.e = new cj(this.f1334b, f, f2, 0.0f, 0.0f);
        this.h = this.f1333a.size();
    }

    @Override // com.caverock.androidsvg.ao
    public final void b(float f, float f2) {
        this.e.a(f, f2);
        this.f1333a.add(this.e);
        this.e = new cj(this.f1334b, f, f2, f - this.e.f1335a, f2 - this.e.f1336b);
        this.i = false;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.g || this.f) {
            this.e.a(f, f2);
            this.f1333a.add(this.e);
            this.f = false;
        }
        this.e = new cj(this.f1334b, f5, f6, f5 - f3, f6 - f4);
        this.i = false;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, float f4) {
        this.e.a(f, f2);
        this.f1333a.add(this.e);
        this.e = new cj(this.f1334b, f3, f4, f3 - f, f4 - f2);
        this.i = false;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.f = true;
        this.g = false;
        cg.a(this.e.f1335a, this.e.f1336b, f, f2, f3, z, z2, f4, f5, this);
        this.g = true;
        this.i = false;
    }

    @Override // com.caverock.androidsvg.ao
    public final void a() {
        this.f1333a.add(this.e);
        b(this.c, this.d);
        this.i = true;
    }
}
