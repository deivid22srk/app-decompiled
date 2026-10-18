package com.google.b.a.a.a.b.a.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7642a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7643b = com.google.protobuf.nano.e.h;
    public t[] c = t.b();
    public String d = "";

    public s() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7642a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7642a);
        }
        if (!Arrays.equals(this.f7643b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7643b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                t tVar = this.c[i];
                if (tVar != null) {
                    codedOutputByteBufferNano.b(3, tVar);
                }
            }
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7642a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7642a);
        }
        if (!Arrays.equals(this.f7643b, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7643b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                t tVar = this.c[i2];
                if (tVar != null) {
                    i += CodedOutputByteBufferNano.d(3, tVar);
                }
            }
            a2 = i;
        }
        if (!this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(4, this.d);
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
                    this.f7642a = aVar.c();
                    break;
                case 18:
                    this.f7643b = aVar.d();
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    t[] tVarArr = new t[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, tVarArr, 0, length);
                    }
                    while (length < tVarArr.length - 1) {
                        tVarArr[length] = new t();
                        aVar.a(tVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    tVarArr[length] = new t();
                    aVar.a(tVarArr[length]);
                    this.c = tVarArr;
                    break;
                case 34:
                    this.d = aVar.c();
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
