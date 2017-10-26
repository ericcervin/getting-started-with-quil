(ns getting-started-with-quil.pg44a
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/stroke-weight 2)
  (doseq [i (range 20 400 20)]
    (q/line i 0 (+ i (/ i 2)) 80)
    (q/line (+ i (/ i 2)) 80 (* i 1.2) 120)))
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

