(ns getting-started-with-quil.pg105
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/ellipse-mode :radius)
  (let [radius 40
        x (* -1 radius)
        speed 0.5]
       {:radius radius
        :x x
        :speed speed}))  
 
(defn update-state [state]
  (assoc state :x (+ (:x state) (:speed state))))
          
                                
(defn draw [state]
  (q/background 0)
  (q/arc (:x state) 60 (:radius state) (:radius state) 0.52 5.76))
  
  
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


