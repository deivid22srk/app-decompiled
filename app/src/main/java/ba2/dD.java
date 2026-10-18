package ba2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class dD extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public f[] f878a = f.b();

    /* renamed from: b, reason: collision with root package name */
    public String[] f879b = com.google.protobuf.nano.e.f;
    public int c = -1;
    public long d = -86400000;
    public e e = null;
    public boolean f = false;
    public boolean g = false;
    public String h = "";
    public String[] i = com.google.protobuf.nano.e.f;
    public String j = "";
    public String k = "";
    public String l = "";

    public dD() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.f878a != null && this.f878a.length > 0) {
            for (int i = 0; i < this.f878a.length; i++) {
                f fVar = this.f878a[i];
                if (fVar != null) {
                    codedOutputByteBufferNano.b(1, fVar);
                }
            }
        }
        if (this.f879b != null && this.f879b.length > 0) {
            for (int i2 = 0; i2 < this.f879b.length; i2++) {
                String str = this.f879b[i2];
                if (str != null) {
                    codedOutputByteBufferNano.a(2, str);
                }
            }
        }
        if (this.c != -1) {
            codedOutputByteBufferNano.a(3, this.c);
        }
        if (this.d != -86400000) {
            codedOutputByteBufferNano.b(4, this.d);
        }
        if (this.e != null) {
            codedOutputByteBufferNano.b(6, this.e);
        }
        if (this.f) {
            codedOutputByteBufferNano.a(7, this.f);
        }
        if (this.g) {
            codedOutputByteBufferNano.a(8, this.g);
        }
        if (!this.h.equals("")) {
            codedOutputByteBufferNano.a(9, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            for (int i3 = 0; i3 < this.i.length; i3++) {
                String str2 = this.i[i3];
                if (str2 != null) {
                    codedOutputByteBufferNano.a(10, str2);
                }
            }
        }
        if (!this.j.equals("")) {
            codedOutputByteBufferNano.a(11, this.j);
        }
        if (!this.k.equals("")) {
            codedOutputByteBufferNano.a(14, this.k);
        }
        if (!this.l.equals("")) {
            codedOutputByteBufferNano.a(15, this.l);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.f878a != null && this.f878a.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f878a.length; i2++) {
                f fVar = this.f878a[i2];
                if (fVar != null) {
                    i += CodedOutputByteBufferNano.d(1, fVar);
                }
            }
            a2 = i;
        }
        if (this.f879b != null && this.f879b.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.f879b.length; i5++) {
                String str = this.f879b[i5];
                if (str != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(str);
                }
            }
            a2 = a2 + i3 + (i4 * 1);
        }
        if (this.c != -1) {
            a2 += CodedOutputByteBufferNano.c(3, this.c);
        }
        if (this.d != -86400000) {
            a2 += CodedOutputByteBufferNano.e(4, this.d);
        }
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(6, this.e);
        }
        if (this.f) {
            a2 += CodedOutputByteBufferNano.c(7) + 1;
        }
        if (this.g) {
            a2 += CodedOutputByteBufferNano.c(8) + 1;
        }
        if (!this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(9, this.h);
        }
        if (this.i != null && this.i.length > 0) {
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < this.i.length; i8++) {
                String str2 = this.i[i8];
                if (str2 != null) {
                    i7++;
                    i6 += CodedOutputByteBufferNano.a(str2);
                }
            }
            a2 = a2 + i6 + (i7 * 1);
        }
        if (!this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(11, this.j);
        }
        if (!this.k.equals("")) {
            a2 += CodedOutputByteBufferNano.b(14, this.k);
        }
        if (!this.l.equals("")) {
            return a2 + CodedOutputByteBufferNano.b(15, this.l);
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
                    int b2 = com.google.protobuf.nano.e.b(aVar, 10);
                    int length = this.f878a == null ? 0 : this.f878a.length;
                    f[] fVarArr = new f[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f878a, 0, fVarArr, 0, length);
                    }
                    while (length < fVarArr.length - 1) {
                        fVarArr[length] = new f();
                        aVar.a(fVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    fVarArr[length] = new f();
                    aVar.a(fVarArr[length]);
                    this.f878a = fVarArr;
                    break;
                case 18:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 18);
                    int length2 = this.f879b == null ? 0 : this.f879b.length;
                    String[] strArr = new String[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.f879b, 0, strArr, 0, length2);
                    }
                    while (length2 < strArr.length - 1) {
                        strArr[length2] = aVar.c();
                        aVar.a();
                        length2++;
                    }
                    strArr[length2] = aVar.c();
                    this.f879b = strArr;
                    break;
                case 24:
                    this.c = aVar.e();
                    break;
                case 32:
                    this.d = aVar.f();
                    break;
                case 50:
                    if (this.e == null) {
                        this.e = new e();
                    }
                    aVar.a(this.e);
                    break;
                case 56:
                    this.f = aVar.b();
                    break;
                case 64:
                    this.g = aVar.b();
                    break;
                case 74:
                    this.h = aVar.c();
                    break;
                case 82:
                    int b4 = com.google.protobuf.nano.e.b(aVar, 82);
                    int length3 = this.i == null ? 0 : this.i.length;
                    String[] strArr2 = new String[b4 + length3];
                    if (length3 != 0) {
                        System.arraycopy(this.i, 0, strArr2, 0, length3);
                    }
                    while (length3 < strArr2.length - 1) {
                        strArr2[length3] = aVar.c();
                        aVar.a();
                        length3++;
                    }
                    strArr2[length3] = aVar.c();
                    this.i = strArr2;
                    break;
                case 90:
                    this.j = aVar.c();
                    break;
                case 114:
                    this.k = aVar.c();
                    break;
                case 122:
                    this.l = aVar.c();
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
