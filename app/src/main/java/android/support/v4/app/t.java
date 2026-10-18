package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class t extends q implements c, e {

    /* renamed from: a, reason: collision with root package name */
    final Handler f234a = new u(this);

    /* renamed from: b, reason: collision with root package name */
    final y f235b = new y(new v(this));
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;

    @Override // android.support.v4.app.q, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.support.v4.app.p, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f235b.b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            int a2 = this.f235b.a();
            if (a2 == 0 || i4 < 0 || i4 >= a2) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            Fragment fragment = this.f235b.a(new ArrayList(a2)).get(i4);
            if (fragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
                return;
            } else {
                fragment.a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f235b.f240a.f.d()) {
            if (Build.VERSION.SDK_INT < 21) {
                finish();
            } else {
                finishAfterTransition();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f235b.f240a.f.a(configuration);
    }

    @Override // android.support.v4.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        y yVar = this.f235b;
        yVar.f240a.f.a(yVar.f240a, yVar.f240a, (Fragment) null);
        super.onCreate(bundle);
        w wVar = (w) getLastNonConfigurationInstance();
        if (wVar != null) {
            this.f235b.f240a.g = wVar.c;
        }
        if (bundle != null) {
            this.f235b.f240a.f.a(bundle.getParcelable("android:support:fragments"), wVar != null ? wVar.f239b : null);
        }
        this.f235b.f240a.f.m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            y yVar = this.f235b;
            boolean a2 = onCreatePanelMenu | yVar.f240a.f.a(menu, getMenuInflater());
            if (Build.VERSION.SDK_INT < 11) {
                return true;
            }
            return a2;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.support.v4.app.p
    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f235b.f240a.f.a(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a(false);
        this.f235b.f240a.f.r();
        z<?> zVar = this.f235b.f240a;
        if (zVar.i == null) {
            return;
        }
        zVar.i.h();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f235b.f240a.f.s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f235b.f240a.f.a(menuItem);
            case 6:
                return this.f235b.f240a.f.b(menuItem);
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f235b.f240a.f.b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.d = false;
        if (this.f234a.hasMessages(2)) {
            this.f234a.removeMessages(2);
            i_();
        }
        this.f235b.f240a.f.c(4);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f235b.b();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f235b.b();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f234a.sendEmptyMessage(2);
        this.d = true;
        this.f235b.c();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f234a.removeMessages(2);
        i_();
        this.f235b.c();
    }

    public void i_() {
        this.f235b.f240a.f.p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.h) {
            this.h = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.f235b.f240a.f.a(menu);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        ArrayList arrayList;
        if (this.e) {
            a(true);
        }
        Object j_ = j_();
        ad adVar = this.f235b.f240a.f;
        if (adVar.f != null) {
            arrayList = null;
            for (int i = 0; i < adVar.f.size(); i++) {
                Fragment fragment = adVar.f.get(i);
                if (fragment != null && fragment.K) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(fragment);
                    fragment.L = true;
                    fragment.t = fragment.s != null ? fragment.s.p : -1;
                    if (ad.f164a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + fragment);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        android.support.v4.h.r<String, ax> g = this.f235b.f240a.g();
        if (arrayList == null && g == null && j_ == null) {
            return null;
        }
        w wVar = new w();
        wVar.f238a = j_;
        wVar.f239b = arrayList;
        wVar.c = g;
        return wVar;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable l = this.f235b.f240a.f.l();
        if (l != null) {
            bundle.putParcelable("android:support:fragments", l);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.e = false;
        this.f = false;
        this.f234a.removeMessages(1);
        if (!this.c) {
            this.c = true;
            this.f235b.f240a.f.n();
        }
        this.f235b.b();
        this.f235b.c();
        z<?> zVar = this.f235b.f240a;
        if (!zVar.k) {
            zVar.k = true;
            if (zVar.i != null) {
                zVar.i.c();
            } else if (!zVar.j) {
                zVar.i = zVar.a("(root)", zVar.k, false);
                if (zVar.i != null && !zVar.i.e) {
                    zVar.i.c();
                }
            }
            zVar.j = true;
        }
        this.f235b.f240a.f.o();
        z<?> zVar2 = this.f235b.f240a;
        if (zVar2.g == null) {
            return;
        }
        int size = zVar2.g.size();
        az[] azVarArr = new az[size];
        for (int i = size - 1; i >= 0; i--) {
            azVarArr[i] = (az) zVar2.g.c(i);
        }
        for (int i2 = 0; i2 < size; i2++) {
            az azVar = azVarArr[i2];
            if (azVar.f) {
                if (az.f187a) {
                    Log.v("LoaderManager", "Finished Retaining in " + azVar);
                }
                azVar.f = false;
                for (int a2 = azVar.f188b.a() - 1; a2 >= 0; a2--) {
                    ba d = azVar.f188b.d(a2);
                    if (d.i) {
                        if (az.f187a) {
                            Log.v("LoaderManager", "  Finished Retaining: " + d);
                        }
                        d.i = false;
                        if (d.h != d.j && !d.h) {
                            d.b();
                        }
                    }
                    if (d.h && d.e && !d.k) {
                        d.b(d.d, d.g);
                    }
                }
            }
            azVar.g();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.e = true;
        this.f234a.sendEmptyMessage(1);
        this.f235b.f240a.f.q();
    }

    public Object j_() {
        return null;
    }

    public void c() {
        if (Build.VERSION.SDK_INT < 11) {
            this.h = true;
        } else {
            invalidateOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.c);
        printWriter.print("mResumed=");
        printWriter.print(this.d);
        printWriter.print(" mStopped=");
        printWriter.print(this.e);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f);
        z<?> zVar = this.f235b.f240a;
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(zVar.k);
        if (zVar.i != null) {
            printWriter.print(str2);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(zVar.i)));
            printWriter.println(":");
            zVar.i.a(str2 + "  ", fileDescriptor, printWriter, strArr);
        }
        this.f235b.f240a.f.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(str + "  ", printWriter, getWindow().getDecorView());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00ed. Please report as an issue. */
    private static String a(View view) {
        String resourcePackageName;
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case 0:
                sb.append('V');
                break;
            case 4:
                sb.append('I');
                break;
            case 8:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        sb.append(view.isFocusable() ? 'F' : '.');
        sb.append(view.isEnabled() ? 'E' : '.');
        sb.append(view.willNotDraw() ? '.' : 'D');
        sb.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        sb.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        sb.append(view.isClickable() ? 'C' : '.');
        sb.append(view.isLongClickable() ? 'L' : '.');
        sb.append(' ');
        sb.append(view.isFocused() ? 'F' : '.');
        sb.append(view.isSelected() ? 'S' : '.');
        sb.append(view.isPressed() ? 'P' : '.');
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (id != 0 && resources != null) {
                switch ((-16777216) & id) {
                    case 16777216:
                        resourcePackageName = "android";
                        String resourceTypeName = resources.getResourceTypeName(id);
                        String resourceEntryName = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName);
                        sb.append("/");
                        sb.append(resourceEntryName);
                        break;
                    case 2130706432:
                        resourcePackageName = "app";
                        String resourceTypeName2 = resources.getResourceTypeName(id);
                        String resourceEntryName2 = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName2);
                        sb.append("/");
                        sb.append(resourceEntryName2);
                        break;
                    default:
                        try {
                            resourcePackageName = resources.getResourcePackageName(id);
                            String resourceTypeName22 = resources.getResourceTypeName(id);
                            String resourceEntryName22 = resources.getResourceEntryName(id);
                            sb.append(" ");
                            sb.append(resourcePackageName);
                            sb.append(":");
                            sb.append(resourceTypeName22);
                            sb.append("/");
                            sb.append(resourceEntryName22);
                            break;
                        } catch (Resources.NotFoundException e) {
                            break;
                        }
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private void a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(a(view));
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i = 0; i < childCount; i++) {
                a(str2, printWriter, viewGroup.getChildAt(i));
            }
        }
    }

    final void a(boolean z) {
        if (!this.f) {
            this.f = true;
            this.g = z;
            this.f234a.removeMessages(1);
            y yVar = this.f235b;
            boolean z2 = this.g;
            z<?> zVar = yVar.f240a;
            zVar.h = z2;
            if (zVar.i != null && zVar.k) {
                zVar.k = false;
                if (z2) {
                    zVar.i.e();
                } else {
                    zVar.i.d();
                }
            }
            this.f235b.f240a.f.c(2);
        }
    }

    public final aa d() {
        return this.f235b.f240a.f;
    }

    public final ax b_() {
        z<?> zVar = this.f235b.f240a;
        if (zVar.i != null) {
            return zVar.i;
        }
        zVar.j = true;
        zVar.i = zVar.a("(root)", zVar.k, true);
        return zVar.i;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.j && i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.support.v4.app.e
    public final void a(int i) {
        if (this.i) {
            this.i = false;
        } else if ((i & (-256)) != 0) {
            throw new IllegalArgumentException("Can only use lower 8 bits for requestCode");
        }
    }

    @Override // android.app.Activity, android.support.v4.app.c
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 8) & 255;
        if (i2 != 0) {
            int i3 = i2 - 1;
            int a2 = this.f235b.a();
            if (a2 == 0 || i3 < 0 || i3 >= a2) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            Fragment fragment = this.f235b.a(new ArrayList(a2)).get(i3);
            if (fragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
            } else {
                fragment.a(iArr);
            }
        }
    }

    static /* synthetic */ void a(t tVar, Fragment fragment, String[] strArr) {
        tVar.i = true;
        int i = ((fragment.p + 1) << 8) + 200;
        if (Build.VERSION.SDK_INT < 23) {
            if (!(tVar instanceof c)) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new b(strArr, tVar, i));
        } else {
            if (tVar instanceof e) {
                tVar.a(i);
            }
            tVar.requestPermissions(strArr, i);
        }
    }
}
