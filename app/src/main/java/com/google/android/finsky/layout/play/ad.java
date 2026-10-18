package com.google.android.finsky.layout.play;

import com.google.android.finsky.utils.FinskyLog;

/* loaded from: classes.dex */
public class ad implements cy {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.apkg.ai f3391a;

    /* renamed from: b, reason: collision with root package name */
    private cy f3392b;

    public ad(int i, byte[] bArr, cy cyVar) {
        a(i, bArr, cyVar);
    }

    public ad(int i, cy cyVar) {
        this(i, null, cyVar);
    }

    public ad(int i) {
        this(i, null);
    }

    public final void a(int i, byte[] bArr, cy cyVar) {
        this.f3391a = com.google.android.finsky.apkg.i.a(i);
        com.google.android.finsky.apkg.i.a(this.f3391a, bArr);
        this.f3392b = cyVar;
    }

    public final void a(byte[] bArr) {
        com.google.android.finsky.apkg.i.a(this.f3391a, bArr);
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.f3391a;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.f3392b;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public void a(cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }

    public void a() {
        if (this.f3392b == null) {
            FinskyLog.e("Cannot log impression because null parent. Type=%d", Integer.valueOf(this.f3391a.f1453a));
        } else {
            this.f3392b.a(this);
        }
    }
}
