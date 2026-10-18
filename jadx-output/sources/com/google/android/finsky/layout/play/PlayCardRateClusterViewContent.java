package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.finsky.protos.ny;

/* loaded from: classes.dex */
public class PlayCardRateClusterViewContent extends PlayCardClusterViewContent {

    /* renamed from: a, reason: collision with root package name */
    int[] f3334a;

    public PlayCardRateClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardRateClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void c() {
        int docCount = getDocCount();
        if (docCount != 0 && this.g != null) {
            int a2 = this.g.a();
            if (this.f3334a == null) {
                this.f3334a = new int[a2];
            }
            for (int i = 0; i < a2; i++) {
                this.f3334a[i] = -1;
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < docCount && i3 < a2) {
                String str = a(i2).f1963a.f3890a;
                boolean z = this.k.a(str, (ny) null) != null;
                boolean c = this.k.c(str);
                if (z || c) {
                    i2++;
                } else {
                    this.f3334a[i3] = i2;
                    i2++;
                    i3++;
                }
            }
        }
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    public final void a(com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, az azVar, bc bcVar, cy cyVar) {
        c();
        super.a(bVar, bVar2, eVar, azVar, bcVar, cyVar);
    }

    public final boolean d() {
        return this.f3334a[0] >= 0;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    protected final int c(int i) {
        return this.f3334a[i];
    }
}
