package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class EditorialDescriptionSection extends ap {
    private boolean e;

    public EditorialDescriptionSection(Context context) {
        this(context, null);
    }

    public EditorialDescriptionSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().a(this, context, attributeSet, 0);
    }

    public com.google.android.play.c.i getCardViewGroupDelegate() {
        return com.google.android.play.c.j.f6829a;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        getCardViewGroupDelegate().a(this, i);
    }

    @Override // com.google.android.finsky.layout.ap, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        getViewTreeObserver().addOnPreDrawListener(new av(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return !this.f3136b.b() || this.f3136b.getBodyLineCount() <= this.f3135a;
    }

    @Override // com.google.android.finsky.layout.ap
    protected final void a() {
        scrollTo(0, 0);
        if (this.d) {
            this.d = false;
            return;
        }
        if (!b()) {
            if (this.e) {
                this.e = false;
                this.f3136b.setBodyMaxLines(this.f3135a);
                this.c.setVisibility(0);
            } else {
                this.e = true;
                this.f3136b.setBodyMaxLines(Integer.MAX_VALUE);
                this.c.setVisibility(8);
            }
        }
    }
}
