package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.protos.hi;
import com.google.android.finsky.protos.hm;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.CardLinearLayout;

/* loaded from: classes.dex */
public class MyAccountFamilyManagementCard extends CardLinearLayout implements com.google.android.finsky.layout.play.cy {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3020a;

    /* renamed from: b, reason: collision with root package name */
    public View f3021b;
    public View c;
    public ViewGroup d;
    public View e;
    public View f;
    public com.google.android.finsky.layout.play.cy g;
    public int h;
    public ce i;
    private com.google.android.finsky.apkg.i j;
    private final com.google.android.finsky.apkg.ai k;

    public MyAccountFamilyManagementCard(Context context) {
        this(context, null);
    }

    public MyAccountFamilyManagementCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = com.google.android.finsky.apkg.i.a(2670);
        this.h = 0;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.j = FinskyApp.a().h();
        this.f3020a = (TextView) findViewById(R.id.manage_my_family_text);
        this.f = findViewById(R.id.my_family_card_separator);
        findViewById(R.id.manage_my_family_row).setOnClickListener(new cb(this));
        this.f3021b = findViewById(R.id.my_family_library_settings_row);
        if (com.google.android.finsky.utils.bb.b(FinskyApp.a().j())) {
            this.f3021b.setOnClickListener(new cc(this));
        } else {
            this.f.setVisibility(8);
            this.f3021b.setVisibility(8);
        }
        ((TextView) findViewById(R.id.family_card_learn_more_text)).setText(getResources().getString(R.string.learn_more_action).toUpperCase(getResources().getConfiguration().locale));
        this.c = findViewById(R.id.family_card_learn_more);
        this.e = findViewById(R.id.loading_indicator);
        this.d = (ViewGroup) findViewById(R.id.family_management_content);
        this.c.setOnClickListener(new cd(this));
    }

    public final void a(hi hiVar) {
        hm a2 = com.google.android.finsky.utils.bb.a(hiVar);
        if (a2 == null) {
            FinskyLog.e("family management card: myself is missing.", new Object[0]);
        } else if (a2.f3916a == 1) {
            this.h = 1;
            this.f3020a.setText(R.string.manage_family_members);
        } else {
            this.h = 2;
            this.f3020a.setText(R.string.view_family);
        }
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.apkg.ai getPlayStoreUiElement() {
        return this.k;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.layout.play.cy getParentNode() {
        return this.g;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(com.google.android.finsky.layout.play.cy cyVar) {
        com.google.android.finsky.apkg.i.a(this, cyVar);
    }
}
