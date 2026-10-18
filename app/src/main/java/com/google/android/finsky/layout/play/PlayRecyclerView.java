package com.google.android.finsky.layout.play;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.dt;
import android.support.v7.widget.dv;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public class PlayRecyclerView extends RecyclerView {
    private View q;
    private dv r;

    public PlayRecyclerView(Context context) {
        super(context);
    }

    public PlayRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final Parcelable n() {
        return super.onSaveInstanceState();
    }

    public final void a(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    public void setEmptyView(View view) {
        this.q = view;
        j();
        setupEmptyViewObserver(getAdapter());
    }

    private void setupEmptyViewObserver(dt dtVar) {
        if (dtVar != null) {
            if (this.r != null) {
                dtVar.b(this.r);
                this.r = null;
            }
            this.r = new cw(this);
            dtVar.a(this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        dt adapter = getAdapter();
        boolean z = adapter == null || adapter.a() == 0;
        if (this.q != null) {
            this.q.setVisibility(z ? 0 : 8);
        }
        setVisibility((!z || this.q == null) ? 0 : 8);
    }

    @Override // android.support.v7.widget.RecyclerView
    public void setAdapter(dt dtVar) {
        if (getAdapter() != null && this.r != null) {
            getAdapter().b(this.r);
            this.r = null;
        }
        super.setAdapter(dtVar);
        setupEmptyViewObserver(dtVar);
        j();
    }
}
