package android.support.v4.h;

/* loaded from: classes.dex */
public final class f<E> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f285a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f286b;
    public Object[] c;
    private long[] d;
    private int e;

    public f() {
        this(10);
    }

    public f(int i) {
        this.f286b = false;
        if (i == 0) {
            this.d = c.f282b;
            this.c = c.c;
        } else {
            int b2 = c.b(i);
            this.d = new long[b2];
            this.c = new Object[b2];
        }
        this.e = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            try {
                fVar.d = (long[]) this.d.clone();
                fVar.c = (Object[]) this.c.clone();
                return fVar;
            } catch (CloneNotSupportedException e) {
                return fVar;
            }
        } catch (CloneNotSupportedException e2) {
            return null;
        }
    }

    public final void b(long j) {
        int a2 = c.a(this.d, this.e, j);
        if (a2 >= 0 && this.c[a2] != f285a) {
            this.c[a2] = f285a;
            this.f286b = true;
        }
    }

    private void d() {
        int i = this.e;
        long[] jArr = this.d;
        Object[] objArr = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f285a) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f286b = false;
        this.e = i2;
    }

    public final void a(long j, E e) {
        int a2 = c.a(this.d, this.e, j);
        if (a2 >= 0) {
            this.c[a2] = e;
            return;
        }
        int i = a2 ^ (-1);
        if (i < this.e && this.c[i] == f285a) {
            this.d[i] = j;
            this.c[i] = e;
            return;
        }
        if (this.f286b && this.e >= this.d.length) {
            d();
            i = c.a(this.d, this.e, j) ^ (-1);
        }
        if (this.e >= this.d.length) {
            int b2 = c.b(this.e + 1);
            long[] jArr = new long[b2];
            Object[] objArr = new Object[b2];
            System.arraycopy(this.d, 0, jArr, 0, this.d.length);
            System.arraycopy(this.c, 0, objArr, 0, this.c.length);
            this.d = jArr;
            this.c = objArr;
        }
        if (this.e - i != 0) {
            System.arraycopy(this.d, i, this.d, i + 1, this.e - i);
            System.arraycopy(this.c, i, this.c, i + 1, this.e - i);
        }
        this.d[i] = j;
        this.c[i] = e;
        this.e++;
    }

    public final int a() {
        if (this.f286b) {
            d();
        }
        return this.e;
    }

    public final long a(int i) {
        if (this.f286b) {
            d();
        }
        return this.d[i];
    }

    public final E b(int i) {
        if (this.f286b) {
            d();
        }
        return (E) this.c[i];
    }

    public final int c(long j) {
        if (this.f286b) {
            d();
        }
        return c.a(this.d, this.e, j);
    }

    public final void b() {
        int i = this.e;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.f286b = false;
    }

    public final void b(long j, E e) {
        if (this.e != 0 && j <= this.d[this.e - 1]) {
            a(j, e);
            return;
        }
        if (this.f286b && this.e >= this.d.length) {
            d();
        }
        int i = this.e;
        if (i >= this.d.length) {
            int b2 = c.b(i + 1);
            long[] jArr = new long[b2];
            Object[] objArr = new Object[b2];
            System.arraycopy(this.d, 0, jArr, 0, this.d.length);
            System.arraycopy(this.c, 0, objArr, 0, this.c.length);
            this.d = jArr;
            this.c = objArr;
        }
        this.d[i] = j;
        this.c[i] = e;
        this.e = i + 1;
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
            sb.append(a(i));
            sb.append('=');
            E b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final E a(long j) {
        int a2 = c.a(this.d, this.e, j);
        if (a2 < 0 || this.c[a2] == f285a) {
            return null;
        }
        return (E) this.c[a2];
    }
}
