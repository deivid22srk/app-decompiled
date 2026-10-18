package com.a.a.a.b;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class h {

    /* renamed from: b, reason: collision with root package name */
    final a.i f957b;

    /* renamed from: a, reason: collision with root package name */
    final List<e> f956a = new ArrayList();
    e[] e = new e[8];
    int f = this.e.length - 1;
    int g = 0;
    int h = 0;
    int c = 4096;
    int d = 4096;

    h(a.y yVar) {
        this.f957b = a.o.a(yVar);
    }

    final void a() {
        if (this.d < this.h) {
            if (this.d == 0) {
                c();
            } else {
                d(this.h - this.d);
            }
        }
    }

    private void c() {
        this.f956a.clear();
        Arrays.fill(this.e, (Object) null);
        this.f = this.e.length - 1;
        this.g = 0;
        this.h = 0;
    }

    private int d(int i) {
        int i2 = 0;
        if (i > 0) {
            int length = this.e.length;
            while (true) {
                length--;
                if (length < this.f || i <= 0) {
                    break;
                }
                i -= this.e[length].j;
                this.h -= this.e[length].j;
                this.g--;
                i2++;
            }
            System.arraycopy(this.e, this.f + 1, this.e, this.f + 1 + i2, this.g);
            this.f += i2;
        }
        return i2;
    }

    final int a(int i) {
        return this.f + 1 + i;
    }

    final a.j b(int i) {
        e[] eVarArr;
        e[] eVarArr2;
        if (c(i)) {
            eVarArr2 = g.f954a;
            return eVarArr2[i].h;
        }
        e[] eVarArr3 = this.e;
        eVarArr = g.f954a;
        return eVarArr3[a(i - eVarArr.length)].h;
    }

    static boolean c(int i) {
        e[] eVarArr;
        if (i >= 0) {
            eVarArr = g.f954a;
            if (i <= eVarArr.length - 1) {
                return true;
            }
        }
        return false;
    }

    final void a(e eVar) {
        this.f956a.add(eVar);
        int i = eVar.j;
        if (i > this.d) {
            c();
            return;
        }
        d((this.h + i) - this.d);
        if (this.g + 1 > this.e.length) {
            e[] eVarArr = new e[this.e.length * 2];
            System.arraycopy(this.e, 0, eVarArr, this.e.length, this.e.length);
            this.f = this.e.length - 1;
            this.e = eVarArr;
        }
        int i2 = this.f;
        this.f = i2 - 1;
        this.e[i2] = eVar;
        this.g++;
        this.h = i + this.h;
    }

    private int d() {
        return this.f957b.g() & 255;
    }

    final int a(int i, int i2) {
        int i3 = i & i2;
        if (i3 >= i2) {
            int i4 = 0;
            while (true) {
                int d = d();
                if ((d & 128) != 0) {
                    i2 += (d & 127) << i4;
                    i4 += 7;
                } else {
                    return (d << i4) + i2;
                }
            }
        } else {
            return i3;
        }
    }

    final a.j b() {
        int d = d();
        boolean z = (d & 128) == 128;
        int a2 = a(d, 127);
        if (!z) {
            return this.f957b.c(a2);
        }
        o a3 = o.a();
        byte[] e = this.f957b.e(a2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        p pVar = a3.f970a;
        int i2 = 0;
        for (byte b2 : e) {
            i = (i << 8) | (b2 & 255);
            i2 += 8;
            while (i2 >= 8) {
                pVar = pVar.f971a[(i >>> (i2 - 8)) & 255];
                if (pVar.f971a == null) {
                    byteArrayOutputStream.write(pVar.f972b);
                    i2 -= pVar.c;
                    pVar = a3.f970a;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            p pVar2 = pVar.f971a[(i << (8 - i2)) & 255];
            if (pVar2.f971a != null || pVar2.c > i2) {
                break;
            }
            byteArrayOutputStream.write(pVar2.f972b);
            i2 -= pVar2.c;
            pVar = a3.f970a;
        }
        return a.j.a(byteArrayOutputStream.toByteArray());
    }
}
