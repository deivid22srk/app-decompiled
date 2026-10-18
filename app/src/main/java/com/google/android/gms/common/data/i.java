package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.av;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final DataHolder f5624a;

    /* renamed from: b, reason: collision with root package name */
    public int f5625b;
    private int c;

    public final long a(String str) {
        return this.f5624a.a(str, this.f5625b, this.c);
    }

    public final String c(String str) {
        return this.f5624a.b(str, this.f5625b, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return at.a(Integer.valueOf(iVar.f5625b), Integer.valueOf(this.f5625b)) && at.a(Integer.valueOf(iVar.c), Integer.valueOf(this.c)) && iVar.f5624a == this.f5624a;
    }

    public i(DataHolder dataHolder, int i) {
        this.f5624a = (DataHolder) av.a(dataHolder);
        av.a(i >= 0 && i < this.f5624a.h);
        this.f5625b = i;
        this.c = this.f5624a.a(this.f5625b);
    }

    public final int b(String str) {
        DataHolder dataHolder = this.f5624a;
        int i = this.f5625b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getInt(i, dataHolder.c.getInt(str));
    }

    public final byte[] d(String str) {
        DataHolder dataHolder = this.f5624a;
        int i = this.f5625b;
        int i2 = this.c;
        dataHolder.a(str, i);
        return dataHolder.d[i2].getBlob(i, dataHolder.c.getInt(str));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5625b), Integer.valueOf(this.c), this.f5624a});
    }
}
