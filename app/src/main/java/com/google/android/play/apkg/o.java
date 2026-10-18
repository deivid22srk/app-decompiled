package com.google.android.play.apkg;

import com.google.protobuf.nano.CodedOutputByteBufferNano;

/* loaded from: classes.dex */
public final class o extends com.google.protobuf.nano.c {

    /* renamed from: a, reason: collision with root package name */
    public long f6775a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6776b = false;
    public long c = 0;
    public boolean d = false;
    public f e = null;
    public int f = -1;
    public boolean g = false;
    public String h = "";
    public boolean i = false;
    public String j = "";
    public boolean k = false;
    public m[] l = m.b();
    public byte[][] m = com.google.protobuf.nano.e.g;
    public int n = 0;
    public boolean o = false;
    public int p = 0;
    public boolean q = false;
    public h r = null;
    public k s = null;

    public o() {
        this.ar = -1;
    }

    @Override // com.google.protobuf.nano.c
    public final void a(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (this.e != null) {
            codedOutputByteBufferNano.b(1, this.e);
        }
        if (this.f != -1 || this.g) {
            codedOutputByteBufferNano.a(2, this.f);
        }
        if (this.l != null && this.l.length > 0) {
            for (int i = 0; i < this.l.length; i++) {
                m mVar = this.l[i];
                if (mVar != null) {
                    codedOutputByteBufferNano.b(3, mVar);
                }
            }
        }
        if (this.f6776b || this.f6775a != 0) {
            codedOutputByteBufferNano.b(4, this.f6775a);
        }
        if (this.m != null && this.m.length > 0) {
            for (int i2 = 0; i2 < this.m.length; i2++) {
                byte[] bArr = this.m[i2];
                if (bArr != null) {
                    codedOutputByteBufferNano.a(5, bArr);
                }
            }
        }
        if (this.i || !this.h.equals("")) {
            codedOutputByteBufferNano.a(6, this.h);
        }
        if (this.k || !this.j.equals("")) {
            codedOutputByteBufferNano.a(7, this.j);
        }
        if (this.d || this.c != 0) {
            codedOutputByteBufferNano.b(8, this.c);
        }
        if (this.n != 0 || this.o) {
            codedOutputByteBufferNano.a(9, this.n);
        }
        if (this.p != 0 || this.q) {
            codedOutputByteBufferNano.a(10, this.p);
        }
        if (this.r != null) {
            codedOutputByteBufferNano.b(11, this.r);
        }
        if (this.s != null) {
            codedOutputByteBufferNano.b(12, this.s);
        }
        super.a(codedOutputByteBufferNano);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.protobuf.nano.c
    public final int a() {
        int a2 = super.a();
        if (this.e != null) {
            a2 += CodedOutputByteBufferNano.d(1, this.e);
        }
        if (this.f != -1 || this.g) {
            a2 += CodedOutputByteBufferNano.c(2, this.f);
        }
        if (this.l != null && this.l.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.l.length; i2++) {
                m mVar = this.l[i2];
                if (mVar != null) {
                    i += CodedOutputByteBufferNano.d(3, mVar);
                }
            }
            a2 = i;
        }
        if (this.f6776b || this.f6775a != 0) {
            a2 += CodedOutputByteBufferNano.e(4, this.f6775a);
        }
        if (this.m != null && this.m.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < this.m.length; i5++) {
                byte[] bArr = this.m[i5];
                if (bArr != null) {
                    i4++;
                    i3 += CodedOutputByteBufferNano.a(bArr);
                }
            }
            a2 = a2 + i3 + (i4 * 1);
        }
        if (this.i || !this.h.equals("")) {
            a2 += CodedOutputByteBufferNano.b(6, this.h);
        }
        if (this.k || !this.j.equals("")) {
            a2 += CodedOutputByteBufferNano.b(7, this.j);
        }
        if (this.d || this.c != 0) {
            a2 += CodedOutputByteBufferNano.e(8, this.c);
        }
        if (this.n != 0 || this.o) {
            a2 += CodedOutputByteBufferNano.c(9, this.n);
        }
        if (this.p != 0 || this.q) {
            a2 += CodedOutputByteBufferNano.c(10, this.p);
        }
        if (this.r != null) {
            a2 += CodedOutputByteBufferNano.d(11, this.r);
        }
        if (this.s != null) {
            return a2 + CodedOutputByteBufferNano.d(12, this.s);
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
                    if (this.e == null) {
                        this.e = new f();
                    }
                    aVar.a(this.e);
                    break;
                case 16:
                    int e = aVar.e();
                    switch (e) {
                        case -1:
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
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                        case 140:
                        case 141:
                        case 142:
                        case 143:
                        case 144:
                        case 145:
                        case 146:
                        case 147:
                        case 148:
                        case 149:
                        case 150:
                        case 151:
                        case 152:
                        case 153:
                        case 154:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                        case 159:
                        case 160:
                        case 161:
                        case 162:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                        case 167:
                        case 168:
                        case 169:
                        case 170:
                        case 171:
                        case 172:
                        case 173:
                        case 174:
                        case 175:
                        case 176:
                        case 177:
                        case 178:
                        case 179:
                        case 180:
                            this.f = e;
                            this.g = true;
                            break;
                    }
                case 26:
                    int b2 = com.google.protobuf.nano.e.b(aVar, 26);
                    int length = this.l == null ? 0 : this.l.length;
                    m[] mVarArr = new m[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.l, 0, mVarArr, 0, length);
                    }
                    while (length < mVarArr.length - 1) {
                        mVarArr[length] = new m();
                        aVar.a(mVarArr[length]);
                        aVar.a();
                        length++;
                    }
                    mVarArr[length] = new m();
                    aVar.a(mVarArr[length]);
                    this.l = mVarArr;
                    break;
                case 32:
                    this.f6775a = aVar.f();
                    this.f6776b = true;
                    break;
                case 42:
                    int b3 = com.google.protobuf.nano.e.b(aVar, 42);
                    int length2 = this.m == null ? 0 : this.m.length;
                    byte[][] bArr = new byte[b3 + length2][];
                    if (length2 != 0) {
                        System.arraycopy(this.m, 0, bArr, 0, length2);
                    }
                    while (length2 < bArr.length - 1) {
                        bArr[length2] = aVar.d();
                        aVar.a();
                        length2++;
                    }
                    bArr[length2] = aVar.d();
                    this.m = bArr;
                    break;
                case 50:
                    this.h = aVar.c();
                    this.i = true;
                    break;
                case 58:
                    this.j = aVar.c();
                    this.k = true;
                    break;
                case 64:
                    this.c = aVar.f();
                    this.d = true;
                    break;
                case 72:
                    int e2 = aVar.e();
                    switch (e2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.n = e2;
                            this.o = true;
                            break;
                    }
                case 80:
                    int e3 = aVar.e();
                    switch (e3) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.p = e3;
                            this.q = true;
                            break;
                    }
                case 90:
                    if (this.r == null) {
                        this.r = new h();
                    }
                    aVar.a(this.r);
                    break;
                case 98:
                    if (this.s == null) {
                        this.s = new k();
                    }
                    aVar.a(this.s);
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
