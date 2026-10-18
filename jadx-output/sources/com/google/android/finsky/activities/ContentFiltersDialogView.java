package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.deivid22srk.store.R;
import com.google.android.finsky.utils.FinskyLog;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* loaded from: classes.dex */
public class ContentFiltersDialogView extends LinearLayout implements AdapterView.OnItemClickListener, go {

    /* renamed from: a, reason: collision with root package name */
    private com.google.android.finsky.c.b[] f1514a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.finsky.protos.ew f1515b;
    private int c;
    private View.OnClickListener d;
    private ListView e;

    public ContentFiltersDialogView(Context context) {
        super(context);
    }

    public ContentFiltersDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.activities.go
    public final void a(Bundle bundle) {
        this.f1514a = com.google.android.finsky.c.a.a(bundle.getString("ContentFiltersDialogView.contentFilterSelections"));
        try {
            this.f1515b = com.google.android.finsky.protos.ew.a(bundle.getByteArray("ContentFiltersDialogView.encodedFilterRange"));
            this.e.setAdapter((ListAdapter) new com.google.android.finsky.adapters.x(getContext(), this.f1514a, this.f1515b));
            this.e.setOnItemClickListener(this);
        } catch (InvalidProtocolBufferNanoException e) {
            FinskyLog.b(e, "Cannot parse FilterRange proto from byte[] in arguments.", new Object[0]);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.e = (ListView) findViewById(R.id.content_filters_choice_list);
    }

    @Override // com.google.android.finsky.activities.go
    public Bundle getResult() {
        Bundle bundle = new Bundle();
        bundle.putInt("ContentFiltersDialogView.selectedChoiceIndex", this.c);
        return bundle;
    }

    public void setOnPositiveClickListener(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c = i;
        this.d.onClick(view);
    }
}
