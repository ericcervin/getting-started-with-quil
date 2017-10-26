(ns getting-started-with-quil.pg46a
  (:require [quil.core :as q]))


(defn setup []
  (q/background 0)
  (q/fill 255)
  (q/stroke 102)
  (doseq [y (range 20 (- (q/height) 19) 10)]
    (doseq [x (range 20 (- (q/width) 19) 10)]
      (q/ellipse x y 4 4)
      (q/line x y 240 60))))
      
      
      
  

    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

