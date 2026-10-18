package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gc;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class DiscoveryBadgeFamilyAgeRange extends a {
    private FifeImageView f;

    public DiscoveryBadgeFamilyAgeRange(Context context) {
        super(context, null);
    }

    public DiscoveryBadgeFamilyAgeRange(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.discovery_badge_family_age_range_radius);
    }

    @Override // com.google.android.finsky.layout.play.a, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = (FifeImageView) findViewById(R.id.overlay_icon);
    }

    @Override // com.google.android.finsky.layout.play.a
    @SuppressLint({"NewApi"})
    public final void a(gc gcVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, DfeToc dfeToc, PackageManager packageManager, cy cyVar) {
        super.a(gcVar, eVar, bVar, document, dfeToc, packageManager, cyVar);
        this.f.a(gcVar.e.f, gcVar.e.l, eVar);
    }

    @Override // com.google.android.finsky.layout.play.a
    protected final void a(gc gcVar, com.google.android.play.image.e eVar) {
        this.f3386a.setBitmapTransformation(com.google.android.play.image.a.b(getResources(), this.c));
    }

    @Override // com.google.android.finsky.layout.play.a
    protected int getPlayStoreUiElementType() {
        return 1801;
    }
}
