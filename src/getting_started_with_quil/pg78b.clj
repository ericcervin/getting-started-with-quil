(ns getting-started-with-quil.pg78b
  (:require [quil.core :as q]))

(defn setup [])

(defn draw []
  (q/rotate (/ (q/mouse-x) 100.0))
  (q/rect -80 -10 160 20))
  
  

(q/defsketch practice
  :size [120 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])


