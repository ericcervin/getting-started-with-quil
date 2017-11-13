(ns getting-started-with-quil.pg118
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/ellipse-mode :radius)
  (q/background 0 153 204);;Blue background
  {:x 180;; x coordinate
   :y 400;;  y coordinate
   :body-height 153 ;;Body Height
   :neck-height 56 ;;Neck Height
   :radius  45 ;;Head radius
   :angle 0.0;; Angle the motion
   :ny 146});;Head height
   
     
 
(defn update-state [state]
  ;;Change position by a small random amount
   (merge state {:x (+ (:x state) (rand 8) -4)
                 :y (+ (:y state) (rand 2) -1)
                 :neck-height (+ 80 (* (q/sin (:angle state)) 30));
                 :angle (+ (:angle state) 0.05)
                 :ny (- (:y state) (:body-height state) (:neck-height state) (:radius state))}))
        
                                
(defn draw [state]
  (let [x (:x state)
        y (:y state)
        body-height (:body-height state)
        ny (:ny state)
        radius (:radius state)]
    ;;Neck
    (q/stroke 255)
    (q/line (+ x 2) (- y body-height) (+ x 2) ny)
    (q/line (+ x 12) (- y body-height) (+ x 12) ny)
    (q/line (+ x 22) (- y body-height) (+ x 22) ny)
    
    ;;Antennae
    (q/line (+ x 12) ny (- x 18) (- ny 43))
    (q/line (+ x 12) ny (+ x 42) (- ny 99))
    (q/line (+ x 12) ny (+ x 78) (+ ny 15))
    
    ;;Body
    (q/no-stroke)
    (q/fill 255 204 0)
    (q/ellipse x (- y 33) 33 33)
    (q/fill 0)
    (q/rect (- x 45) (- y body-height) 90 (- body-height 33))
    (q/fill 255 204 0)
    (q/rect (- x 45) (- y body-height 17) 90 6)


    ;;Head
    (q/fill 0)
    (q/ellipse (+ x 12) ny radius radius)
    (q/fill 255)
    (q/ellipse (+ x 24) (- ny 6) 14 14)
    (q/fill 0)
    (q/ellipse (+ x 24) (- ny 6) 3 3)))
      
  
    
(q/defsketch practice
  :size [360 480]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


