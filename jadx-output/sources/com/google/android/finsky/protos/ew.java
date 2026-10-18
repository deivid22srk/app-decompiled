package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ew extends com.google.protobuf.nano.c {
    private static volatile ew[] t;

    /* renamed from: a, reason: collision with root package name */
    public int[] f3804a = com.google.protobuf.nano.e.f7878a;

    /* renamed from: b, reason: collision with root package name */
    public int f3805b = 0;
    public boolean c = false;
    public ev[] d = ev.b();
    public String e = "";
    public boolean f = false;
    public ds g = null;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public String l = "";
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public String p = "";
    public boolean q = false;
    public int r = 0;
    public boolean s = false;

    public static ew[] b() {
        if (t == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (t == null) {
                    t = new ew[0];
                }
            }
        }
        return t;
    }

    public ew() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3804a != null && this.f3804a.length > 0) {
            for (int i = 0; i < this.f3804a.length; i++) {
                codedOutputByteBufferNano.a(1, this.f3804a[i]);
            }
        }
        if (this.c || this.f3805b != 0) {
            codedOutputByteBufferNano.a(2, this.f3805b);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i2 = 0; i2 < this.d.length; i2++) {
                ev evVar = this.d[i2];
                if (evVar != null) {
                    codedOutputByteBufferNano.b(3, evVar);
                }
            }
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(5, this.g);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(6, this.h);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(7, this.j);
        }
        if (this.m || !this.l.equals("")) {
            codedOutputByteBufferNano.a(8, this.l);
        }
        if (this.o || this.n) {
            codedOutputByteBufferNano.a(9, this.n);
        }
        if (this.q || !this.p.equals("")) {
            codedOutputByteBufferNano.a(10, this.p);
        }
        if (this.s || this.r != 0) {
            codedOutputByteBufferNano.a(11, this.r);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int i;
        int a2 = super.a();
        if (this.f3804a == null || this.f3804a.length <= 0) {
            i = a2;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f3804a.length; i3++) {
                i2 += CodedOutputByteBufferNano.b(this.f3804a[i3]);
            }
            i = a2 + i2 + (this.f3804a.length * 1);
        }
        if (this.c || this.f3805b != 0) {
            i += CodedOutputByteBufferNano.c(2, this.f3805b);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i4 = 0; i4 < this.d.length; i4++) {
                ev evVar = this.d[i4];
                if (evVar != null) {
                    i += CodedOutputByteBufferNano.d(3, evVar);
                }
            }
        }
        if (this.f || !this.e.equals("")) {
            i += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (this.g != null) {
            i += CodedOutputByteBufferNano.d(5, this.g);
        }
        if (this.i || !this.h.equals("")) {
            i += CodedOutputByteBufferNano.b(6, this.h);
        }
        if (this.k || !this.j.equals("")) {
            i += CodedOutputByteBufferNano.b(7, this.j);
        }
        if (this.m || !this.l.equals("")) {
            i += CodedOutputByteBufferNano.b(8, this.l);
        }
        if (this.o || this.n) {
            i += CodedOutputByteBufferNano.c(9) + 1;
        }
        if (this.q || !this.p.equals("")) {
            i += CodedOutputByteBufferNano.b(10, this.p);
        }
        if (this.s || this.r != 0) {
            return i + CodedOutputByteBufferNano.c(11, this.r);
        }
        return i;
    }

    public static ew a(byte[] bArr) {
        return (ew) com.google.protobuf.nano.c.a(new ew(), bArr, bArr.length);
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        int i;
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 8);
                    int[] iArr = new int[b2];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < b2) {
                        if (i2 != 0) {
                            aVar.a();
                        }
                        int e = aVar.e();
                        switch (e) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                i = i3 + 1;
                                iArr[i3] = e;
                                break;
                            default:
                                i = i3;
                                break;
                        }
                        i2++;
                        i3 = i;
                    }
                    if (i3 != 0) {
                        int length = this.f3804a == null ? 0 : this.f3804a.length;
                        if (length == 0 && i3 == iArr.length) {
                            this.f3804a = iArr;
                            break;
                        } else {
                            int[] iArr2 = new int[length + i3];
                            if (length != 0) {
                                System.arraycopy(this.f3804a, 0, iArr2, 0, length);
                            }
                            System.arraycopy(iArr, 0, iArr2, length, i3);
                            this.f3804a = iArr2;
                            break;
                        }
                    } else {
                        break;
                    }
                case 10:
                    int c = aVar.c(aVar.e());
                    int j = aVar.j();
                    int i4 = 0;
                    while (aVar.i() > 0) {
                        switch (aVar.e()) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                i4++;
                                break;
                        }
                    }
                    if (i4 != 0) {
                        aVar.e(j);
                        int length2 = this.f3804a == null ? 0 : this.f3804a.length;
                        int[] iArr3 = new int[i4 + length2];
                        if (length2 != 0) {
                            System.arraycopy(this.f3804a, 0, iArr3, 0, length2);
                        }
                        while (aVar.i() > 0) {
                            int e2 = aVar.e();
                            switch (e2) {
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                case 17:
                                case 18:
                                case 19:
                                case 20:
                                case 21:
                                case 22:
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                case 38:
                                case 39:
                                case 40:
                                case 41:
                                case 42:
                                case 43:
                                case 44:
                                case 45:
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                    iArr3[length2] = e2;
                                    length2++;
                                    break;
                            }
                        }
                        this.f3804a = iArr3;
                    }
                    aVar.d(c);
                    break;
                case 16:
                    this.f3805b = aVar.e();
                    this.c = true;
                    break;
                case 26:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length3 = this.d == null ? 0 : this.d.length;
                    ev[] evVarArr = new ev[b3 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.d, 0, evVarArr, 0, length3);
                    }
                    while (length3 < evVarArr.length - 1) {
                        evVarArr[length3] = new ev();
                        aVar.a(evVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    evVarArr[length3] = new ev();
                    aVar.a(evVarArr[length3]);
                    this.d = evVarArr;
                    break;
                case 34:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 42:
                    if (this.g == null) {
                        this.g = new ds();
                    }
                    aVar.a(this.g);
                    break;
                case 50:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 58:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 66:
                    this.l = aVar.c();
                    this.m = true;
                    break;
                case 72:
                    this.n = aVar.b();
                    this.o = true;
                    break;
                case 82:
                    this.p = aVar.c();
                    this.q = true;
                    break;
                case 88:
                    this.r = aVar.e();
                    this.s = true;
                    break;
                default:
                    if (!com.google.protobuf.nano.e.a(aVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
