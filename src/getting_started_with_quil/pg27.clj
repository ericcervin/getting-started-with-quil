(ns getting-started-with-quil.pg27
  (:require [quil.core :as q]))


(defn setup []
  (q/no-stroke)
  (q/smooth)
  (q/background 204 226 225)
  (q/fill 255 0 0 160)
  (q/ellipse 132 82 200 200)
  (q/fill 0 255 0 160)
  (q/ellipse 228 -16 200 200)
  (q/fill 0 0 255 160)
  (q/ellipse 268 118 200 200))  
  

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



