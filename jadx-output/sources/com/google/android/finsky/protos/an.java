package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class an extends com.google.protobuf.nano.c {
    private static volatile an[] k;

    /* renamed from: a, reason: collision with root package name */
    public String f3598a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3599b = false;
    public String c = "";
    public boolean d = false;
    public ds[] e = ds.b();
    public ds f = null;
    public String g = "";
    public boolean h = false;
    public String i = "";
    public boolean j = false;

    public static an[] b() {
        if (k == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (k == null) {
                    k = new an[0];
                }
            }
        }
        return k;
    }

    public an() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3599b || !this.f3598a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3598a);
        }
        if (this.e != null && this.e.length > 0) {
            for (int i = 0; i < this.e.length; i++) {
                ds dsVar = this.e[i];
                if (dsVar != null) {
                    codedOutputByteBufferNano.b(2, dsVar);
                }
            }
        }
        if (this.h || !this.g.equals("")) {
            codedOutputByteBufferNano.a(3, this.g);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(5, this.i);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(6, this.f);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3599b || !this.f3598a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3598a);
        }
        if (this.e != null && this.e.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.e.length; i2++) {
                ds dsVar = this.e[i2];
                if (dsVar != null) {
                    i += CodedOutputByteBufferNano.d(2, dsVar);
                }
            }
            a2 = i;
        }
        if (this.h || !this.g.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.g);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.c);
        }
        if (this.j || !this.i.equals("")) {
            a2 += CodedOutputByteBufferNano.b(5, this.i);
        }
        if (this.f != null) {
            return a2 + CodedOutputByteBufferNano.d(6, this.f);
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
                    this.f3598a = aVar.c();
                    this.f3599b = true;
                    break;
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.e == null ? 0 : this.e.length;
                    ds[] dsVarArr = new ds[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.e, 0, dsVarArr, 0, length);
                    }
                    while (length < dsVarArr.length - 1) {
                        dsVarArr[length] = new ds();
                        aVar.a(dsVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dsVarArr[length] = new ds();
                    aVar.a(dsVarArr[length]);
                    this.e = dsVarArr;
                    break;
                case 26:
                    this.g = aVar.c();
                    this.h = true;
                    break;
                case 34:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 42:
                    this.i = aVar.c();
                    this.j = true;
                    break;
                case 50:
                    if (this.f == null) {
                        this.f = new ds();
                    }
                    aVar.a(this.f);
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
