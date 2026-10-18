package ba2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class c extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public int f876a = 100;

    /* renamed from: b, reason: collision with root package name */
    public String f877b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public long f = 0;
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";

    public c() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f876a != 100) {
            codedOutputByteBufferNano.a(1, this.f876a);
        }
        if (!this.f877b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f877b);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(5, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        if (this.f != 0) {
            codedOutputByteBufferNano.b(7, this.f);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(9, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.a(10, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.a(11, this.i);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.a(12, this.j);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.a(13, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.a(15, this.l);
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.a(21, this.m);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f876a != 100) {
            a2 += CodedOutputByteBufferNano.c(1, this.f876a);
        }
        if (!this.f877b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f877b);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.c);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.d);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.e);
        }
        if (this.f != 0) {
            a2 += CodedOutputByteBufferNano.e(7, this.f);
        }
        if (!this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.g);
        }
        if (!this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(10, this.h);
        }
        if (!this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.i);
        }
        if (!this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.j);
        }
        if (!this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.k);
        }
        if (!this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.l);
        }
        if (!this.m.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(21, this.m);
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
                        case 100:
                            this.f876a = e;
                            break;
                    }
                case 18:
                    this.f877b = aVar.c();
                    break;
                case 26:
                    this.c = aVar.c();
                    break;
                case 42:
                    this.d = aVar.c();
                    break;
                case 50:
                    this.e = aVar.c();
                    break;
                case 56:
                    this.f = aVar.f();
                    break;
                case 74:
                    this.g = aVar.c();
                    break;
                case 82:
                    this.h = aVar.c();
                    break;
                case 90:
                    this.i = aVar.c();
                    break;
                case 98:
                    this.j = aVar.c();
                    break;
                case 106:
                    this.k = aVar.c();
                    break;
                case 122:
                    this.l = aVar.c();
                    break;
                case 170:
                    this.m = aVar.c();
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
