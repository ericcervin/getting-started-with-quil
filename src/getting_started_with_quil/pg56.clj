(ns getting-started-with-quil.p56
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  (q/stroke 0 102)
  {:x 1
   :y 1
   :px 1
   :py 1
   :weight 1})  
 
(defn update-state[state]
  (let [easing 0.05
        px (:x state)
        py (:y state)
        x (+ px (* (- (q/mouse-x) px) easing))
        y (+ py (* (- (q/mouse-y) py) easing))
        weight (q/dist px py x y)]
        
    {:x x :y y :px px :py py :weight weight}))

(defn draw [state]
  (q/stroke-weight (:weight state))
  (q/line (:x state) (:y state) (:px state) (:py state)))
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

