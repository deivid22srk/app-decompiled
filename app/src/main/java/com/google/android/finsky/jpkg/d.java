package com.google.android.finsky.jpkg;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import com.android.volley.apkg.x;
import com.android.volley.o;
import com.android.volley.s;
import com.android.volley.t;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.aa;
import com.google.android.finsky.protos.pe;
import com.google.android.finsky.utils.cz;
import com.google.android.finsky.utils.jm;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import org.keyczar.Keyczar;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l f2889a = new e(this);

    /* renamed from: b, reason: collision with root package name */
    public final a f2890b = new a(this.f2889a);
    public final Queue<pe> c = new LinkedList();
    public final List<l> d = new ArrayList();
    pe e = null;
    o f = null;
    x g = null;
    AudioManager h = null;
    int i = -1;
    public final s l = new f(this);
    public final t<JSONObject> m = new g(this);
    public final AudioManager.OnAudioFocusChangeListener n = new h(this);
    public final MediaPlayer.OnPreparedListener j = new i(this);
    public final MediaPlayer.OnCompletionListener k = new j(this);

    public final void a() {
        this.f2889a.h();
        this.f2890b.reset();
        this.e = null;
    }

    public final void b() {
        this.f2889a.a(this.c.size());
    }

    public final boolean c() {
        jm.a();
        boolean isEmpty = this.c.isEmpty();
        if (!isEmpty && this.i != 1) {
            this.h.requestAudioFocus(this.n, 3, 1);
            this.i = 1;
        } else if (isEmpty && this.i != -1) {
            this.h.abandonAudioFocus(this.n);
            this.i = -1;
        }
        this.f2890b.a();
        if (this.c.isEmpty()) {
            this.e = null;
            return false;
        }
        this.f2889a.c();
        if (this.g != null) {
            this.g.d();
        }
        this.e = this.c.remove();
        b();
        this.g = new aa(a(this.e.h), this.m, this.l);
        FinskyApp.a(this.f);
        this.f.a(this.g);
        this.f2889a.f();
        return true;
    }

    public static String a(String str) {
        NameValuePair nameValuePair;
        ArrayList a2 = cz.a(URLEncodedUtils.parse(URI.create(str), Keyczar.DEFAULT_ENCODING));
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= a2.size()) {
                nameValuePair = null;
                break;
            }
            nameValuePair = (NameValuePair) a2.get(i2);
            if ("mode".equals(nameValuePair.getName())) {
                break;
            }
            i = i2 + 1;
        }
        if (nameValuePair != null) {
            a2.remove(nameValuePair);
        }
        a2.add(new BasicNameValuePair("mode", "streaming"));
        return Uri.parse(str).buildUpon().encodedQuery(URLEncodedUtils.format(a2, Keyczar.DEFAULT_ENCODING)).build().toString();
    }

    public static /* synthetic */ void a(d dVar) {
        dVar.f2889a.g();
        dVar.e = null;
        dVar.c();
    }
}
