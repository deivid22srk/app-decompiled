package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class me extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public mp f4119a = null;

    /* renamed from: b, reason: collision with root package name */
    public cn f4120b = null;
    public jb[] c = jb.b();
    public aa d = null;
    public byte[] e = com.google.protobuf.nano.e.h;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public p i = null;
    public md j = null;
    public k k = null;
    public bk l = null;

    public me() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4119a != null) {
            codedOutputByteBufferNano.b(1, this.f4119a);
        }
        if (this.f4120b != null) {
            codedOutputByteBufferNano.b(2, this.f4120b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                jb jbVar = this.c[i];
                if (jbVar != null) {
                    codedOutputByteBufferNano.b(3, jbVar);
                }
            }
        }
        if (this.d != null) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(6, this.g);
        }
        if (this.i != null) {
            codedOutputByteBufferNano.b(7, this.i);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(8, this.j);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(9, this.k);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(10, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4119a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4119a);
        }
        if (this.f4120b != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.f4120b);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                jb jbVar = this.c[i2];
                if (jbVar != null) {
                    i += CodedOutputByteBufferNano.d(3, jbVar);
                }
            }
            a2 = i;
        }
        if (this.d != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.d);
        }
        if (this.f || !Arrays.equals(this.e, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(5, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.g);
        }
        if (this.i != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.i);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(8, this.j);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(9, this.k);
        }
        if (this.l != null) {
            return a2 + CodedOutputByteBufferNano.d(10, this.l);
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
                    if (this.f4119a == null) {
                        this.f4119a = new mp();
                    }
                    aVar.a(this.f4119a);
                    break;
                case 18:
                    if (this.f4120b == null) {
                        this.f4120b = new cn();
                    }
                    aVar.a(this.f4120b);
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    jb[] jbVarArr = new jb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, jbVarArr, 0, length);
                    }
                    while (length < jbVarArr.length - 1) {
                        jbVarArr[length] = new jb();
                        aVar.a(jbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jbVarArr[length] = new jb();
                    aVar.a(jbVarArr[length]);
                    this.c = jbVarArr;
                    break;
                case 34:
                    if (this.d == null) {
                        this.d = new aa();
                    }
                    aVar.a(this.d);
                    break;
                case 42:
                    this.e = aVar.d();
                    this.f = true;
                    break;
                case 50:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 58:
                    if (this.i == null) {
                        this.i = new p();
                    }
                    aVar.a(this.i);
                    break;
                case 66:
                    if (this.j == null) {
                        this.j = new md();
                    }
                    aVar.a(this.j);
                    break;
                case 74:
                    if (this.k == null) {
                        this.k = new k();
                    }
                    aVar.a(this.k);
                    break;
                case 82:
                    if (this.l == null) {
                        this.l = new bk();
                    }
                    aVar.a(this.l);
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
