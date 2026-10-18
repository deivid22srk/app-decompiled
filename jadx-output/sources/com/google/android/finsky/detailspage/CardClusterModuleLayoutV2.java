package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.layout.play.PlayCardClusterViewV2;
import com.google.android.finsky.utils.ik;

/* loaded from: classes.dex */
public class CardClusterModuleLayoutV2 extends PlayCardClusterViewV2 implements bp, bq, bs, bt, v {

    /* renamed from: b, reason: collision with root package name */
    private final int f2490b;

    public CardClusterModuleLayoutV2(Context context) {
        this(context, null);
    }

    public CardClusterModuleLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        if (resources.getBoolean(R.bool.use_wide_layout)) {
            this.f2490b = -resources.getDimensionPixelSize(R.dimen.play_card_inset);
        } else {
            this.f2490b = 0;
        }
    }

    public final void a(int i, String str, String str2, View.OnClickListener onClickListener, int i2, com.google.android.finsky.layout.s sVar, com.google.android.finsky.layout.u uVar, android.support.v7.widget.eg egVar, Bundle bundle, com.google.android.finsky.layout.play.cy cyVar, byte[] bArr) {
        Resources resources = getResources();
        int max = Math.max(resources.getDimensionPixelSize(R.dimen.details_pack_row_padding), br.a(resources, resources.getBoolean(R.bool.use_wide_layout)));
        a(max);
        a(i, str, null, str2, onClickListener, max);
        a(sVar, uVar.a(i2), ik.c(resources), egVar, bundle, cyVar, bArr);
    }

    @Override // com.google.android.finsky.detailspage.bt
    public int getMarginOffset() {
        return this.f2490b;
    }

    public int getMaxItemsPerPage() {
        return ik.e(getResources());
    }
}
