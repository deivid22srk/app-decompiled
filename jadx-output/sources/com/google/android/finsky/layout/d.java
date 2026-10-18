package com.google.android.finsky.layout;

import android.widget.Filter;
import java.util.List;

/* loaded from: classes.dex */
final class d extends Filter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AddressAutoComplete f3213a;

    private d(AddressAutoComplete addressAutoComplete) {
        this.f3213a = addressAutoComplete;
    }

    /* synthetic */ d(AddressAutoComplete addressAutoComplete, byte b2) {
        this(addressAutoComplete);
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        boolean z;
        g gVar;
        List<com.google.android.finsky.placesapi.e> a2;
        synchronized (this.f3213a) {
            z = this.f3213a.c;
            gVar = this.f3213a.f2920b;
            AddressAutoComplete.c(this.f3213a);
        }
        if (gVar == null || z || (a2 = gVar.a(charSequence)) == null) {
            return null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        filterResults.values = a2;
        filterResults.count = a2.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        c cVar;
        c cVar2;
        c cVar3;
        if (filterResults == null || filterResults.count <= 0) {
            cVar = this.f3213a.f2919a;
            cVar.notifyDataSetInvalidated();
        } else {
            cVar2 = this.f3213a.f2919a;
            cVar2.f3179b = (List) filterResults.values;
            cVar3 = this.f3213a.f2919a;
            cVar3.notifyDataSetChanged();
        }
    }
}
