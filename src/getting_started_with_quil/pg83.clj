(ns getting-started-with-quil.pg83
  (:require [quil.core :as q]))


(defn setup [])


(defn draw []
  (let [scalar (if (> (q/mouse-x) 0) (/ (q/mouse-x) 60.0) 1)]
    (q/translate (q/mouse-x) (q/mouse-y))
    (q/scale scalar)
    (q/stroke-weight (/ 1.0 scalar))
    (q/rect -15 -15 30 30)))
  

(q/defsketch practice
  :size [120 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



