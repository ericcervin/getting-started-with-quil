(ns getting-started-with-quil.p53
  (:require [quil.core :as q]))


(defn setup []
  (q/stroke 0 102)
  (q/stroke-weight 4))  
    
(defn draw []
  (q/line (q/mouse-x) (q/mouse-y) (q/pmouse-x) (q/pmouse-y)))
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])

