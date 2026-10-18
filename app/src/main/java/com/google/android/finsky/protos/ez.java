package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ez extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3806a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3807b = false;
    public af[] c = af.b();
    public boolean d = false;
    public boolean e = false;
    public af[] f = af.b();

    public ez() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3807b || this.f3806a) {
            codedOutputByteBufferNano.a(1, this.f3806a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                af afVar = this.c[i];
                if (afVar != null) {
                    codedOutputByteBufferNano.b(2, afVar);
                }
            }
        }
        if (this.e || this.d) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i2 = 0; i2 < this.f.length; i2++) {
                af afVar2 = this.f[i2];
                if (afVar2 != null) {
                    codedOutputByteBufferNano.b(4, afVar2);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3807b || this.f3806a) {
            a2 += CodedOutputByteBufferNano.c(1) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                af afVar = this.c[i2];
                if (afVar != null) {
                    i += CodedOutputByteBufferNano.d(2, afVar);
                }
            }
            a2 = i;
        }
        if (this.e || this.d) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.f != null && this.f.length > 0) {
            for (int i3 = 0; i3 < this.f.length; i3++) {
                af afVar2 = this.f[i3];
                if (afVar2 != null) {
                    a2 += CodedOutputByteBufferNano.d(4, afVar2);
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
                case 8:
                    this.f3806a = aVar.b();
                    this.f3807b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    af[] afVarArr = new af[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, afVarArr, 0, length);
                    }
                    while (length < afVarArr.length - 1) {
                        afVarArr[length] = new af();
                        aVar.a(afVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    afVarArr[length] = new af();
                    aVar.a(afVarArr[length]);
                    this.c = afVarArr;
                    break;
                case 24:
                    this.d = aVar.b();
                    this.e = true;
                    break;
                case 34:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length2 = this.f == null ? 0 : this.f.length;
                    af[] afVarArr2 = new af[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f, 0, afVarArr2, 0, length2);
                    }
                    while (length2 < afVarArr2.length - 1) {
                        afVarArr2[length2] = new af();
                        aVar.a(afVarArr2[length2]);
                        aVar.a();
                        length2++;
                    }
                    afVarArr2[length2] = new af();
                    aVar.a(afVarArr2[length2]);
                    this.f = afVarArr2;
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
