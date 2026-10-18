package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class lc extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public dp f4072a = null;

    /* renamed from: b, reason: collision with root package name */
    public String f4073b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;
    public String f = "";
    public boolean g = false;
    public ds[] h = ds.b();
    public String i = "";
    public boolean j = false;

    public lc() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4072a != null) {
            codedOutputByteBufferNano.b(1, this.f4072a);
        }
        if (this.c || !this.f4073b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4073b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            codedOutputByteBufferNano.a(4, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            for (int i = 0; i < this.h.length; i++) {
                ds dsVar = this.h[i];
                if (dsVar != null) {
                    codedOutputByteBufferNano.b(5, dsVar);
                }
            }
        }
        if (this.j || !this.i.equals("")) {
            codedOutputByteBufferNano.a(6, this.i);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4072a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f4072a);
        }
        if (this.c || !this.f4073b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4073b);
        }
        if (this.e || !this.d.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.d);
        }
        if (this.g || !this.f.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.f);
        }
        if (this.h != null && this.h.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.h.length; i2++) {
                ds dsVar = this.h[i2];
                if (dsVar != null) {
                    i += CodedOutputByteBufferNano.d(5, dsVar);
                }
            }
            a2 = i;
        }
        if (this.j || !this.i.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(6, this.i);
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
                    if (this.f4072a == null) {
                        this.f4072a = new dp();
                    }
                    aVar.a(this.f4072a);
                    break;
                case 18:
                    this.f4073b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
                    break;
                case 34:
                    this.f = aVar.c();
                    this.g = true;
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.h == null ? 0 : this.h.length;
                    ds[] dsVarArr = new ds[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.h, 0, dsVarArr, 0, length);
                    }
                    while (length < dsVarArr.length - 1) {
                        dsVarArr[length] = new ds();
                        aVar.a(dsVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dsVarArr[length] = new ds();
                    aVar.a(dsVarArr[length]);
                    this.h = dsVarArr;
                    break;
                case 50:
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
