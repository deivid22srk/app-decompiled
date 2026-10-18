package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
final class ae implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActivityChooserView f647a;

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        boolean z;
        ad adVar;
        ad adVar2;
        ad adVar3;
        float f;
        switch (((ad) adapterView.getAdapter()).getItemViewType(i)) {
            case 0:
                this.f647a.a();
                z = this.f647a.m;
                if (!z) {
                    adVar = this.f647a.f613b;
                    if (!adVar.f646b) {
                        i++;
                    }
                    adVar2 = this.f647a.f613b;
                    Intent b2 = adVar2.f645a.b(i);
                    if (b2 != null) {
                        b2.addFlags(524288);
                        this.f647a.getContext().startActivity(b2);
                        return;
                    }
                    return;
                }
                if (i > 0) {
                    adVar3 = this.f647a.f613b;
                    x xVar = adVar3.f645a;
                    synchronized (xVar.f869a) {
                        xVar.c();
                        y yVar = xVar.f870b.get(i);
                        y yVar2 = xVar.f870b.get(0);
                        if (yVar2 != null) {
                            f = (yVar2.f872b - yVar.f872b) + 5.0f;
                        } else {
                            f = 1.0f;
                        }
                        xVar.a(new aa(new ComponentName(yVar.f871a.activityInfo.packageName, yVar.f871a.activityInfo.name), System.currentTimeMillis(), f));
                    }
                    return;
                }
                return;
            case 1:
                this.f647a.a(Integer.MAX_VALUE);
                return;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        int i;
        ad adVar;
        ad adVar2;
        ad adVar3;
        frameLayout = this.f647a.g;
        if (view != frameLayout) {
            frameLayout2 = this.f647a.e;
            if (view == frameLayout2) {
                this.f647a.m = false;
                ActivityChooserView activityChooserView = this.f647a;
                i = this.f647a.n;
                activityChooserView.a(i);
                return;
            }
            throw new IllegalArgumentException();
        }
        this.f647a.a();
        adVar = this.f647a.f613b;
        ResolveInfo b2 = adVar.f645a.b();
        adVar2 = this.f647a.f613b;
        int a2 = adVar2.f645a.a(b2);
        adVar3 = this.f647a.f613b;
        Intent b3 = adVar3.f645a.b(a2);
        if (b3 != null) {
            b3.addFlags(524288);
            this.f647a.getContext().startActivity(b3);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        FrameLayout frameLayout;
        ad adVar;
        int i;
        frameLayout = this.f647a.g;
        if (view == frameLayout) {
            adVar = this.f647a.f613b;
            if (adVar.getCount() > 0) {
                this.f647a.m = true;
                ActivityChooserView activityChooserView = this.f647a;
                i = this.f647a.n;
                activityChooserView.a(i);
            }
            return true;
        }
        throw new IllegalArgumentException();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PopupWindow.OnDismissListener onDismissListener;
        PopupWindow.OnDismissListener onDismissListener2;
        onDismissListener = this.f647a.l;
        if (onDismissListener != null) {
            onDismissListener2 = this.f647a.l;
            onDismissListener2.onDismiss();
        }
        if (this.f647a.f612a != null) {
            this.f647a.f612a.a(false);
        }
    }
}
