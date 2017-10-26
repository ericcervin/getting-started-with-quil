(ns getting-started-with-quil.pg43a
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/stroke-weight 2)
  (doseq [i (range 20 400 8)]
    (q/line i 40 (+ i 60) 80)))
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

