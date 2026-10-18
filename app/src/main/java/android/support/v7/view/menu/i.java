package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.as;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class i implements android.support.v4.e.a.a {
    private static final int[] l = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    final Context f592a;

    /* renamed from: b, reason: collision with root package name */
    public j f593b;
    CharSequence f;
    Drawable g;
    View h;
    m j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private boolean o;
    private ContextMenu.ContextMenuInfo t;
    public int e = 0;
    private boolean u = false;
    private boolean v = false;
    boolean i = false;
    private boolean w = false;
    private ArrayList<m> x = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<x>> y = new CopyOnWriteArrayList<>();
    ArrayList<m> c = new ArrayList<>();
    private ArrayList<m> p = new ArrayList<>();
    private boolean q = true;
    public ArrayList<m> d = new ArrayList<>();
    private ArrayList<m> r = new ArrayList<>();
    private boolean s = true;

    public i(Context context) {
        this.f592a = context;
        this.m = context.getResources();
        this.o = this.m.getConfiguration().keyboard != 1 && this.m.getBoolean(android.support.v7.b.c.abc_config_showMenuShortcutsWhenKeyboardPresent);
    }

    public final void a(x xVar) {
        a(xVar, this.f592a);
    }

    public final void a(x xVar, Context context) {
        this.y.add(new WeakReference<>(xVar));
        xVar.a(context, this);
        this.s = true;
    }

    public final void b(x xVar) {
        Iterator<WeakReference<x>> it = this.y.iterator();
        while (it.hasNext()) {
            WeakReference<x> next = it.next();
            x xVar2 = next.get();
            if (xVar2 == null || xVar2 == xVar) {
                this.y.remove(next);
            }
        }
    }

    public final void a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray<Parcelable> sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a2 = as.a(item);
            if (a2 != null && a2.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                a2.saveHierarchyState(sparseArray);
                if (as.d(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray<Parcelable> sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((ad) item.getSubMenu()).a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public final void b(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View a2 = as.a(item);
                if (a2 != null && a2.getId() != -1) {
                    a2.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((ad) item.getSubMenu()).b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                as.b(findItem);
            }
        }
    }

    protected String a() {
        return "android:menu:actionviewstates";
    }

    public void a(j jVar) {
        this.f593b = jVar;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        m mVar = (m) a(i, i2, i3, charSequence);
        ad adVar = new ad(this.f592a, this, mVar);
        mVar.a(adVar);
        return adVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f592a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    private void a(int i, boolean z) {
        if (i >= 0 && i < this.c.size()) {
            this.c.remove(i);
            if (z) {
                b(true);
            }
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.j != null) {
            b(this.j);
        }
        this.c.clear();
        b(true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.c.get(i2);
            if (mVar.getGroupId() == i) {
                mVar.a(z2);
                mVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.c.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            m mVar = this.c.get(i2);
            i2++;
            z2 = (mVar.getGroupId() == i && mVar.b(z)) ? true : z2;
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.c.get(i2);
            if (mVar.getGroupId() == i) {
                mVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.c.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.c.get(i2);
            if (mVar.getItemId() != i) {
                if (mVar.hasSubMenu() && (findItem = mVar.getSubMenu().findItem(i)) != null) {
                    return findItem;
                }
            } else {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public int size() {
        return this.c.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        b(false);
    }

    boolean b() {
        return this.n;
    }

    public boolean c() {
        return this.o;
    }

    boolean a(i iVar, MenuItem menuItem) {
        return this.f593b != null && this.f593b.a(iVar, menuItem);
    }

    private static int a(ArrayList<m> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f596a <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        m a2 = a(i, keyEvent);
        boolean z = false;
        if (a2 != null) {
            z = a(a2, (x) null, i2);
        }
        if ((i2 & 2) != 0) {
            a(true);
        }
        return z;
    }

    private void a(List<m> list, int i, KeyEvent keyEvent) {
        boolean b2 = b();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                m mVar = this.c.get(i2);
                if (mVar.hasSubMenu()) {
                    ((i) mVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = b2 ? mVar.getAlphabeticShortcut() : mVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b2 && alphabeticShortcut == '\b' && i == 67)) && mVar.isEnabled())) {
                    list.add(mVar);
                }
            }
        }
    }

    private m a(int i, KeyEvent keyEvent) {
        ArrayList<m> arrayList = this.x;
        arrayList.clear();
        a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean b2 = b();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = arrayList.get(i2);
            char alphabeticShortcut = b2 ? mVar.getAlphabeticShortcut() : mVar.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return mVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return mVar;
            }
            if (b2 && alphabeticShortcut == '\b' && i == 67) {
                return mVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), (x) null, i2);
    }

    public final boolean a(MenuItem menuItem, x xVar, int i) {
        m mVar = (m) menuItem;
        if (mVar == null || !mVar.isEnabled()) {
            return false;
        }
        boolean b2 = mVar.b();
        android.support.v4.view.n nVar = mVar.d;
        boolean z = nVar != null && nVar.e();
        if (mVar.i()) {
            boolean expandActionView = mVar.expandActionView() | b2;
            if (expandActionView) {
                a(true);
                return expandActionView;
            }
            return expandActionView;
        }
        if (mVar.hasSubMenu() || z) {
            a(false);
            if (!mVar.hasSubMenu()) {
                mVar.a(new ad(this.f592a, this, mVar));
            }
            ad adVar = (ad) mVar.getSubMenu();
            if (z) {
                nVar.a(adVar);
            }
            if (!this.y.isEmpty()) {
                r2 = xVar != null ? xVar.a(adVar) : false;
                Iterator<WeakReference<x>> it = this.y.iterator();
                boolean z2 = r2;
                while (it.hasNext()) {
                    WeakReference<x> next = it.next();
                    x xVar2 = next.get();
                    if (xVar2 == null) {
                        this.y.remove(next);
                    } else {
                        z2 = !z2 ? xVar2.a(adVar) : z2;
                    }
                }
                r2 = z2;
            }
            boolean z3 = b2 | r2;
            if (!z3) {
                a(true);
                return z3;
            }
            return z3;
        }
        if ((i & 1) == 0) {
            a(true);
        }
        return b2;
    }

    public final void a(boolean z) {
        if (!this.w) {
            this.w = true;
            Iterator<WeakReference<x>> it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference<x> next = it.next();
                x xVar = next.get();
                if (xVar == null) {
                    this.y.remove(next);
                } else {
                    xVar.a(this, z);
                }
            }
            this.w = false;
        }
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    public final void b(boolean z) {
        if (!this.u) {
            if (z) {
                this.q = true;
                this.s = true;
            }
            if (this.y.isEmpty()) {
                return;
            }
            d();
            Iterator<WeakReference<x>> it = this.y.iterator();
            while (it.hasNext()) {
                WeakReference<x> next = it.next();
                x xVar = next.get();
                if (xVar == null) {
                    this.y.remove(next);
                } else {
                    xVar.b(z);
                }
            }
            e();
            return;
        }
        this.v = true;
    }

    public final void d() {
        if (!this.u) {
            this.u = true;
            this.v = false;
        }
    }

    public final void e() {
        this.u = false;
        if (this.v) {
            this.v = false;
            b(true);
        }
    }

    final void f() {
        this.q = true;
        b(true);
    }

    final void g() {
        this.s = true;
        b(true);
    }

    public final ArrayList<m> h() {
        if (!this.q) {
            return this.p;
        }
        this.p.clear();
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            m mVar = this.c.get(i);
            if (mVar.isVisible()) {
                this.p.add(mVar);
            }
        }
        this.q = false;
        this.s = true;
        return this.p;
    }

    public final void i() {
        ArrayList<m> h = h();
        if (this.s) {
            Iterator<WeakReference<x>> it = this.y.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<x> next = it.next();
                x xVar = next.get();
                if (xVar == null) {
                    this.y.remove(next);
                } else {
                    z = xVar.a() | z;
                }
            }
            if (z) {
                this.d.clear();
                this.r.clear();
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    m mVar = h.get(i);
                    if (mVar.f()) {
                        this.d.add(mVar);
                    } else {
                        this.r.add(mVar);
                    }
                }
            } else {
                this.d.clear();
                this.r.clear();
                this.r.addAll(h());
            }
            this.s = false;
        }
    }

    public final ArrayList<m> j() {
        i();
        return this.r;
    }

    public void clearHeader() {
        this.g = null;
        this.f = null;
        this.h = null;
        b(false);
    }

    final void a(CharSequence charSequence, Drawable drawable, View view) {
        if (view != null) {
            this.h = view;
            this.f = null;
            this.g = null;
        } else {
            if (charSequence != null) {
                this.f = charSequence;
            }
            if (drawable != null) {
                this.g = drawable;
            }
            this.h = null;
        }
        b(false);
    }

    protected final i a(CharSequence charSequence) {
        a(charSequence, (Drawable) null, (View) null);
        return this;
    }

    protected final i a(Drawable drawable) {
        a((CharSequence) null, drawable, (View) null);
        return this;
    }

    public i k() {
        return this;
    }

    public boolean a(m mVar) {
        boolean z = false;
        if (!this.y.isEmpty()) {
            d();
            Iterator<WeakReference<x>> it = this.y.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference<x> next = it.next();
                x xVar = next.get();
                if (xVar == null) {
                    this.y.remove(next);
                } else {
                    z = xVar.b(mVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            e();
            if (z) {
                this.j = mVar;
            }
        }
        return z;
    }

    public boolean b(m mVar) {
        boolean z = false;
        if (!this.y.isEmpty() && this.j == mVar) {
            d();
            Iterator<WeakReference<x>> it = this.y.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference<x> next = it.next();
                x xVar = next.get();
                if (xVar == null) {
                    this.y.remove(next);
                } else {
                    z = xVar.c(mVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            e();
            if (z) {
                this.j = null;
            }
        }
        return z;
    }

    private MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4 = ((-65536) & i3) >> 16;
        if (i4 < 0 || i4 >= l.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i5 = (l[i4] << 16) | (65535 & i3);
        m mVar = new m(this, i, i2, i3, i5, charSequence, this.e);
        if (this.t != null) {
            mVar.e = this.t;
        }
        this.c.add(a(this.c, i5), mVar);
        b(true);
        return mVar;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int i2;
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (this.c.get(i3).getItemId() == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            } else {
                i2 = -1;
                break;
            }
        }
        a(i2, true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int i2;
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (this.c.get(i3).getGroupId() == i) {
                    i2 = i3;
                    break;
                }
                i3++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int size2 = this.c.size() - i2;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.c.get(i2).getGroupId() != i) {
                    break;
                }
                a(i2, false);
                i4 = i5;
            }
            b(true);
        }
    }
}
