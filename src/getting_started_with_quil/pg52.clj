(ns getting-started-with-quil.p52
  (:require [quil.core :as q]))


(defn setup []
  (q/fill 0 102)
  (q/no-stroke))  
    
(defn draw []
  (q/ellipse (q/mouse-x) (q/mouse-y) 9 9))
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])

