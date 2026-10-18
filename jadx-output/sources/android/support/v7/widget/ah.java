package android.support.v7.widget;

/* loaded from: classes.dex */
final class ah {

    /* renamed from: a, reason: collision with root package name */
    int f650a;

    /* renamed from: b, reason: collision with root package name */
    int f651b;
    Object c;
    int d;

    ah(int i, int i2, int i3, Object obj) {
        this.f650a = i;
        this.f651b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final String toString() {
        String str;
        StringBuilder append = new StringBuilder().append(Integer.toHexString(System.identityHashCode(this))).append("[");
        switch (this.f650a) {
            case 1:
                str = "add";
                break;
            case 2:
                str = "rm";
                break;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                str = "??";
                break;
            case 4:
                str = "up";
                break;
            case 8:
                str = "mv";
                break;
        }
        return append.append(str).append(",s:").append(this.f651b).append("c:").append(this.d).append(",p:").append(this.c).append("]").toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ah ahVar = (ah) obj;
        if (this.f650a != ahVar.f650a) {
            return false;
        }
        if (this.f650a == 8 && Math.abs(this.d - this.f651b) == 1 && this.d == ahVar.f651b && this.f651b == ahVar.d) {
            return true;
        }
        if (this.d == ahVar.d && this.f651b == ahVar.f651b) {
            return this.c != null ? this.c.equals(ahVar.c) : ahVar.c == null;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f650a * 31) + this.f651b) * 31) + this.d;
    }
}
