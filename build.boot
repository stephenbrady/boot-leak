(def dependencies ['[org.clojure/clojure "1.7.0"]
                   '[adzerk/boot-test "1.0.4"]])

(set-env!
  :source-paths #{"src" "boot"}
  :resource-paths #{"resources"}
  :dependencies #(into % dependencies))

(require '[adzerk.boot-test :as boot-test :refer [test]])

(deftask test-env
  []
  (set-env! :source-paths #{"test"})
  identity)
