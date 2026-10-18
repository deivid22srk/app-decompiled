package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

/* loaded from: classes.dex */
final class y extends x implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final Context f5733b;
    private final Handler c;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<z, aa> f5732a = new HashMap<>();
    private final com.google.android.gms.common.stats.b d = com.google.android.gms.common.stats.b.a();
    private final long e = 5000;

    y(Context context) {
        this.f5733b = context.getApplicationContext();
        this.c = new Handler(context.getMainLooper(), this);
    }

    @Override // com.google.android.gms.common.internal.x
    public final void a(ComponentName componentName, ServiceConnection serviceConnection) {
        a(new z(componentName), serviceConnection);
    }

    @Override // com.google.android.gms.common.internal.x
    public final void a(String str, ServiceConnection serviceConnection) {
        a(new z(str), serviceConnection);
    }

    @Override // com.google.android.gms.common.internal.x
    public final boolean a(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return a(new z(componentName), serviceConnection, str);
    }

    @Override // com.google.android.gms.common.internal.x
    public final boolean a(String str, ServiceConnection serviceConnection, String str2) {
        return a(new z(str), serviceConnection, str2);
    }

    private boolean a(z zVar, ServiceConnection serviceConnection, String str) {
        boolean z;
        av.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5732a) {
            aa aaVar = this.f5732a.get(zVar);
            if (aaVar != null) {
                this.c.removeMessages(0, aaVar);
                if (!aaVar.a(serviceConnection)) {
                    aaVar.a(serviceConnection, str);
                    switch (aaVar.c) {
                        case 1:
                            serviceConnection.onServiceConnected(aaVar.g, aaVar.e);
                            break;
                        case 2:
                            aaVar.a(str);
                            break;
                    }
                } else {
                    throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + zVar);
                }
            } else {
                aaVar = new aa(this, zVar);
                aaVar.a(serviceConnection, str);
                aaVar.a(str);
                this.f5732a.put(zVar, aaVar);
            }
            z = aaVar.d;
        }
        return z;
    }

    private void a(z zVar, ServiceConnection serviceConnection) {
        av.a(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f5732a) {
            aa aaVar = this.f5732a.get(zVar);
            if (aaVar == null) {
                throw new IllegalStateException("Nonexistent connection status for service config: " + zVar);
            }
            if (!aaVar.a(serviceConnection)) {
                throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + zVar);
            }
            aaVar.h.d.a(aaVar.h.f5733b, com.google.android.gms.common.stats.b.a(serviceConnection), (String) null, (Intent) null, 4);
            aaVar.f5695b.remove(serviceConnection);
            if (aaVar.a()) {
                this.c.sendMessageDelayed(this.c.obtainMessage(0, aaVar), this.e);
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                aa aaVar = (aa) message.obj;
                synchronized (this.f5732a) {
                    if (aaVar.a()) {
                        if (aaVar.d) {
                            aaVar.h.d.a(aaVar.h.f5733b, aaVar.f5694a);
                            aaVar.d = false;
                            aaVar.c = 2;
                        }
                        this.f5732a.remove(aaVar.f);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
