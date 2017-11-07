(ns getting-started-with-quil.pg100
  (:require [quil.core :as q]))

(defn setup [])
  

(defn dino [x y]
  (q/fill 153 176 180)
  (q/with-translation [x y]
    (q/begin-shape)
    (q/vertex 50 120)
    (q/vertex 100 90)
    (q/vertex 110 60)
    (q/vertex 80 20)
    (q/vertex 210 60)
    (q/vertex 160 80)
    (q/vertex 200 90)
    (q/vertex 140 100)
    (q/vertex 130 120)
    (q/end-shape)))
  
  

(defn draw []
  (q/background 204)
  (dino (- (q/mouse-x) 120) 0))
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



