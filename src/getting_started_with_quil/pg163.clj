(ns getting-started-with-quil.pg163
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
   (let [num-bots 20]
     (map #(create-robot "/images/robot2.svg"
             (+ -40 (rand (q/width))) 
             (q/map-range % 0 num-bots -100 (- (q/height) 200))) (range num-bots)))) 
                                

(defn update-state [state]
  (map #(update-robot (nth state %)) (range (count state))))
        
  

(defn draw [state]
  (q/background 0  153  204)
  (doseq [i (range (count state))]
      (display-robot (nth state i))))
  
  
(q/defsketch practice
  :size [720 480]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])
