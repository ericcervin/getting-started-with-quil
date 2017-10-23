(ns getting-started-with-quil.pg17
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth))

(defn draw []
  (q/ellipse 278 -100 400 400)
  (q/ellipse 120  100 110 110)
  (q/ellipse 412 60 18 18))
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



