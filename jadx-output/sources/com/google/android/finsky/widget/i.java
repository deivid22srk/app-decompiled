package com.google.android.finsky.widget;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.vending.R;
import com.google.android.finsky.protos.pt;
import java.util.List;

/* loaded from: classes.dex */
final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f5212a;

    /* renamed from: b, reason: collision with root package name */
    private final List<pt> f5213b;
    private final ActivityManager c;
    private final int d;

    public i(Activity activity, List<pt> list, int i) {
        this.f5212a = activity;
        this.f5213b = list;
        this.d = i;
        this.c = (ActivityManager) this.f5212a.getSystemService("activity");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f5213b.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public pt getItem(int i) {
        return this.f5213b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return b(i);
    }

    private int b(int i) {
        return getItem(i).f4268a;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Drawable drawable;
        if (view == null) {
            view = LayoutInflater.from(this.f5212a).inflate(R.layout.widget_configuration_choice, viewGroup, false);
        }
        k kVar = (k) view.getTag();
        if (kVar == null) {
            kVar = new k(view);
        }
        int b2 = b(i);
        kVar.f5217b.setText(getItem(i).c);
        int launcherLargeIconDensity = this.c.getLauncherLargeIconDensity();
        int b3 = s.b(b2);
        Resources resources = this.f5212a.getResources();
        Resources.Theme theme = this.f5212a.getTheme();
        if (Build.VERSION.SDK_INT < 21) {
            if (Build.VERSION.SDK_INT < 15) {
                drawable = resources.getDrawable(b3);
            } else {
                drawable = resources.getDrawableForDensity(b3, launcherLargeIconDensity);
            }
        } else {
            drawable = resources.getDrawableForDensity(b3, launcherLargeIconDensity, theme);
        }
        kVar.c.setImageDrawable(drawable);
        kVar.f5216a.setOnClickListener(new j(this, b2));
        return view;
    }
}
