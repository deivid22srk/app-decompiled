package com.google.android.finsky.setup;

import android.widget.TextView;
import com.android.vending.R;

/* loaded from: classes.dex */
final class o {
    private static final int[] d = {R.string.setup_wizard_ellipse_single, R.string.setup_wizard_ellipse_double, R.string.setup_wizard_ellipse_triple};

    /* renamed from: a, reason: collision with root package name */
    TextView f4670a;
    private int e = 0;

    /* renamed from: b, reason: collision with root package name */
    boolean f4671b = false;
    Runnable c = new p(this);

    public o(TextView textView) {
        this.f4670a = textView;
    }

    static /* synthetic */ void a(o oVar) {
        oVar.e = (oVar.e + 1) % (d.length + 1);
        if (oVar.e == 0) {
            oVar.f4670a.setText("");
        } else {
            oVar.f4670a.setText(d[oVar.e - 1]);
        }
        oVar.f4670a.invalidate();
    }
}
