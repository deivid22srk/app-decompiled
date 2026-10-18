package a;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class p implements x {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f22a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OutputStream f23b;

    p(z zVar, OutputStream outputStream) {
        this.f22a = zVar;
        this.f23b = outputStream;
    }

    @Override // a.x
    public final void a_(f fVar, long j) {
        ab.a(fVar.f10b, 0L, j);
        while (j > 0) {
            this.f22a.g();
            v vVar = fVar.f9a;
            int min = (int) Math.min(j, vVar.c - vVar.f33b);
            this.f23b.write(vVar.f32a, vVar.f33b, min);
            vVar.f33b += min;
            j -= min;
            fVar.f10b -= min;
            if (vVar.f33b == vVar.c) {
                fVar.f9a = vVar.a();
                w.f34a.a(vVar);
            }
        }
    }

    @Override // a.x
    public final void b() {
        this.f23b.flush();
    }

    @Override // a.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23b.close();
    }

    @Override // a.x
    public final z a() {
        return this.f22a;
    }

    public final String toString() {
        return "sink(" + this.f23b + ")";
    }
}
