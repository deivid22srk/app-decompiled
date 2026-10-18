package android.support.design.widget;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* loaded from: classes.dex */
final class aj implements Handler.Callback {
    aj() {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z = false;
        switch (message.what) {
            case 0:
                Snackbar snackbar = (Snackbar) message.obj;
                if (snackbar.f69b.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = snackbar.f69b.getLayoutParams();
                    if (layoutParams instanceof l) {
                        au auVar = new au(snackbar);
                        auVar.f = be.a(0.1f);
                        auVar.g = be.a(0.6f);
                        auVar.d = 0;
                        auVar.c = new an(snackbar);
                        ((l) layoutParams).a(auVar);
                    }
                    snackbar.f68a.addView(snackbar.f69b);
                }
                snackbar.f69b.setOnAttachStateChangeListener(new ao(snackbar));
                if (android.support.v4.view.by.H(snackbar.f69b)) {
                    snackbar.b();
                } else {
                    snackbar.f69b.setOnLayoutChangeListener(new aq(snackbar));
                }
                return true;
            case 1:
                Snackbar snackbar2 = (Snackbar) message.obj;
                int i = message.arg1;
                if (snackbar2.f69b.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams2 = snackbar2.f69b.getLayoutParams();
                    if (layoutParams2 instanceof l) {
                        i iVar = ((l) layoutParams2).f138a;
                        if (iVar instanceof be) {
                            be beVar = (be) iVar;
                            if ((beVar.f108b != null ? beVar.f108b.f448a : 0) != 0) {
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        if (Build.VERSION.SDK_INT >= 14) {
                            android.support.v4.view.by.t(snackbar2.f69b).c(snackbar2.f69b.getHeight()).a(a.f73b).a(250L).a(new at(snackbar2, i)).b();
                        } else {
                            Animation loadAnimation = AnimationUtils.loadAnimation(snackbar2.f69b.getContext(), android.support.design.b.design_snackbar_out);
                            loadAnimation.setInterpolator(a.f73b);
                            loadAnimation.setDuration(250L);
                            loadAnimation.setAnimationListener(new ak(snackbar2, i));
                            snackbar2.f69b.startAnimation(loadAnimation);
                        }
                        return true;
                    }
                }
                snackbar2.c();
                return true;
            default:
                return false;
        }
    }
}
