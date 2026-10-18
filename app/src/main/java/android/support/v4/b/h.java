package android.support.v4.b;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.support.v4.b.n;
import android.support.v4.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h extends a<Cursor> {
    final n<Cursor>.o f;
    public Uri g;
    public String[] h;
    String i;
    String[] j;
    String k;
    Cursor l;
    android.support.v4.os.a m;

    @Override // android.support.v4.b.a
    public final /* synthetic */ void a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor2.isClosed()) {
            return;
        }
        cursor2.close();
    }

    @Override // android.support.v4.b.a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Cursor d() {
        synchronized (this) {
            if (this.f243b != null) {
                throw new OperationCanceledException();
            }
            this.m = new android.support.v4.os.a();
        }
        try {
            Cursor a2 = c.a(this.q.getContentResolver(), this.g, this.h, this.i, this.j, this.k, this.m);
            if (a2 != null) {
                try {
                    a2.getCount();
                    a2.registerContentObserver(this.f);
                } catch (RuntimeException e) {
                    a2.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.m = null;
            }
            return a2;
        } catch (Throwable th) {
            synchronized (this) {
                this.m = null;
                throw th;
            }
        }
    }

    @Override // android.support.v4.b.a
    public final void e() {
        super.e();
        synchronized (this) {
            if (this.m != null) {
                android.support.v4.os.a aVar = this.m;
                synchronized (aVar) {
                    if (!aVar.f306a) {
                        aVar.f306a = true;
                        aVar.c = true;
                        Object obj = aVar.f307b;
                        if (obj != null) {
                            try {
                                ((CancellationSignal) obj).cancel();
                            } catch (Throwable th) {
                                synchronized (aVar) {
                                    aVar.c = false;
                                    aVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (aVar) {
                            aVar.c = false;
                            aVar.notifyAll();
                        }
                    }
                }
            }
        }
    }

    public h(Context context) {
        super(context);
        this.f = new n.o();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.b.n
    public final void g() {
        if (this.l != null) {
            b(this.l);
        }
        if (l() || this.l == null) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.b.n
    public final void h() {
        j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.b.n
    public final void i() {
        super.i();
        j();
        if (this.l != null && !this.l.isClosed()) {
            this.l.close();
        }
        this.l = null;
    }

    @Override // android.support.v4.b.a, android.support.v4.b.n
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.g);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.h));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.i);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.j));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.k);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.l);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.support.v4.b.n
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void b(Cursor cursor) {
        if (this.t) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.l;
        this.l = cursor;
        if (this.r) {
            super.b(cursor);
        }
        if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
            cursor2.close();
        }
    }
}
