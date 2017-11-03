(ns getting-started-with-quil.pg79
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:angle 0})  
 
(defn update-state [state]
  {:angle (+ (:angle state) 0.1)})        
                                
(defn draw [state]
  (q/translate (q/mouse-x) (q/mouse-y))
  (q/rotate (:angle state))
  (q/rect -15 -15 30 30))
  
  
    
(q/defsketch practice
  :size [120 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


