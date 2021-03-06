(ns getting-started-with-quil.pg45
  (:require [quil.core :as q]))


(defn setup []
  (q/background 0)
  (q/fill 255 140)
  (doseq [y (range 0 (+ (q/height) 1) 40)]
    (q/ellipse 0 y 40 40))
  
  (doseq [x (range 0 (+ (q/width) 1) 40)]
    (q/ellipse x 0 40 40)))

    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

