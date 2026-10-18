package com.google.android.gms.car;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IInterface;
import java.util.List;

/* loaded from: classes.dex */
public interface fq extends IInterface {
    CarInfo a();

    ec a(String str);

    String a(String str, String str2);

    List<ResolveInfo> a(Intent intent, int i);

    void a(CarFacet carFacet);

    void a(CarFrxEvent carFrxEvent);

    void a(CarInfo carInfo);

    void a(CarInfo carInfo, String str);

    void a(cg cgVar);

    void a(cj cjVar);

    void a(ft ftVar);

    boolean a(Intent intent);

    boolean a(String str, int i);

    boolean a(String str, boolean z);

    CarUiInfo b();

    String b(String str);

    List<ResolveInfo> b(Intent intent);

    void b(cg cgVar);

    void b(cj cjVar);

    void b(ft ftVar);

    void b(String str, String str2);

    void b(String str, boolean z);

    boolean c();

    int d();

    dw e();

    fw f();

    de g();

    ca h();

    cs i();

    cm j();

    dk k();

    cy l();

    bu m();

    void n();

    void o();

    void p();

    com.google.android.gms.car.a.a q();

    dq r();

    ay s();

    List<CarInfo> t();

    List<CarInfo> u();
}
