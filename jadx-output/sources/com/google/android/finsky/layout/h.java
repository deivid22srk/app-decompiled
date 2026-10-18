package com.google.android.finsky.layout;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends cv {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3279a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.google.android.finsky.utils.eo> f3280b = new ArrayList();
    private final List<com.google.android.finsky.utils.eo> c = new ArrayList();
    private LayoutInflater d;
    private Context e;

    public h(Context context, String str, String[] strArr, boolean z) {
        this.e = context;
        this.d = LayoutInflater.from(context);
        PackageInfo a2 = a(context.getPackageManager(), str);
        this.f3279a = a2 != null;
        com.google.android.finsky.utils.ep a3 = com.google.android.finsky.utils.er.a(strArr, a(a2), z);
        com.google.android.finsky.utils.eo[] eoVarArr = a3.f4855a;
        for (int i = 0; i < eoVarArr.length; i++) {
            com.google.android.finsky.utils.eo eoVar = eoVarArr[i];
            if (eoVar != null) {
                boolean a4 = eoVar.a();
                boolean b2 = eoVar.b();
                if (i != a3.f4856b) {
                    if (a4) {
                        this.f3280b.add(eoVar);
                    } else if (b2) {
                        this.c.add(eoVar);
                    }
                } else {
                    if (b2) {
                        this.c.add(eoVar);
                    }
                    if (a4) {
                        this.f3280b.add(eoVar);
                    }
                }
            }
        }
    }

    @Override // com.google.android.finsky.layout.cv
    public final boolean a() {
        return this.f3279a;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size() + Math.min(1, this.f3280b.size());
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return i < this.c.size() ? this.c.get(i) : this.f3280b;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public static Set<String> a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        if (packageInfo.requestedPermissions != null) {
            for (String str : packageInfo.requestedPermissions) {
                hashSet.add(str);
            }
            return hashSet;
        }
        return hashSet;
    }

    public static PackageInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 4096);
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String string;
        if (i < this.c.size()) {
            com.google.android.finsky.utils.eo eoVar = this.c.get(i);
            if (eoVar.f4853a == 16) {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < eoVar.f.size(); i2++) {
                    sb.append(this.e.getString(R.string.bulleted_line_item, eoVar.f.get(i2)));
                    sb.append("\n");
                }
                string = sb.toString();
            } else {
                string = this.e.getString(eoVar.c);
            }
            return a(viewGroup, eoVar, string);
        }
        return a(viewGroup, this.f3280b);
    }

    private View a(ViewGroup viewGroup, List<com.google.android.finsky.utils.eo> list) {
        int size = list.size();
        if (size == 0 || size == 17) {
            FinskyLog.e("numBuckets=[" + size + "]", new Object[0]);
        }
        String str = null;
        String string = size > 0 ? this.e.getString(list.get(0).f4854b) : null;
        String string2 = size > 1 ? this.e.getString(list.get(1).f4854b) : null;
        String string3 = size > 2 ? this.e.getString(list.get(2).f4854b) : null;
        String string4 = size > 3 ? this.e.getString(list.get(3).f4854b) : null;
        String string5 = size > 4 ? this.e.getString(list.get(4).f4854b) : null;
        String string6 = size > 5 ? this.e.getString(list.get(5).f4854b) : null;
        switch (size) {
            case 1:
                str = this.e.getString(list.get(0).f4854b);
                break;
            case 2:
                str = this.e.getString(R.string.multiple_items_2, string, string2);
                break;
            case 3:
                str = this.e.getString(R.string.multiple_items_3, string, string2, string3);
                break;
            case 4:
                str = this.e.getString(R.string.multiple_items_4, string, string2, string3, string4);
                break;
            case 5:
                str = this.e.getString(R.string.multiple_items_5, string, string2, string3, string4, string5);
                break;
            case 6:
                str = this.e.getString(R.string.multiple_items_6, string, string2, string3, string4, string5, string6);
                break;
        }
        View inflate = this.d.inflate(R.layout.existing_permissions_row, viewGroup, false);
        ((ImageView) inflate.findViewById(R.id.bucket_icon)).setImageResource(R.drawable.ic_perm_check);
        TextView textView = (TextView) inflate.findViewById(R.id.header);
        TextView textView2 = (TextView) inflate.findViewById(R.id.short_description);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.expander_icon);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.detailed_buckets);
        textView.setText(R.string.already_has_access_to);
        textView2.setText(str);
        View findViewById = inflate.findViewById(R.id.permission_row);
        findViewById.setTag(false);
        inflate.setOnClickListener(new i(this, findViewById, imageView, viewGroup2, textView2));
        for (com.google.android.finsky.utils.eo eoVar : list) {
            View a2 = a(viewGroup, eoVar, this.e.getString(eoVar.c));
            a2.findViewById(R.id.expander_icon).setVisibility(8);
            a2.setOnClickListener(null);
            a2.setClickable(false);
            a2.setBackgroundResource(R.drawable.focus_overlay);
            a2.findViewById(R.id.content).setVisibility(0);
            viewGroup2.addView(a2);
        }
        return inflate;
    }

    private View a(ViewGroup viewGroup, com.google.android.finsky.utils.eo eoVar, String str) {
        View inflate = this.d.inflate(R.layout.permission_row, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.header);
        TextView textView2 = (TextView) inflate.findViewById(R.id.content);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.expander_icon);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.bucket_icon);
        textView.setText(eoVar.f4854b);
        textView2.setText(str);
        imageView2.setImageResource(eoVar.d);
        textView2.setVisibility(8);
        inflate.setOnClickListener(new j(this, textView2, imageView));
        inflate.setBackgroundResource(R.drawable.play_highlight_overlay_light);
        return inflate;
    }

    @Override // com.google.android.finsky.layout.cv
    public final boolean b() {
        return !(this.c.size() > 0);
    }
}
