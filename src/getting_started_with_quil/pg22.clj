(ns getting-started-with-quil.pg22
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/stroke-weight 12)
  (q/rect 60 25 70 70)
  (q/stroke-join :round)
  (q/rect 160 25 70 70)
  (q/stroke-join :bevel)
  (q/rect 260 25 70 70)
  (q/stroke-join :miter)
  (q/rect 360 25 70 70))
  
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



