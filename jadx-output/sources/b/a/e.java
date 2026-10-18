package b.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class e extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public double f880a = 0.0d;

    /* renamed from: b, reason: collision with root package name */
    public double f881b = 0.0d;
    public double c = 0.0d;
    public float d = 0.0f;
    public double e = -1.0d;

    public e() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (Double.doubleToLongBits(this.f880a) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.a(1, this.f880a);
        }
        if (Double.doubleToLongBits(this.f881b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.a(2, this.f881b);
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            codedOutputByteBufferNano.a(4, this.d);
        }
        if (Double.doubleToLongBits(this.e) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.a(5, this.e);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (Double.doubleToLongBits(this.f880a) != Double.doubleToLongBits(0.0d)) {
            a2 += CodedOutputByteBufferNano.c(1) + 8;
        }
        if (Double.doubleToLongBits(this.f881b) != Double.doubleToLongBits(0.0d)) {
            a2 += CodedOutputByteBufferNano.c(2) + 8;
        }
        if (Double.doubleToLongBits(this.c) != Double.doubleToLongBits(0.0d)) {
            a2 += CodedOutputByteBufferNano.c(3) + 8;
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            a2 += CodedOutputByteBufferNano.c(4) + 4;
        }
        if (Double.doubleToLongBits(this.e) != Double.doubleToLongBits(-1.0d)) {
            return a2 + CodedOutputByteBufferNano.c(5) + 8;
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
                case 9:
                    this.f880a = Double.longBitsToDouble(aVar.h());
                    break;
                case 17:
                    this.f881b = Double.longBitsToDouble(aVar.h());
                    break;
                case 25:
                    this.c = Double.longBitsToDouble(aVar.h());
                    break;
                case 37:
                    this.d = Float.intBitsToFloat(aVar.g());
                    break;
                case 41:
                    this.e = Double.longBitsToDouble(aVar.h());
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
