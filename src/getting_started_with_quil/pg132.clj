(ns getting-started-with-quil.pg132
  (:require [quil.core :as q]))


(defn draw-robot [x y body-height neck-height]
  (let [radius 45
        ny  (- y body-height neck-height radius)]
    
    
    ;;neck
    (q/stroke 255)
    (q/line (+ x 2)  (- y body-height) (+ x 2) ny)
    (q/line (+ x 12) (- y body-height) (+ x 12) ny)
    (q/line (+ x 22) (- y body-height) (+ x 22) ny)
    
    ;;ANTENNAE
    (q/line (+ x 12) ny (- x 18) (- ny 43))
    (q/line (+ x 12) ny (+ x 42) (- ny 99))
    (q/line (+ x 22) ny (+ x 78) (+ ny 15))
    
    ;;BODY
    (q/no-stroke)
    (q/fill 255 204 0)
    (q/ellipse x (- y 33) 33 33)
    (q/fill 0)
    (q/rect (- x 45) (- y body-height) 90 (- body-height 33))
    (q/fill 255 204 0)
    (q/rect (- x 45) (+ (- y body-height) 17) 90 6)
    
    ;;head
    (q/fill 0);
    (q/ellipse (+ x 12) ny radius radius)
    (q/fill 255)
    (q/ellipse (+ x 24) (- ny 6) 14 14);;Large Eye
    (q/fill 0); // Set fill to black
    (q/ellipse (+ x 24) (- ny 6) 3 3);;Pupil
    (q/fill 153 204 255)
    (q/ellipse x (- ny 8) 5 5);;small eye 1
    (q/ellipse (+ x 30) (- ny 26) 4 4);;small eye 2
    (q/ellipse (+ x 41) (+ ny 6) 3 3)));;small eye 3

(defn setup [] 
  (q/stroke-weight 2)
  (q/ellipse-mode :radius))
  

(defn draw []
  (q/background 0 153 204)
  (draw-robot 120 420 110 140)
  (draw-robot 270 460 260 95)
  (draw-robot 420 310 80 10)
  (draw-robot 570 390 180 40))
    
(q/defsketch practice
  :size [720 480]
  :setup setup
  :draw draw
  :features [:keep-on-top])

