package android.support.v7.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class ay implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Field f678a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ PopupWindow f679b;
    final /* synthetic */ ViewTreeObserver.OnScrollChangedListener c;

    ay(Field field, PopupWindow popupWindow, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f678a = field;
        this.f679b = popupWindow;
        this.c = onScrollChangedListener;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        try {
            WeakReference weakReference = (WeakReference) this.f678a.get(this.f679b);
            if (weakReference != null && weakReference.get() != null) {
                this.c.onScrollChanged();
            }
        } catch (IllegalAccessException e) {
        }
    }
}
