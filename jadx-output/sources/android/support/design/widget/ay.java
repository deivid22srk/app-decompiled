package android.support.design.widget;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
final class ay implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ax f99a;

    ay(ax axVar) {
        this.f99a = axVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                ax axVar = this.f99a;
                ba baVar = (ba) message.obj;
                synchronized (axVar.f97a) {
                    if (axVar.c == baVar || axVar.d == baVar) {
                        axVar.a(baVar, 2);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
