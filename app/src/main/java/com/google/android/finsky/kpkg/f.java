package com.google.android.finsky.kpkg;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.util.ArrayMap;
import java.util.ArrayList;

@TargetApi(19)
/* loaded from: classes.dex */
public final class f extends Animator {

    /* renamed from: a, reason: collision with root package name */
    public final Animator f2906a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayMap<Animator.AnimatorListener, Animator.AnimatorListener> f2907b = new ArrayMap<>();

    public f(Animator animator) {
        this.f2906a = animator;
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        g gVar = new g(this, animatorListener);
        if (!this.f2907b.containsKey(animatorListener)) {
            this.f2907b.put(animatorListener, gVar);
            this.f2906a.addListener(gVar);
        }
    }

    @Override // android.animation.Animator
    public final void cancel() {
        this.f2906a.cancel();
    }

    @Override // android.animation.Animator
    public final void end() {
        this.f2906a.end();
    }

    @Override // android.animation.Animator
    public final long getDuration() {
        return this.f2906a.getDuration();
    }

    @Override // android.animation.Animator
    public final TimeInterpolator getInterpolator() {
        return this.f2906a.getInterpolator();
    }

    @Override // android.animation.Animator
    public final ArrayList<Animator.AnimatorListener> getListeners() {
        return new ArrayList<>(this.f2907b.keySet());
    }

    @Override // android.animation.Animator
    public final long getStartDelay() {
        return this.f2906a.getStartDelay();
    }

    @Override // android.animation.Animator
    public final boolean isPaused() {
        return this.f2906a.isPaused();
    }

    @Override // android.animation.Animator
    public final boolean isRunning() {
        return this.f2906a.isRunning();
    }

    @Override // android.animation.Animator
    public final boolean isStarted() {
        return this.f2906a.isStarted();
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f2907b.clear();
        this.f2906a.removeAllListeners();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        Animator.AnimatorListener animatorListener2 = this.f2907b.get(animatorListener);
        if (animatorListener2 != null) {
            this.f2907b.remove(animatorListener);
            this.f2906a.removeListener(animatorListener2);
        }
    }

    @Override // android.animation.Animator
    public final Animator setDuration(long j) {
        this.f2906a.setDuration(j);
        return this;
    }

    @Override // android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        this.f2906a.setInterpolator(timeInterpolator);
    }

    @Override // android.animation.Animator
    public final void setStartDelay(long j) {
        this.f2906a.setStartDelay(j);
    }

    @Override // android.animation.Animator
    public final void setTarget(Object obj) {
        this.f2906a.setTarget(obj);
    }

    @Override // android.animation.Animator
    public final void setupEndValues() {
        this.f2906a.setupEndValues();
    }

    @Override // android.animation.Animator
    public final void setupStartValues() {
        this.f2906a.setupStartValues();
    }

    @Override // android.animation.Animator
    public final void start() {
        this.f2906a.start();
    }
}
