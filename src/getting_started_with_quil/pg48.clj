(ns getting-started-with-quil.pg48
  (:require [quil.core :as q]))


(defn setup []
  (let [x  60
        y  390
        body-height 180
        neck-height 45
        radius 45
        ny  (- y body-height neck-height radius)]
    
    (q/stroke-weight 2)
    (q/background 0 153 204)
    (q/ellipse-mode :radius)
    ;;neck
    (q/stroke 255)
    (q/line (+ x 2)  (- y body-height) (+ x 2) ny);;Left
    (q/line (+ x 12) (- y body-height) (+ x 12) ny);;Middle
    (q/line (+ x 22) (- y body-height) (+ x 22) ny);;Right
    ;;ANTENNAE))
    (q/line (+ x 2) ny (- x 18) (- ny 43));;SMALL
    (q/line (+ x 12) ny (+ x 42) (- ny 99));;TALL
    (q/line (+ x 22) ny (+ x 78) (+ ny 15));;MEDIUM
    ;;BODY
    (q/no-stroke)
    (q/fill 255 204 0)
    (q/ellipse x (- y 33) 33 33);;antigravity orb
    (q/fill 0)
    (q/rect (- x 45) (- y body-height) 90 (- body-height 33));;Main Body
    (q/fill 255 204 0)
    (q/rect (- x 45) (+ (- y body-height) 17) 90 6)
    (q/fill 0);
    (q/ellipse (+ x 12) ny radius radius);;Head
    (q/fill 255);; //Set fill to white
    (q/ellipse (+ x 24) (- ny 6) 14 14);;Large Eye
    (q/fill 0); // Set fill to black
    (q/ellipse (+ x 24) (- ny 6) 3 3);;Pupil
    (q/fill 153 204 255)
    (q/ellipse x (- ny 8) 5 5);;small eye 1
    (q/ellipse (+ x 30) (- ny 26) 4 4);;small eye 2
    (q/ellipse (+ x 41) (+ ny 6) 3 3);;small eye 3
    ))
    
(q/defsketch practice
  :size [170 480]
  :setup setup
  :features [:keep-on-top])

