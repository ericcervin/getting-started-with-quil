(ns getting-started-with-quil.p67
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  {})  
 
(defn update-state[state]
  state)
                                
(defn draw [state]
  (q/background 204)
  (q/line 20 20 220 100)
  (if (q/key-pressed?) (q/line 220 20 20 100)))
  
 
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

