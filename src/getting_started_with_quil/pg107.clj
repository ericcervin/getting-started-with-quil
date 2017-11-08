(ns getting-started-with-quil.pg107
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/ellipse-mode :radius)
  {:radius 40 :x 110 :speed 0.5 :direction 1})  
 
(defn update-state [state]
  (let [speed (:speed state)
        radius (:radius state)
        px (:x state)
        pdirection (:direction state)
        x (+ px (* speed pdirection))
        direction (if (or (> x  (- (q/width) radius)) (< x radius))
                      (* -1 pdirection)
                      pdirection)];; Flip direction
  
       (merge state {:x x :direction direction})))
                  
                                
(defn draw [state]
  (q/background 0)
  (let [direction (:direction state)
        radius (:radius state)
        x (:x state)]
    (if (= direction 1)
      (q/arc x 60 radius radius 0.52 5.76);;face right
      (q/arc x 60 radius radius 3.67 8.9))));;face left
    

(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


