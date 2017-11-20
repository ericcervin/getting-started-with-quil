(ns getting-started-with-quil.pg147
  (:require [quil.core :as q]
            [quil.middleware :as m]))



(defn create-robot [svg-name temp-x temp-y]
     {:bot-shape (q/load-shape svg-name)
      :xpos temp-x
      :ypos temp-y
      :angle (rand q/TWO-PI)
      :yoffset 0.0})
  
(defn update-robot [r]
  (let [angle (+ (:angle r) 0.05)]
   (merge r {:angle angle
             :yoffset (* (q/sin angle) 20)})))
     
(defn display-robot [r]
    (q/shape (:bot-shape r) (:xpos r) (+ (:ypos r) (:yoffset r))))
    


(defn setup []
  {:bot1 (create-robot "/images/robot1.svg" 90 80)
   :bot2 (create-robot "/images/robot2.svg" 440 30)})

(defn update-state [state]
  {:bot1 (update-robot (:bot1 state))
   :bot2 (update-robot (:bot2 state))})
  

(defn draw [state]
  (q/background 0  153  204)
  (display-robot (:bot1 state))
  (display-robot (:bot2 state)))
  
  
(q/defsketch practice
  :size [720 480]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
