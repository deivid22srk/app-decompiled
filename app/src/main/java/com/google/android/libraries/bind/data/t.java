package com.google.android.libraries.bind.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class t extends ab {

    /* renamed from: a, reason: collision with root package name */
    protected final ac f6703a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f6704b;
    protected final DataException c;
    protected final q d;

    public t(k kVar, Executor executor, q qVar, k kVar2) {
        super(kVar, qVar != null ? qVar.a() : executor);
        com.google.android.libraries.bind.apkg.a.a();
        this.f6703a = kVar2.e;
        this.f6704b = kVar2.d;
        this.c = kVar2.e.e;
        this.d = qVar;
    }

    protected List<Data> a() {
        return this.f6703a.f6684b;
    }

    @Override // com.google.android.libraries.bind.data.ab
    protected final List<Data> b() {
        if (this.c != null) {
            throw this.c;
        }
        List<Data> a2 = a();
        if (this.j.get()) {
            return null;
        }
        if (this.d != null) {
            ArrayList arrayList = new ArrayList(a2.size());
            if (this.d == null) {
                return arrayList;
            }
            Iterator<Data> it = a2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            if (this.j.get()) {
                return null;
            }
            return this.d.a(arrayList);
        }
        return a2;
    }

    @Override // com.google.android.libraries.bind.data.ab
    protected final void a(ac acVar, j jVar) {
        this.i.a(this, acVar, jVar, Integer.valueOf(this.f6704b));
    }
}
