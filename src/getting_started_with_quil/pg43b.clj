(ns getting-started-with-quil.pg43b
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/stroke-weight 2)
  (doseq [i (range 20 400 20)]
    (q/line i 0 (+ i (/ i 2)) 80)))
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

