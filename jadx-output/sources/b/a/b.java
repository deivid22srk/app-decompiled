package b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class b extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public c f874a = null;

    /* renamed from: b, reason: collision with root package name */
    public d f875b = null;

    public b() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f874a != null) {
            codedOutputByteBufferNano.b(1, this.f874a);
        }
        if (this.f875b != null) {
            codedOutputByteBufferNano.b(2, this.f875b);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f874a != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.f874a);
        }
        if (this.f875b != null) {
            return a2 + CodedOutputByteBufferNano.d(2, this.f875b);
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
                    if (this.f874a == null) {
                        this.f874a = new c();
                    }
                    aVar.a(this.f874a);
                    break;
                case 18:
                    if (this.f875b == null) {
                        this.f875b = new d();
                    }
                    aVar.a(this.f875b);
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
