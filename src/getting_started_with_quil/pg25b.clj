(ns getting-started-with-quil.pg25b
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/fill 153)
  (q/ellipse 132 82 200 200)
  (q/no-fill)
  (q/ellipse 228 -16 200 200)
  (q/no-stroke)
  (q/ellipse 268 118 200 200))  
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



