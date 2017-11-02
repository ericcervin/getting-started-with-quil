(ns getting-started-with-quil.p73
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            
(defn setup []
  (q/ellipse-mode :radius)
  (let [x 60 ;;x coordinate
        y 440 ;;y coordinate
        body-height 160 ;; Body height
        neck-height 70 ;;Neck Height
        radius 45] ;;Head radius
        
   {:x x 
    :y y 
    :body-height body-height 
    :neck-height neck-height 
    :radius radius 
    :neck-y (- y body-height neck-height radius)}))
    
   
     
 
(defn update-state [state]
  (let [easing 0.04
        radius (:radius state)
        target-x (q/mouse-x)
        px (:x state)
        x (+ px (* (- target-x px) easing))
        y (:y state)
        neck-height (if (q/mouse-pressed?) 16 70)
        body-height (if (q/mouse-pressed?) 90 160)
        neck-y (- y body-height neck-height radius)]
    (merge state {:x x :neck-height neck-height :neck-y neck-y :body-height body-height :radius radius})))
    

                                
(defn draw [state]
  (let [body-height (:body-height state)
        neck-y (:neck-y state)
        x (:x state)
        y (:y state)
        radius (:radius state)]
        
   (q/stroke-weight 2)
   (q/background 0 153 204)
  
   ;;Neck
   (q/stroke 255)
   (q/line (+ x 12) (- y body-height) (+ x 12) neck-y)
     
   ;;ANTENNAE
   (q/line (+ x 12) neck-y (- x 18) (- neck-y 43));; SMALL
   (q/line (+ x 12) neck-y (+ x 42) (- neck-y 99));; TALL
   (q/line (+ x 22) neck-y (+ x 78) (+ neck-y 15));; BODY
     
   ;;BODY
   (q/no-stroke)
   (q/fill 255 204 0) 
   (q/ellipse x (- y 33) 33 33)
   (q/fill 0)
   (q/rect (- x 45) (- y body-height) 90 (- body-height 33))
     
   ;;HEAD
   (q/fill 0)
   (q/ellipse (+ x 12) neck-y radius radius)
   (q/fill 255)
   (q/ellipse (+ x 24) (- neck-y 6) 14 14)
   (q/fill 0);;Set fill to black
   (q/ellipse (+ x 24) (- neck-y 6) 3 3)))
  
    
(q/defsketch practice
  :size [360 480]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

