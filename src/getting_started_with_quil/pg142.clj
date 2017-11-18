(ns getting-started-with-quil.pg142
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defrecord JitterBug [x y diameter speed])

(defn move-bug [b]
  (let [speed (:speed b)]
   (merge b {:x (+ (:x b) (* -1 speed) (* 2 (rand speed)))
             :y (+ (:y b) (* -1 speed) (* 2 (rand speed)))})))

(defn display-bug [b]
  (q/ellipse (:x b) (:y b) (:diameter b) (:diameter b)))

(defn setup []
  (->JitterBug (/ (q/width) 2) (/ (q/height) 2) 20 2.5))  
 
(defn update-state [state]
  (move-bug state))        
                                
(defn draw [state]
  (display-bug state))
  
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


