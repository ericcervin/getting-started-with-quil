(ns getting-started-with-quil.p91b
  (:require [quil.core :as q]))

            
(defn setup []
  (let [img1 (q/load-image "/images/lunar.jpg")
        img2 (q/load-image "/images/capsule.jpg")]
       (q/image img1 -120 0)
       (q/image img1 130 0 240 120)
       (q/image img2 300 0 240 120)))

    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])
  

