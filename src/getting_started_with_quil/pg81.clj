(ns getting-started-with-quil.pg81
  
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  {:angle 0.0
   :angle-direction 1
   :speed 0.005})  
 
(defn update-state [state]
  (let [pa (:angle state)
        pad (:angle-direction state)
        angle (+ pa (* pad (:speed state)))
        angle-direction (if (or (> angle q/QUARTER-PI) (< angle 0)) (* pad -1) pad)]
   (merge state
     {:angle angle
      :angle-direction angle-direction})))
    
                                
(defn draw [state]
     (q/background 204)
     (q/translate 20 25);;move to start position
     (q/rotate (:angle state))
     (q/stroke-weight 12);
     (q/line 0 0 40 0)
     (q/translate 40 0);;move to next joint
     (q/rotate (* (:angle state) 2.0))
     (q/stroke-weight 6)
     (q/line 0 0 30 0)
     (q/translate 30 0);;move to next joint
     (q/rotate (* (:angle state) 2.5))
     (q/stroke-weight 3)
     (q/line 0 0 20 0))
  
  
  
    
(q/defsketch practice
  :size [120 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


