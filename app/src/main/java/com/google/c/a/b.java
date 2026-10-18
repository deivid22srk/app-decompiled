package com.google.c.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.e;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public String f7728a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f7729b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public String o = "";
    public String p = "";
    public String[] q = com.google.protobuf.nano.e.f;
    public String r = "";
    public String s = "";
    public String t = "";

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f7728a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f7728a);
        }
        if (!this.f7729b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f7729b);
        }
        if (!this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(4, this.e);
        }
        if (!this.f.equals("")) {
            codedOutputByteBufferNano.a(5, this.f);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.a(6, this.h);
        }
        if (!this.i.equals("")) {
            codedOutputByteBufferNano.a(11, this.i);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.a(12, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.a(13, this.l);
        }
        if (this.q != null && this.q.length > 0) {
            for (int i = 0; i < this.q.length; i++) {
                String str = this.q[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(14, str);
                }
            }
        }
        if (!this.o.equals("")) {
            codedOutputByteBufferNano.a(15, this.o);
        }
        if (!this.p.equals("")) {
            codedOutputByteBufferNano.a(16, this.p);
        }
        if (!this.g.equals("")) {
            codedOutputByteBufferNano.a(17, this.g);
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.a(21, this.j);
        }
        if (!this.c.equals("")) {
            codedOutputByteBufferNano.a(26, this.c);
        }
        if (!this.r.equals("")) {
            codedOutputByteBufferNano.a(27, this.r);
        }
        if (!this.s.equals("")) {
            codedOutputByteBufferNano.a(28, this.s);
        }
        if (!this.m.equals("")) {
            codedOutputByteBufferNano.a(29, this.m);
        }
        if (!this.n.equals("")) {
            codedOutputByteBufferNano.a(30, this.n);
        }
        if (!this.t.equals("")) {
            codedOutputByteBufferNano.a(1150, this.t);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f7728a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f7728a);
        }
        if (!this.f7729b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f7729b);
        }
        if (!this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (!this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.e);
        }
        if (!this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.f);
        }
        if (!this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.h);
        }
        if (!this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.i);
        }
        if (!this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(12, this.k);
        }
        if (!this.l.equals("")) {
            a2 += CodedOutputByteBufferNano.b(13, this.l);
        }
        if (this.q != null && this.q.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.q.length; i3++) {
                String str = this.q[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i + (i2 * 1);
        }
        if (!this.o.equals("")) {
            a2 += CodedOutputByteBufferNano.b(15, this.o);
        }
        if (!this.p.equals("")) {
            a2 += CodedOutputByteBufferNano.b(16, this.p);
        }
        if (!this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(17, this.g);
        }
        if (!this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(21, this.j);
        }
        if (!this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(26, this.c);
        }
        if (!this.r.equals("")) {
            a2 += CodedOutputByteBufferNano.b(27, this.r);
        }
        if (!this.s.equals("")) {
            a2 += CodedOutputByteBufferNano.b(28, this.s);
        }
        if (!this.m.equals("")) {
            a2 += CodedOutputByteBufferNano.b(29, this.m);
        }
        if (!this.n.equals("")) {
            a2 += CodedOutputByteBufferNano.b(30, this.n);
        }
        if (!this.t.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(1150, this.t);
        }
        return a2;
    }

    @Override // com.google.protobuf.nano.c
    public final /* synthetic */ c a(com.google.protobuf.nano.a aVar) {
        while (true) {
            int a2 = aVar.a();
            switch (a2) {
                case 0:
                    break;
                case 10:
                    this.f7728a = aVar.c();
                    break;
                case 18:
                    this.f7729b = aVar.c();
                    break;
                case 26:
                    this.d = aVar.c();
                    break;
                case 34:
                    this.e = aVar.c();
                    break;
                case 42:
                    this.f = aVar.c();
                    break;
                case 50:
                    this.h = aVar.c();
                    break;
                case 90:
                    this.i = aVar.c();
                    break;
                case 98:
                    this.k = aVar.c();
                    break;
                case 106:
                    this.l = aVar.c();
                    break;
                case 114:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 114);
                    int length = this.q == null ? 0 : this.q.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.q, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.q = strArr;
                    break;
                case 122:
                    this.o = aVar.c();
                    break;
                case 130:
                    this.p = aVar.c();
                    break;
                case 138:
                    this.g = aVar.c();
                    break;
                case 170:
                    this.j = aVar.c();
                    break;
                case 210:
                    this.c = aVar.c();
                    break;
                case 218:
                    this.r = aVar.c();
                    break;
                case 226:
                    this.s = aVar.c();
                    break;
                case 234:
                    this.m = aVar.c();
                    break;
                case 242:
                    this.n = aVar.c();
                    break;
                case 9202:
                    this.t = aVar.c();
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
