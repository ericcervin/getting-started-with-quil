(ns getting-started-with-quil.p112
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:time1 1000
   :time2 2000
   :x 0})
  
     
 
(defn update-state [state]
  (let [current-time (q/millis)]
      (cond (> current-time (:time2 state)) (assoc state :x (- (:x state) 0.5))
            (> current-time (:time1 state)) (assoc state :x (+ (:x state) 2))
            :else state)))          
                                
(defn draw [state]
  (q/background 204)
  (q/ellipse (:x state) 60 90 90))
  
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])





