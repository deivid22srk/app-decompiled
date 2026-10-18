package com.caverock.androidsvg;

import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
final class co implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public aw f1343a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1344b;
    public boolean c;
    public Paint d = new Paint();
    public Paint e;
    public s f;
    public s g;
    public boolean h;
    public boolean i;
    final /* synthetic */ cg j;

    public co(cg cgVar) {
        this.j = cgVar;
        this.d.setFlags(385);
        this.d.setStyle(Paint.Style.FILL);
        this.d.setTypeface(Typeface.DEFAULT);
        this.e = new Paint();
        this.e.setFlags(385);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setTypeface(Typeface.DEFAULT);
        this.f1343a = aw.a();
    }

    protected final Object clone() {
        try {
            co coVar = (co) super.clone();
            coVar.f1343a = (aw) this.f1343a.clone();
            coVar.d = new Paint(this.d);
            coVar.e = new Paint(this.e);
            return coVar;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
}
