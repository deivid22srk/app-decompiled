package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.gw;
import com.google.android.gms.internal.hv;

@gw
/* loaded from: classes.dex */
final class d extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    hv f5321a;

    public d(Context context, String str) {
        super(context);
        this.f5321a = new hv(context, str);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hv hvVar = this.f5321a;
        int historySize = motionEvent.getHistorySize();
        for (int i = 0; i < historySize; i++) {
            hvVar.a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i));
        }
        hvVar.a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
        return false;
    }
}
