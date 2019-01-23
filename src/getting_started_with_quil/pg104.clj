(ns getting-started-with-quil.pg104
  (:require [quil.core :as q]))


(defn setup []
  ;;(q/frame-rate 30));; Thirty frames each second
  ;;(q/frame-rate 12));;  Twelve frames each second
  ;;(q/frame-rate 2));;  Two frames each second
  (q/frame-rate 0.5)) ;;One frame every two seconds
  
  


(defn draw []
  (println (q/current-frame-rate)))

(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top])



