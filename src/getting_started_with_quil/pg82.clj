(ns getting-started-with-quil.pg82
  (:require [quil.core :as q]))


(defn setup [])


(defn draw []
  (q/translate (q/mouse-x) (q/mouse-y))
  (q/scale (/ (q/mouse-x) 60))
  (q/rect -15 -15 30 30))
  

(q/defsketch practice
  :size [120 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



