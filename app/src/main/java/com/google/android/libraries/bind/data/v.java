package com.google.android.libraries.bind.data;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class v extends t {
    final /* synthetic */ Data e;
    final /* synthetic */ u f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(u uVar, k kVar, Executor executor, q qVar, k kVar2, Data data) {
        super(kVar, executor, qVar, kVar2);
        this.f = uVar;
        this.e = data;
    }

    @Override // com.google.android.libraries.bind.data.t
    protected final List<Data> a() {
        if (this.e == null) {
            if (this.f.i) {
                return new ArrayList(0);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.e);
        return arrayList;
    }
}
