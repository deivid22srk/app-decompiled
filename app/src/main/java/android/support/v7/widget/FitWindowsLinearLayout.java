package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements cg {

    /* renamed from: a, reason: collision with root package name */
    private ch f622a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v7.widget.cg
    public void setOnFitSystemWindowsListener(ch chVar) {
        this.f622a = chVar;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        if (this.f622a != null) {
            this.f622a.a(rect);
        }
        return super.fitSystemWindows(rect);
    }
}
