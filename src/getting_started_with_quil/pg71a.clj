(ns getting-started-with-quil.p71a
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            
(defn setup []
  (q/stroke-weight 12)
  {})  
 
(defn update-state [state]
  state)        
                                
(defn draw [state]
  (let [mx (+ 60 (/ (q/mouse-x) 2))]
    (q/background 204)
    (q/stroke 102)
    (q/line (q/mouse-x) 0 (q/mouse-x) (q/height));;Grayline;
    (q/stroke 0)
    (q/line mx 0 mx (q/height))));;Blackline
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

