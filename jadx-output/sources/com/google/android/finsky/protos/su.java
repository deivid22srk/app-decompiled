package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class su extends com.google.protobuf.nano.c {
    private static volatile su[] f;

    /* renamed from: a, reason: collision with root package name */
    public ds[] f4404a = ds.b();

    /* renamed from: b, reason: collision with root package name */
    public String f4405b = "";
    public boolean c = false;
    public String d = "";
    public boolean e = false;

    public static su[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new su[0];
                }
            }
        }
        return f;
    }

    public su() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4404a != null && this.f4404a.length > 0) {
            for (int i = 0; i < this.f4404a.length; i++) {
                ds dsVar = this.f4404a[i];
                if (dsVar != null) {
                    codedOutputByteBufferNano.b(1, dsVar);
                }
            }
        }
        if (this.c || !this.f4405b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f4405b);
        }
        if (this.e || !this.d.equals("")) {
            codedOutputByteBufferNano.a(3, this.d);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4404a != null && this.f4404a.length > 0) {
            for (int i = 0; i < this.f4404a.length; i++) {
                ds dsVar = this.f4404a[i];
                if (dsVar != null) {
                    a2 += CodedOutputByteBufferNano.d(1, dsVar);
                }
            }
        }
        if (this.c || !this.f4405b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f4405b);
        }
        if (this.e || !this.d.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(3, this.d);
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f4404a == null ? 0 : this.f4404a.length;
                    ds[] dsVarArr = new ds[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f4404a, 0, dsVarArr, 0, length);
                    }
                    while (length < dsVarArr.length - 1) {
                        dsVarArr[length] = new ds();
                        aVar.a(dsVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    dsVarArr[length] = new ds();
                    aVar.a(dsVarArr[length]);
                    this.f4404a = dsVarArr;
                    break;
                case 18:
                    this.f4405b = aVar.c();
                    this.c = true;
                    break;
                case 26:
                    this.d = aVar.c();
                    this.e = true;
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
