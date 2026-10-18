package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class p extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public String f4233a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4234b = false;
    public String c = "";
    public boolean d = false;
    public l e = null;
    public jb f = null;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;
    public ds k = null;

    public p() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4234b || !this.f4233a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4233a);
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
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        if (this.k != null) {
            codedOutputByteBufferNano.b(7, this.k);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4234b || !this.f4233a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4233a);
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
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.g);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.i);
        }
        if (this.k != null) {
            return a2 + CodedOutputByteBufferNano.d(7, this.k);
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
                    this.f4233a = aVar.c();
                    this.f4234b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new l();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new jb();
                    }
                    aVar.a(this.f);
                    break;
                case 42:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 50:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 58:
                    if (this.k == null) {
                        this.k = new ds();
                    }
                    aVar.a(this.k);
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
