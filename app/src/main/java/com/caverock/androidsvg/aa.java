package com.caverock.androidsvg;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public class aa extends bl implements bj {

    /* renamed from: a, reason: collision with root package name */
    public List<bn> f1265a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Boolean f1266b;
    public Matrix c;
    public ab d;
    public String e;

    protected aa() {
    }

    @Override // com.caverock.androidsvg.bj
    public final List<bn> a() {
        return this.f1265a;
    }

    @Override // com.caverock.androidsvg.bj
    public final void a(bn bnVar) {
        if (bnVar instanceof av) {
            this.f1265a.add(bnVar);
            return;
        }
        throw new SAXException("Gradient elements cannot contain " + bnVar + " elements.");
    }
}
