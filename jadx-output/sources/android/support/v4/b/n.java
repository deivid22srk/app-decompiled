package android.support.v4.b;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class n<D> {
    public int n;
    public q<D> o;
    public p<D> p;
    public Context q;
    public boolean r = false;
    public boolean s = false;
    public boolean t = true;
    public boolean u = false;
    public boolean v = false;

    public final class o extends ContentObserver {
        public o() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            n.this.m();
        }
    }

    public n(Context context) {
        this.q = context.getApplicationContext();
    }

    public void b(D d) {
        if (this.o != null) {
            this.o.a(this, d);
        }
    }

    public final void a(q<D> qVar) {
        if (this.o == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.o != qVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.o = null;
    }

    public final void a(p<D> pVar) {
        if (this.p == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.p != pVar) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.p = null;
    }

    public void g() {
    }

    public final boolean j() {
        return b();
    }

    protected boolean b() {
        return false;
    }

    public final void k() {
        a();
    }

    protected void a() {
    }

    public void h() {
    }

    public void i() {
    }

    public final boolean l() {
        boolean z = this.u;
        this.u = false;
        this.v |= z;
        return z;
    }

    public final void m() {
        if (!this.r) {
            this.u = true;
        } else {
            a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        android.support.v4.h.d.a(this, sb);
        sb.append(" id=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.n);
        printWriter.print(" mListener=");
        printWriter.println(this.o);
        if (this.r || this.u || this.v) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.r);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.u);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.v);
        }
        if (this.s || this.t) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.s);
            printWriter.print(" mReset=");
            printWriter.println(this.t);
        }
    }
}
