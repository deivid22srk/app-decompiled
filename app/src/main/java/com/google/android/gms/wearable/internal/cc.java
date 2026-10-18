package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.internal.mh;
import java.util.List;

/* loaded from: classes.dex */
final class cc<T> extends ak {

    /* renamed from: a, reason: collision with root package name */
    mh<Object> f6601a;

    /* renamed from: b, reason: collision with root package name */
    mh<Object> f6602b;
    mh<com.google.android.gms.wearable.h> c;
    mh<com.google.android.gms.wearable.u> d;
    mh<Object> e;
    mh<Object> f;
    mh<Object> g;
    mh<Object> h;
    mh<Object> i;
    final IntentFilter[] j;
    final String k;

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(LargeAssetSyncRequestPayload largeAssetSyncRequestPayload, ad adVar) {
        throw new UnsupportedOperationException("onLargeAssetSyncRequest not supported on live listener");
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(aa aaVar, String str, int i) {
        throw new UnsupportedOperationException("openFileDescriptor not supported on live listener");
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(AncsNotificationParcelable ancsNotificationParcelable) {
        if (this.f6602b != null) {
            this.f6602b.a(new cd(ancsNotificationParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(AmsEntityUpdateParcelable amsEntityUpdateParcelable) {
        if (this.f6601a != null) {
            this.f6601a.a(new cg(amsEntityUpdateParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(DataHolder dataHolder) {
        if (this.c != null) {
            this.c.a(new ch(dataHolder));
        } else {
            dataHolder.c();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(MessageEventParcelable messageEventParcelable) {
        if (this.d != null) {
            this.d.a(new ci(messageEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(NodeParcelable nodeParcelable) {
        if (this.e != null) {
            this.e.a(new cj(nodeParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void b(NodeParcelable nodeParcelable) {
        if (this.e != null) {
            this.e.a(new ck(nodeParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(List<NodeParcelable> list) {
        if (this.f != null) {
            this.f.a(new cl(list));
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(ChannelEventParcelable channelEventParcelable) {
        if (this.g != null) {
            this.g.a(new cm(channelEventParcelable));
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(LargeAssetQueueStateChangeParcelable largeAssetQueueStateChangeParcelable) {
        if (this.h != null) {
            this.h.a(new ce(largeAssetQueueStateChangeParcelable));
        } else {
            largeAssetQueueStateChangeParcelable.f6553b.a();
        }
    }

    @Override // com.google.android.gms.wearable.internal.aj
    public final void a(CapabilityInfoParcelable capabilityInfoParcelable) {
        if (this.i != null) {
            this.i.a(new cf(capabilityInfoParcelable));
        }
    }

    static void a(mh<?> mhVar) {
        if (mhVar != null) {
            mhVar.f6160a = null;
        }
    }
}
