(ns getting-started-with-quil.pg76
  (:require [quil.core :as q]))

(defn setup [])

(defn draw []
  (q/translate (q/mouse-x) (q/mouse-y))
  (q/rect 0 0 30 30)
  (q/translate 35 10)
  (q/rect 0 0 15 15))

(q/defsketch practice
  :size [120 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])


