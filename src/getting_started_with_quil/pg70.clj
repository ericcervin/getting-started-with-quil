(ns getting-started-with-quil.p70
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            
(defn setup []
  {:x 215})  
 
(defn update-state [state]
  (if (q/key-pressed?)
      (cond 
        (= (q/key-as-keyword) :left)   (update state :x dec)
        (= (q/key-as-keyword) :right)  (update state :x inc)
        :else state)
      state))        
                                
(defn draw [state]
  (q/rect (:x state) 45 50 50))
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

