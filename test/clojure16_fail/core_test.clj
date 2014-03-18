(ns clojure16-fail.core-test
  (:require [clojure.test :refer :all]
            [clojure16-fail.core :refer :all]))

(deftest cljs-core-compiles.test
  (is (do (compile 'cljs.core)
          true)))
