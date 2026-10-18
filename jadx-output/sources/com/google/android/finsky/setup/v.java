package com.google.android.finsky.setup;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.protos.nu;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class v extends ArrayAdapter<nu> {

    /* renamed from: a, reason: collision with root package name */
    private final nu[] f4679a;

    public v(Context context, nu[] nuVarArr) {
        super(context, R.layout.restore_device_row_entry, nuVarArr);
        this.f4679a = nuVarArr;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f4679a.length + 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int itemViewType = getItemViewType(i);
        Context context = getContext();
        LayoutInflater from = LayoutInflater.from(context);
        if (itemViewType == 0) {
            if (view != null) {
                return view;
            }
            View inflate = from.inflate(R.layout.restore_as_new_device_row_entry, viewGroup, false);
            ((CheckedTextView) inflate).setText(context.getResources().getString(R.string.setup_wizard_setup_as_new_option));
            return inflate;
        }
        if (view == null) {
            view = from.inflate(R.layout.restore_device_row_entry, viewGroup, false);
            w wVar = new w();
            wVar.f4681b = (CheckedTextView) view.findViewById(R.id.setup_wizard_device_name);
            wVar.f4680a = (TextView) view.findViewById(R.id.device_usage_time);
            view.setTag(wVar);
        }
        w wVar2 = (w) view.getTag();
        nu nuVar = this.f4679a[i - 1];
        wVar2.f4681b.setText(nuVar.c);
        TextView textView = wVar2.f4680a;
        long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - nuVar.g);
        Resources resources = context.getResources();
        textView.setText(days == 0 ? resources.getString(R.string.setup_wizard_device_last_used_today_message) : resources.getQuantityString(R.plurals.setup_wizard_device_last_used_message, (int) days, Long.valueOf(days)));
        return view;
    }
}
