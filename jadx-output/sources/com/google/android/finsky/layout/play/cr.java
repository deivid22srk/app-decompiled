package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.api.model.DfeToc;
import com.google.android.finsky.layout.ForegroundLinearLayout;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public abstract class cr extends ForegroundLinearLayout implements com.google.android.finsky.adapters.ap, cy {

    /* renamed from: a, reason: collision with root package name */
    protected TextView f3478a;

    /* renamed from: b, reason: collision with root package name */
    protected FifeImageView f3479b;
    protected int c;
    private final com.google.android.finsky.a.ai d;
    private com.google.android.finsky.protos.ba e;
    private com.google.android.finsky.navigationmanager.b f;
    private DfeToc g;
    private cy h;

    public cr(Context context) {
        super(context);
        this.d = com.google.android.finsky.a.i.a(101);
    }

    public cr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = com.google.android.finsky.a.i.a(101);
    }

    public cr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = com.google.android.finsky.a.i.a(101);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3478a = (TextView) findViewById(R.id.li_title);
        this.f3479b = (FifeImageView) findViewById(R.id.li_icon);
        setOnClickListener(new cs(this));
    }

    public int getIconWidth() {
        if (this.f3479b == null) {
            return 0;
        }
        return this.f3479b.getLayoutParams().width;
    }

    public void a(com.google.android.finsky.protos.ba baVar, com.google.android.finsky.navigationmanager.b bVar, DfeToc dfeToc, com.google.android.play.image.e eVar, cy cyVar) {
        this.e = baVar;
        this.f = bVar;
        this.g = dfeToc;
        this.c = com.google.android.finsky.utils.ai.b(getContext(), baVar.g);
        if (this.f3479b != null && baVar.c != null) {
            this.f3479b.a(baVar.c.f, baVar.c.l, eVar);
        }
        this.f3478a.setText(baVar.f3619a);
        setContentDescription(baVar.f3619a);
        com.google.android.finsky.a.i.a(this.d, baVar.k);
        this.h = cyVar;
        getParentNode().a(this);
    }

    @Override // com.google.android.finsky.adapters.ap
    public final void ab_() {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.f3479b.a();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.getText().clear();
        return dispatchPopulateAccessibilityEvent;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        com.google.android.play.utils.g.a(accessibilityNodeInfo, Button.class.getName());
    }

    @Override // com.google.android.finsky.layout.play.cy
    public com.google.android.finsky.a.ai getPlayStoreUiElement() {
        return this.d;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public cy getParentNode() {
        return this.h;
    }

    @Override // com.google.android.finsky.layout.play.cy
    public final void a(cy cyVar) {
        throw new IllegalStateException("unwanted children");
    }
}
