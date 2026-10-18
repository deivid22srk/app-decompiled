package com.google.b.a.a.a.b.a.apkg.bpkg.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class e extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f7567a = "";

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7568b = com.google.protobuf.nano.e.h;
    public String c = "";
    public g[] d = g.b();
    public s[] e = s.b();
    public byte[] f = com.google.protobuf.nano.e.h;

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7567a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7567a);
        }
        if (!Arrays.equals(this.f7568b, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(2, this.f7568b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (int i = 0; i < this.d.length; i++) {
                g gVar = this.d[i];
                if (gVar != null) {
                    codedOutputByteBufferNano.b(5, gVar);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (int i2 = 0; i2 < this.e.length; i2++) {
                s sVar = this.e[i2];
                if (sVar != null) {
                    codedOutputByteBufferNano.b(6, sVar);
                }
            }
        }
        if (!Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(7, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7567a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7567a);
        }
        if (!Arrays.equals(this.f7568b, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7568b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.d.length; i2++) {
                g gVar = this.d[i2];
                if (gVar != null) {
                    i += CodedOutputByteBufferNano.d(5, gVar);
                }
            }
            a2 = i;
        }
        if (this.e != null && this.e.length > 0) {
            for (int i3 = 0; i3 < this.e.length; i3++) {
                s sVar = this.e[i3];
                if (sVar != null) {
                    a2 += CodedOutputByteBufferNano.d(6, sVar);
                }
            }
        }
        if (!Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            return a2 + CodedOutputByteBufferNano.b(7, this.f);
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
                    this.f7567a = aVar.c();
                    break;
                case 18:
                    this.f7568b = aVar.d();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.d == null ? 0 : this.d.length;
                    g[] gVarArr = new g[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.d, 0, gVarArr, 0, length);
                    }
                    while (length < gVarArr.length - 1) {
                        gVarArr[length] = new g();
                        aVar.a(gVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    gVarArr[length] = new g();
                    aVar.a(gVarArr[length]);
                    this.d = gVarArr;
                    break;
                case 50:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 50);
                    int length2 = this.e == null ? 0 : this.e.length;
                    s[] sVarArr = new s[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.e, 0, sVarArr, 0, length2);
                    }
                    while (length2 < sVarArr.length - 1) {
                        sVarArr[length2] = new s();
                        aVar.a(sVarArr[length2]);
                        aVar.a();
                        length2++;
                    }
                    sVarArr[length2] = new s();
                    aVar.a(sVarArr[length2]);
                    this.e = sVarArr;
                    break;
                case 58:
                    this.f = aVar.d();
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
