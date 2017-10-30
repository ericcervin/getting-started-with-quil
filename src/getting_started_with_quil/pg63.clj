(ns getting-started-with-quil.p63
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  (q/ellipse-mode :radius)
  {:x 120
   :y 60
   :radius 12
   :fill 255})  
 
(defn update-state[state]
  (let [x (:x state)
        y (:y state)
        d (q/dist (q/mouse-x) (q/mouse-y) x y)
        r (:radius state)]
    (if (< d r)  
        (merge state {:radius (inc r) :fill 0})
        (merge state {:fill 255}))))
                                
           
    

(defn draw [state]
  (q/background 204)
  (q/fill (:fill state))
  (q/ellipse (:x state) (:y state) (:radius state) (:radius state)))
  
 
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

