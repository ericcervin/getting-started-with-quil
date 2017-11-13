(ns getting-started-with-quil.pg115b
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:angle 0.0
   :offset 60
   :scalar 40
   :speed 0.5})
  
 
(defn update-state [state]
  (update state :angle #(+ % (:speed state))))        
                                
(defn draw [state]
  (let [offset (:offset state)
        angle (:angle state)
        scalar (:scalar state)
        y1 (+ offset  (* (q/sin angle) scalar))
        y2 (+ offset  (* (q/sin (+ angle 0.4)) scalar))
        y3 (+ offset  (* (q/sin (+ angle 0.8)) scalar))]
  
   (q/background 0)
   (q/ellipse 80 y1 40 40)
   (q/ellipse 120 y2 40 40)
   (q/ellipse 160 y3 40 40)))
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
