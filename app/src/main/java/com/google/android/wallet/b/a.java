package com.google.android.wallet.b;

import android.support.v4.h.r;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.b.a.a.a.b.a.bpkg.f;
import com.google.b.a.a.a.b.a.bpkg.i;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray<d> f7242a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<ArrayList<i>> f7243b;
    public final SparseArray<c> c;
    public final SparseBooleanArray d;
    final r<b, com.google.b.a.a.a.b.a.bpkg.c> e;

    public a(com.google.b.a.a.a.b.a.bpkg.e eVar) {
        boolean z = (eVar == null || eVar.f7669b == null) ? false : true;
        int length = z ? eVar.f7669b.length : 0;
        this.f7242a = new SparseArray<>(length);
        this.f7243b = new SparseArray<>(length);
        this.c = new SparseArray<>(length);
        this.d = new SparseBooleanArray(length);
        this.e = new r<>(length);
        if (z) {
            for (com.google.b.a.a.a.b.a.bpkg.c cVar : eVar.f7669b) {
                for (i iVar : cVar.c) {
                    this.e.put(new b(iVar), cVar);
                    ArrayList<i> arrayList = this.f7243b.get(iVar.f7675a);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.f7243b.put(iVar.f7675a, arrayList);
                    }
                    arrayList.add(iVar);
                }
                for (f fVar : cVar.d) {
                    this.d.put(fVar.f7671b, true);
                }
            }
        }
    }

    @Override // com.google.android.wallet.b.e
    public final void a(i iVar) {
        com.google.b.a.a.a.b.a.bpkg.c cVar = this.e.get(new b(iVar));
        for (i iVar2 : cVar.c) {
            if (iVar2 != iVar) {
                this.f7242a.get(iVar2.f7675a).a(iVar2);
                return;
            }
        }
        for (f fVar : cVar.d) {
            this.c.get(fVar.f7671b).a(fVar, cVar.c);
        }
    }
}
