package com.google.android.finsky.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.deivid22srk.store.R;
import com.google.android.finsky.layout.ErrorFooter;

/* loaded from: classes.dex */
public abstract class aj extends BaseAdapter implements com.google.android.finsky.api.model.x {
    public final LayoutInflater c;
    public final Context d;
    public final com.google.android.finsky.navigationmanager.b e;
    protected View.OnClickListener g = new ak(this);
    public int f = 1;

    public abstract void a();

    public abstract String b();

    public abstract boolean c();

    public aj(Context context, com.google.android.finsky.navigationmanager.b bVar) {
        this.d = context;
        this.e = bVar;
        this.c = LayoutInflater.from(context);
    }

    public final View a(View view, ViewGroup viewGroup) {
        ErrorFooter errorFooter = (ErrorFooter) (view != null ? view : a(R.layout.error_footer, viewGroup));
        errorFooter.a(b(), this.g);
        errorFooter.setIdentifier("error_footer");
        return errorFooter;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    public final View a(int i, ViewGroup viewGroup) {
        return this.c.inflate(i, viewGroup, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        this.f = i;
        notifyDataSetChanged();
    }

    @Override // com.google.android.finsky.api.model.x
    public final void m_() {
        if (c()) {
            a(1);
        } else {
            a(0);
        }
    }
}
