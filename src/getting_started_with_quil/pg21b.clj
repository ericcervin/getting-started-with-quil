(ns getting-started-with-quil.pg21b
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/stroke-weight 24)
  (q/line 60 25 130 95)
  (q/stroke-cap :square)
  (q/line 160 25 230 95)
  (q/stroke-cap :project)
  (q/line 260 25 330 95)
  (q/stroke-cap :round)
  (q/line 360 25 430 95))
  
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



