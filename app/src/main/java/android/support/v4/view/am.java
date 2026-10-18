package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
final class am extends ak implements LayoutInflater.Factory2 {
    am(an anVar) {
        super(anVar);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f335a.a(view, str, context, attributeSet);
    }
}
