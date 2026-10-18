package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class jd extends com.google.protobuf.nano.c {
    private static volatile jd[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f3988a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f3989b = false;
    public int c = 0;
    public boolean d = false;
    public np e = null;

    public static jd[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new jd[0];
                }
            }
        }
        return f;
    }

    public jd() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3989b || !this.f3988a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f3988a);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(2, this.e);
        }
        if (this.c != 0 || this.d) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3989b || !this.f3988a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f3988a);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(2, this.e);
        }
        if (this.c != 0 || this.d) {
            return a2 + CodedOutputByteBufferNano.c(3, this.c);
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
                    this.f3988a = aVar.c();
                    this.f3989b = true;
                    break;
                case 18:
                    if (this.e == null) {
                        this.e = new np();
                    }
                    aVar.a(this.e);
                    break;
                case 24:
                    int e = aVar.e();
                    switch (e) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.c = e;
                            this.d = true;
                            break;
                    }
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
