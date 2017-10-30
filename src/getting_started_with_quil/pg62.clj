(ns getting-started-with-quil.p62
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  {:x (/ (q/width) 2)
   :offset 10})  
 
(defn update-state[state]
  (let [x (:x state)]
       (if (> (q/mouse-x) x) {:x (+ x 0.5) :offset -10}
                             {:x (- x 0.5) :offset  10})))

(defn draw [state]
  (q/background 204)
  (q/line (:x state) 0 (:x state) (q/height))
  (q/line (q/mouse-x) (q/mouse-y) (+ (q/mouse-x) (:offset state)) (- (q/mouse-y) 10))
  (q/line (q/mouse-x) (q/mouse-y) (+ (q/mouse-x) (:offset state)) (+ (q/mouse-y) 10))
  (q/line (q/mouse-x) (q/mouse-y) (+ (q/mouse-x) (* (:offset state) 3)) (q/mouse-y)))
  
 
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

