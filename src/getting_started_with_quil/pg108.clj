(ns getting-started-with-quil.pg108
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (let [start-x 20;; // Initial x coordinate
        stop-x 160;; // Final x coordinate
        start-y 30;; // Initial y coordinate
        stop-y 80;;  // Final y coordinate
        x start-x;;  // Current x coordinate
        y start-y;;  // Current y coordinate
        step 0.005;; // Size of each step (0.0 to 1.0)
        pct 0.0];; // Percentage traveled (0.0 to 1.0)�)  
    
    {:start-x start-x :stop-x stop-x :start-y start-y :stop-y stop-y :x x :y y :step step :pct pct}))
    
    
 
(defn update-state [state]
  (if (< (:pct state) 1)
    (merge state {:x (+ (:start-x state) (* (- (:stop-x state) (:start-x state)) (:pct state)))
                  :y (+ (:start-y state) (* (- (:stop-y state) (:start-y state)) (:pct state)))
                  :pct (+ (:pct state) (:step state))})
    state)) 
                  
                                
(defn draw [state]
  (q/background 0)
  (q/ellipse (:x state) (:y state) 20 20))
    

(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


