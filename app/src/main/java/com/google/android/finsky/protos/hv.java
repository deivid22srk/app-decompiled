package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class hv extends com.google.protobuf.nano.c {
    private static volatile hv[] d;

    /* renamed from: a, reason: collision with root package name */
    public int f3930a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3931b = false;
    public String[] c = com.google.protobuf.nano.e.f;

    public static hv[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new hv[0];
                }
            }
        }
        return d;
    }

    public hv() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f3930a != 1 || this.f3931b) {
            codedOutputByteBufferNano.a(1, this.f3930a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                String str = this.c[i];
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f3930a != 1 || this.f3931b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f3930a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < this.c.length; i3++) {
                String str = this.c[i3];
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
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.f3930a = e;
                            this.f3931b = true;
                            break;
                    }
                case 18:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length = this.c == null ? 0 : this.c.length;
                    String[] strArr = new String[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, strArr, 0, length);
                    }
                    while (length < strArr.length - 1) {
                        strArr[length] = aVar.c();
                        aVar.a();
                        length++;
                    }
                    strArr[length] = aVar.c();
                    this.c = strArr;
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
