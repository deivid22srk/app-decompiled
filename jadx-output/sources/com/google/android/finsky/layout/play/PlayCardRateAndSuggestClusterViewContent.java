package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class PlayCardRateAndSuggestClusterViewContent extends PlayCardClusterViewContent {

    /* renamed from: a, reason: collision with root package name */
    int f3331a;

    public PlayCardRateAndSuggestClusterViewContent(Context context) {
        this(context, null);
    }

    public PlayCardRateAndSuggestClusterViewContent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3331a = 0;
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    public final void a(com.google.android.finsky.api.b bVar, com.google.android.finsky.navigationmanager.b bVar2, com.google.android.play.image.e eVar, az azVar, bc bcVar, cy cyVar) {
        super.a(bVar, bVar2, eVar, azVar, bcVar, cyVar);
        b(false);
    }

    @Override // com.google.android.finsky.layout.play.PlayCardClusterViewContent
    protected int getNumberOfTilesToBind() {
        if (this.f3331a == 0) {
            return 1;
        }
        return super.getNumberOfTilesToBind();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void b(boolean z) {
        if (getCardChildCount() != 0) {
            for (int i = 0; i < this.g.a(); i++) {
                b(i).setVisibility(0);
            }
            boolean z2 = this.f3331a == 2;
            for (int i2 = 1; i2 < this.g.a(); i2++) {
                com.google.android.play.layout.a b2 = b(i2);
                if (b2.getData() == null) {
                    b2.a();
                }
                bo boVar = (bo) b2;
                if (z2) {
                    boVar.b(z);
                } else {
                    boVar.a(z);
                }
            }
        }
    }
}
