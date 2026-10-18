package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class bm extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f3638a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3639b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public jb k = null;
    public io l = null;
    public aa m = null;

    public bm() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3638a != 1 || this.f3639b) {
            codedOutputByteBufferNano.a(1, this.f3638a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(6, this.k);
        }
        if (this.l != null) {
            codedOutputByteBufferNano.b(7, this.l);
        }
        if (this.m != null) {
            codedOutputByteBufferNano.b(8, this.m);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3638a != 1 || this.f3639b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3638a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.k != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.k);
        }
        if (this.l != null) {
            a2 += CodedOutputByteBufferNano.d(7, this.l);
        }
        if (this.m != null) {
            return a2 + CodedOutputByteBufferNano.d(8, this.m);
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
                            this.f3638a = e;
                            this.f3639b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 34:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    if (this.k == null) {
                        this.k = new jb();
                    }
                    aVar.a(this.k);
                    break;
                case 58:
                    if (this.l == null) {
                        this.l = new io();
                    }
                    aVar.a(this.l);
                    break;
                case 66:
                    if (this.m == null) {
                        this.m = new aa();
                    }
                    aVar.a(this.m);
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
