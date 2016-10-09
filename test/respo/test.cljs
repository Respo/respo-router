
(ns respo.test
  (:require [cljs.test :refer-macros [deftest is run-tests]]
            [respo-router.util.format :as format]
            [respo-router.util.listener :as listener]))

(deftest test-stringify
  (is (= "" (format/stringify-query {})))
  (is (= "a=1&b=2" (format/stringify-query {"a" 1 "b" 2}))))
