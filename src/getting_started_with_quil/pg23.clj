(ns getting-started-with-quil.pg23
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/rect 120 60 80 80)
  (q/ellipse 120 60 80 80)
  (q/ellipse-mode :corner)
  (q/rect 280 20 80 80)
  (q/ellipse 280 20 80 80))
  
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



