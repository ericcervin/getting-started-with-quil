(ns getting-started-with-quil.pg156
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (take (q/width) (repeatedly #(rand 255))))  
 
(defn update-state [state]
  state)        
                                
(defn draw [state]
   (doseq [i (range (count state))]
      (q/stroke (nth state i))
      (q/line i 0 i (q/height))))
  
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

