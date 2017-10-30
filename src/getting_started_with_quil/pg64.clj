(ns getting-started-with-quil.p64
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  {:x 80
   :y 30
   :w 80
   :h 60
   :fill 255})  
 
(defn update-state[state]
  (let [x (:x state)
        y (:y state)
        w (:w state)
        h (:h state)
        mx (q/mouse-x)
        my (q/mouse-y)]
    (if (and (> mx x) (< mx (+ x w)) (> my y) (< my (+ y h)))  
        (assoc state :fill 0)
        (assoc state :fill 255))))
                                
(defn draw [state]
  (q/background 204)
  (q/fill (:fill state))
  (q/rect (:x state) (:y state) (:w state) (:h state)))
  
 
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

