package android.support.v4.b;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Add missing generic type declarations: [Params, Result] */
/* loaded from: classes.dex */
final class t<Params, Result> extends z<Params, Result> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(r rVar) {
        super((byte) 0);
        this.f254a = rVar;
    }

    @Override // java.util.concurrent.Callable
    public final Result call() {
        AtomicBoolean atomicBoolean;
        Object c;
        atomicBoolean = this.f254a.i;
        atomicBoolean.set(true);
        Process.setThreadPriority(10);
        c = this.f254a.c(this.f254a.a());
        return (Result) c;
    }
}
