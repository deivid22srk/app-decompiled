package com.google.android.finsky.layout;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class bv {

    /* renamed from: a, reason: collision with root package name */
    final by f3172a;

    /* renamed from: b, reason: collision with root package name */
    protected final View f3173b;
    protected int c;
    int d;
    volatile boolean e;
    private final Handler f;
    private final int g;
    private final int h;
    private final View.OnClickListener i;

    public bv(View view, int i, int i2, by byVar, int i3) {
        this.f = new Handler();
        this.i = new bw(this);
        this.e = false;
        this.c = i;
        this.g = R.id.page_error_indicator;
        this.h = i2;
        this.f3173b = view;
        this.f3172a = byVar;
        this.d = i3;
    }

    public bv(View view, int i, by byVar) {
        this.f = new Handler();
        this.i = new bw(this);
        this.e = false;
        this.c = i;
        this.g = R.id.error_indicator;
        this.h = R.id.loading_indicator;
        this.f3173b = view;
        this.f3172a = byVar;
        this.d = 3;
        a(false);
        a(false, (String) null);
        a(false, false);
    }

    public final void a() {
        a(0, (String) null);
    }

    public final void a(int i) {
        this.e = true;
        this.f.postDelayed(new bx(this), i);
    }

    public final void b() {
        a(2, (String) null);
    }

    public final void a(String str) {
        a(1, str);
    }

    public final void a(int i, String str) {
        bv bvVar;
        boolean z;
        bv bvVar2;
        this.e = false;
        if (this.d != i) {
            switch (this.d) {
                case 0:
                    a(false);
                    if (i != 2) {
                        bvVar = this;
                        bvVar2 = bvVar;
                        z = false;
                        bvVar2.a(false, z);
                        break;
                    }
                    break;
                case 1:
                    a(false, (String) null);
                    break;
                case 2:
                    if (i == 0) {
                        z = true;
                        bvVar2 = this;
                        bvVar2.a(false, z);
                        break;
                    } else {
                        bvVar = this;
                        bvVar2 = bvVar;
                        z = false;
                        bvVar2.a(false, z);
                    }
            }
            switch (i) {
                case 0:
                    a(true);
                    break;
                case 1:
                    a(true, str);
                    break;
                case 2:
                    a(true, false);
                    break;
                case 3:
                    break;
                default:
                    throw new IllegalStateException("Invalid mode " + i + "should be LOADING_MODE, ERROR_MODE, DATA_MODE, or BLANK_MODE");
            }
            this.d = i;
        }
    }

    private void a(boolean z) {
        this.f3173b.findViewById(this.h).setVisibility(z ? 0 : 8);
    }

    private void a(boolean z, String str) {
        View findViewById = this.f3173b.findViewById(this.g);
        findViewById.setVisibility(z ? 0 : 8);
        if (z) {
            ((TextView) findViewById.findViewById(R.id.error_msg)).setText(str);
        }
        ((Button) findViewById.findViewById(R.id.retry_button)).setOnClickListener(z ? this.i : null);
    }

    protected void a(boolean z, boolean z2) {
        ViewGroup viewGroup;
        if (this.c > 0 && (viewGroup = (ViewGroup) this.f3173b.findViewById(this.c)) != null) {
            viewGroup.setVisibility(z ? 0 : 8);
        }
    }
}
