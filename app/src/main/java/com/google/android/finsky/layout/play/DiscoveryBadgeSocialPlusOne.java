package com.google.android.finsky.layout.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.gc;

/* loaded from: classes.dex */
public class DiscoveryBadgeSocialPlusOne extends a {
    private View f;
    private Drawable g;

    public DiscoveryBadgeSocialPlusOne(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeSocialPlusOne(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = android.support.v4.c.apkg.a.c(android.support.v4.b.g.a(context, R.drawable.social_pluseone_background).mutate());
        setWillNotDraw(false);
    }

    @Override // com.google.android.finsky.layout.play.a, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f = findViewById(R.id.plus_one_container);
    }

    @Override // com.google.android.finsky.layout.play.a
    @SuppressLint({"NewApi"})
    public final void a(gc gcVar, com.google.android.play.image.e eVar, com.google.android.finsky.navigationmanager.b bVar, Document document, DfeToc dfeToc, PackageManager packageManager, cy cyVar) {
        super.a(gcVar, eVar, bVar, document, dfeToc, packageManager, cyVar);
        android.support.v4.c.apkg.a.a(this.g, getResources().getColor(R.color.discovery_plus_one_background));
        if (Build.VERSION.SDK_INT >= 16) {
            this.f.setBackground(this.g);
        } else {
            this.f.setBackgroundDrawable(this.g);
        }
        findViewById(R.id.plus_one).setContentDescription(null);
    }

    @Override // com.google.android.finsky.layout.play.a
    protected int getPlayStoreUiElementType() {
        return 1804;
    }
}
