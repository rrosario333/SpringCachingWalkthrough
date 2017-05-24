package com.robert.caching.repository;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Robert.
 */
@Component
@Profile("simple-cache")
public class LocalCacheEvict {

    @CacheEvict(cacheNames = "alluserscache",allEntries = true)
    public void evictAllUsersCache() {

    }

    @CacheEvict(cacheNames = "usercache",allEntries = true)
    public void evictUserCache() {

    }

}
