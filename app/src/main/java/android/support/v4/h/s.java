package android.support.v4.h;

/* loaded from: classes.dex */
public final class s<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f302a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f303b;
    public int[] c;
    public Object[] d;
    public int e;

    public s() {
        this((byte) 0);
    }

    private s(byte b2) {
        this.f303b = false;
        int a2 = android.support.v4.h.c.a(10);
        this.c = new int[a2];
        this.d = new Object[a2];
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public s<E> clone() {
        try {
            s<E> sVar = (s) super.clone();
            try {
                sVar.c = (int[]) this.c.clone();
                sVar.d = (Object[]) this.d.clone();
                return sVar;
            } catch (CloneNotSupportedException e) {
                return sVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final void b(int i) {
        if (this.d[i] != f302a) {
            this.d[i] = f302a;
            this.f303b = true;
        }
    }

    private void e() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f302a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f303b = false;
        this.e = i2;
    }

    public final void a(int i, E e) {
        int a2 = android.support.v4.h.c.a(this.c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e;
            return;
        }
        int i2 = a2 ^ (-1);
        if (i2 < this.e && this.d[i2] == f302a) {
            this.c[i2] = i;
            this.d[i2] = e;
            return;
        }
        if (this.f303b && this.e >= this.c.length) {
            e();
            i2 = android.support.v4.h.c.a(this.c, this.e, i) ^ (-1);
        }
        if (this.e >= this.c.length) {
            int a3 = android.support.v4.h.c.a(this.e + 1);
            int[] iArr = new int[a3];
            Object[] objArr = new Object[a3];
            System.arraycopy(this.c, 0, iArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = iArr;
            this.d = objArr;
        }
        if (this.e - i2 != 0) {
            System.arraycopy(this.c, i2, this.c, i2 + 1, this.e - i2);
            System.arraycopy(this.d, i2, this.d, i2 + 1, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    public final int a() {
        if (this.f303b) {
            e();
        }
        return this.e;
    }

    public final int c(int i) {
        if (this.f303b) {
            e();
        }
        return this.c[i];
    }

    public final E d(int i) {
        if (this.f303b) {
            e();
        }
        return (E) this.d[i];
    }

    public final int b() {
        if (this.f303b) {
            e();
        }
        return android.support.v4.h.c.a(this.c, this.e, 2);
    }

    public final void c() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f303b = false;
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(c(i));
            sb.append('=');
            E d = d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final E a(int i) {
        int a2 = android.support.v4.h.c.a(this.c, this.e, i);
        if (a2 < 0 || this.d[a2] == f302a) {
            return null;
        }
        return (E) this.d[a2];
    }
}
