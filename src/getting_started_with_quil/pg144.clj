(ns getting-started-with-quil.pg144
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
  {:jit (->JitterBug (* (q/width) 0.33) (/ (q/height) 2) 50 2.5)
   :bug (->JitterBug (* (q/width) 0.66) (/ (q/height) 2) 10 2.5)})  
 
(defn update-state [state]
  {:jit (move-bug (:jit state))
   :bug (move-bug (:bug state))})        
                                
(defn draw [state]
  (display-bug (:jit state))
  (display-bug (:bug state)))
  
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


