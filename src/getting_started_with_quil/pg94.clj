(ns getting-started-with-quil.pg94
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
    {:img (q/load-image "/images/clouds.png")})


(defn draw [state]
    (q/background 204)
    (q/image (:img state) 0 0)
    (q/image (:img state) 0 (* -1 (q/mouse-y))))
  
  
   
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
  

