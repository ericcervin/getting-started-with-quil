(ns getting-started-with-quil.pg35
  (:require [quil.core :as q]))


(defn setup []
    (q/smooth)
    (let [y 60
          d 80]
      (q/ellipse 75 y d d)
      (q/ellipse 175 y d d)
      (q/ellipse 275 y d d)))
    
  
    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])

