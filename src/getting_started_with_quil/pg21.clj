(ns getting-started-with-quil.pg21
  (:require [quil.core :as q]))


(defn setup []
  (q/smooth)
  (q/ellipse 75 60 90 90)
  (q/stroke-weight 8)
  (q/ellipse 175 60 90 90)
  (q/ellipse 279 60 90 90)
  (q/stroke-weight 20)
  (q/ellipse 389 60 90 90)
  )

(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



