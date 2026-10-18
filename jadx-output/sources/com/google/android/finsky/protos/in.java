package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class in extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3959a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3960b = false;
    public long c = 0;
    public boolean d = false;
    public fw[] e = fw.b();
    public int f = 0;
    public boolean g = false;

    public in() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3959a != 0 || this.f3960b) {
            codedOutputByteBufferNano.a(1, this.f3959a);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                fw fwVar = this.e[i];
                if (fwVar != null) {
                    codedOutputByteBufferNano.b(3, fwVar);
                }
            }
        }
        if (this.g || this.f != 0) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3959a != 0 || this.f3960b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3959a);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(2, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                fw fwVar = this.e[i2];
                if (fwVar != null) {
                    i += CodedOutputByteBufferNano.d(3, fwVar);
                }
            }
            a2 = i;
        }
        if (this.g || this.f != 0) {
            return a2 + CodedOutputByteBufferNano.c(4, this.f);
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
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f3959a = e;
                            this.f3960b = true;
                            break;
                    }
                case 16:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.e == null ? 0 : this.e.length;
                    fw[] fwVarArr = new fw[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, fwVarArr, 0, length);
                    }
                    while (length < fwVarArr.length - 1) {
                        fwVarArr[length] = new fw();
                        aVar.a(fwVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    fwVarArr[length] = new fw();
                    aVar.a(fwVarArr[length]);
                    this.e = fwVarArr;
                    break;
                case 32:
                    this.f = aVar.e();
                    this.g = true;
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
