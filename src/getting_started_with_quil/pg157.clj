(ns getting-started-with-quil.pg157
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (q/no-stroke)
  (let [num 60]
    {:x (take num (repeat 0))
     :y (take num (repeat 0))
     :num num}))  
 
(defn update-state [state]
  (merge state {:x (cons (q/mouse-x) (butlast (:x state)))
                :y (cons (q/mouse-y) (butlast (:y state)))}))
        
                                
(defn draw [state]
   (q/background 0)
   (doseq [i (range (:num state))]
      (q/fill (* i 4))
      (q/ellipse (nth (:x state) i) (nth (:y state) i) 40 40)))
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
