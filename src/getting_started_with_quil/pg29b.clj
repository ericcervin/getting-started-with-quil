(ns getting-started-with-quil.pg29b
  (:require [quil.core :as q]))


(defn setup []
    ;;Left Creature
    (q/smooth)
    (q/begin-shape)
    (q/vertex 50 120)
    (q/vertex 100 90)
    (q/vertex 110 60)
    (q/vertex 80 20)
    (q/vertex 210 60)
    (q/vertex 160 80)
    (q/vertex 200 90)
    (q/vertex 140 100)
    (q/vertex 130 120)
    (q/end-shape :close)
    (q/fill 0)
    (q/ellipse 155 60 8 8)

     ;;Right Creature
    (q/fill 255)
    (q/begin-shape)
    (q/vertex 370 120)
    (q/vertex 360 90)
    (q/vertex 290 80)
    (q/vertex 340 70)
    (q/vertex 280 50)
    (q/vertex 420 10)
    (q/vertex 390 50)
    (q/vertex 410 90)
    (q/vertex 460 120)
    (q/end-shape)
    (q/fill 0)
    (q/ellipse 345 50 10 10))


(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

