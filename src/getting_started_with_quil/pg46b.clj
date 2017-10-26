(ns getting-started-with-quil.pg46b
  (:require [quil.core :as q]))


(defn setup []
  (q/background 0)
  (doseq [y (range 32 (+ (q/height) 1) 8)]
    (doseq [x (range 12 (+ (q/width) 1) 15)]
      (q/ellipse (+ x y) y (- 16 (/ y 10.0)) (- 16 (/ y 10.0))))))

    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

