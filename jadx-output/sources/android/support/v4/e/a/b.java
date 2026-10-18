package android.support.v4.e.a;

import android.support.v4.view.ay;
import android.support.v4.view.n;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public interface b extends MenuItem {
    b a(ay ayVar);

    b a(n nVar);

    n a();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i);
}
