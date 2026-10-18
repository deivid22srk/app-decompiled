package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lt extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f4097a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4098b = false;
    public String c = "";
    public boolean d = false;
    public lu e = null;
    public cj f = null;
    public p g = null;
    public String h = "";
    public boolean i = false;
    public nj j = null;
    public String k = "";
    public boolean l = false;
    public gx m = null;
    public dp n = null;
    public byte[] o = com.google.protobuf.nano.e.h;
    public boolean p = false;
    public pb q = null;
    public k r = null;
    public jb[] s = jb.b();

    public lt() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4097a != 1 || this.f4098b) {
            codedOutputByteBufferNano.a(1, this.f4097a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.g != null) {
            codedOutputByteBufferNano.b(5, this.g);
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(6, this.h);
        }
        if (this.j != null) {
            codedOutputByteBufferNano.b(7, this.j);
        }
        if (this.l || !this.k.equals("")) {
            codedOutputByteBufferNano.a(8, this.k);
        }
        if (this.n != null) {
            codedOutputByteBufferNano.b(10, this.n);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(11, this.m);
        }
        if (this.p || !Arrays.equals(this.o, com.google.protobuf.nano.e.h)) {
            codedOutputByteBufferNano.a(12, this.o);
        }
        if (this.q != null) {
            codedOutputByteBufferNano.b(13, this.q);
        }
        if (this.r != null) {
            codedOutputByteBufferNano.b(14, this.r);
        }
        if (this.s != null && this.s.length > 0) {
            for (int i = 0; i < this.s.length; i++) {
                jb jbVar = this.s[i];
                if (jbVar != null) {
                    codedOutputByteBufferNano.b(15, jbVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4097a != 1 || this.f4098b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4097a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.g != null) {
            a2 += CodedOutputByteBufferNano.d(5, this.g);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.h);
        }
        if (this.j != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.j);
        }
        if (this.l || !this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(8, this.k);
        }
        if (this.n != null) {
            a2 += CodedOutputByteBufferNano.d(10, this.n);
        }
        if (this.m != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.m);
        }
        if (this.p || !Arrays.equals(this.o, com.google.protobuf.nano.e.h)) {
            a2 += CodedOutputByteBufferNano.b(12, this.o);
        }
        if (this.q != null) {
            a2 += CodedOutputByteBufferNano.d(13, this.q);
        }
        if (this.r != null) {
            a2 += CodedOutputByteBufferNano.d(14, this.r);
        }
        if (this.s != null && this.s.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.s.length; i2++) {
                jb jbVar = this.s[i2];
                if (jbVar != null) {
                    i += CodedOutputByteBufferNano.d(15, jbVar);
                }
            }
            return i;
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
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f4097a = e;
                            this.f4098b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new lu();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new cj();
                    }
                    aVar.a(this.f);
                    break;
                case 42:
                    if (this.g == null) {
                        this.g = new p();
                    }
                    aVar.a(this.g);
                    break;
                case 50:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 58:
                    if (this.j == null) {
                        this.j = new nj();
                    }
                    aVar.a(this.j);
                    break;
                case 66:
                    this.k = aVar.c();
                    this.l = true;
                    break;
                case 82:
                    if (this.n == null) {
                        this.n = new dp();
                    }
                    aVar.a(this.n);
                    break;
                case 90:
                    if (this.m == null) {
                        this.m = new gx();
                    }
                    aVar.a(this.m);
                    break;
                case 98:
                    this.o = aVar.d();
                    this.p = true;
                    break;
                case 106:
                    if (this.q == null) {
                        this.q = new pb();
                    }
                    aVar.a(this.q);
                    break;
                case 114:
                    if (this.r == null) {
                        this.r = new k();
                    }
                    aVar.a(this.r);
                    break;
                case 122:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 122);
                    int length = this.s == null ? 0 : this.s.length;
                    jb[] jbVarArr = new jb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.s, 0, jbVarArr, 0, length);
                    }
                    while (length < jbVarArr.length - 1) {
                        jbVarArr[length] = new jb();
                        aVar.a(jbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    jbVarArr[length] = new jb();
                    aVar.a(jbVarArr[length]);
                    this.s = jbVarArr;
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
