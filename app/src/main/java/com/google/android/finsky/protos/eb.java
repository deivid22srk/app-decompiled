package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class eb extends com.google.protobuf.nano.c {
    private static volatile eb[] g;

    /* renamed from: a, reason: collision with root package name */
    public long f3765a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3766b = false;
    public String c = "";
    public boolean d = false;
    public ed e = null;
    public ec[] f = ec.b();

    public static eb[] b() {
        if (g == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (g == null) {
                    g = new eb[0];
                }
            }
        }
        return g;
    }

    public eb() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3766b || this.f3765a != 0) {
            codedOutputByteBufferNano.b(1, this.f3765a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (int i = 0; i < this.f.length; i++) {
                ec ecVar = this.f[i];
                if (ecVar != null) {
                    codedOutputByteBufferNano.b(4, ecVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3766b || this.f3765a != 0) {
            a2 += CodedOutputByteBufferNano.e(1, this.f3765a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f.length; i2++) {
                ec ecVar = this.f[i2];
                if (ecVar != null) {
                    i += CodedOutputByteBufferNano.d(4, ecVar);
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
                    this.f3765a = aVar.f();
                    this.f3766b = true;
                    break;
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new ed();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 34);
                    int length = this.f == null ? 0 : this.f.length;
                    ec[] ecVarArr = new ec[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f, 0, ecVarArr, 0, length);
                    }
                    while (length < ecVarArr.length - 1) {
                        ecVarArr[length] = new ec();
                        aVar.a(ecVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    ecVarArr[length] = new ec();
                    aVar.a(ecVarArr[length]);
                    this.f = ecVarArr;
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
