package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.DiscoveryBar;
import java.util.List;

/* loaded from: classes.dex */
public class CombinedTitleModuleLayout extends LinearLayout implements bp, bq, com.google.android.finsky.layout.aj {

    /* renamed from: a, reason: collision with root package name */
    private DiscoveryBar f2491a;

    /* renamed from: b, reason: collision with root package name */
    private WarningMessageModuleLayout f2492b;

    public CombinedTitleModuleLayout(Context context) {
        super(context);
    }

    public CombinedTitleModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2491a = (DiscoveryBar) findViewById(R.id.discovery_bar);
        this.f2492b = (WarningMessageModuleLayout) findViewById(R.id.warning_message_module);
        this.f2491a.setBackgroundDrawable(null);
    }

    public View getTitleModuleLayout() {
        return this;
    }

    public DiscoveryBar getDiscoveryBarModuleLayout() {
        return this.f2491a;
    }

    public WarningMessageModuleLayout getWarningMessageModuleLayout() {
        return this.f2492b;
    }

    @Override // com.google.android.finsky.layout.aj
    public final void b(List<View> list) {
        list.add(findViewById(R.id.secondary_stack));
    }

    @Override // com.google.android.finsky.layout.aj
    public final void a(List<Integer> list) {
        list.add(Integer.valueOf(R.id.secondary_stack));
    }
}
