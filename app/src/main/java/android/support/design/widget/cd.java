package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
class cd extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private int f130a;

    public cd(Context context) {
        this(context, null);
    }

    public cd(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cd(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f130a = getVisibility();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        a(i, true);
    }

    final void a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f130a = i;
        }
    }

    final int getUserSetVisibility() {
        return this.f130a;
    }
}
