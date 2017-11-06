(ns getting-started-with-quil.pg92
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup []
    {:img (q/load-image "/images/lunar.jpg")})


(defn draw [state]
    (q/background 0)
    (q/image (:img state) 0 0 (* 2 (q/mouse-x)) (* 2 (q/mouse-y))))
  
   
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
  

