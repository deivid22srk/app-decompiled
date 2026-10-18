package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class y extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public z[] f4419a = z.b();

    /* renamed from: b, reason: collision with root package name */
    public z[] f4420b = z.b();

    public y() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4419a != null && this.f4419a.length > 0) {
            for (int i = 0; i < this.f4419a.length; i++) {
                z zVar = this.f4419a[i];
                if (zVar != null) {
                    codedOutputByteBufferNano.b(1, zVar);
                }
            }
        }
        if (this.f4420b != null && this.f4420b.length > 0) {
            for (int i2 = 0; i2 < this.f4420b.length; i2++) {
                z zVar2 = this.f4420b[i2];
                if (zVar2 != null) {
                    codedOutputByteBufferNano.b(2, zVar2);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4419a != null && this.f4419a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f4419a.length; i2++) {
                z zVar = this.f4419a[i2];
                if (zVar != null) {
                    i += CodedOutputByteBufferNano.d(1, zVar);
                }
            }
            a2 = i;
        }
        if (this.f4420b != null && this.f4420b.length > 0) {
            for (int i3 = 0; i3 < this.f4420b.length; i3++) {
                z zVar2 = this.f4420b[i3];
                if (zVar2 != null) {
                    a2 += CodedOutputByteBufferNano.d(2, zVar2);
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4419a == null ? 0 : this.f4419a.length;
                    z[] zVarArr = new z[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4419a, 0, zVarArr, 0, length);
                    }
                    while (length < zVarArr.length - 1) {
                        zVarArr[length] = new z();
                        aVar.a(zVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    zVarArr[length] = new z();
                    aVar.a(zVarArr[length]);
                    this.f4419a = zVarArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f4420b == null ? 0 : this.f4420b.length;
                    z[] zVarArr2 = new z[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f4420b, 0, zVarArr2, 0, length2);
                    }
                    while (length2 < zVarArr2.length - 1) {
                        zVarArr2[length2] = new z();
                        aVar.a(zVarArr2[length2]);
                        aVar.a();
                        length2++;
                    }
                    zVarArr2[length2] = new z();
                    aVar.a(zVarArr2[length2]);
                    this.f4420b = zVarArr2;
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
