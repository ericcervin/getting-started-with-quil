(ns getting-started-with-quil.pg38
  (:require [quil.core :as q]))


(defn setup []
    (q/smooth)
    (q/line 0 0 (q/width)  (q/height))
    (q/line 0 (q/height) (q/width) 0)
    (q/ellipse (/ (q/width) 2) (/ (q/height) 2) 60 60))
    
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

