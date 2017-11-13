(ns getting-started-with-quil.pg115a
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:angle 0.0})  
 
(defn update-state [state]
  (assoc state :angle (+ (:angle state) 0.1)))        
                                
(defn draw [state]
  (let [sinval (q/sin (:angle state))]
   (println sinval)
   (q/background (q/map-range sinval -1 1 0 255))))
    
(q/defsketch practice
  :size [100 100]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
