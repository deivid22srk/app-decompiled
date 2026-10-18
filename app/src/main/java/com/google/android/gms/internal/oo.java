package com.google.android.gms.internal;

/* loaded from: classes.dex */
public final class oo extends af {
    private static volatile oo[] B;

    /* renamed from: a, reason: collision with root package name */
    public Integer f6211a = null;

    /* renamed from: b, reason: collision with root package name */
    public ol[] f6212b = ol.b();
    public op[] c = op.b();
    public Long d = null;
    public Long e = null;
    public Long f = null;
    public Long g = null;
    public Long h = null;
    public String i = null;
    public String j = null;
    public String k = null;
    public String l = null;
    public Integer m = null;
    public String n = null;
    public String o = null;
    public String q = null;
    public Long r = null;
    public Long s = null;
    public String t = null;
    public Boolean u = null;
    public String v = null;
    public Long w = null;
    public Integer x = null;
    public String y = null;
    public String z = null;
    public Boolean A = null;

    public static oo[] b() {
        if (B == null) {
            synchronized (ae.f5865a) {
                if (B == null) {
                    B = new oo[0];
                }
            }
        }
        return B;
    }

    @Override // com.google.android.gms.internal.af
    public final void a(zzaic zzaicVar) {
        if (this.f6211a != null) {
            zzaicVar.a(1, this.f6211a.intValue());
        }
        if (this.f6212b != null && this.f6212b.length > 0) {
            for (int i = 0; i < this.f6212b.length; i++) {
                ol olVar = this.f6212b[i];
                if (olVar != null) {
                    zzaicVar.a(2, olVar);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (int i2 = 0; i2 < this.c.length; i2++) {
                op opVar = this.c[i2];
                if (opVar != null) {
                    zzaicVar.a(3, opVar);
                }
            }
        }
        if (this.d != null) {
            zzaicVar.a(4, this.d.longValue());
        }
        if (this.e != null) {
            zzaicVar.a(5, this.e.longValue());
        }
        if (this.f != null) {
            zzaicVar.a(6, this.f.longValue());
        }
        if (this.h != null) {
            zzaicVar.a(7, this.h.longValue());
        }
        if (this.i != null) {
            zzaicVar.a(8, this.i);
        }
        if (this.j != null) {
            zzaicVar.a(9, this.j);
        }
        if (this.k != null) {
            zzaicVar.a(10, this.k);
        }
        if (this.l != null) {
            zzaicVar.a(11, this.l);
        }
        if (this.m != null) {
            zzaicVar.a(12, this.m.intValue());
        }
        if (this.n != null) {
            zzaicVar.a(13, this.n);
        }
        if (this.o != null) {
            zzaicVar.a(14, this.o);
        }
        if (this.q != null) {
            zzaicVar.a(16, this.q);
        }
        if (this.r != null) {
            zzaicVar.a(17, this.r.longValue());
        }
        if (this.s != null) {
            zzaicVar.a(18, this.s.longValue());
        }
        if (this.t != null) {
            zzaicVar.a(19, this.t);
        }
        if (this.u != null) {
            zzaicVar.a(20, this.u.booleanValue());
        }
        if (this.v != null) {
            zzaicVar.a(21, this.v);
        }
        if (this.w != null) {
            zzaicVar.a(22, this.w.longValue());
        }
        if (this.x != null) {
            zzaicVar.a(23, this.x.intValue());
        }
        if (this.y != null) {
            zzaicVar.a(24, this.y);
        }
        if (this.z != null) {
            zzaicVar.a(25, this.z);
        }
        if (this.g != null) {
            zzaicVar.a(26, this.g.longValue());
        }
        if (this.A != null) {
            zzaicVar.a(28, this.A.booleanValue());
        }
        super.a(zzaicVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo)) {
            return false;
        }
        oo ooVar = (oo) obj;
        if (this.f6211a == null) {
            if (ooVar.f6211a != null) {
                return false;
            }
        } else if (!this.f6211a.equals(ooVar.f6211a)) {
            return false;
        }
        if (ae.a(this.f6212b, ooVar.f6212b) && ae.a(this.c, ooVar.c)) {
            if (this.d == null) {
                if (ooVar.d != null) {
                    return false;
                }
            } else if (!this.d.equals(ooVar.d)) {
                return false;
            }
            if (this.e == null) {
                if (ooVar.e != null) {
                    return false;
                }
            } else if (!this.e.equals(ooVar.e)) {
                return false;
            }
            if (this.f == null) {
                if (ooVar.f != null) {
                    return false;
                }
            } else if (!this.f.equals(ooVar.f)) {
                return false;
            }
            if (this.g == null) {
                if (ooVar.g != null) {
                    return false;
                }
            } else if (!this.g.equals(ooVar.g)) {
                return false;
            }
            if (this.h == null) {
                if (ooVar.h != null) {
                    return false;
                }
            } else if (!this.h.equals(ooVar.h)) {
                return false;
            }
            if (this.i == null) {
                if (ooVar.i != null) {
                    return false;
                }
            } else if (!this.i.equals(ooVar.i)) {
                return false;
            }
            if (this.j == null) {
                if (ooVar.j != null) {
                    return false;
                }
            } else if (!this.j.equals(ooVar.j)) {
                return false;
            }
            if (this.k == null) {
                if (ooVar.k != null) {
                    return false;
                }
            } else if (!this.k.equals(ooVar.k)) {
                return false;
            }
            if (this.l == null) {
                if (ooVar.l != null) {
                    return false;
                }
            } else if (!this.l.equals(ooVar.l)) {
                return false;
            }
            if (this.m == null) {
                if (ooVar.m != null) {
                    return false;
                }
            } else if (!this.m.equals(ooVar.m)) {
                return false;
            }
            if (this.n == null) {
                if (ooVar.n != null) {
                    return false;
                }
            } else if (!this.n.equals(ooVar.n)) {
                return false;
            }
            if (this.o == null) {
                if (ooVar.o != null) {
                    return false;
                }
            } else if (!this.o.equals(ooVar.o)) {
                return false;
            }
            if (this.q == null) {
                if (ooVar.q != null) {
                    return false;
                }
            } else if (!this.q.equals(ooVar.q)) {
                return false;
            }
            if (this.r == null) {
                if (ooVar.r != null) {
                    return false;
                }
            } else if (!this.r.equals(ooVar.r)) {
                return false;
            }
            if (this.s == null) {
                if (ooVar.s != null) {
                    return false;
                }
            } else if (!this.s.equals(ooVar.s)) {
                return false;
            }
            if (this.t == null) {
                if (ooVar.t != null) {
                    return false;
                }
            } else if (!this.t.equals(ooVar.t)) {
                return false;
            }
            if (this.u == null) {
                if (ooVar.u != null) {
                    return false;
                }
            } else if (!this.u.equals(ooVar.u)) {
                return false;
            }
            if (this.v == null) {
                if (ooVar.v != null) {
                    return false;
                }
            } else if (!this.v.equals(ooVar.v)) {
                return false;
            }
            if (this.w == null) {
                if (ooVar.w != null) {
                    return false;
                }
            } else if (!this.w.equals(ooVar.w)) {
                return false;
            }
            if (this.x == null) {
                if (ooVar.x != null) {
                    return false;
                }
            } else if (!this.x.equals(ooVar.x)) {
                return false;
            }
            if (this.y == null) {
                if (ooVar.y != null) {
                    return false;
                }
            } else if (!this.y.equals(ooVar.y)) {
                return false;
            }
            if (this.z == null) {
                if (ooVar.z != null) {
                    return false;
                }
            } else if (!this.z.equals(ooVar.z)) {
                return false;
            }
            return this.A == null ? ooVar.A == null : this.A.equals(ooVar.A);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.z == null ? 0 : this.z.hashCode()) + (((this.y == null ? 0 : this.y.hashCode()) + (((this.x == null ? 0 : this.x.hashCode()) + (((this.w == null ? 0 : this.w.hashCode()) + (((this.v == null ? 0 : this.v.hashCode()) + (((this.u == null ? 0 : this.u.hashCode()) + (((this.t == null ? 0 : this.t.hashCode()) + (((this.s == null ? 0 : this.s.hashCode()) + (((this.r == null ? 0 : this.r.hashCode()) + (((this.q == null ? 0 : this.q.hashCode()) + (((this.o == null ? 0 : this.o.hashCode()) + (((this.n == null ? 0 : this.n.hashCode()) + (((this.m == null ? 0 : this.m.hashCode()) + (((this.l == null ? 0 : this.l.hashCode()) + (((this.k == null ? 0 : this.k.hashCode()) + (((this.j == null ? 0 : this.j.hashCode()) + (((this.i == null ? 0 : this.i.hashCode()) + (((this.h == null ? 0 : this.h.hashCode()) + (((this.g == null ? 0 : this.g.hashCode()) + (((this.f == null ? 0 : this.f.hashCode()) + (((this.e == null ? 0 : this.e.hashCode()) + (((this.d == null ? 0 : this.d.hashCode()) + (((((((this.f6211a == null ? 0 : this.f6211a.hashCode()) + ((getClass().getName().hashCode() + 527) * 31)) * 31) + ae.a(this.f6212b)) * 31) + ae.a(this.c)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31) + (this.A != null ? this.A.hashCode() : 0);
    }

    public oo() {
        this.p = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.af
    public final int a() {
        int a2 = super.a();
        if (this.f6211a != null) {
            a2 += zzaic.b(1, this.f6211a.intValue());
        }
        if (this.f6212b != null && this.f6212b.length > 0) {
            int i = a2;
            for (int i2 = 0; i2 < this.f6212b.length; i2++) {
                ol olVar = this.f6212b[i2];
                if (olVar != null) {
                    i += zzaic.b(2, olVar);
                }
            }
            a2 = i;
        }
        if (this.c != null && this.c.length > 0) {
            for (int i3 = 0; i3 < this.c.length; i3++) {
                op opVar = this.c[i3];
                if (opVar != null) {
                    a2 += zzaic.b(3, opVar);
                }
            }
        }
        if (this.d != null) {
            a2 += zzaic.b(4, this.d.longValue());
        }
        if (this.e != null) {
            a2 += zzaic.b(5, this.e.longValue());
        }
        if (this.f != null) {
            a2 += zzaic.b(6, this.f.longValue());
        }
        if (this.h != null) {
            a2 += zzaic.b(7, this.h.longValue());
        }
        if (this.i != null) {
            a2 += zzaic.b(8, this.i);
        }
        if (this.j != null) {
            a2 += zzaic.b(9, this.j);
        }
        if (this.k != null) {
            a2 += zzaic.b(10, this.k);
        }
        if (this.l != null) {
            a2 += zzaic.b(11, this.l);
        }
        if (this.m != null) {
            a2 += zzaic.b(12, this.m.intValue());
        }
        if (this.n != null) {
            a2 += zzaic.b(13, this.n);
        }
        if (this.o != null) {
            a2 += zzaic.b(14, this.o);
        }
        if (this.q != null) {
            a2 += zzaic.b(16, this.q);
        }
        if (this.r != null) {
            a2 += zzaic.b(17, this.r.longValue());
        }
        if (this.s != null) {
            a2 += zzaic.b(18, this.s.longValue());
        }
        if (this.t != null) {
            a2 += zzaic.b(19, this.t);
        }
        if (this.u != null) {
            this.u.booleanValue();
            a2 += zzaic.b(20) + 1;
        }
        if (this.v != null) {
            a2 += zzaic.b(21, this.v);
        }
        if (this.w != null) {
            a2 += zzaic.b(22, this.w.longValue());
        }
        if (this.x != null) {
            a2 += zzaic.b(23, this.x.intValue());
        }
        if (this.y != null) {
            a2 += zzaic.b(24, this.y);
        }
        if (this.z != null) {
            a2 += zzaic.b(25, this.z);
        }
        if (this.g != null) {
            a2 += zzaic.b(26, this.g.longValue());
        }
        if (this.A == null) {
            return a2;
        }
        this.A.booleanValue();
        return a2 + zzaic.b(28) + 1;
    }

    @Override // com.google.android.gms.internal.af
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final oo a(z zVar) {
        while (true) {
            int a2 = zVar.a();
            switch (a2) {
                case 0:
                    break;
                case 8:
                    this.f6211a = Integer.valueOf(zVar.e());
                    break;
                case 18:
                    int b2 = ai.b(zVar, 18);
                    int length = this.f6212b == null ? 0 : this.f6212b.length;
                    ol[] olVarArr = new ol[b2 + length];
                    if (length != 0) {
                        System.arraycopy(this.f6212b, 0, olVarArr, 0, length);
                    }
                    while (length < olVarArr.length - 1) {
                        olVarArr[length] = new ol();
                        zVar.a(olVarArr[length]);
                        zVar.a();
                        length++;
                    }
                    olVarArr[length] = new ol();
                    zVar.a(olVarArr[length]);
                    this.f6212b = olVarArr;
                    break;
                case 26:
                    int b3 = ai.b(zVar, 26);
                    int length2 = this.c == null ? 0 : this.c.length;
                    op[] opVarArr = new op[b3 + length2];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, opVarArr, 0, length2);
                    }
                    while (length2 < opVarArr.length - 1) {
                        opVarArr[length2] = new op();
                        zVar.a(opVarArr[length2]);
                        zVar.a();
                        length2++;
                    }
                    opVarArr[length2] = new op();
                    zVar.a(opVarArr[length2]);
                    this.c = opVarArr;
                    break;
                case 32:
                    this.d = Long.valueOf(zVar.f());
                    break;
                case 40:
                    this.e = Long.valueOf(zVar.f());
                    break;
                case 48:
                    this.f = Long.valueOf(zVar.f());
                    break;
                case 56:
                    this.h = Long.valueOf(zVar.f());
                    break;
                case 66:
                    this.i = zVar.c();
                    break;
                case 74:
                    this.j = zVar.c();
                    break;
                case 82:
                    this.k = zVar.c();
                    break;
                case 90:
                    this.l = zVar.c();
                    break;
                case 96:
                    this.m = Integer.valueOf(zVar.e());
                    break;
                case 106:
                    this.n = zVar.c();
                    break;
                case 114:
                    this.o = zVar.c();
                    break;
                case 130:
                    this.q = zVar.c();
                    break;
                case 136:
                    this.r = Long.valueOf(zVar.f());
                    break;
                case 144:
                    this.s = Long.valueOf(zVar.f());
                    break;
                case 154:
                    this.t = zVar.c();
                    break;
                case 160:
                    this.u = Boolean.valueOf(zVar.b());
                    break;
                case 170:
                    this.v = zVar.c();
                    break;
                case 176:
                    this.w = Long.valueOf(zVar.f());
                    break;
                case 184:
                    this.x = Integer.valueOf(zVar.e());
                    break;
                case 194:
                    this.y = zVar.c();
                    break;
                case 202:
                    this.z = zVar.c();
                    break;
                case 208:
                    this.g = Long.valueOf(zVar.f());
                    break;
                case 224:
                    this.A = Boolean.valueOf(zVar.b());
                    break;
                default:
                    if (!ai.a(zVar, a2)) {
                        break;
                    } else {
                        break;
                    }
            }
        }
        return this;
    }
}
