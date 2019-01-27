(ns getting-started-with-quil.pg99
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
  (let [network (q/load-shape "/images/network.svg")]
    (q/shape-mode :center)
    {:network network
     :diameter (q/map-range (q/mouse-x) 0 (q/width) 10 800)}))  
 
(defn update-state [state]
  (merge state {:diameter (q/map-range (q/mouse-x) 0 (q/width) 10 800)}))        
                                
(defn draw [state]
  (let [network (:network state)
        diameter (:diameter state)]
    (q/background 0)
    (q/shape network 120 60 diameter diameter)))
  
  
    
(q/defsketch practice
  :size [240 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


