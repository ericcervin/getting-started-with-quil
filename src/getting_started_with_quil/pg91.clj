(ns getting-started-with-quil.pg91
  (:require [quil.core :as q]))

            
(defn setup []
  (let [img (q/load-image "/images/lunar.jpg")]
       (q/image img 0 0)))
    
  

    

    
(q/defsketch practice
  :size [480 120]
  :setup setup
  :features [:keep-on-top])
  

