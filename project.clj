(defproject koan-engine "0.1.2-SNAPSHOT"
  :description "Koan Engine for Clojure projects."
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [fresh "1.0.2"]
                 [jline "0.9.94" :exclusions [junit]]]
  :dev-dependencies [[swank-clojure "1.4.0-SNAPSHOT"
                      :exclusions [org.clojure/clojure]]])
