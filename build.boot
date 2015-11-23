(def dependencies ['[org.clojure/clojure "1.7.0"]])

(set-env!
  :source-paths #{"src"}
  :dependencies #(into % dependencies))

(require '[boot.pod :as pod])


(deftask leak
  []
  (boot.core/with-pre-wrap fileset
    (let [c-pod (pod/make-pod (get-env))]
      (boot.util/info "New pod: %s\n" c-pod)
      (pod/destroy-pod c-pod))
    fileset))
