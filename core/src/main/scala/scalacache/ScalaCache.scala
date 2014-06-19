package scalacache

//import scalacache.memoization.MemoizationConfig

/**
 * Container holding the cache itself, along with all necessary configuration.
 * @param cache The cache itself
 * @param memoization Configuration related to method memoization
 */
case class ScalaCache(
  cache: Cache,
  cacheConfig: CacheConfig = CacheConfig(),
  keyBuilder: CacheKeyBuilder = DefaultCacheKeyBuilder /*,
  memoization: MemoizationConfig = MemoizationConfig()*/ )

