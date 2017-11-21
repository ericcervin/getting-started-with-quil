(ns getting-started-with-quil.pg159
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defrecord JitterBug [x y diameter speed])

(defn create-bug [x y r]
    (->JitterBug x y r 2.5))

(defn move-bug [b]
  (let [speed (:speed b)]
   (merge b {:x (+ (:x b) (* -1 speed) (* 2 (rand speed)))
             :y (+ (:y b) (* -1 speed) (* 2 (rand speed)))})))

(defn display-bug [b]
  (q/ellipse (:x b) (:y b) (:diameter b) (:diameter b)))

(defn setup []
   (map #(create-bug (rand (q/width)) (rand (q/height)) (+ % 1)) (range 33)))
       

(defn update-state [state]
  (map move-bug state))        
                                
(defn draw [state]
  (doseq [b state]
     (display-bug b)))
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


