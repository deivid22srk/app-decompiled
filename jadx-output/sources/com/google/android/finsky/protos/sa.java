package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class sa extends com.google.protobuf.nano.c {
    private static volatile sa[] h;

    /* renamed from: a, reason: collision with root package name */
    public String f4367a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4368b = false;
    public String c = "";
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public sb[] g = sb.b();

    public static sa[] b() {
        if (h == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (h == null) {
                    h = new sa[0];
                }
            }
        }
        return h;
    }

    public sa() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4368b || !this.f4367a.equals("")) {
            codedOutputByteBufferNano.a(3, this.f4367a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(4, this.c);
        }
        if (this.f || this.e) {
            codedOutputByteBufferNano.a(6, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i = 0; i < this.g.length; i++) {
                sb sbVar = this.g[i];
                if (sbVar != null) {
                    codedOutputByteBufferNano.a(7, sbVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4368b || !this.f4367a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.f4367a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(4, this.c);
        }
        if (this.f || this.e) {
            a2 += CodedOutputByteBufferNano.c(6) + 1;
        }
        if (this.g != null && this.g.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.g.length; i2++) {
                sb sbVar = this.g[i2];
                if (sbVar != null) {
                    i += CodedOutputByteBufferNano.c(7, sbVar);
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
                case 26:
                    this.f4367a = aVar.c();
                    this.f4368b = true;
                    break;
                case 34:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 48:
                    this.e = aVar.b();
                    this.f = true;
                    break;
                case 59:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 59);
                    int length = this.g == null ? 0 : this.g.length;
                    sb[] sbVarArr = new sb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.g, 0, sbVarArr, 0, length);
                    }
                    while (length < sbVarArr.length - 1) {
                        sbVarArr[length] = new sb();
                        aVar.a(sbVarArr[length], 7);
                        aVar.a();
                        length++;
                    }
                    sbVarArr[length] = new sb();
                    aVar.a(sbVarArr[length], 7);
                    this.g = sbVarArr;
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
