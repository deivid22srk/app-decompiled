package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static t<Boolean> f6381a = t.a("measurement.service_enabled");

    /* renamed from: b, reason: collision with root package name */
    public static t<Boolean> f6382b = t.a("measurement.service_client_enabled");
    public static t<String> c = t.a("measurement.log_tag", "GMPM", "GMPM-SVC");
    public static t<Long> d = t.a("measurement.ad_id_cache_time", 10000L);
    public static t<Long> e = t.a("measurement.monitoring.sample_period_millis", 86400000L);
    public static t<Integer> f = t.a("measurement.upload.max_bundles", 100);
    public static t<Integer> g = t.a("measurement.upload.max_batch_size", 65536);
    public static t<String> h = t.a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");
    public static t<Long> i = t.a("measurement.upload.backoff_period", 43200000L);
    public static t<Long> j = t.a("measurement.upload.window_interval", 3600000L);
    public static t<Long> k = t.a("measurement.upload.interval", 3600000L);
    public static t<Long> l = t.a("measurement.upload.stale_data_deletion_interval", 86400000L);
    public static t<Long> m = t.a("measurement.upload.initial_upload_delay_time", 15000L);
    public static t<Long> n = t.a("measurement.upload.retry_time", 1800000L);
    public static t<Integer> o = t.a("measurement.upload.retry_count", 6);
    public static t<Long> p = t.a("measurement.upload.max_queue_time", 2419200000L);
    public static t<Long> q = t.a("measurement.service_client.idle_disconnect_millis", 5000L);
}
