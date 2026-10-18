package com.google.android.finsky.layout;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.android.vending.R;
import java.util.List;

/* loaded from: classes.dex */
final class c extends ArrayAdapter<String> implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AddressAutoComplete f3178a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.google.android.finsky.placesapi.e> f3179b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AddressAutoComplete addressAutoComplete, Context context) {
        super(context, R.layout.address_suggestion_item);
        this.f3178a = addressAutoComplete;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        if (this.f3179b != null) {
            return this.f3179b.size();
        }
        return 0;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Filterable
    public final Filter getFilter() {
        return new d(this.f3178a, (byte) 0);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        return this.f3179b.get(i).f3565a;
    }
}
