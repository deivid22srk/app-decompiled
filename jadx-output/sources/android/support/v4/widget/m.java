package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes.dex */
final class m extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f461a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar) {
        super(new Handler());
        this.f461a = lVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f461a.b();
    }
}
