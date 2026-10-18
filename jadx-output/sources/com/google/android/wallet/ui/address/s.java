package com.google.android.wallet.ui.address;

import android.text.TextUtils;
import android.util.Log;
import android.widget.Filter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class s extends Filter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f7399a;

    s(r rVar) {
        this.f7399a = rVar;
    }

    private ArrayList<com.google.android.wallet.common.a.d> a(CharSequence charSequence) {
        List<com.google.android.wallet.common.a.c> list;
        char c;
        int i;
        String str;
        if (charSequence != null) {
            list = this.f7399a.i;
            for (com.google.android.wallet.common.a.c cVar : list) {
                try {
                    c = this.f7399a.g;
                    char[] cArr = this.f7399a.f7397a;
                    i = this.f7399a.e;
                    str = this.f7399a.f;
                    ArrayList<com.google.android.wallet.common.a.d> a2 = a(cVar.a(charSequence, c, cArr, i, str), cVar.a());
                    if (a2 != null && !a2.isEmpty()) {
                        return a2;
                    }
                } catch (Throwable th) {
                    String valueOf = String.valueOf(cVar.a());
                    Log.e("AddressSourceResultAdap", valueOf.length() != 0 ? "Could not fetch addresses from ".concat(valueOf) : new String("Could not fetch addresses from "), th);
                }
            }
        }
        return new ArrayList<>();
    }

    private ArrayList<com.google.android.wallet.common.a.d> a(List<com.google.android.wallet.common.a.d> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList<com.google.android.wallet.common.a.d> arrayList = new ArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (com.google.android.wallet.common.a.d dVar : list) {
            if (dVar.e != null) {
                if (!a(dVar.e)) {
                    if (!b(dVar.e)) {
                        String str2 = dVar.d;
                        if (!TextUtils.isEmpty(str2) && !linkedHashMap.containsKey(str2)) {
                            linkedHashMap.put(str2, Integer.valueOf(arrayList.size()));
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(dVar.f)) {
                arrayList.add(dVar);
                if (!TextUtils.isEmpty(dVar.d)) {
                    linkedHashMap.put(dVar.d, -1);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            int i = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (intValue != -1) {
                    arrayList.add(intValue + i, new com.google.android.wallet.common.a.d((String) entry.getKey(), str));
                    i++;
                }
            }
        }
        return arrayList;
    }

    private boolean a(com.google.c.a.b bVar) {
        char[] cArr;
        char[] cArr2;
        cArr = this.f7399a.h;
        if (cArr == null || bVar.q.length == 0) {
            return false;
        }
        cArr2 = this.f7399a.h;
        boolean z = false;
        for (char c : cArr2) {
            switch (c) {
                case '1':
                case '2':
                case '3':
                case 'A':
                case 'N':
                    break;
                default:
                    if (com.google.android.wallet.common.a.a.a(c)) {
                        z = true;
                        if (!TextUtils.isEmpty(com.google.android.wallet.common.a.b.a(bVar, c))) {
                            return false;
                        }
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return z;
    }

    private boolean b(com.google.c.a.b bVar) {
        char[] cArr;
        char[] cArr2;
        boolean z;
        cArr = this.f7399a.h;
        if (cArr == null) {
            return true;
        }
        cArr2 = this.f7399a.h;
        for (char c : cArr2) {
            if (c == 'A') {
                c = '1';
            }
            char[] cArr3 = this.f7399a.f7397a;
            if (cArr3 != null) {
                for (char c2 : cArr3) {
                    if (c2 == c) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z && TextUtils.isEmpty(com.google.android.wallet.common.a.b.a(bVar, c))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList<com.google.android.wallet.common.a.d> a2 = a(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = a2;
        filterResults.count = a2.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        ArrayList<com.google.android.wallet.common.a.d> arrayList = (ArrayList) filterResults.values;
        this.f7399a.c = charSequence;
        this.f7399a.f7398b = arrayList;
        if (this.f7399a.f7398b != null && !this.f7399a.f7398b.isEmpty()) {
            this.f7399a.notifyDataSetChanged();
        } else {
            this.f7399a.notifyDataSetInvalidated();
        }
    }

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return obj instanceof com.google.android.wallet.common.a.d ? ((com.google.android.wallet.common.a.d) obj).d : super.convertResultToString(obj);
    }
}
