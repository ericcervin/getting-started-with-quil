(ns getting-started-with-quil.pg26
  (:require [quil.core :as q]))


(defn setup []
  (q/no-stroke)
  (q/smooth)
  (q/background 0 26 51)
  (q/fill 255 0 0)
  (q/ellipse 132 82 200 200)
  (q/fill 0 255 0)
  (q/ellipse 228 -16 200 200)
  (q/fill 0 0 255)
  (q/ellipse 268 118 200 200))  
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



