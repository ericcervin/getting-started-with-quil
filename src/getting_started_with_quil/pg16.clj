(ns getting-started-with-quil.pg16
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth))

(defn draw []
  (q/quad 158 55 199 14 392 66 351 107)
  (q/triangle 347 54 392 9 392 66)
  (q/triangle 158 55 290 91 290 112))
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



