package com.google.gson.b.a;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.aj<Class> f7769a = new ab();

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.ak f7770b = a(Class.class, f7769a);
    public static final com.google.gson.aj<BitSet> c = new am();
    public static final com.google.gson.ak d = a(BitSet.class, c);
    public static final com.google.gson.aj<Boolean> e = new ay();
    public static final com.google.gson.aj<Boolean> f = new ba();
    public static final com.google.gson.ak g = a(Boolean.TYPE, Boolean.class, e);
    public static final com.google.gson.aj<Number> h = new bb();
    public static final com.google.gson.ak i = a(Byte.TYPE, Byte.class, h);
    public static final com.google.gson.aj<Number> j = new bc();
    public static final com.google.gson.ak k = a(Short.TYPE, Short.class, j);
    public static final com.google.gson.aj<Number> l = new bd();
    public static final com.google.gson.ak m = a(Integer.TYPE, Integer.class, l);
    public static final com.google.gson.aj<Number> n = new be();
    public static final com.google.gson.aj<Number> o = new bf();
    public static final com.google.gson.aj<Number> p = new ac();
    public static final com.google.gson.aj<Number> q = new ad();
    public static final com.google.gson.ak r = a(Number.class, q);
    public static final com.google.gson.aj<Character> s = new ae();
    public static final com.google.gson.ak t = a(Character.TYPE, Character.class, s);
    public static final com.google.gson.aj<String> u = new af();
    public static final com.google.gson.ak v = a(String.class, u);
    public static final com.google.gson.aj<StringBuilder> w = new ag();
    public static final com.google.gson.ak x = a(StringBuilder.class, w);
    public static final com.google.gson.aj<StringBuffer> y = new ah();
    public static final com.google.gson.ak z = a(StringBuffer.class, y);
    public static final com.google.gson.aj<URL> A = new ai();
    public static final com.google.gson.ak B = a(URL.class, A);
    public static final com.google.gson.aj<URI> C = new aj();
    public static final com.google.gson.ak D = a(URI.class, C);
    public static final com.google.gson.aj<InetAddress> E = new ak();
    public static final com.google.gson.ak F = new ax(InetAddress.class, E);
    public static final com.google.gson.aj<UUID> G = new al();
    public static final com.google.gson.ak H = a(UUID.class, G);
    public static final com.google.gson.ak I = new an();
    public static final com.google.gson.aj<Calendar> J = new ap();
    public static final com.google.gson.ak K = new aw(Calendar.class, GregorianCalendar.class, J);
    public static final com.google.gson.aj<Locale> L = new aq();
    public static final com.google.gson.ak M = a(Locale.class, L);
    public static final com.google.gson.aj<com.google.gson.y> N = new ar();
    public static final com.google.gson.ak O = a(com.google.gson.y.class, N);
    public static final com.google.gson.ak P = new as();

    public static <TT> com.google.gson.ak a(com.google.gson.c.a<TT> aVar, com.google.gson.aj<TT> ajVar) {
        return new at(aVar, ajVar);
    }

    public static <TT> com.google.gson.ak a(Class<TT> cls, com.google.gson.aj<TT> ajVar) {
        return new au(cls, ajVar);
    }

    public static <TT> com.google.gson.ak a(Class<TT> cls, Class<TT> cls2, com.google.gson.aj<? super TT> ajVar) {
        return new av(cls, cls2, ajVar);
    }
}
