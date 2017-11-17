(ns getting-started-with-quil.pg124
  (:require [quil.core :as q]
            [quil.middleware :as m]))

(defn setup [])
     
     
 
(defn update-state [state]
  
  state)
        
                                
(defn draw [state]
  (q/background 176 204 226)
  (q/translate 110 110)
  (q/stroke 138 138 125)
  (q/stroke-weight 70)
  (q/line 0 -35 0 -65);;Body
  (q/no-stroke)
  (q/fill 255)
  (q/ellipse -17.5 -65 35 35);;Left eye dome
  (q/ellipse 17.5 -65 35 35);;Right eye dome
  (q/arc 0 -65 70 70 0 q/PI);; Chin
  (q/fill 51 51 30)
  (q/ellipse -14 -65 8 8);; Left eye
  (q/ellipse 14 -65 8 8);;  Right eye
  (q/quad 0 -58 4 -51 0 -44 -4 -51));; Beak

  
  
      
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :update update-state
  :draw draw
  :features [:keep-on-top]
  :middleware [m/fun-mode])


