(ns getting-started-with-quil.p85
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            
(defn setup []
  (q/ellipse-mode :radius)
  {})
    
(defn update-state [state]
  state)
                                
(defn draw [state]
  (let [x 60 ;;x coordinate
        y 440;;y coordinate
        easing 0.04
        radius 45 ;;head radius
        body-height 160;;body height
        neck-height 70;;neck height
        neck-y (* -1 (+ body-height neck-height radius))]
    (q/stroke-weight 2)
    (q/background 0 153 204)
    (q/translate (q/mouse-x) y) ; // Move all to (mouseX, y)
    (if (q/mouse-pressed?)
        (q/scale 1)
        (q/scale 0.6))
    
       ;;BODY
    (q/no-stroke)
    (q/fill 255 204 0) 
    (q/ellipse 0 -33 33 33)
    (q/fill 0)
    (q/rect -45 (* -1 body-height) 90 (- body-height 33))
    
    ;;Neck
    (q/stroke 255)
    (q/line 12 (* -1 body-height) 12 neck-y)
    
    
    ;;Hair
    (q/push-matrix)
    (q/translate 12 neck-y)
    (let [angle (* -1 (/ q/PI 30.0))]
         (doseq [i (range 31)]
                (q/line 80 0 0 0)
                (q/rotate angle)))
           
   
    (q/pop-matrix)
    
    ;;Head
    (q/no-stroke)
    (q/fill 0)
    (q/ellipse 12 neck-y radius radius)
    (q/fill 255)
    (q/ellipse 24 (- neck-y 6) 14 14)
    (q/fill 0);; Set fill to black
    (q/ellipse 24 (- neck-y 6) 3 3)))
    
    
    
    
(q/defsketch practice
  :size [360 480]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

