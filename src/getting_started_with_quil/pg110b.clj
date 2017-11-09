(ns getting-started-with-quil.p110b
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:speed 2.5
   :diameter 20
   :x (/ (q/width) 2)
   :y (/ (q/height) 2)})
     
 
(defn update-state [state]
  (let [speed (:speed state)]
    (merge state {:x (+ (:x state) (* -1 speed) (rand (* 2 speed)))
                  :y (+ (:y state) (* -1 speed) (rand (* 2 speed)))})))
          
                                
(defn draw [state]
  (q/ellipse (:x state) (:y state) (:diameter state) (:diameter state)))
  
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])





