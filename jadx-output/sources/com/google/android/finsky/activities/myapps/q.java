package com.google.android.finsky.activities.myapps;

import android.annotation.TargetApi;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.billing.ar;
import com.google.android.finsky.utils.cz;
import com.google.android.play.layout.PlayActionButton;
import java.util.ArrayList;
import java.util.List;

@TargetApi(11)
/* loaded from: classes.dex */
final class q implements AbsListView.MultiChoiceModeListener {

    /* renamed from: a, reason: collision with root package name */
    private final o f1837a;

    /* synthetic */ q(o oVar, byte b2) {
        this(oVar);
    }

    private q(o oVar) {
        this.f1837a = oVar;
    }

    @Override // android.widget.AbsListView.MultiChoiceModeListener
    public final void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        ActionMode actionMode2;
        int size = a().size();
        actionMode2 = this.f1837a.q;
        actionMode2.setTitle(this.f1837a.d.getResources().getQuantityString(R.plurals.my_apps_selected, size, Integer.valueOf(size)));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getMenuInflater().inflate(R.menu.my_apps_actions, menu);
        this.f1837a.q = actionMode;
        MenuItem findItem = menu.findItem(R.id.install_button);
        View inflate = this.f1837a.d.getLayoutInflater().inflate(R.layout.my_apps_bulk_install_button, (ViewGroup) null);
        PlayActionButton playActionButton = (PlayActionButton) inflate.findViewById(R.id.bulk_install_button);
        playActionButton.setActionStyle(1);
        playActionButton.a(3, R.string.install, new r(this, actionMode, findItem));
        findItem.setActionView(inflate);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ac acVar;
        boolean z;
        acVar = this.f1837a.m;
        List<Document> a2 = a();
        switch (menuItem.getItemId()) {
            case R.id.install_button /* 2131886927 */:
                if (acVar.B.a("progress_dialog") == null) {
                    acVar.f1808b.f();
                    acVar.c = ar.u();
                    acVar.c.a(acVar.B, "progress_dialog");
                    ArrayList<String> a3 = ac.a(a2);
                    String j = FinskyApp.a().j();
                    com.google.android.finsky.api.model.f fVar = new com.google.android.finsky.api.model.f(acVar.aq, a3, null, false);
                    fVar.a(new ah(acVar, fVar, j));
                    fVar.a(new ai(acVar));
                }
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return z;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f1837a.q = null;
        this.f1837a.c.post(new s(this));
    }

    private List<Document> a() {
        SparseBooleanArray checkedItemPositions = this.f1837a.c.getCheckedItemPositions();
        ArrayList a2 = cz.a(checkedItemPositions.size());
        for (int i = 0; i < checkedItemPositions.size(); i++) {
            int keyAt = checkedItemPositions.keyAt(i);
            if (checkedItemPositions.get(keyAt)) {
                a2.add(this.f1837a.f1835b.a(keyAt));
            }
        }
        return a2;
    }
}
