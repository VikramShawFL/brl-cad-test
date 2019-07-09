;; TODO Make Brl-Cad run using clojure programming language
;; [ ] 0: Use clojure sh function to run system command
;; [x] 1: Create a database of name "test.g"
;; [x] 2: Check the database has been created using emacs or shell
;; [x] 3: Create a solid figure like sphere
;; [x] 4: Draw the sphere using draw command


(ns vikram-cad.core
(:require [clojure.java.shell :refer [sh]]))

(defn example []
  (println (:out (sh "./mged" "-c" "~/cad-files/test.g"))))
