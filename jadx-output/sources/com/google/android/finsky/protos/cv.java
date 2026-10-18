package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class cv extends com.google.protobuf.nano.c {
    private static volatile cv[] k;

    /* renamed from: a, reason: collision with root package name */
    public String f3701a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3702b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;

    public static cv[] b() {
        if (k == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (k == null) {
                    k = new cv[0];
                }
            }
        }
        return k;
    }

    public cv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3702b || !this.f3701a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3701a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3702b || !this.f3701a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3701a);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(3) + 1;
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.g);
        }
        if (this.j || !this.i.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.i);
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
                    this.f3701a = aVar.c();
                    this.f3702b = true;
                    break;
                case 16:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 24:
                    this.e = aVar.b();
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
