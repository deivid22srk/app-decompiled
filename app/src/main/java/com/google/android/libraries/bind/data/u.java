package com.google.android.libraries.bind.data;

/* loaded from: classes.dex */
public final class u extends r {
    boolean i;
    private final Object j;

    public u(k kVar, Object obj, q qVar, int[] iArr) {
        super(kVar, qVar, iArr, kVar.f6696b);
        this.j = obj;
    }

    @Override // com.google.android.libraries.bind.data.r, com.google.android.libraries.bind.data.k
    protected final ab k() {
        k kVar = this.h;
        Object obj = this.j;
        com.google.android.libraries.bind.apkg.a.a();
        Integer num = kVar.e.d.get(obj);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 && !this.i) {
            return null;
        }
        return new v(this, this, com.google.android.libraries.bind.apkg.o.c, this.g, this.h, this.h.a(intValue));
    }
}
