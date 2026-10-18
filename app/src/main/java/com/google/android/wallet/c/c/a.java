package com.google.android.wallet.c.c;

import android.os.Bundle;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.d.b.a.b.g;

/* loaded from: classes.dex */
public final class a extends com.google.android.wallet.common.d.b {
    public g i;

    @Override // com.google.android.wallet.common.d.b, com.google.android.wallet.common.d.e, android.support.v4.app.Fragment
    public final void e(Bundle bundle) {
        super.e(bundle);
        if (this.i != null) {
            bundle.putParcelable("submitResponse", ParcelableProto.a(this.i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.d.b, com.google.android.wallet.common.d.e
    public final void c(Bundle bundle) {
        super.c(bundle);
        this.i = (g) ParcelableProto.a(bundle, "submitResponse");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.wallet.common.d.b
    public final void u() {
        this.i = null;
    }
}
