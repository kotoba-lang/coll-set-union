(ns kotoba.coll.set-union
  "set-union -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds set-union and names, in its
  deps.edn, exactly the definitions set-union reaches. Nothing else."
  )

(defn set-union
  "Union of zero or more sets. Mirrors clojure.set/union without the
  clojure.set dependency."
  ([] #{})
  ([s1] (or s1 #{}))
  ([s1 s2] (into (or s1 #{}) (or s2 #{})))
  ([s1 s2 & sets] (reduce set-union (set-union s1 s2) sets)))
