package com.google.android.finsky.layout;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.deivid22srk.store.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class AppSecurityPermissions extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private Context f2923a;

    /* renamed from: b, reason: collision with root package name */
    private int f2924b;
    private cv c;
    private String d;
    private final List<View> e;

    public AppSecurityPermissions(Context context) {
        this(context, null);
    }

    public AppSecurityPermissions(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList();
        this.f2924b = 0;
    }

    public final void a(cv cvVar, String str, Bundle bundle) {
        this.f2923a = getContext();
        this.d = str;
        this.c = cvVar;
        if (this.f2924b == 0) {
            this.f2924b = com.google.android.finsky.utils.ax.a(bundle, this.d + ":" + getId());
        }
        a();
    }

    public final void a(Bundle bundle) {
        com.google.android.finsky.utils.ax.a(bundle, this.d + ":" + getId(), this.f2924b);
    }

    private void a() {
        removeAllViews();
        this.e.clear();
        int count = this.c.getCount();
        if (!this.c.b()) {
            for (int i = 0; i < count; i++) {
                View view = this.c.getView(i, null, this);
                this.e.add(view);
                addView(view);
            }
            return;
        }
        TextView textView = (TextView) LayoutInflater.from(this.f2923a).inflate(R.layout.no_permissions_required, (ViewGroup) this, false);
        String b2 = com.google.android.finsky.c.d.E.b();
        if (!TextUtils.isEmpty(b2)) {
            textView.setText(Html.fromHtml(getResources().getString(this.c.a() ? R.string.no_new_dangerous_permissions_with_learn_more_link : R.string.no_dangerous_permissions_with_learn_more_link, this.d, b2)));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            textView.setText(Html.fromHtml(this.c.a() ? this.f2923a.getString(R.string.no_new_dangerous_permissions, this.d) : this.f2923a.getString(R.string.no_dangerous_permissions, this.d)));
        }
        addView(textView);
    }
}
