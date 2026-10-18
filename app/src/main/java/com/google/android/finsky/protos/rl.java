package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class rl extends com.google.protobuf.nano.c {
    private static volatile rl[] d;

    /* renamed from: a, reason: collision with root package name */
    public String f4341a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f4342b = false;
    public rb[] c = rb.b();

    public static rl[] b() {
        if (d == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (d == null) {
                    d = new rl[0];
                }
            }
        }
        return d;
    }

    public rl() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f4342b || !this.f4341a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f4341a);
        }
        if (this.c != null && this.c.length > 0) {
            for (int i = 0; i < this.c.length; i++) {
                rb rbVar = this.c[i];
                if (rbVar != null) {
                    codedOutputByteBufferNano.b(3, rbVar);
                }
            }
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f4342b || !this.f4341a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f4341a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.c.length; i2++) {
                rb rbVar = this.c[i2];
                if (rbVar != null) {
                    i += CodedOutputByteBufferNano.d(3, rbVar);
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
                case 10:
                    this.f4341a = aVar.c();
                    this.f4342b = true;
                    break;
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.c == null ? 0 : this.c.length;
                    rb[] rbVarArr = new rb[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.c, 0, rbVarArr, 0, length);
                    }
                    while (length < rbVarArr.length - 1) {
                        rbVarArr[length] = new rb();
                        aVar.a(rbVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    rbVarArr[length] = new rb();
                    aVar.a(rbVarArr[length]);
                    this.c = rbVarArr;
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
