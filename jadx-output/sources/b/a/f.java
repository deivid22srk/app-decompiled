package b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class f extends com.google.protobuf.nano.c {
    private static volatile f[] f;

    /* renamed from: a, reason: collision with root package name */
    public String f882a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f883b = "";
    public long c = -1;
    public long d = -1;
    public String e = "";

    public static f[] b() {
        if (f == null) {
            synchronized (com.google.protobuf.nano.b.f7877a) {
                if (f == null) {
                    f = new f[0];
                }
            }
        }
        return f;
    }

    public f() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f882a.equals("")) {
            codedOutputByteBufferNano.a(1, this.f882a);
        }
        if (!this.f883b.equals("")) {
            codedOutputByteBufferNano.a(2, this.f883b);
        }
        if (this.c != -1) {
            codedOutputByteBufferNano.b(3, this.c);
        }
        if (this.d != -1) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (!this.e.equals("")) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (!this.f882a.equals("")) {
            a2 += CodedOutputByteBufferNano.b(1, this.f882a);
        }
        if (!this.f883b.equals("")) {
            a2 += CodedOutputByteBufferNano.b(2, this.f883b);
        }
        if (this.c != -1) {
            a2 += CodedOutputByteBufferNano.e(3, this.c);
        }
        if (this.d != -1) {
            a2 += CodedOutputByteBufferNano.e(4, this.d);
        }
        if (!this.e.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(5, this.e);
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
                    this.f882a = aVar.c();
                    break;
                case 18:
                    this.f883b = aVar.c();
                    break;
                case 24:
                    this.c = aVar.f();
                    break;
                case 32:
                    this.d = aVar.f();
                    break;
                case 42:
                    this.e = aVar.c();
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
