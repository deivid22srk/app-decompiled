package com.google.android.finsky.layout.play;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public final class de extends ad {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3490a;

    public de(int i, byte[] bArr, cy cyVar) {
        super(i, bArr, cyVar);
        this.f3490a = false;
        this.f3490a = false;
    }

    @Override // com.google.android.finsky.layout.play.ad, com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        if (this.f3490a) {
            super.a(cyVar);
            return;
        }
        com.google.android.finsky.apkg.ai playStoreUiElement = cyVar.getPlayStoreUiElement();
        if (playStoreUiElement == null) {
            throw new IllegalArgumentException("childNode has null element");
        }
        com.google.android.finsky.apkg.i.a(this, playStoreUiElement);
    }

    @Override // com.google.android.finsky.layout.play.ad
    public final void a() {
        if (this.f3490a) {
            super.a();
        } else {
            FinskyLog.e("Should not be report impressions when not selected", new Object[0]);
        }
    }

    public final void a(boolean z) {
        cy parentNode = getParentNode();
        if (z) {
            com.google.android.finsky.apkg.i.a(parentNode, getPlayStoreUiElement());
            if (getPlayStoreUiElement().f.length > 0) {
                parentNode.a(this);
            }
        } else {
            com.google.android.finsky.apkg.i.b(parentNode);
            com.google.android.finsky.apkg.i.a(parentNode.getPlayStoreUiElement(), getPlayStoreUiElement());
        }
        this.f3490a = z;
    }
}
