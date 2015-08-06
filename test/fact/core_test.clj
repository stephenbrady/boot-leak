(ns fact.core-test
  (require [clojure.test :as t]))

(t/deftest foo-test
  (println "test")
  (t/testing "NOTHING - just a placeholder"
    (t/is (= 1 1))))
