(ns getting-started-with-quil.pg117
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/fill 0)
  {:angle 0.0
   :offset 60
   :scalar 2
   :speed 0.05})
  
 
(defn update-state [state]
  (merge state {:angle (+ (:angle state) (:speed state))
                :scalar (+ (:scalar state) (:speed state))}))                        
                                
(defn draw [state]
  (let [offset (:offset state)
        angle (:angle state)
        scalar (:scalar state)
        x (+ offset  (* (q/cos angle) scalar))
        y (+ offset  (* (q/sin angle) scalar))]
        
    (q/ellipse x y 2 2)))
  
    
(q/defsketch practice
  :size [120 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
