package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class iq extends com.google.protobuf.nano.c {
    private static volatile iq[] h;

    /* renamed from: a, reason: collision with root package name */
    public int f3965a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3966b = false;
    public boolean c = false;
    public boolean d = false;
    public cj e = null;
    public jv f = null;
    public String[] g = com.google.protobuf.nano.e.f;

    public static iq[] b() {
        if (h == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (h == null) {
                    h = new iq[0];
                }
            }
        }
        return h;
    }

    public iq() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3965a != 0 || this.f3966b) {
            codedOutputByteBufferNano.a(1, this.f3965a);
        }
        if (this.d || this.c) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(3, this.e);
        }
        if (this.f != null) {
            codedOutputByteBufferNano.b(4, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i = 0; i < this.g.length; i++) {
                String str = this.g[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(5, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3965a != 0 || this.f3966b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3965a);
        }
        if (this.d || this.c) {
            a2 += CodedOutputByteBufferNano.c(2) + 1;
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(3, this.e);
        }
        if (this.f != null) {
            a2 += CodedOutputByteBufferNano.d(4, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.g.length; i3++) {
                String str = this.g[i3];
                if (str != null) {
                    i2++;
                    i += CodedOutputByteBufferNano.a(str);
                }
            }
            return a2 + i + (i2 * 1);
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
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 13:
                        case 100:
                            this.f3965a = e;
                            this.f3966b = true;
                            break;
                    }
                case 16:
                    this.c = aVar.b();
                    this.d = true;
                    break;
                case 26:
                    if (this.e == null) {
                        this.e = new cj();
                    }
                    aVar.a(this.e);
                    break;
                case 34:
                    if (this.f == null) {
                        this.f = new jv();
                    }
                    aVar.a(this.f);
                    break;
                case 42:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length = this.g == null ? 0 : this.g.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.g, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.g = strArr;
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
