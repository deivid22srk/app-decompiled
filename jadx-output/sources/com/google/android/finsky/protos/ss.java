package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class ss extends com.google.protobuf.nano.c {
    private static volatile ss[] h;

    /* renamed from: a, reason: collision with root package name */
    public int f4400a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4401b = false;
    public String c = "";
    public boolean d = false;
    public String e = "";
    public boolean f = false;
    public st[] g = st.b();

    public static ss[] b() {
        if (h == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (h == null) {
                    h = new ss[0];
                }
            }
        }
        return h;
    }

    public ss() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4400a != 1 || this.f4401b) {
            codedOutputByteBufferNano.a(1, this.f4400a);
        }
        if (this.d || !this.c.equals("")) {
            codedOutputByteBufferNano.a(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            codedOutputByteBufferNano.a(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            for (int i = 0; i < this.g.length; i++) {
                st stVar = this.g[i];
                if (stVar != null) {
                    codedOutputByteBufferNano.a(4, stVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4400a != 1 || this.f4401b) {
            a2 += CodedOutputByteBufferNano.c(1, this.f4400a);
        }
        if (this.d || !this.c.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.c);
        }
        if (this.f || !this.e.equals("")) {
            a2 += CodedOutputByteBufferNano.b(3, this.e);
        }
        if (this.g != null && this.g.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.g.length; i2++) {
                st stVar = this.g[i2];
                if (stVar != null) {
                    i += CodedOutputByteBufferNano.c(4, stVar);
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
                    int e = aVar.e();
                    switch (e) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            this.f4400a = e;
                            this.f4401b = true;
                            break;
                    }
                case 18:
                    this.c = aVar.c();
                    this.d = true;
                    break;
                case 26:
                    this.e = aVar.c();
                    this.f = true;
                    break;
                case 35:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 35);
                    int length = this.g == null ? 0 : this.g.length;
                    st[] stVarArr = new st[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.g, 0, stVarArr, 0, length);
                    }
                    while (length < stVarArr.length - 1) {
                        stVarArr[length] = new st();
                        aVar.a(stVarArr[length], 4);
                        aVar.a();
                        length++;
                    }
                    stVarArr[length] = new st();
                    aVar.a(stVarArr[length], 4);
                    this.g = stVarArr;
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
