(ns getting-started-with-quil.pg09
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth))

(defn draw []
  (if (q/mouse-pressed?)
    (q/fill 0)
    (q/fill 255))
    
  (q/ellipse (q/mouse-x) (q/mouse-y) 80 80))

(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



