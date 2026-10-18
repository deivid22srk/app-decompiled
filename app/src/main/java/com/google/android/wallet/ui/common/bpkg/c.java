package com.google.android.wallet.ui.common.bpkg;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f7498a;

    public c(a... aVarArr) {
        super(null);
        this.f7498a = new ArrayList<>(Arrays.asList(aVarArr));
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.f7498a.add(aVar);
        }
    }

    public final void b(a aVar) {
        if (aVar != null) {
            this.f7498a.remove(aVar);
        }
    }

    public final boolean b() {
        return this.f7498a.isEmpty();
    }
}
