package com.google.android.play.apkg;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class w extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f6791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(v vVar, Looper looper) {
        super(looper);
        this.f6791a = vVar;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        v.a(this.f6791a, message);
    }
}
