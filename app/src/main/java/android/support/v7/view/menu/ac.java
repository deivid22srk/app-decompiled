package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

/* loaded from: classes.dex */
class ac extends e<android.support.v4.e.a.a> implements Menu {
    ac(Context context, android.support.v4.e.a.a aVar) {
        super(context, aVar);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(((android.support.v4.e.a.a) this.d).add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(((android.support.v4.e.a.a) this.d).add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(((android.support.v4.e.a.a) this.d).add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(((android.support.v4.e.a.a) this.d).add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(((android.support.v4.e.a.a) this.d).addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return a(((android.support.v4.e.a.a) this.d).addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(((android.support.v4.e.a.a) this.d).addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(((android.support.v4.e.a.a) this.d).addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = null;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        }
        int addIntentOptions = ((android.support.v4.e.a.a) this.d).addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = a(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        ((android.support.v4.e.a.a) this.d).setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        ((android.support.v4.e.a.a) this.d).setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        ((android.support.v4.e.a.a) this.d).setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return ((android.support.v4.e.a.a) this.d).hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return a(((android.support.v4.e.a.a) this.d).findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return ((android.support.v4.e.a.a) this.d).size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return a(((android.support.v4.e.a.a) this.d).getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        ((android.support.v4.e.a.a) this.d).close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return ((android.support.v4.e.a.a) this.d).performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ((android.support.v4.e.a.a) this.d).isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return ((android.support.v4.e.a.a) this.d).performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        ((android.support.v4.e.a.a) this.d).setQwertyMode(z);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.f587b != null) {
            Iterator<android.support.v4.e.a.b> it = this.f587b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (i == it.next().getItemId()) {
                    it.remove();
                    break;
                }
            }
        }
        ((android.support.v4.e.a.a) this.d).removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.f587b != null) {
            Iterator<android.support.v4.e.a.b> it = this.f587b.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
        ((android.support.v4.e.a.a) this.d).removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.f587b != null) {
            this.f587b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        ((android.support.v4.e.a.a) this.d).clear();
    }
}
