package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class kh extends com.google.protobuf.nano.c {
    private static volatile kh[] o;

    /* renamed from: a, reason: collision with root package name */
    public dp f4035a = null;

    /* renamed from: b, reason: collision with root package name */
    public dp f4036b = null;
    public dp c = null;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public ki[] h = ki.b();
    public ea i = null;
    public ea[] j = ea.b();
    public ht k = null;
    public ds[] l = ds.b();
    public kh[] m = b();
    public nb n = null;

    private static kh[] b() {
        if (o == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (o == null) {
                    o = new kh[0];
                }
            }
        }
        return o;
    }

    public kh() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4035a != null) {
            codedOutputByteBufferNano.b(1, this.f4035a);
        }
        if (this.f4036b != null) {
            codedOutputByteBufferNano.b(2, this.f4036b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(5, this.f);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(7, this.i);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(9, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i = 0; i < this.l.length; i++) {
                ds dsVar = this.l[i];
                if (dsVar != null) {
                    codedOutputByteBufferNano.b(10, dsVar);
                }
            }
        }
        if (this.m != null && this.m.length > 0) {
            for (int i2 = 0; i2 < this.m.length; i2++) {
                kh khVar = this.m[i2];
                if (khVar != null) {
                    codedOutputByteBufferNano.b(11, khVar);
                }
            }
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(13, this.n);
        }
        if (this.j != null && this.j.length > 0) {
            for (int i3 = 0; i3 < this.j.length; i3++) {
                ea eaVar = this.j[i3];
                if (eaVar != null) {
                    codedOutputByteBufferNano.b(14, eaVar);
                }
            }
        }
        if (this.h != null && this.h.length > 0) {
            for (int i4 = 0; i4 < this.h.length; i4++) {
                ki kiVar = this.h[i4];
                if (kiVar != null) {
                    codedOutputByteBufferNano.b(15, kiVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4035a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4035a);
        }
        if (this.f4036b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4036b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.i);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.l.length; i2++) {
                ds dsVar = this.l[i2];
                if (dsVar != null) {
                    i += CodedOutputByteBufferNano.d(10, dsVar);
                }
            }
            a2 = i;
        }
        if (this.m != null && this.m.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.m.length; i4++) {
                kh khVar = this.m[i4];
                if (khVar != null) {
                    i3 += CodedOutputByteBufferNano.d(11, khVar);
                }
            }
            a2 = i3;
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.n);
        }
        if (this.j != null && this.j.length > 0) {
            int i5 = a2;
            for (int i6 = 0; i6 < this.j.length; i6++) {
                ea eaVar = this.j[i6];
                if (eaVar != null) {
                    i5 += CodedOutputByteBufferNano.d(14, eaVar);
                }
            }
            a2 = i5;
        }
        if (this.h != null && this.h.length > 0) {
            for (int i7 = 0; i7 < this.h.length; i7++) {
                ki kiVar = this.h[i7];
                if (kiVar != null) {
                    a2 += CodedOutputByteBufferNano.d(15, kiVar);
                }
            }
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ com.google.protobuf.nano.c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    if (this.f4035a == null) {
                        this.f4035a = new dp();
                    }
                    aVar.a(this.f4035a);
                    break;
                case 18:
                    if (this.f4036b == null) {
                        this.f4036b = new dp();
                    }
                    aVar.a(this.f4036b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new dp();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 42:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 58:
                    if (this.i == null) {
                        this.i = new ea();
                    }
                    aVar.a(this.i);
                    break;
                case 74:
                    if (this.k == null) {
                        this.k = new ht();
                    }
                    aVar.a(this.k);
                    break;
                case 82:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 82);
                    int length = this.l == null ? 0 : this.l.length;
                    ds[] dsVarArr = new ds[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.l, 0, dsVarArr, 0, length);
                    }
                    while (length < dsVarArr.length - 1) {
                        dsVarArr[length] = new ds();
                        aVar.a(dsVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dsVarArr[length] = new ds();
                    aVar.a(dsVarArr[length]);
                    this.l = dsVarArr;
                    break;
                case 90:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 90);
                    int length2 = this.m == null ? 0 : this.m.length;
                    kh[] khVarArr = new kh[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.m, 0, khVarArr, 0, length2);
                    }
                    while (length2 < khVarArr.length - 1) {
                        khVarArr[length2] = new kh();
                        aVar.a(khVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    khVarArr[length2] = new kh();
                    aVar.a(khVarArr[length2]);
                    this.m = khVarArr;
                    break;
                case 106:
                    if (this.n == null) {
                        this.n = new nb();
                    }
                    aVar.a(this.n);
                    break;
                case 114:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 114);
                    int length3 = this.j == null ? 0 : this.j.length;
                    ea[] eaVarArr = new ea[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.j, 0, eaVarArr, 0, length3);
                    }
                    while (length3 < eaVarArr.length - 1) {
                        eaVarArr[length3] = new ea();
                        aVar.a(eaVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    eaVarArr[length3] = new ea();
                    aVar.a(eaVarArr[length3]);
                    this.j = eaVarArr;
                    break;
                case 122:
                    int b5 = com.google.protobuf.nano.e.b(aVar, 122);
                    int length4 = this.h == null ? 0 : this.h.length;
                    ki[] kiVarArr = new ki[b5 + length4];
                    if (length4 != 0) {
                        System.arraycopy(this.h, 0, kiVarArr, 0, length4);
                    }
                    while (length4 < kiVarArr.length - 1) {
                        kiVarArr[length4] = new ki();
                        aVar.a(kiVarArr[length4]);
                        aVar.a();
                        length4++;
                    }
                    kiVarArr[length4] = new ki();
                    aVar.a(kiVarArr[length4]);
                    this.h = kiVarArr;
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
