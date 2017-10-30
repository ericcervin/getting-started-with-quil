(ns getting-started-with-quil.p54b
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  {:x 1})  
 
(defn update-state[state]
  (let [ex (:x state)]
    (assoc state :x  (+ ex (* (- (q/mouse-x) ex) 0.01)))))

(defn draw [state]
  (q/ellipse (:x state) 40 12 12)
  (println (str (q/mouse-x) " : "  (:x state))))
  
    
(q/defsketch practice
  :size [220 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

