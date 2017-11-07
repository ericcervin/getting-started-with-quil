(ns getting-started-with-quil.pg102
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:easing 0.05
   :offset 0
   :target-offset (q/map-range (q/mouse-y) 0 (q/height) -40 40)
   :smaller-offset 0
   :smallest-offset 0
   :bot1 (q/load-shape "/images/robot1.svg")
   :bot2 (q/load-shape "/images/robot2.svg")
   :bot3 (q/load-shape "/images/robot3.svg")
   :landscape (q/load-image "/images/alpine.png")})  
 
(defn update-state [state]
  (let [easing (:easing state)
        poffset (:offset state)
        target-offset  (q/map-range (q/mouse-y) 0 (q/height) -40 40)
        offset (+ poffset (* (- target-offset poffset) easing))
        smaller-offset (* 0.7 offset)
        smallest-offset (* -0.5 smaller-offset)]
    (merge state {:offset offset :smaller-offset smaller-offset 
                  :smallest-offset smallest-offset})))
            
                                
(defn draw [state]
  (let [
        bot1 (:bot1 state)
        bot2 (:bot2 state)
        bot3 (:bot3 state)
        landscape (:landscape state)
        offset (:offset state)
        smaller-offset (:smaller-offset state)
        smallest-offset (:smallest-offset state)]
        
    (q/background-image landscape)
    (q/shape bot1 (+ 85 offset) 65)
    (q/shape bot2 (+ 510 smaller-offset) 140 78 248)
    (q/shape bot3 (+ 410 smallest-offset) 225 39 124)))

  
    
(q/defsketch practice
  :size [720 480]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


