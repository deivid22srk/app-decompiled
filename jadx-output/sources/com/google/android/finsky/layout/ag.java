package com.google.android.finsky.layout;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.ht;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class ag extends cv {

    /* renamed from: a, reason: collision with root package name */
    private final List<com.google.android.finsky.utils.eo> f3127a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final LayoutInflater f3128b;
    private final Context c;
    private final boolean d;

    public ag(Context context, String str, String[] strArr, boolean z) {
        com.google.android.finsky.utils.ep a2;
        this.c = context;
        this.f3128b = LayoutInflater.from(context);
        PackageInfo a3 = h.a(context.getPackageManager(), str);
        this.d = a3 != null;
        Set<String> a4 = h.a(a3);
        Set set = null;
        if (a4 != null) {
            Set a5 = ht.a(strArr);
            a5.removeAll(a4);
            set = ht.a(strArr);
            set.removeAll(a5);
        }
        if (z) {
            a2 = com.google.android.finsky.utils.dz.a(strArr, set);
        } else {
            a2 = com.google.android.finsky.utils.er.a(strArr, set, true, true);
        }
        List<com.google.android.finsky.utils.eo> list = this.f3127a;
        ArrayList arrayList = new ArrayList();
        for (com.google.android.finsky.utils.eo eoVar : a2.f4855a) {
            if (eoVar != null) {
                arrayList.add(eoVar);
            }
        }
        list.addAll(arrayList);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3127a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.f3127a.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // com.google.android.finsky.layout.cv
    public final boolean a() {
        return this.d;
    }

    @Override // com.google.android.finsky.layout.cv
    public final boolean b() {
        return this.f3127a.size() == 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        com.google.android.finsky.utils.eo eoVar = this.f3127a.get(i);
        View inflate = this.f3128b.inflate(R.layout.permission_row, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.header);
        TextView textView2 = (TextView) inflate.findViewById(R.id.content);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.expander_icon);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.bucket_icon);
        imageView.setVisibility(8);
        textView.setText(eoVar.f4854b);
        StringBuilder sb = new StringBuilder();
        boolean z = eoVar.e.size() > 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= eoVar.f.size()) {
                break;
            }
            if (this.d) {
                str = this.c.getString(R.string.new_permission, eoVar.f.get(i3));
            } else {
                str = eoVar.f.get(i3);
            }
            sb.append(this.c.getString(R.string.bulleted_line_item, str));
            if (i3 < eoVar.f.size() - 1 || z) {
                sb.append("<br>");
            }
            i2 = i3 + 1;
        }
        for (int i4 = 0; i4 < eoVar.e.size(); i4++) {
            sb.append(this.c.getString(R.string.bulleted_line_item, eoVar.e.get(i4)));
            if (i4 < eoVar.e.size() - 1) {
                sb.append("<br>");
            }
        }
        textView2.setText(Html.fromHtml(sb.toString()));
        imageView2.setImageResource(eoVar.d);
        textView2.setVisibility(0);
        return inflate;
    }
}
