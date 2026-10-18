package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class mo extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public mp f4138a = null;

    /* renamed from: b, reason: collision with root package name */
    public cn f4139b = null;
    public mc c = null;
    public mb d = null;
    public jb[] e = jb.b();
    public byte[] f = com.google.protobuf.nano.e.h;
    public boolean g = false;

    public mo() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4138a != null) {
            codedOutputByteBufferNano.b(1, this.f4138a);
        }
        if (this.f4139b != null) {
            codedOutputByteBufferNano.b(2, this.f4139b);
        }
        if (this.c != null) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                jb jbVar = this.e[i];
                if (jbVar != null) {
                    codedOutputByteBufferNano.b(4, jbVar);
                }
            }
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(5, this.f);
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(8, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4138a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4138a);
        }
        if (this.f4139b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4139b);
        }
        if (this.c != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.c);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                jb jbVar = this.e[i2];
                if (jbVar != null) {
                    i += CodedOutputByteBufferNano.d(4, jbVar);
                }
            }
            a2 = i;
        }
        if (this.g || !Arrays.equals(this.f, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(5, this.f);
        }
        if (this.d != null) {
            return a2 + CodedOutputByteBufferNano.d(8, this.d);
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
                    if (this.f4138a == null) {
                        this.f4138a = new mp();
                    }
                    aVar.a(this.f4138a);
                    break;
                case 18:
                    if (this.f4139b == null) {
                        this.f4139b = new cn();
                    }
                    aVar.a(this.f4139b);
                    break;
                case 26:
                    if (this.c == null) {
                        this.c = new mc();
                    }
                    aVar.a(this.c);
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.e == null ? 0 : this.e.length;
                    jb[] jbVarArr = new jb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, jbVarArr, 0, length);
                    }
                    while (length < jbVarArr.length - 1) {
                        jbVarArr[length] = new jb();
                        aVar.a(jbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jbVarArr[length] = new jb();
                    aVar.a(jbVarArr[length]);
                    this.e = jbVarArr;
                    break;
                case 42:
                    this.f = aVar.d();
                    this.g = true;
                    break;
                case 66:
                    if (this.d == null) {
                        this.d = new mb();
                    }
                    aVar.a(this.d);
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
