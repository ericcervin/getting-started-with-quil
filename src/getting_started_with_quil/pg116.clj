(ns getting-started-with-quil.pg116
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:angle 0.0
   :offset 60
   :scalar 30
   :speed 0.05})
  
 
(defn update-state [state]
  (update state :angle #(+ % (:speed state))))        
                                
(defn draw [state]
  (let [offset (:offset state)
        angle (:angle state)
        scalar (:scalar state)
        x (+ offset  (* (q/cos angle) scalar))
        y (+ offset  (* (q/sin angle) scalar))]
        
    (q/ellipse x y 40 40)))
  
    
(q/defsketch practice
  :size [120 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
