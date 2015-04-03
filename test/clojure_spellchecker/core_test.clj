(ns clojure-spellchecker.core-test
  (:require [clojure.test :refer :all]
            [clojure-spellchecker.core :refer :all]))

(deftest spelling-test
  (testing
    (is (= "spelling" (min-distance "spellling")))
    (is (= "spelling" (min-distance "spellling")))
    (is (= "spilling" (min-distance "spillling")))
    (is (= "cloture" (min-distance "clojure")))
    (is (= "absolutely" (min-distance "absolutly")))))
