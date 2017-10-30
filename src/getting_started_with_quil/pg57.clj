(ns getting-started-with-quil.p57
  (:require [quil.core :as q]
            [quil.middleware :as m]))
            


(defn setup []
  (q/stroke-weight 30)
  {:stroke 102})  
 
(defn update-state[state]
  (if (q/mouse-pressed?) {:stroke 0} {:stroke 102}))

(defn draw [state]
  (q/stroke 102)
  (q/line 40 0 70 (q/height))
  (q/stroke (:stroke state))
  (q/line 0 70 (q/width) 50))
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])

