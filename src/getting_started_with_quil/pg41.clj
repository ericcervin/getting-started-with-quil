(ns getting-started-with-quil.pg41
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/stroke-weight 8)
  (doseq [i (range 20 400 60)]
    (q/line i 40 (+ i 60) 80)
    ))
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

