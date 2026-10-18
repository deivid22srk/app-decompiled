package com.google.android.wallet.ui.common.bpkg;

import android.widget.TextView;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends c {
    public b(a... aVarArr) {
        super(aVarArr);
    }

    @Override // com.google.android.wallet.ui.common.bpkg.a
    public final boolean a(TextView textView) {
        Iterator<a> it = this.f7498a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!next.a(textView)) {
                this.f7497b = next.a();
                return false;
            }
        }
        return true;
    }
}
