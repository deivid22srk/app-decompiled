package android.support.v7.widget;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
final class df implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cu f762a;

    private df(cu cuVar) {
        this.f762a = cuVar;
    }

    /* synthetic */ df(cu cuVar, byte b2) {
        this(cuVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        cx cxVar;
        cx cxVar2;
        cx cxVar3;
        cx cxVar4;
        cx cxVar5;
        PopupWindow popupWindow;
        cxVar = this.f762a.d;
        if (cxVar != null) {
            cxVar2 = this.f762a.d;
            if (android.support.v4.view.by.J(cxVar2)) {
                cxVar3 = this.f762a.d;
                int count = cxVar3.getCount();
                cxVar4 = this.f762a.d;
                if (count > cxVar4.getChildCount()) {
                    cxVar5 = this.f762a.d;
                    if (cxVar5.getChildCount() <= this.f762a.j) {
                        popupWindow = this.f762a.c;
                        popupWindow.setInputMethodMode(2);
                        this.f762a.b();
                    }
                }
            }
        }
    }
}
