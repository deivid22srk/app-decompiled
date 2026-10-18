package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
class ak implements LayoutInflater.Factory {

    /* renamed from: a, reason: collision with root package name */
    final an f335a;

    ak(an anVar) {
        this.f335a = anVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.f335a.a(null, str, context, attributeSet);
    }

    public String toString() {
        return getClass().getName() + "{" + this.f335a + "}";
    }
}
