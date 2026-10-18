package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class n extends com.google.protobuf.nano.c {
    public static volatile n[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f6773a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6774b;
    public String c;
    public boolean d;

    public static n[] b() {
        if (e == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (e == null) {
                    e = new n[0];
                }
            }
        }
        return e;
    }

    public n() {
        c();
    }

    public final n c() {
        this.f6773a = "";
        this.f6774b = false;
        this.c = "";
        this.d = false;
        this.ar = -1;
        return this;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f6774b || !this.f6773a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f6773a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f6774b || !this.f6773a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f6773a);
        }
        if (this.d || !this.c.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(2, this.c);
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
                    this.f6773a = aVar.c();
                    this.f6774b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
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
