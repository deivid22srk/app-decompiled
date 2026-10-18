package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import java.util.List;

/* loaded from: classes.dex */
public class AddressAutoComplete extends AutoCompleteTextView implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    private c f2919a;

    /* renamed from: b, reason: collision with root package name */
    private g f2920b;
    private boolean c;

    static /* synthetic */ boolean c(AddressAutoComplete addressAutoComplete) {
        addressAutoComplete.c = false;
        return false;
    }

    public AddressAutoComplete(Context context) {
        this(context, null);
    }

    public AddressAutoComplete(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AddressAutoComplete(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f2919a = new c(this, getContext());
        setAdapter(this.f2919a);
        setOnItemClickListener(this);
    }

    public synchronized void setSuggestionProvider(g gVar) {
        this.f2920b = gVar;
    }

    public final synchronized void a() {
        this.c = true;
    }

    @Override // android.widget.AutoCompleteTextView
    protected void replaceText(CharSequence charSequence) {
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        List list;
        if (this.f2920b != null) {
            g gVar = this.f2920b;
            list = this.f2919a.f3179b;
            gVar.a((com.google.android.finsky.placesapi.e) list.get(i));
        }
    }
}
