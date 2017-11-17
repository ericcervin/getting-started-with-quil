(ns getting-started-with-quil.pg129b
  (:require [quil.core :as q]))
            
  
(defn owl [x y g s]
  (q/push-matrix)
  (q/translate x y)
  (q/scale s) ;; Set the size
  (q/stroke (- 138 g) (- 138 g) (- 125 g)) ;; Set the color value
  (q/stroke-weight 70)
  (q/line 0 -35 0 -65);;Body
  (q/no-stroke)
  (q/fill 255)
  (q/ellipse -17.5 -65 35 35);;Left eye dome
  (q/ellipse 17.5 -65 35 35);;Right eye dome
  (q/arc 0 -65 70 70 0 q/PI);; Chin
  (q/fill 51 51 30)
  (q/ellipse -14 -65 8 8);; Left eye
  (q/ellipse 14 -65 8 8);;  Right eye
  (q/quad 0 -58 4 -51 0 -44 -4 -51);; Beak
  (q/pop-matrix))

(defn setup []
  (q/background 176 204 226)
  (doseq [i (range 35 (+ (q/width) 40) 40)]
      (let [gray (rand-int 102)
            scalar (+ 0.25 (rand 0.75))]
        (owl i 110 gray scalar))))
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])



