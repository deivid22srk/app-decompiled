package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements cg {

    /* renamed from: a, reason: collision with root package name */
    private ch f621a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v7.widget.cg
    public void setOnFitSystemWindowsListener(ch chVar) {
        this.f621a = chVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f621a != null) {
            this.f621a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
