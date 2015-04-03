(defproject clojure-spellchecker "0.1.0-SNAPSHOT"
  :description "A sample spell-checker implementation"
  :url "http://bernhardwenzel.com/blog/2015/02/01/clojure-hands-on-tutorial-for-beginners-building-a-spell-checker/"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [
                  [org.clojure/clojure "1.6.0"]
                  [org.apache.commons/commons-lang3 "3.3.2"]
                  ]
  :main ^:skip-aot clojure-spellchecker.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
