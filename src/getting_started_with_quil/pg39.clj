(ns getting-started-with-quil.pg39
  (:require [quil.core :as q]))


(defn setup []
    (let [x 25
          h 20
          y 25
          x2 (+ x 100)
          x3 (- x2 250)]
      (q/rect x y 300 h)
      (q/rect x2 (+ y h) 300 h)
      (q/rect x3 (+ y (* 2 h)) 300 4)))
      
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

