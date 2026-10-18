package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ht extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3926a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3927b = false;
    public hv[] c = hv.b();
    public boolean d = false;
    public boolean e = false;
    public int f = 1;
    public boolean g = false;
    public kp h = null;
    public boolean i = false;
    public boolean j = false;
    public dw[] k = dw.b();
    public hx l = null;
    public hu[] m = hu.b();
    public hw n = null;

    public ht() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3926a != 1 || this.f3927b) {
            codedOutputByteBufferNano.a(5, this.f3926a);
        }
        if (this.f != 1 || this.g) {
            codedOutputByteBufferNano.a(6, this.f);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(7, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            for (int i = 0; i < this.m.length; i++) {
                hu huVar = this.m[i];
                if (huVar != null) {
                    codedOutputByteBufferNano.a(9, huVar);
                }
            }
        }
        if (this.e || this.d) {
            codedOutputByteBufferNano.a(13, this.d);
        }
        if (this.k != null && this.k.length > 0) {
            for (int i2 = 0; i2 < this.k.length; i2++) {
                dw dwVar = this.k[i2];
                if (dwVar != null) {
                    codedOutputByteBufferNano.b(14, dwVar);
                }
            }
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(16, this.n);
        }
        if (this.h != null) {
            codedOutputByteBufferNano.b(17, this.h);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                hv hvVar = this.c[i3];
                if (hvVar != null) {
                    codedOutputByteBufferNano.b(18, hvVar);
                }
            }
        }
        if (this.j || this.i) {
            codedOutputByteBufferNano.a(21, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3926a != 1 || this.f3927b) {
            a2 += CodedOutputByteBufferNano.c(5, this.f3926a);
        }
        if (this.f != 1 || this.g) {
            a2 += CodedOutputByteBufferNano.c(6, this.f);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.l);
        }
        if (this.m != null && this.m.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.m.length; i2++) {
                hu huVar = this.m[i2];
                if (huVar != null) {
                    i += CodedOutputByteBufferNano.c(9, huVar);
                }
            }
            a2 = i;
        }
        if (this.e || this.d) {
            a2 += CodedOutputByteBufferNano.c(13) + 1;
        }
        if (this.k != null && this.k.length > 0) {
            int i3 = a2;
            for (int i4 = 0; i4 < this.k.length; i4++) {
                dw dwVar = this.k[i4];
                if (dwVar != null) {
                    i3 += CodedOutputByteBufferNano.d(14, dwVar);
                }
            }
            a2 = i3;
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(16, this.n);
        }
        if (this.h != null) {
            a2 += CodedOutputByteBufferNano.d(17, this.h);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i5 = 0; i5 < this.c.length; i5++) {
                hv hvVar = this.c[i5];
                if (hvVar != null) {
                    a2 += CodedOutputByteBufferNano.d(18, hvVar);
                }
            }
        }
        if (this.j || this.i) {
            return a2 + CodedOutputByteBufferNano.c(21) + 1;
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
                case 40:
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
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
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            this.f3926a = e;
                            this.f3927b = true;
                            break;
                    }
                case 48:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f = e2;
                            this.g = true;
                            break;
                    }
                case 58:
                    if (this.l == null) {
                        this.l = new hx();
                    }
                    aVar.a(this.l);
                    break;
                case 75:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 75);
                    int length = this.m == null ? 0 : this.m.length;
                    hu[] huVarArr = new hu[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.m, 0, huVarArr, 0, length);
                    }
                    while (length < huVarArr.length - 1) {
                        huVarArr[length] = new hu();
                        aVar.a(huVarArr[length], 9);
                        aVar.a();
                        length++;
                    }
                    huVarArr[length] = new hu();
                    aVar.a(huVarArr[length], 9);
                    this.m = huVarArr;
                    break;
                case 104:
                    this.d = aVar.b();
                    this.e = true;
                    break;
                case 114:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 114);
                    int length2 = this.k == null ? 0 : this.k.length;
                    dw[] dwVarArr = new dw[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.k, 0, dwVarArr, 0, length2);
                    }
                    while (length2 < dwVarArr.length - 1) {
                        dwVarArr[length2] = new dw();
                        aVar.a(dwVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    dwVarArr[length2] = new dw();
                    aVar.a(dwVarArr[length2]);
                    this.k = dwVarArr;
                    break;
                case 130:
                    if (this.n == null) {
                        this.n = new hw();
                    }
                    aVar.a(this.n);
                    break;
                case 138:
                    if (this.h == null) {
                        this.h = new kp();
                    }
                    aVar.a(this.h);
                    break;
                case 146:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 146);
                    int length3 = this.c == null ? 0 : this.c.length;
                    hv[] hvVarArr = new hv[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.c, 0, hvVarArr, 0, length3);
                    }
                    while (length3 < hvVarArr.length - 1) {
                        hvVarArr[length3] = new hv();
                        aVar.a(hvVarArr[length3]);
                        aVar.a();
                        length3++;
                    }
                    hvVarArr[length3] = new hv();
                    aVar.a(hvVarArr[length3]);
                    this.c = hvVarArr;
                    break;
                case 168:
                    this.i = aVar.b();
                    this.j = true;
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
