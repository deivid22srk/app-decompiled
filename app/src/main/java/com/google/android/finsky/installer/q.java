package com.google.android.finsky.installer;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.UserHandle;
import com.google.android.finsky.utils.FinskyLog;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class q extends i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MultiUserCoordinatorService f2868a;

    q(MultiUserCoordinatorService multiUserCoordinatorService) {
        this.f2868a = multiUserCoordinatorService;
    }

    @Override // com.google.android.finsky.installer.h
    public final void a(k kVar) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        UserHandle callingUserHandle = Binder.getCallingUserHandle();
        hashMap = this.f2868a.d;
        synchronized (hashMap) {
            if (kVar != null) {
                hashMap3 = this.f2868a.d;
                hashMap3.put(callingUserHandle, kVar);
            } else {
                hashMap2 = this.f2868a.d;
                hashMap2.remove(callingUserHandle);
            }
        }
    }

    @Override // com.google.android.finsky.installer.h
    public final boolean a(String str) {
        boolean z;
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        String str2;
        boolean z2 = false;
        z = this.f2868a.f2853a;
        if (z) {
            str2 = this.f2868a.f2854b;
            if (str.equals(str2)) {
                this.f2868a.f2854b = null;
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new r(this, str), 15000L);
                return z2;
            }
        }
        UserHandle callingUserHandle = Binder.getCallingUserHandle();
        hashMap = this.f2868a.c;
        synchronized (hashMap) {
            hashMap2 = this.f2868a.c;
            hashMap2.get(str);
            if (a(callingUserHandle, str)) {
                hashMap3 = this.f2868a.c;
                hashMap3.put(str, callingUserHandle);
                FinskyLog.a("User=%s requested=%s granted=true", callingUserHandle, str);
                c(str);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // com.google.android.finsky.installer.h
    public final void b(String str) {
        HashMap hashMap;
        HashMap hashMap2;
        boolean z;
        HashMap hashMap3;
        UserHandle callingUserHandle = Binder.getCallingUserHandle();
        hashMap = this.f2868a.c;
        synchronized (hashMap) {
            hashMap2 = this.f2868a.c;
            UserHandle userHandle = (UserHandle) hashMap2.get(str);
            if (userHandle == null) {
                FinskyLog.c("User=%s released=%s *** was not previously acquired", callingUserHandle, str);
                z = true;
            } else if (userHandle.equals(callingUserHandle)) {
                hashMap3 = this.f2868a.c;
                hashMap3.remove(str);
                FinskyLog.a("User=%s released=%s", callingUserHandle, str);
                z = true;
            } else {
                FinskyLog.c("User=%s released=%s *** owned by=%s", callingUserHandle, str, userHandle);
                z = false;
            }
        }
        if (z) {
            d(str);
        }
    }

    @Override // com.google.android.finsky.installer.h
    public final void a() {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        UserHandle callingUserHandle = Binder.getCallingUserHandle();
        HashSet hashSet = new HashSet();
        hashMap = this.f2868a.c;
        synchronized (hashMap) {
            hashMap2 = this.f2868a.c;
            if (!hashMap2.isEmpty()) {
                hashMap3 = this.f2868a.c;
                Iterator it = hashMap3.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((UserHandle) entry.getValue()).equals(callingUserHandle)) {
                        String str = (String) entry.getKey();
                        FinskyLog.c("User=%s removed=%s", callingUserHandle, str);
                        it.remove();
                        hashSet.add(str);
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    d((String) it2.next());
                }
            }
        }
    }

    private void c(String str) {
        HashMap hashMap;
        HashMap hashMap2;
        hashMap = this.f2868a.d;
        synchronized (hashMap) {
            hashMap2 = this.f2868a.d;
            for (Map.Entry entry : hashMap2.entrySet()) {
                try {
                    ((k) entry.getValue()).a(str);
                } catch (RemoteException e) {
                    FinskyLog.c("Could not notify listener for user %s", entry.getKey());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        HashMap hashMap;
        HashMap hashMap2;
        hashMap = this.f2868a.d;
        synchronized (hashMap) {
            hashMap2 = this.f2868a.d;
            for (Map.Entry entry : hashMap2.entrySet()) {
                try {
                    ((k) entry.getValue()).b(str);
                } catch (RemoteException e) {
                    FinskyLog.c("Could not notify listener for user %s", entry.getKey());
                }
            }
        }
    }

    private boolean a(UserHandle userHandle, String str) {
        HashMap hashMap;
        boolean z;
        HashMap hashMap2;
        HashMap hashMap3;
        boolean z2;
        HashMap hashMap4;
        hashMap = this.f2868a.c;
        synchronized (hashMap) {
            UserHandle userHandle2 = null;
            z = this.f2868a.e;
            if (z) {
                hashMap4 = this.f2868a.c;
                userHandle2 = (UserHandle) hashMap4.get(str);
            } else {
                hashMap2 = this.f2868a.c;
                if (!hashMap2.isEmpty()) {
                    hashMap3 = this.f2868a.c;
                    userHandle2 = (UserHandle) hashMap3.values().iterator().next();
                }
            }
            if (userHandle2 == null || userHandle2.equals(userHandle)) {
                return true;
            }
            z2 = this.f2868a.e;
            FinskyLog.a("User=%s requested=%s granted=false owned by=%s concurrent mode=%s", userHandle, str, userHandle2, Boolean.valueOf(z2));
            return false;
        }
    }
}
