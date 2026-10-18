package android.support.v4.b;

import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* JADX INFO: Add missing generic type declarations: [Result] */
/* loaded from: classes.dex */
final class u<Result> extends FutureTask<Result> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f255a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    u(r rVar, Callable callable) {
        super(callable);
        this.f255a = rVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        try {
            r.b(this.f255a, get());
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException e2) {
            r.b(this.f255a, null);
        } catch (ExecutionException e3) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
