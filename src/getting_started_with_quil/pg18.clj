(ns getting-started-with-quil.pg18
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth))

(defn draw []
  (q/arc 90 60 80 80 0 q/HALF-PI);
  (q/arc 190 60 80 80 0 (+ q/PI q/HALF-PI))
  (q/arc 290 60 80 80 q/PI (+ q/TWO-PI q/HALF-PI))
  (q/arc 390 60 80 80 q/QUARTER-PI (+ q/PI q/QUARTER-PI)))
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



