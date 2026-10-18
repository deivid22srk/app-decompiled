package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class pe {

    /* renamed from: a, reason: collision with root package name */
    protected static final Comparator<byte[]> f6226a = new pf();

    /* renamed from: b, reason: collision with root package name */
    private List<byte[]> f6227b = new LinkedList();
    private List<byte[]> c = new ArrayList(64);
    private int d = 0;
    private final int e;

    public pe(int i) {
        this.e = i;
    }

    private synchronized void a() {
        while (this.d > this.e) {
            byte[] remove = this.f6227b.remove(0);
            this.c.remove(remove);
            this.d -= remove.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.e) {
                this.f6227b.add(bArr);
                int binarySearch = Collections.binarySearch(this.c, bArr, f6226a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.c.add(binarySearch, bArr);
                this.d += bArr.length;
                a();
            }
        }
    }

    public final synchronized byte[] a(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.c.size()) {
                bArr = new byte[i];
                break;
            }
            bArr = this.c.get(i3);
            if (bArr.length >= i) {
                this.d -= bArr.length;
                this.c.remove(i3);
                this.f6227b.remove(bArr);
                break;
            }
            i2 = i3 + 1;
        }
        return bArr;
    }
}
