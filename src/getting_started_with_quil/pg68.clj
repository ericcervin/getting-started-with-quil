(ns getting-started-with-quil.p68
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  (q/text-size 64)
  (q/text-align :center))  
 
(defn update-state[state]
  state)
                                
(defn draw [state]
  (q/background 0)
  (q/text (str (q/raw-key)) 60 80))
  
 
    
(q/defsketch practice
  :size [120 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

