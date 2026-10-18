package org.keyczar;

import java.util.concurrent.ConcurrentHashMap;
import org.keyczar.interfaces.Stream;

/* loaded from: classes2.dex */
class StreamCache<T extends Stream> {
    private final ConcurrentHashMap<KeyczarKey, StreamQueue<T>> cacheMap = new ConcurrentHashMap<>();

    StreamCache() {
    }

    void put(KeyczarKey keyczarKey, T t) {
        getQueue(keyczarKey).add(t);
    }

    T get(KeyczarKey keyczarKey) {
        return (T) getQueue(keyczarKey).poll();
    }

    StreamQueue<T> getQueue(KeyczarKey keyczarKey) {
        StreamQueue<T> streamQueue = this.cacheMap.get(keyczarKey);
        if (streamQueue == null) {
            StreamQueue<T> streamQueue2 = new StreamQueue<>();
            StreamQueue<T> putIfAbsent = this.cacheMap.putIfAbsent(keyczarKey, streamQueue2);
            return putIfAbsent == null ? streamQueue2 : putIfAbsent;
        }
        return streamQueue;
    }
}
